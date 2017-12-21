package org.k3yake.rss;

import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by katsuki on 17/12/22.
 */
public class RssUrlCreaterTest {

    @Test
    public void RSSUrlCreaterのテスト_文字列を元にRSSのURLを作成する(){
        assertThat(new RssUrlCreater().create("urlVal"),is(new RssUrl("urlVal")));
    }
}
