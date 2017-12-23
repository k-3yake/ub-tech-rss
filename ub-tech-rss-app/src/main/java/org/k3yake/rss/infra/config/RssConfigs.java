package org.k3yake.rss.infra.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.stream.Stream;

/**
 * Created by katsuki-miyake on 17/12/24.
 */
public class RssConfigs {
    public List<RssConfig> rssConfigs;

    public List<RssConfig> getRssConfigs() {
        return rssConfigs;
    }

    public void setRssConfigs(List<RssConfig> rssConfigs) {
        this.rssConfigs = rssConfigs;
    }

    @Deprecated
    public RssConfigs() {    }

    public static RssConfigs read(File yml){
        ObjectMapper mapper = new ObjectMapper(new YAMLFactory());
        try {
            return mapper.readValue(yml,RssConfigs.class);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
