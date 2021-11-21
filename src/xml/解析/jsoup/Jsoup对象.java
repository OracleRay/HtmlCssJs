package Ω‚Œˆ.jsoup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;
import java.net.URL;

public class Jsoup∂‘œÛ {
    public static void main(String[] args) throws IOException {
        URL url = new URL("https://news.baidu.com/");
        Document document = Jsoup.parse(url, 10000);
        System.out.println(document);
    }
}