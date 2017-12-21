package org.k3yake.rss;

/**
 * Created by katsuki on 17/12/22.
 */
public class PrintRSSApplication {

    public static void main(String[] args){
        String url =  args[0];
        RssUrl rssUrl = new RssUrlCreater().create(url);
        RssFeed rssFeed = new RssReader(new HttpClient()).get(rssUrl).convert(new NpRemoveConverter());
        new RssWriter().write(rssFeed);
    }
}
