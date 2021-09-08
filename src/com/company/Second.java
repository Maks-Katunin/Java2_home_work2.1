package com.company;

public class Second extends First {
    private int serialNumber;



    public Second(String name,
                  int serialNumber) {
        super(name);
        this.serialNumber = serialNumber;
    }



    @Override
    public void print() {
        super.print();
        System.out.println(serialNumber);
    }
}
