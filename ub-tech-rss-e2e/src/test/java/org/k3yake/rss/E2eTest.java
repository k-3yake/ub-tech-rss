package org.k3yake.rss;

import org.apache.commons.io.IOUtils;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

import static java.nio.charset.StandardCharsets.UTF_8;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by katsuki on 17/12/22.
 */
public class E2eTest {

    @Test
    public void TEST() throws IOException, InterruptedException {
        DummyServer.main(null);
        Runtime r = Runtime.getRuntime();
        String result = execApplication(System.getenv("TARGET_JAR"));
        assertThat(result,is("beforeafter\n"));
    }

    private String execApplication(String targetJarPath) throws IOException, InterruptedException {
        ProcessBuilder pb = new ProcessBuilder("java","-jar",targetJarPath);
        Process process = pb.start();
        process.waitFor();
        return IOUtils.toString(process.getInputStream(), UTF_8);
    }
}
