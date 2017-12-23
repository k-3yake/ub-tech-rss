package org.k3yake.rss.domain.converter;

import org.k3yake.rss.domain.RssFeed;

/**
 * Created by katsuki-miyake on 17/12/24.
 */
class ColoplConverter implements RssConverter{
    @Override
    public RssFeed convert(RssFeed rssFeed) {
        return new RssFeed(rssFeed.getText().replaceAll("colopl",""));
    }
}
