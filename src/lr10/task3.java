package lr10;



import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.w3c.dom.Element;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import java.io.*;



public class task3 {

    public static void main(String[] args) throws InterruptedException {
        long start = System.currentTimeMillis();

        try {



            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
            org.w3c.dom.Document doc = docBuilder.newDocument();


            Element rootElement = doc.createElement("news");
            doc.appendChild(rootElement);

            Element news = doc.createElement("parse");
            rootElement.appendChild(news);

            Element content = doc.createElement("news");


            Document document = Jsoup.connect("https://4pda.to/").get();



            var element = document.select("#WVgegEXeyQ>article>div>h2>a");


            for (int i = 0; i < 2; i++) {
                String title = element.get(i).text();
                String href = element.get(i).attr("href");

                content.appendChild(doc.createTextNode(title));
                news.appendChild(content);
                content.appendChild(doc.createTextNode(href));
                news.appendChild(content);

            }
            doc.setXmlStandalone(true);
            doc.normalizeDocument();
            javax.xml.transform.TransformerFactory tf = javax.xml.transform.TransformerFactory.newInstance();
            javax.xml.transform.Transformer transformer = tf.newTransformer();
            transformer.setOutputProperty(javax.xml.transform.OutputKeys.ENCODING, "UTF-8");
            transformer.setOutputProperty(javax.xml.transform.OutputKeys.STANDALONE, "yes");
            transformer.setOutputProperty(javax.xml.transform.OutputKeys.INDENT, "yes");
            javax.xml.transform.dom.DOMSource source = new javax.xml.transform.dom.DOMSource(doc);
            javax.xml.transform.stream.StreamResult result = new javax.xml.transform.stream.StreamResult(new File("D://Primer/task3.xml"));
            transformer.transform(source, result);
//        }

        } catch (IOException | ParserConfigurationException | TransformerException | RuntimeException  e) {
            System.err.println("Проверьте подключение к интернету. ");
        }

    }

}

