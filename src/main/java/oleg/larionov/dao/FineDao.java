package oleg.larionov.dao;

import oleg.larionov.models.Fine;

import java.util.List;

public interface FineDao {

    List<Fine> findAll();

    List<Fine> findWithParameters(String sec_name, String license_plate);

}
