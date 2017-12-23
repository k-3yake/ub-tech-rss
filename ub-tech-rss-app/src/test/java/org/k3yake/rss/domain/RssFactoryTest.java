package org.k3yake.rss.rss;

import org.junit.Test;
import org.k3yake.rss.infra.HttpClient;
import org.k3yake.rss.rss.converter.ConverterFactory;
import org.k3yake.rss.rss.converter.NpRemoveConverter;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by katsuki-miyake on 17/12/24.
 */
public class RssFactoryTest {

    @Test
    public void Rss作成のテスト_名前とURLからRSSを作成する(){
        assertThat(new RssFactory(new HttpClientMock()).createRss("ubTech","urlVal"),is(new Rss("ubTech",new RssFeed("inputText"), ConverterFactory.create("ubTech"))));
    }

    private static class HttpClientMock extends HttpClient {
        @Override
        public String get(String url){
            assertThat(url,is("urlVal"));
            return "inputText";
        }
    }

}