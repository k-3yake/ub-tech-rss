package org.k3yake.rss;

/**
 * Created by katsuki on 17/12/22.
 */
public class PrintRSSApplication {

    public static void main(String[] args){
        try{
            RssUrl rssUrl = new RssUrlCreater().create("http://localhost:8080/rss/");
            RssFeed rssFeed = new RssReader(new HttpClient()).get(rssUrl);
            System.out.println( rssFeed.getText().replaceAll("NewsPicks","") ); //. 取得結果をコンソールへ
        }catch(Throwable e){
            e.printStackTrace();
        }
    }
}
