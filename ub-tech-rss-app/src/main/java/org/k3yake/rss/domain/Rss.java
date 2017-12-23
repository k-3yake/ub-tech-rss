package org.k3yake.rss.domain;

import org.k3yake.rss.RssName;
import org.k3yake.rss.domain.converter.RssConverter;

/**
 * Created by katsuki-miyake on 17/12/24.
 */
public class Rss {
    private RssName name;
    private RssFeed feed;
    private RssConverter rssConverter;

    Rss(RssName name, RssFeed rssFeed, RssConverter rssConverter) {
        this.name = name;
        this.feed = rssFeed;
        this.rssConverter = rssConverter;
    }

    public String getFeed() {
        return feed.convert(rssConverter).getText();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Rss rss = (Rss) o;

        if (name != null ? !name.equals(rss.name) : rss.name != null) return false;
        if (feed != null ? !feed.equals(rss.feed) : rss.feed != null) return false;
        return rssConverter != null ? rssConverter.equals(rss.rssConverter) : rss.rssConverter == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (feed != null ? feed.hashCode() : 0);
        result = 31 * result + (rssConverter != null ? rssConverter.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Rss{" +
                "name='" + name + '\'' +
                ", feed=" + feed +
                ", rssConverter=" + rssConverter +
                '}';
    }
}
