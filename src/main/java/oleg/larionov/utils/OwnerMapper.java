package oleg.larionov.utils;

import oleg.larionov.models.Owner;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class OwnerMapper implements RowMapper {

    @Override
    public Owner mapRow(ResultSet resultSet, int i) throws SQLException {
        Owner owner = new Owner();
        owner.setId(resultSet.getInt("id_owner"));
        owner.setName(resultSet.getString("name"));
        owner.setSec_name(resultSet.getString("sec_name"));
        return owner;
    }
}
