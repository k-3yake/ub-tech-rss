package org.k3yake.rss.rss;

import org.k3yake.rss.rss.converter.NpRemoveConverter;
import org.k3yake.rss.rss.converter.RssConverter;

/**
 * Created by katsuki-miyake on 17/12/24.
 */
public class Rss {
    private String name;
    private RssFeed feed;
    private RssConverter npRemoveConverter;

    Rss(String name, RssFeed rssFeed, RssConverter npRemoveConverter) {
        this.name = name;
        this.feed = rssFeed;
        this.npRemoveConverter = npRemoveConverter;
    }

    public RssFeed getFeed() {
        return this.feed.convert(npRemoveConverter);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Rss rss = (Rss) o;

        if (name != null ? !name.equals(rss.name) : rss.name != null) return false;
        if (feed != null ? !feed.equals(rss.feed) : rss.feed != null) return false;
        return npRemoveConverter != null ? npRemoveConverter.equals(rss.npRemoveConverter) : rss.npRemoveConverter == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (feed != null ? feed.hashCode() : 0);
        result = 31 * result + (npRemoveConverter != null ? npRemoveConverter.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Rss{" +
                "name='" + name + '\'' +
                ", feed=" + feed +
                ", npRemoveConverter=" + npRemoveConverter +
                '}';
    }
}
