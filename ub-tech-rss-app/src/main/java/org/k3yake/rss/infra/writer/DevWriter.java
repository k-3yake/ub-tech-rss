package org.k3yake.rss.infra.writer;

/**
 * Created by katsuki on 17/12/22.
 */
public class DevWriter implements Writer{

    @Override
    public void write(String text){
        System.out.println(text);
    }
}
