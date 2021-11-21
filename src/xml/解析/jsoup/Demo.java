package 解析.jsoup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;

public class Demo {
    public static void main(String[] args) throws IOException {
        //1.获取Document对象，根据xml文档获取
        //1.1.获取student.xml的path
        //String path = Demo.class.getClassLoader().getResource("student.xml").getPath();
        String path = "D:\\雷东宸\\IdeaProjects\\前端\\src\\xml\\student.xml";
        //1.2.解析xml文档，加载文档进内存，获取dom树--->Document
        Document document = Jsoup.parse(new File(path), "utf-8");
        //2.获取元素对象
        Elements elements = document.getElementsByTag("name");

        System.out.println(elements.size());
        //2.1获取第一个name的Element对象
        Element element = elements.get(0);
        //2.2获取数据
        String name = element.text();
        System.out.println(name);
    }
}