package org.k3yake.rss;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

/**
 * Created by katsuki on 17/12/22.
 */
public class PrintRSSApplication {

    public static void main(String[] args){
        try{
            String url = "http://localhost:8080/rss/";
            RssFeed rssFeed = new RssReader(new HttpClient()).get(new Url(url));
            System.out.println( rssFeed.getText().replaceAll("NewsPicks","") ); //. 取得結果をコンソールへ
        }catch( Exception e ){
            e.printStackTrace();
        }
    }
}
