package org.k3yake.rss;

/**
 * Created by katsuki on 17/12/22.
 */
public class NpRemoveConverter {

    public RssFeed convert(RssFeed rssFeed){
        return  new RssFeed(rssFeed.getText().replaceAll("NewsPicks",""));
    }

}
