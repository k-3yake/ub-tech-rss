package org.k3yake.rss;

import org.k3yake.rss.infra.config.RssConfigs;
import org.k3yake.rss.domain.RssFactory;
import org.k3yake.rss.infra.writer.DevWriter;
import org.k3yake.rss.infra.writer.Writer;

/**
 * Created by katsuki on 17/12/22.
 */
public class PrintRSSApplication {
    private RssConfigs rssConfigs;
    private RssFactory rssFactory;
    private Writer writer;

    public PrintRSSApplication(RssFactory rssFactory, RssConfigs rssConfigs,Writer writer) {
        this.rssFactory = rssFactory;
        this.rssConfigs = rssConfigs;
        this.writer = writer;
    }

    public void exec() {
        rssConfigs.getRssConfigs().stream()
                .map( c -> rssFactory.createRss(c.getName(), c.getUrl()))
                .forEach( r -> writer.write(r.getFeed()));
    }
}
