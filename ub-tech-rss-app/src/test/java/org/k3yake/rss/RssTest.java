package org.k3yake.rss;

import org.junit.Test;

import java.io.IOException;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by katsuki on 17/12/22.
 */
public class RssTest {

    @Test
    public void RSS取得のテスト_与えられたURLからRSSを取得する() throws IOException {
        RssReader rssReader = new RssReader(new HttpClientMock());
        assertThat(rssReader.get(new Url("urlVal")),is(new RssFeed("inputText")));
    }

    private static class HttpClientMock extends HttpClient{
        @Override
        public String get(String url){
            assertThat(url,is("urlVal"));
            return "inputText";
        }
    }


}
