package pl.pg.asobecki.wai.jaxws;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.URL;

public class Main {

    public static void main(String[] args) throws Exception {

        URL url = new URL("http://localhost:8080/jax-ws/first-ws?wsdl");
        QName qName = new QName("http://jaxws.wai.asobecki.pg.pl/", "FirstWebServiceImplService");
        Service service = Service.create(url, qName);
        FirstWebService firstWebService = service.getPort(FirstWebService.class);
        System.out.println(firstWebService.getFirstWebServiceAsString("test string"));
    }
}
