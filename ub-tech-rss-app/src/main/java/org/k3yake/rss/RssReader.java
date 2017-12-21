package org.k3yake.rss;

import java.io.IOException;

/**
 * Created by katsuki on 17/12/22.
 */
public class RssReader {


    private final HttpClient httpClient;

    public RssReader(HttpClient httpClient) {
        this.httpClient = httpClient;
    }

    public RssFeed get(Url url) throws IOException {
        return new RssFeed(httpClient.get(url.toString()));
    }
}
