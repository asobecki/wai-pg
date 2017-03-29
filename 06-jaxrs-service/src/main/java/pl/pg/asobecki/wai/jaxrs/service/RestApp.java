package pl.pg.asobecki.wai.jaxrs.service;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by asobecki on 29.03.17.
 */
@ApplicationPath("/rest")
public class RestApp extends Application {
    public Set<Class<?>> getClasses() {
        return new HashSet<Class<?>>(Arrays.asList(RestWebService.class));
    }
}
