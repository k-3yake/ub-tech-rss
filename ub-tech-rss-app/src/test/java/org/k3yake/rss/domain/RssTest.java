package org.k3yake.rss.domain;

import org.junit.Test;
import org.k3yake.rss.RssName;
import org.k3yake.rss.domain.converter.NpRemoveConverter;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.k3yake.rss.RssName.ubTech;

/**
 * Created by katsuki-miyake on 17/12/24.
 */
public class RssTest {

    @Test
    public void RssFeed取得のテスト_指定されたConverterにしたがってFeedを返す(){
        NpRemoveConverter npRemoveConverter = new NpRemoveConverterMock();
        assertThat(new Rss(ubTech,new RssFeed("aNewsPicksa"),npRemoveConverter).getFeed(),is("converted"));
    }

    private static class NpRemoveConverterMock extends NpRemoveConverter{
        @Override
        public RssFeed convert(RssFeed rssFeed){
            return  new RssFeed("converted");
        }
    }

}