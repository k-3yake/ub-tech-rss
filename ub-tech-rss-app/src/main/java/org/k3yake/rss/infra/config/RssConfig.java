package org.k3yake.rss.infra.config;

import org.k3yake.rss.RssName;

/**
 * Created by katsuki-miyake on 17/12/24.
 */
public class RssConfig {
    private RssName name;
    private String url;

    public RssName getName() {
        return name;
    }

    public void setName(String name) {
        this.name = RssName.valueOf(name);
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
