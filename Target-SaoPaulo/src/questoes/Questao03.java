package questoes;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Element;
import java.io.InputStream;
import java.io.FileNotFoundException;

public class Questao03 {

    private double[] faturamentoDiario;
    private double menorValor = 10;
    private double maiorValor;
    private double media;

    public Questao03(String xmlFilePath) throws Exception {
        carregarFaturamentoDoXML(xmlFilePath);
    }

    private void carregarFaturamentoDoXML(String xmlFilePath) throws Exception {
        // Carregar o arquivo XML do classpath
        InputStream xmlStream = getClass().getClassLoader().getResourceAsStream("questoes/" + xmlFilePath);
        if (xmlStream == null) {
            throw new FileNotFoundException("Arquivo XML não encontrado: " + xmlFilePath);
        }

        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document doc = builder.parse(xmlStream);

        doc.getDocumentElement().normalize();
        NodeList nodeList = doc.getElementsByTagName("row");

        faturamentoDiario = new double[nodeList.getLength()];
        double soma = 0;
        menorValor = Double.MAX_VALUE;
        maiorValor = Double.MIN_VALUE;

        for (int i = 0; i < nodeList.getLength(); i++) {
            Element element = (Element) nodeList.item(i);
            double valor = Double.parseDouble(element.getElementsByTagName("valor").item(0).getTextContent());
            faturamentoDiario[i] = valor;
            soma += valor;

            if (valor < menorValor) {
                menorValor = valor;
            }
            if (valor > maiorValor) {
                maiorValor = valor;
            }
        }

        media = soma / faturamentoDiario.length;
    }

    public double getMenorValor() {
        return menorValor;
    }

    public double getMaiorValor() {
        return maiorValor;
    }

    public int contarDiasAcimaDaMedia() {
        int contador = 0;
        for (double valor : faturamentoDiario) {
            if (valor > media) {
                contador++;
            }
        }
        return contador;
    }
}