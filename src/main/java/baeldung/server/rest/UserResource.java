package baeldung.server.rest;

import baeldung.server.model.User;
import baeldung.server.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import java.util.List;

/**
 * Created by Administrator on 2018/8/3.
 */
@Path("/user")
@Consumes("application/json")
public class UserResource {

    @Autowired
    private UserRepository userRepository;

    @Path("/getOne")
    @GET
    @Produces("application/json")
    public User getUserById(){
        return userRepository.get();
    }

    @GET
    @Produces("application/json")
    public List<User> getAllUser(){
      return   userRepository.getAllUser();
    }
}
