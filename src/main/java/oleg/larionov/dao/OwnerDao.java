package oleg.larionov.dao;

import oleg.larionov.models.Car;
import oleg.larionov.models.Owner;

import java.util.List;

public interface OwnerDao {

    List<Owner> findAll();

    Owner findById(Integer id);

}
