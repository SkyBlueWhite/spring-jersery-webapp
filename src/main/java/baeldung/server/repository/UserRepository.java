package baeldung.server.repository;

import baeldung.server.model.User;

import java.util.List;

/**
 * Created by Administrator on 2018/8/3.
 */
public interface UserRepository {
    User get();
    List<User> getAllUser();
}
