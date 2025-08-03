package com.example.beans;

import org.springframework.stereotype.Component;
import java.util.List;

@Component
public class Bank {
    private List<String> branches;

    public void setBranches(List<String> branches) {
        this.branches = branches;
    }

    public void displayBranches() {
        System.out.println("Bank Branches:");
        branches.forEach(System.out::println);
    }
}
