package oleg.larionov.models;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
public class FineType {

    private  int id;
    private String fine_title;
    private int fine_fee;
    private int counter;

    public FineType() {
    }

    public FineType(int id, String fine_title, int fine_fee) {
        this.id = id;
        this.fine_title = fine_title;
        this.fine_fee = fine_fee;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFine_title() {
        return fine_title;
    }

    public void setFine_title(String fine_title) {
        this.fine_title = fine_title;
    }

    public int getFine_fee() {
        return fine_fee;
    }

    public void setFine_fee(int fine_fee) {
        this.fine_fee = fine_fee;
    }

    @Override
    public String toString() {
        return "FineType{" +
                "id=" + id +
                ", fine_title='" + fine_title + '\'' +
                ", fine_fee=" + fine_fee +
                '}';
    }
}
