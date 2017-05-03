import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;

public class main {
    public static void main(String[] args) {
        Document doc = null;
        try {
            doc = Jsoup.connect("http://www.mvideo.ru/product-list-page-cls?q=5d+mark+iii&region_id=1&limit=12").get();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Elements newsHeadlines = doc.select(".product-tile.sel-product-tile");

        System.out.println(newsHeadlines);
    }
}
