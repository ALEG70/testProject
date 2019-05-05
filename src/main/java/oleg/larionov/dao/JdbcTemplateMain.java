package oleg.larionov.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import javax.sql.DataSource;

@Repository
public class JdbcTemplateMain{

    static JdbcTemplate jdbcTemplate;

    @Autowired
    public void setDataSource(DataSource ds) {

        jdbcTemplate = new JdbcTemplate(ds);
    }
}
