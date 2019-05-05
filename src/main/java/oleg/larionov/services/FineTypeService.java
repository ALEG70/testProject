package oleg.larionov.services;

import oleg.larionov.dao.FineTypeDao;
import oleg.larionov.dao.JdbcFineTypeDao;
import oleg.larionov.models.FineType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class FineTypeService {

   public List<FineType> findAll(){

       return fineTypeDao.findAll();
   }

   public List<FineType> pickTopFines(Integer limit) {

       return fineTypeDao.topFines(limit);
   }

    @Autowired
    public void setFineTypeDao(FineTypeDao fineTypeDao) {
        this.fineTypeDao = fineTypeDao;
    }

    private FineTypeDao fineTypeDao;
}
