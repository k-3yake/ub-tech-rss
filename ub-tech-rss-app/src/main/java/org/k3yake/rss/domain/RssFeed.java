package org.k3yake.rss.domain;

import org.k3yake.rss.domain.converter.RssConverter;

/**
 * Created by katsuki on 17/12/22.
 */
public class RssFeed {

    private final String text;

    public RssFeed(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    RssFeed convert(RssConverter rssConverter) {
        return rssConverter.convert(this);
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RssFeed rssFeed = (RssFeed) o;

        return text != null ? text.equals(rssFeed.text) : rssFeed.text == null;
    }

    @Override
    public int hashCode() {
        return text != null ? text.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "RssFeed{" +
                "text='" + text + '\'' +
                '}';
    }
}
