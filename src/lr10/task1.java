package lr10;

import org.w3c.dom.*;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;

import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class task1 {
    public static void main(String[] args) {
        try {

            Scanner in = new Scanner(System.in);
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document doc = builder.newDocument();
            Element root = doc.createElement("library");
            doc.appendChild(root);

            System.out.println("Что хотите сделать?");
            System.out.println("1. Добавить новую игру");
            System.out.println("2. Найти игру");
            System.out.println("3. Удалить игру");
            System.out.println("4. Выйти");
            int chose = in.nextInt();
            while (chose != 4) {
                switch (chose) {
                    case (1):

                        System.out.println("Сколько хотите добавить игр?");
                        int kol = in.nextInt();
                        if (kol == 0) {
                            return;
                        } else {
                            for (int i = 1; i <= kol; i++) {

                                System.out.println("Введите название игры");
                                String name = in.next();
                                System.out.println("Введите разработчика");
                                String dev = in.next();
                                System.out.println("Введите год создания игры");
                                int ye = in.nextInt();


                                //создание игры
                                Element game = doc.createElement("game");
                                root.appendChild(game);

                                //название игры
                                Element gamename = doc.createElement("name");
                                gamename.appendChild(doc.createTextNode(name));
                                game.appendChild(gamename);

                                //запись разработчика
                                Element developers = doc.createElement("developers");
                                developers.appendChild(doc.createTextNode(dev));
                                game.appendChild(developers);

                                //дата релиза
                                Element year1 = doc.createElement("year");
                                year1.appendChild(doc.createTextNode(String.valueOf(ye)));
                                game.appendChild(year1);
                            }
                        }
                        Transformer transformer =
                                TransformerFactory.newInstance().newTransformer();
                        DOMSource source = new DOMSource(doc);
                        StreamResult result = new StreamResult(new File("D://Primer/task1.xml"));
                        transformer.transform(source, result);


                        System.out.println("Игры записаны");
                        break;
                    case (2):
                        System.out.println("1. Искать по названию разработчиков");
                        System.out.println("2. Искать по дате релиза");
                        int chose0 = in.nextInt();

                        Document dok1 = builder.parse("D://Primer/task1.xml");
                        Node rootNode = dok1.getFirstChild();
                        NodeList list = rootNode.getChildNodes();
                        switch (chose0) {
                            case (1):

                                System.out.println("Разработчики игры:");

                                for (int i = 0; i < list.getLength(); i++) {

                                    String nodeList = dok1.getElementsByTagName("developers").item(i).getTextContent();

                                    System.out.println(nodeList);

                                }
                                System.out.println("Выберите разработчика ");
                                String chose2 = in.next();
                                    if (chose2.equals("valve")) {

                                        for (int i = 0; i < list.getLength(); i++) {
                                            String nodeList = dok1.getElementsByTagName("developers").item(i).getTextContent();
                                            if (nodeList.equals("valve")) {

                                                System.out.println("название игры: " + dok1.getElementsByTagName("name").item(i).getTextContent());

                                            }
                                        }
                                    }



                                    if (chose2.equals("remedy")) {
                                        for (int i = 0; i < list.getLength(); i++) {
                                            String nodeList = dok1.getElementsByTagName("developers").item(i).getTextContent();
                                            if (nodeList.equals("remedy")) {

                                                System.out.println("название игры: " + dok1.getElementsByTagName("name").item(i).getTextContent());

                                            }
                                        }
                                    }
                                    if (chose2.equals("id_software")) {
                                        for (int i = 0; i < list.getLength(); i++) {
                                            String nodeList = dok1.getElementsByTagName("developers").item(i).getTextContent();
                                            if (nodeList.equals("id_software")) {

                                                System.out.println("название игры: " + dok1.getElementsByTagName("name").item(i).getTextContent());

                                            }
                                        }
                                    }

                                    else {
                                        return;
                                    }

                                    case (2):

                                        Node rootNode1 = dok1.getFirstChild();
                                        System.out.println("Даты релиза игр:");
                                        NodeList list1 = rootNode1.getChildNodes();

                                        for (int i = 0; i < list1.getLength(); i++) {

                                            String nodeList = dok1.getElementsByTagName("year").item(i).getTextContent();

                                            System.out.println(nodeList);

                                        }
                                        System.out.println("Выберите год ");
                                        int chose1 = in.nextInt();

                                            if (chose1==2001) {

                                                for (int i = 0; i < list.getLength(); i++) {
                                                    String nodeList = dok1.getElementsByTagName("year").item(i).getTextContent();
                                                    if (nodeList.equals("2001")) {

                                                        System.out.println("название игры: " + dok1.getElementsByTagName("name").item(i).getTextContent());

                                                    }
                                                }
                                            }

                                            if (chose1==2003) {
                                                for (int i = 0; i < list.getLength(); i++) {
                                                    String nodeList = dok1.getElementsByTagName("year").item(i).getTextContent();
                                                    if (nodeList.equals("2003")) {

                                                        System.out.println("название игры: " + dok1.getElementsByTagName("name").item(i).getTextContent());

                                                    }
                                                }
                                            }
                                                else {
                                                    return;
                                            }

                                        break;
                                    default:
                                        return;
                                }
                                break;

                            case (3):

                                Document dok2 = builder.parse("D://Primer/task1.xml");
                                Node rootNode1 = dok2.getFirstChild();
                                NodeList list1 = rootNode1.getChildNodes();

                                System.out.println("Что хотите удалить?");
                                System.out.println("1. Удалить по названию игры");
                                System.out.println("2. Удалить по разработчику игры");
                                System.out.println("3. Удалить по дате релиза игр");
                                int chose3 = in.nextInt();
                                if (chose3==1){
                                    System.out.println(" игры:");

                                    for (int i = 0; i < list1.getLength(); i++) {

                                        String nodeList = dok2.getElementsByTagName("name").item(i).getTextContent();

                                        System.out.println(nodeList);

                                    }
                                    System.out.println("Введите название игры, которое хотите удалить");
                                    String gameName=in.next();
                                    for (int i = 0; i < list1.getLength(); i++){
                                    if (gameName.equals("max_payne")){

                                        Node node = list1.item(i);
                                        Element element=(Element)node;

                                        Node parentNode = element.getParentNode();
                                        parentNode.removeChild(element);


                                        for (int j = 0; j < list1.getLength(); j++) {
                                            String nodeList = dok2.getElementsByTagName("name").item(j).getTextContent();
                                            System.out.println(nodeList);

                                        }
                                        Transformer transformer1 =
                                                TransformerFactory.newInstance().newTransformer();
                                        DOMSource source1 = new DOMSource(dok2);
                                        StreamResult result1 = new StreamResult(new File("D://Primer/task1,5.xml"));
                                        transformer1.transform(source1, result1);
                                    }
                                    if (gameName.equals("return_to_castle_wolfenstein")){



                                        for (int j = 0; j < list1.getLength(); j++) {
                                            String nodeList = dok2.getElementsByTagName("name").item(j).getTextContent();
                                            System.out.println(nodeList);

                                        }
                                    }
                                    if (gameName.equals("counter-strike_1.6")){




                                        for (int j = 0; j < list1.getLength(); j++) {
                                            String nodeList = dok2.getElementsByTagName("name").item(j).getTextContent();
                                            System.out.println(nodeList);

                                        }
                                    }
                                    else {return;}

                                    }
                                    Transformer transformer1 =
                                            TransformerFactory.newInstance().newTransformer();
                                    DOMSource source1 = new DOMSource(dok2);
                                    StreamResult result1 = new StreamResult(new File("D://Primer/task2.xml"));
                                    transformer1.transform(source1, result1);
                                }
                                return;


                            default:

                                return;
                        }

                }
            } catch (SAXException | TransformerException | IOException | ParserConfigurationException ex) {
            throw new RuntimeException(ex);
        }
    }


    }










