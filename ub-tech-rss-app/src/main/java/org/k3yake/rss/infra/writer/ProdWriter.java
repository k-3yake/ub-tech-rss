package org.k3yake.rss.infra.writer;

import java.util.Date;

/**
 * Created by katsuki-miyake on 17/12/24.
 */
public class ProdWriter implements Writer {

    @Override
    public void write(String text){
        System.out.println(new Date() + " : " + text);
    }

}
