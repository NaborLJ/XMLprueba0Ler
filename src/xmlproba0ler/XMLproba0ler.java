
package xmlproba0ler;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;


public class XMLproba0ler {


    public static void main(String[] args) throws FileNotFoundException, XMLStreamException {
        String fichero ="/home/oracle/NetBeansProjects/XMLproba0/autores.xml";
        XMLInputFactory inputFactory = XMLInputFactory.newInstance();
        XMLStreamReader reader = inputFactory.createXMLStreamReader(new FileReader(fichero));
        
        while (reader.hasNext()) {
  int eventType = reader.next();
  
  switch (eventType) {
      case 1:
          if("autor".equals(reader.getLocalName())){
              System.out.println("Codigo del autor :"+reader.getAttributeValue(0));
          }
          if("nome".equals(reader.getLocalName())){
              System.out.println(reader.getElementText());
          }
          if("titulo".equals(reader.getLocalName())){
              System.out.println(reader.getElementText());
          }
      break;
  }
    
      
    
}
        reader.close();
    }
    
}
