package com.springjdbc.dao;

import java.util.List;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import com.springjdbc.model.Person;

@Repository
public abstract class PersonDAOImpl implements PersonDAO {

    private JdbcTemplate jdbcTemplate;

    public PersonDAOImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<Person> getAllPersons() {
        String sql = "SELECT * FROM person";
        return jdbcTemplate.query(sql, (rs, rowNum) -> {
            Person p = new Person();
            p.setId(rs.getInt("id"));
            p.setName(rs.getString("name"));
            p.setAge(rs.getInt("age"));
            return p;
        });
    }
}
