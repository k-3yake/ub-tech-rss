package org.k3yake.rss.domain.converter;

import org.k3yake.rss.RssName;

/**
 * Created by katsuki-miyake on 17/12/24.
 */
public class ConverterFactory {

    private static NpRemoveConverter npRemoveConverter = new NpRemoveConverter();
    private static ColoplConverter coloplConverter = new ColoplConverter();

    public static RssConverter create(RssName rssName){
        switch(rssName){
            case ubTech:return npRemoveConverter;
            case colopl:return coloplConverter;
            default:throw new IllegalArgumentException(rssName.toString());
        }
    }
}
