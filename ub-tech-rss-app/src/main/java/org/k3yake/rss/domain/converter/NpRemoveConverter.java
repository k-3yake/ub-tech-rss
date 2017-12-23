package org.k3yake.rss.domain.converter;

import org.k3yake.rss.domain.RssFeed;

/**
 * Created by katsuki on 17/12/22.
 */
public class NpRemoveConverter implements RssConverter{

    public RssFeed convert(RssFeed rssFeed){
        return new RssFeed(rssFeed.getText().replaceAll("NewsPicks",""));
    }

}
