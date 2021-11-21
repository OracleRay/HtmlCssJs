package ����.jsoup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;

public class Demo {
    public static void main(String[] args) throws IOException {
        //1.��ȡDocument���󣬸���xml�ĵ���ȡ
        //1.1.��ȡstudent.xml��path
        //String path = Demo.class.getClassLoader().getResource("student.xml").getPath();
        String path = "D:\\�׶��\\IdeaProjects\\ǰ��\\src\\xml\\student.xml";
        //1.2.����xml�ĵ��������ĵ����ڴ棬��ȡdom��--->Document
        Document document = Jsoup.parse(new File(path), "utf-8");
        //2.��ȡԪ�ض���
        Elements elements = document.getElementsByTag("name");

        System.out.println(elements.size());
        //2.1��ȡ��һ��name��Element����
        Element element = elements.get(0);
        //2.2��ȡ����
        String name = element.text();
        System.out.println(name);
    }
}