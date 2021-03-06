//package baeldung.server.config;
//
//import baeldung.server.exception.AlreadyExistsExceptionHandler;
//import baeldung.server.exception.NotFoundExceptionHandler;
//import baeldung.server.rest.EmployeeResource;
//
//import javax.ws.rs.ApplicationPath;
//import javax.ws.rs.core.Application;
//import java.util.Arrays;
//import java.util.HashSet;
//import java.util.Set;
//
//@ApplicationPath("/resources")
//public class RestConfig extends Application {
//    public Set<Class<?>> getClasses() {
//        return new HashSet<Class<?>>(Arrays.asList(EmployeeResource.class, NotFoundExceptionHandler.class, AlreadyExistsExceptionHandler.class));
//    }
//}