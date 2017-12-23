package org.k3yake.rss.rss.converter;

import org.k3yake.rss.rss.RssFeed;

/**
 * Created by katsuki on 17/12/22.
 */
public class NpRemoveConverter implements RssConverter{

    public RssFeed convert(RssFeed rssFeed){
        return new RssFeed(rssFeed.getText().replaceAll("NewsPicks",""));
    }

}
