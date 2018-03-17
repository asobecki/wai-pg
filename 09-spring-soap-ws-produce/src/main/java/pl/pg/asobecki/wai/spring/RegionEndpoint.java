package pl.pg.asobecki.wai.spring;

import io.spring.guides.gs_producing_web_service.GetRegionRequest;
import io.spring.guides.gs_producing_web_service.GetRegionResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

/**
 * Created by asobecki on 30.03.17.
 */
@Endpoint // register the class with Spring WS as potential handler for SOAP incoming message
public class RegionEndpoint {
    private static final String NAMESPACE_URI = "http://spring.io/guides/gs-producing-web-service";


    private RegionRepository regionRepository;

    @Autowired
    public RegionEndpoint(RegionRepository regionRepository) {
        this.regionRepository = regionRepository;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getRegionRequest") // wybór metody do przetwarzania żądań SOAP
    @ResponsePayload    // response will be placed in response payload (body) - ustalona konwersja odpowiedzi na wiadomość
    public GetRegionResponse getRegion(@RequestPayload GetRegionRequest request) {
        GetRegionResponse response = new GetRegionResponse();
        response.setRegion(regionRepository.findRegion(request.getName()));

        return response;
    }
}
