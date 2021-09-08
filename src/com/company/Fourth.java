package com.company;

public class Fourth extends First {

    private int serialNumber;
    private String interfaceName;
    private String ancestorName;


    public Fourth(String name,
                  int serialNumber,
                  String interfaceName,
                  String ancestorName) {
        super(name);
        this.serialNumber = serialNumber;
        this.interfaceName = interfaceName;
        this.ancestorName = ancestorName;
    }

    @Override
    public void print() {
        super.print();
        System.out.println(serialNumber);
        System.out.println(interfaceName);
        System.out.println(ancestorName);
    }
}
