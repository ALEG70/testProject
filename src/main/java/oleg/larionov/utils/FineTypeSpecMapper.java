package oleg.larionov.utils;

import oleg.larionov.models.FineType;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class FineTypeSpecMapper implements RowMapper<FineType> {

    @Override
    public FineType mapRow(ResultSet resultSet, int i) throws SQLException {

        FineType fineType = new FineType();
        fineType.setId(resultSet.getInt("id_ft"));
        fineType.setFine_title(resultSet.getString("title"));
        fineType.setFine_fee(resultSet.getInt("price"));
        fineType.setCounter(resultSet.getInt("ctr"));
        return fineType;
    }
}

