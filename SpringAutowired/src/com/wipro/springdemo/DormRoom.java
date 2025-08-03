package com.wipro.springdemo;

public class DormRoom {
    private int number;
    private String building;

    public DormRoom() {} // default constructor

    public DormRoom(int number, String building) {
        this.number = number;
        this.building = building;
    }

    public String getLocation() {
        return "Room " + number + " in " + building + " building.";
    }

    // setters
    public void setNumber(int number) {
        this.number = number;
    }

    public void setBuilding(String building) {
        this.building = building;
    }
}
