package org.k3yake.rss;

import org.apache.commons.io.IOUtils;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;

import static java.lang.System.lineSeparator;
import static java.nio.charset.StandardCharsets.UTF_8;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by katsuki on 17/12/22.
 */
public class E2eTest {

    @BeforeClass
    public static void runDummyServer() throws IOException {
        DummyServer.main(null);
    }

    @Test
    public void TEST_ubTech() throws IOException, InterruptedException {
        Runtime r = Runtime.getRuntime();
        String result = execApplication("/rss-resource_ub_tech.yml");
        assertThat(result,is("beforeafter\n"));
    }

    @Test
    public void TEST_multiSite() throws IOException, InterruptedException {
        Runtime r = Runtime.getRuntime();
        String result = execApplication("/rss-resource_multi.yml");
        assertThat(result,is("beforeafter\nbefore2after2\n"));
    }

    private String execApplication(String rssResouceFileName) throws IOException, InterruptedException {
        ProcessBuilder pb = new ProcessBuilder()
                .command(
                        "java",
                        "-Drss.config.path=" + getClass().getResource(rssResouceFileName).getPath()
                        ,"-Denv=dev",
                        "-jar",System.getenv("TARGET_JAR"));

        Process process = pb.start();
        process.waitFor();
        return IOUtils.toString(process.getInputStream(), UTF_8);
    }
}
