
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

public class XMLReader {

    public static void main(String[] args) {
        try {
            // Carica il file XML
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document = builder.parse("src/volpe.xml");

            // Esegui metodo stampa 
            printAllFoxes(document);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void printAllFoxes(Document document) {
        // Ottieni l'elemento "fauna"
        Element faunaElement = (Element) document.getElementsByTagName("fauna").item(0);

        // Ottieni tutti gli elementi "esemplare" all'interno dell'elemento "fauna"
        NodeList esemplareList = faunaElement.getElementsByTagName("esemplare");

        // Elabora i risultati
        for (int i = 0; i < esemplareList.getLength(); i++) {
            Element esemplareElement = (Element) esemplareList.item(i);

            // Controlla se la specie è "Volpe"
            String specie = esemplareElement.getElementsByTagName("specie").item(0).getTextContent();
            if ("Volpe".equals(specie)) {
                // Stampa il nome della volpe
                String nome = esemplareElement.getElementsByTagName("nome").item(0).getTextContent();
                System.out.println("Nome della volpe: " + nome);
            }
        }
    }
}
//fonte: https://www.lim.di.unimi.it/teaching/materiali/progmus/09_xml.pdf?PHPSESSID=7n3t18hfdu94h9h0c8dfv9h296 