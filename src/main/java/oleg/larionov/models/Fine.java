package oleg.larionov.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;

@Service
public class Fine {

    public Fine() {
    }

    public Fine(int id_fine, int id_car, int id_type) {
        this.id_fine = id_fine;
        this.id_car = id_car;
        this.id_type = id_type;
    }

    public Fine(int id_fine, int id_car, int id_type, FineType type, Car car) {
        this.id_fine = id_fine;
        this.id_car = id_car;
        this.id_type = id_type;
        this.type = type;
        this.car = car;
    }


    public int getId_car() {
        return id_car;
    }

    public int getId_type() {
        return id_type;
    }

    @Autowired
    public void setType(FineType type) {
        this.type = type;
    }

    @Autowired
    public void setCar(Car car) {
        this.car = car;
    }

    public Car getCar() {
        return car;
    }

    public FineType getType() {
        return type;
    }

    public void setId_car(int id_car) {
        this.id_car = id_car;
    }

    public void setId_type(int id_type) {
        this.id_type = id_type;
    }

    public int getId_fine() {
        return id_fine;
    }

    public void setId_fine(int id_fine) {
        this.id_fine = id_fine;
    }

    public int getCtr() {
        return ctr;
    }

    public void setCtr(int ctr) {
        this.ctr = ctr;
    }

    private int id_fine;
    private int id_car;
    private int id_type;
    private int ctr;

    private FineType type;
    private Car car;
}
