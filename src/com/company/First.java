package com.company;

public class First implements Printable{
    private String name;

    public First(String name) {
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println(name);
    }
}
