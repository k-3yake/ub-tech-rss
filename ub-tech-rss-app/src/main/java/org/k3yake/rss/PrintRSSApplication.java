package org.k3yake.rss;

import org.k3yake.rss.infra.HttpClient;
import org.k3yake.rss.infra.config.RssConfig;
import org.k3yake.rss.infra.config.RssConfigs;
import org.k3yake.rss.rss.Rss;
import org.k3yake.rss.rss.RssFactory;
import org.k3yake.rss.rss.converter.NpRemoveConverter;
import org.k3yake.rss.rss.RssFeed;

import java.io.File;
import java.util.List;

/**
 * Created by katsuki on 17/12/22.
 */
public class PrintRSSApplication {
    private static RssFactory rssFactory = new RssFactory(new HttpClient());

    public static void main(String[] args) {
        RssConfigs.read(new File(args[0]))
                .getRssConfigs().stream()
                .map( c -> rssFactory.createRss(c.getName(), c.getUrl()))
                .forEach( r -> new RssWriter().write(r.getFeed()));
    }
}
