package org.k3yake.rss.domain.converter;

import org.k3yake.rss.domain.RssFeed;

/**
 * Created by katsuki-miyake on 17/12/24.
 */
public interface RssConverter {

    public RssFeed convert(RssFeed rssFeed);

}
