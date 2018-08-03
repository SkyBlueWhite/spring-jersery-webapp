package baeldung.server.repository;

import baeldung.server.model.User;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2018/8/3.
 */
@Component
public class UserRepositoryImp implements UserRepository {
    private List<User> list;

    public UserRepositoryImp(){
        list = new ArrayList<User>();
        User user = new User();
        user.setId(1);
        user.setName("jack");
        user.setSex(1);
        user.setMobile("15436234662");
        user.setAddress("GangZhou ZHUJIANG NEW TOWN!");
        User user1 = new User();
        user1.setId(2);
        user1.setName("Collin");
        user1.setSex(0);
        user1.setMobile("131434352");
        user1.setAddress("NEW YOURK LOWS!");
        list.add(user);
        list.add(user1);
    }

    public User get() {

        return list.get(0);
    }


    public List<User> getAllUser() {

        return list;
    }
}
