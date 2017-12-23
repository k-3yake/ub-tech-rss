package org.k3yake.rss.rss;

import org.k3yake.rss.RssReader;
import org.k3yake.rss.RssUrl;
import org.k3yake.rss.infra.HttpClient;
import org.k3yake.rss.rss.converter.ConverterFactory;
import org.k3yake.rss.rss.converter.NpRemoveConverter;

/**
 * Created by katsuki-miyake on 17/12/24.
 */
public class RssFactory {

    private HttpClient httpClient;

    public RssFactory(HttpClient httpClient){
        this.httpClient = httpClient;
    }

    public Rss createRss(String name,String url){
        RssFeed rssFeed = new RssReader(httpClient).get(new RssUrl(url));
        return new Rss(name,rssFeed, ConverterFactory.create(name));
    }
}
