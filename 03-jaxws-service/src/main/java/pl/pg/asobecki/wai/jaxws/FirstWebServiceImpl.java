package pl.pg.asobecki.wai.jaxws;

import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

/**
 * Created by asobecki on 29.03.17.
 */
@WebService(endpointInterface = "pl.pg.asobecki.wai.jaxws.FirstWebService")
public class FirstWebServiceImpl implements FirstWebService {

    public String getFirstWebServiceAsString(String name) {
        return "First Web Service JAX-WS "+name;
    }
}
