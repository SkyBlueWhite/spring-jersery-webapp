package baeldung.server.model;

import javax.json.bind.annotation.JsonbPropertyOrder;

/**
 * Created by Administrator on 2018/8/3.
 */
@JsonbPropertyOrder({"id","name","sex","mobile","address"})
public class User {
    private long id;
    private String name;
    private int sex;
    private String mobile;
    private String address;

    public User(){
        super();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
