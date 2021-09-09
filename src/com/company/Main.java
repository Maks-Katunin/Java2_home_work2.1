package com.company;

public class Main {

    public static void main(String[] args) {

        createObject("Second");
        createObject("Third");
        createObject("Fourth");
        createObject("Fifth");


    }

    public static void createObject(String className) {
        switch (className) {
            case ("Second"):
                Second second = new Second("vtoroy",
                        2);
                second.print();
                System.out.println("--------------------");
                break;
            case ("Third"):
                Third third = new Third("tretiy",
                        3,
                        " printable ");
                third.print();
                System.out.println("--------------------");
                break;

            case ("Fourth"):
                Fourth fourth = new Fourth("chetvertiy",
                        4,
                        "printable",
                        "perviy");
                fourth.print();
                System.out.println("--------------------");
            default:
                System.out.println("Wrond data");
        }


    }
}
