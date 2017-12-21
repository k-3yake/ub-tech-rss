package org.k3yake.rss;

/**
 * Created by katsuki on 17/12/22.
 */
public class RssUrl {

    private final String url;

    public RssUrl(String url) {
        this.url = url;
    }

    public String toString(){
        return url;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RssUrl rssUrl = (RssUrl) o;

        return url != null ? url.equals(rssUrl.url) : rssUrl.url == null;
    }

    @Override
    public int hashCode() {
        return url != null ? url.hashCode() : 0;
    }


}
