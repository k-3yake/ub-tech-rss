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
        String url = "http://localhost:8080/rss/";

        try{
            CloseableHttpClient client = HttpClients.createDefault();
            HttpGet get = new HttpGet( url );
            CloseableHttpResponse response = client.execute( get );
            int sc = response.getStatusLine().getStatusCode(); //. 200 の想定
            HttpEntity entity = response.getEntity();
            String html = EntityUtils.toString( entity, "UTF-8" );
            System.out.println( html.replaceAll("NewsPicks","") ); //. 取得結果をコンソールへ
            client.close();
        }catch( Exception e ){
            e.printStackTrace();
        }
    }
}
