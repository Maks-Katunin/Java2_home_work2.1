package com.company;

public class Third extends First {

    private int serialNumber;
    private String interfaceName;


    public Third(String name,
                 int serialNumber,
                 String interfaceName) {
        super(name);
        this.serialNumber = serialNumber;
        this.interfaceName = interfaceName;
    }

    @Override
    public void print() {
        super.print();
        System.out.println(serialNumber);
        System.out.println(interfaceName);
    }
}
