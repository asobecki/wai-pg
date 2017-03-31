package pl.pg.asobecki.wai.spring;

import io.spring.guides.gs_producing_web_service.GetRegionRequest;
import io.spring.guides.gs_producing_web_service.GetRegionResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

/**
 * Created by asobecki on 30.03.17.
 */
public class RegionsClient extends WebServiceGatewaySupport {
    private static final Logger log = LoggerFactory.getLogger(RegionsClient.class);

    // create class using: xjc -d . -wsdl http://localhost:8080/ws/regions.wsdl

    public GetRegionResponse getRegion(String name) {
        GetRegionRequest request = new GetRegionRequest();
        request.setName(name);
        log.info("Requesting region for "+name);

        GetRegionResponse response = (GetRegionResponse) getWebServiceTemplate()
                .marshalSendAndReceive("http://127.0.0.1:8080/ws",
                        request,
                        new SoapActionCallback("getRegion")); // http://spring.io/guides/gs-producing-web-service/getRegion


        log.info("Response from web service: "+printResponse(response));
        return response;
    }

    private String printResponse(GetRegionResponse response) {
        StringBuilder sb = new StringBuilder();
        sb.append("Capital: "+response.getRegion().getCapital());
        sb.append("\n");
        sb.append("Population: "+response.getRegion().getPopulation());
        sb.append("\n");
        return sb.toString();
    }

}
