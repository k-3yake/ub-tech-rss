package org.k3yake.rss;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;
import org.apache.commons.io.IOUtils;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
public class DummyServer {

    public static void main(String[] arguments) throws IOException
    {
       HttpServer server = HttpServer.create(new InetSocketAddress(8080), 0);
       server.createContext("/rss", new HelloHttpHandler());
       server.start();
   }

    private static class HelloHttpHandler implements HttpHandler
    {
        public void handle(HttpExchange exchange) throws IOException
        {
            byte[] response = IOUtils.toString(getClass().getResourceAsStream("/dummy.rss"), StandardCharsets.UTF_8).getBytes();
            exchange.sendResponseHeaders(200, response.length);
            OutputStream output = exchange.getResponseBody();
            output.write(response);
            output.close();
        }
    }
}
