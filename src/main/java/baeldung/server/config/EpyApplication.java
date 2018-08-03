package baeldung.server.config;

import baeldung.server.exception.AlreadyExistsExceptionHandler;
import baeldung.server.exception.NotFoundExceptionHandler;
import baeldung.server.rest.EmployeeResource;
import baeldung.server.rest.UserResource;
import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.server.spring.scope.RequestContextFilter;

/**
 * Created by Administrator on 2018/8/3.
 */
public class EpyApplication extends ResourceConfig {
   public EpyApplication(){
       register(RequestContextFilter.class);
       register(UserResource.class);
       register(EmployeeResource.class);
       register( NotFoundExceptionHandler.class);
       register( AlreadyExistsExceptionHandler.class);
   }

}
