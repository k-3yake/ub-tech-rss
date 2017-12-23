package org.k3yake.rss.infra.config;

/**
 * Created by katsuki-miyake on 17/12/24.
 */
public class RssConfig {
    private String name;
    private String url;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
