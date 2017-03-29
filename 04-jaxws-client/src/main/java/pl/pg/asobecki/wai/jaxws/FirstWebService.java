package pl.pg.asobecki.wai.jaxws;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

/**
 * Created by asobecki on 29.03.17.
 */
@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface FirstWebService {
    @WebMethod
    String getFirstWebServiceAsString(String name);
}
