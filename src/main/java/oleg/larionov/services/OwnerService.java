package oleg.larionov.services;

import oleg.larionov.dao.JdbcOwnerDao;
import oleg.larionov.dao.OwnerDao;
import oleg.larionov.models.Owner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class OwnerService {

    public List<Owner> findAll(){

        return ownerDao.findAll();
        }

    public Owner findById(Integer id_owner){

        return ownerDao.findById(id_owner);
    }

    @Autowired
    public void setOwnerDao(OwnerDao ownerDao) {
        this.ownerDao = ownerDao;
    }

    private OwnerDao ownerDao;

 }
