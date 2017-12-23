package org.k3yake.rss.rss;

import org.junit.Test;
import org.k3yake.rss.rss.converter.NpRemoveConverter;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by katsuki-miyake on 17/12/24.
 */
public class RssTest {

    @Test
    public void RssFeed取得のテスト_指定されたConverterにしたがってFeedを返す(){
        NpRemoveConverter npRemoveConverter = new NpRemoveConverterMock();
        assertThat(new Rss("test",new RssFeed("aNewsPicksa"),npRemoveConverter).getFeed(),is("converted"));
    }

    private static class NpRemoveConverterMock extends NpRemoveConverter{
        @Override
        public RssFeed convert(RssFeed rssFeed){
            return  new RssFeed("converted");
        }
    }

}