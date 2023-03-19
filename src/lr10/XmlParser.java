package lr10;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class XmlParser {
    public static void main(String[] args) {
        try{
            File inputFile=new File("D://Primer/example1.xml");
            DocumentBuilderFactory dbFactory=DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder=dbFactory.newDocumentBuilder();
            Document doc=dBuilder.parse(inputFile);
doc.getDocumentElement().normalize();
            System.out.println("корневой элемент: "+doc.getDocumentElement().getNodeName());
            NodeList nodeList=doc.getElementsByTagName("book");
            for (int i=0;i<nodeList.getLength();i++) {
                Node node = nodeList.item(i);
                System.out.println("\n текущий элемент: " + node.getNodeName());
                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Element element = (Element) node;
                    System.out.println("название книги: " + element.getElementsByTagName("title").item(0).getTextContent());
                    System.out.println("автор: " + element.getElementsByTagName("author").item(0).getTextContent());
                    System.out.println("год издания: " + element.getElementsByTagName("year").item(0).getTextContent());
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
