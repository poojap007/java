package com.wipro.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Freshman {
    private String name;

    @Autowired
    @Qualifier("dormA") // if Qualifier is used
    private DormRoom room;

    public String getName() {
        return name;
    }

    public DormRoom getRoom() {
        return room;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void showDetails() {
        System.out.println("Freshman Name: " + name);
        System.out.println("Dorm Location: " + room.getLocation());
    }
}
