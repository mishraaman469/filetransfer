import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class Read {
	
	 public static void main(String[] args) {
			String FILENAME = "C:\\Users\\Aman\\Documents\\workspace-spring-tool-suite-4-4.9.0.RELEASE\\CodingChallenge\\ColudStreamPractice\\DemoProj\\target\\surefire-reports\\TEST-com.mindtree.talent.controller.DemoControllerTest.xml";
			 DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			 try {
				 
				 DocumentBuilder db = dbf.newDocumentBuilder();
				 Document doc = db.parse(new File(FILENAME));
				 doc.getDocumentElement().normalize();
				 System.out.println("Root Element :" + doc.getDocumentElement().getNodeName());
				 System.out.println("------");
				 
				 NodeList list = doc.getElementsByTagName("testcase");
				 System.out.println(list.getLength());
				 for(int temp=0;temp<list.getLength();temp++) {
					 Node node=list.item(temp);
					 System.out.println(node.getNodeName());
					 System.out.println(node.getChildNodes());
						/*
						 * if(node.getNodeType()==Node.ELEMENT_NODE) { Element element= (Element) node;
						 * String
						 * failure=element.getElementsByTagName("failure").item(0).getTextContent();
						 * System.out.println("TestCases :"+node.getNodeName());
						 * System.out.println("Failure"+failure); }
						 */
					 
				 }
				 
			 }catch (Exception e) {
				// TODO: handle exception
			}
	}
		
}
