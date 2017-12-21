package org.k3yake.rss;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;

/**
 * Created by katsuki on 17/12/22.
 */
public class HttpClient {

    public String get(String url)  {
        try(CloseableHttpClient client = HttpClients.createDefault()) {
            HttpGet get = new HttpGet(url);
            CloseableHttpResponse response = client.execute(get);
            int sc = response.getStatusLine().getStatusCode(); //. 200 の想定
            HttpEntity entity = response.getEntity();
            return EntityUtils.toString(entity, "UTF-8");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args){
        System.out.println(new HttpClient().get("https://www.yahoo.co.jp/"));
    }

}
