package pl.pg.asobecki.wai.jaxrs.service;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Application;
import javax.ws.rs.core.Response;

/**
 * Created by asobecki on 29.03.17.
 */
public class RestWebService extends Application {
    @GET
    @Path("/rest-service/{param1}")
    public Response getInfo(@PathParam("param1") String info) {
        String response = "Response from rest web service: "+info;
        return Response.status(200).entity(response).build();
    }
}
