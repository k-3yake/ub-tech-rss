package org.k3yake.rss.domain.converter;

/**
 * Created by katsuki-miyake on 17/12/24.
 */
public class ConverterFactory {

    private enum Converters {
        ubTech(new NpRemoveConverter()),
        colopl(new ColoplConverter());

        private RssConverter npRemoveConverter;
        private Converters(RssConverter npRemoveConverter){
            this.npRemoveConverter = npRemoveConverter;
        }
    }

    public static RssConverter create(String rssName){
        return Converters.valueOf(rssName).npRemoveConverter;
    }
}
