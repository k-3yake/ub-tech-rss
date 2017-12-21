package org.k3yake.rss.rssFeed;

import org.k3yake.rss.rssFeed.RssFeed;

/**
 * Created by katsuki on 17/12/22.
 */
public class NpRemoveConverter {

    RssFeed convert(RssFeed rssFeed){
        return  new RssFeed(rssFeed.getText().replaceAll("NewsPicks",""));
    }

}
