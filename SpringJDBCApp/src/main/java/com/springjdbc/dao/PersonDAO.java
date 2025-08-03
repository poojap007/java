package com.springjdbc.dao;

import com.springjdbc.model.Person;
import java.util.List;

public interface PersonDAO {
    void create(Person person);
    Person getPersonById(int id);
    List<Person> getAllPersons();
    void deleteById(int id);
    void update(Person person);
}
