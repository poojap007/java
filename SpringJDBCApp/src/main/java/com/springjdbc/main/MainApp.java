package com.springjdbc.main;

import com.springjdbc.config.AppConfig;
import com.springjdbc.dao.PersonDAO;
import com.springjdbc.model.Person;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class MainApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        PersonDAO dao = context.getBean(PersonDAO.class);

        System.out.println("List of person is:");
        dao.getAllPersons().forEach(System.out::println);

        System.out.println("\nGet person with ID 2");
        System.out.println(dao.getPersonById(2));

        System.out.println("\nCreating person:");
        dao.create(new Person(4, "Sergey", "Emets", 36));
        dao.getAllPersons().forEach(System.out::println);

        System.out.println("\nDeleting person with ID 2");
        dao.deleteById(2);

        System.out.println("\nUpdate person with ID 4");
        dao.update(new Person(4, "Sergey", "CHANGED", 36));

        System.out.println("\nList of person is:");
        dao.getAllPersons().forEach(System.out::println);

        context.close();
    }
}
