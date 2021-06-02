package org.example.entity;

import lombok.Data;

@Data
public class Program {

    public Program(String name){
        this.name = name;
    }
    private String name;


}
