package org.k3yake.rss;

import org.k3yake.rss.infra.HttpClient;
import org.k3yake.rss.infra.config.RssConfigs;
import org.k3yake.rss.domain.RssFactory;
import org.k3yake.rss.infra.writer.DevWriter;
import org.k3yake.rss.infra.writer.Writer;
import org.k3yake.rss.infra.writer.WriterFactory;

import java.io.File;

/**
 * Created by katsuki-miyake on 17/12/24.
 */
public class Main {

    public static void main(String[] args){
        RssFactory rssFactory = new RssFactory(new HttpClient());
        RssConfigs rssConfigs = RssConfigs.read(new File(System.getProperty("rss.config.path")));
        Writer writer = WriterFactory.create(System.getProperty("env"));
        PrintRSSApplication printRSSApplication = new PrintRSSApplication(rssFactory,rssConfigs,writer);
        printRSSApplication.exec();
    }


}
