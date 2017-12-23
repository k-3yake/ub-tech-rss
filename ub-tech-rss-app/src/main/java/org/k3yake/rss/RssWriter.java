package org.k3yake.rss;

import org.k3yake.rss.rss.RssFeed;

/**
 * Created by katsuki on 17/12/22.
 */
public class RssWriter {

    public void write(RssFeed rssFeed){
        System.out.println(rssFeed.getText());
    }
}
