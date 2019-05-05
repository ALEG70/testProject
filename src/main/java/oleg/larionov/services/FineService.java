package oleg.larionov.services;

import oleg.larionov.dao.FineDao;
import oleg.larionov.dao.JdbcFineDao;
import oleg.larionov.models.Fine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class FineService {

    public List<Fine> findWithParameters(String sec_name, String license_plate){
        sec_name = sec_name.replaceAll("\\s+","").toLowerCase();
        license_plate = license_plate.replaceAll("\\s+","").toLowerCase();
        return fineDao.findWithParameters(sec_name, license_plate);
    }

    public List<Fine> findAll(){
        return fineDao.findAll();
    }

    private FineDao fineDao;

    @Autowired
    public void setFineDao(FineDao fineDao) {
        this.fineDao = fineDao;
    }

}
