package org.k3yake.rss;

import org.k3yake.rss.infra.HttpClient;
import org.k3yake.rss.rssFeed.RssFeed;

/**
 * Created by katsuki on 17/12/22.
 */
public class RssReader {


    private final HttpClient httpClient;

    public RssReader(HttpClient httpClient) {
        this.httpClient = httpClient;
    }

    public RssFeed get(RssUrl url) {
        return new RssFeed(httpClient.get(url.toString()));
    }
}
