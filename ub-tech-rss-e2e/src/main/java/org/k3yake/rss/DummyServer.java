package org.k3yake.rss;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;
import org.apache.commons.io.IOUtils;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.nio.charset.StandardCharsets;

public class DummyServer {

    public static void main(String[] arguments) throws IOException
    {
       HttpServer server = HttpServer.create(new InetSocketAddress(8080), 0);
       server.createContext("/tech.uzabase.com/rss", new RssHandler("beforeNewsPicksafter"));
       server.createContext("/colopl.com/rss", new RssHandler("before2coloplafter2"));
       server.start();
   }

    private static class RssHandler implements HttpHandler  {
        private String responseTxt;

        private RssHandler(String responseTxt){
            this.responseTxt = responseTxt;
        }

        public void handle(HttpExchange exchange) throws IOException  {
            byte[] response = responseTxt.getBytes();
            exchange.sendResponseHeaders(200, response.length);
            OutputStream output = exchange.getResponseBody();
            output.write(response);
            output.close();
        }
    }
}
