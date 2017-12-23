package org.k3yake.rss.domain.converter;

import org.junit.Test;
import org.k3yake.rss.domain.RssFeed;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

/**
 * Created by katsuki on 17/12/22.
 */
public class NpRemoveConverterTest {

    @Test
    public void 変換処理のテスト_RSSにNewsPicsの文字がある場合_NewsPicksの文字を削る(){
        assertThat(new NpRemoveConverter().convert(new RssFeed("ANewsPicksB")),is(new RssFeed("AB")));
    }

    @Test
    public void 変換処理のテスト_RSSが空文字の場合_空文字を返す(){
        assertThat(new NpRemoveConverter().convert(new RssFeed("")),is(new RssFeed("")));
    }

}