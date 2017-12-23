package org.k3yake.rss.infra.writer;

/**
 * Created by katsuki-miyake on 17/12/24.
 */
public class WriterFactory {

    public static Writer create(String env) {
        if("dev".equals(env)) return new DevWriter();
        else return new ProdWriter();
    }
}
