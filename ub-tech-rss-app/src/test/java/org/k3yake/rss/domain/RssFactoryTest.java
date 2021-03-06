package org.k3yake.rss.domain;

import org.junit.Test;
import org.k3yake.rss.RssName;
import org.k3yake.rss.infra.HttpClient;
import org.k3yake.rss.domain.converter.ConverterFactory;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.k3yake.rss.RssName.ubTech;

/**
 * Created by katsuki-miyake on 17/12/24.
 */
public class RssFactoryTest {

    @Test
    public void Rss作成のテスト_名前とURLからRSSを作成する(){
        assertThat(new RssFactory(new HttpClientMock()).createRss(ubTech,"urlVal"),is(new Rss(ubTech,new RssFeed("inputText"), ConverterFactory.create(ubTech))));
    }

    private static class HttpClientMock extends HttpClient {
        @Override
        public String get(String url){
            assertThat(url,is("urlVal"));
            return "inputText";
        }
    }

}