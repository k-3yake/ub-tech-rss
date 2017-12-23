package org.k3yake.rss.rss;

import org.junit.Test;
import org.k3yake.rss.rss.converter.NpRemoveConverter;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by katsuki on 17/12/22.
 */
public class RssFeedTest {

    @Test
    public void RssFeedの変換処理のテスト_Converterの内容にしたがって変換したものを返す(){
        NpRemoveConverter npRemoveConverter = new NpRemoveConverterMock();
        assertThat(new RssFeed("").convert(npRemoveConverter),is(new RssFeed("converted")));
    }

    private static class NpRemoveConverterMock extends NpRemoveConverter{
        @Override
        public RssFeed convert(RssFeed rssFeed){
            return  new RssFeed("converted");
        }
    }
}
