package org.k3yake.rss.domain;

import org.k3yake.rss.RssName;
import org.k3yake.rss.infra.HttpClient;
import org.k3yake.rss.domain.converter.ConverterFactory;

/**
 * Created by katsuki-miyake on 17/12/24.
 */
public class RssFactory {

    private HttpClient httpClient;

    public RssFactory(HttpClient httpClient){
        this.httpClient = httpClient;
    }

    public Rss createRss(RssName name,String url){
        RssFeed rssFeed = new RssFeed(httpClient.get(url.toString()));;
        return new Rss(name,rssFeed, ConverterFactory.create(name));
    }
}
