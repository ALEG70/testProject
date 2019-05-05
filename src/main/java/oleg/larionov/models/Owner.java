package oleg.larionov.models;

import org.springframework.stereotype.Service;

@Service
public class Owner {

    public Owner() {
    }

    public Owner(int id, String name, String sec_name) {
        this.id = id;
        this.name = name;
        this.sec_name = sec_name;
    }

    @Override
    public String toString() {
        return "Owner{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sec_name='" + sec_name + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSec_name() {
        return sec_name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSec_name(String sec_name) {
        this.sec_name = sec_name;
    }

    private int id;
    private String name;
    private String sec_name;
}
