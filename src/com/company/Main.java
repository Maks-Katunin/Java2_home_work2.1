package com.company;

public class Main {

    public static void main(String[] args) {



        Third third = new Third("tretiy",
                3,
                " printable ");
        third.print();
        System.out.println("--------------------");

        Fourth fourth = new Fourth("chetvertiy",
                4,
                "printable",
                "perviy");
        fourth.print();
        System.out.println("--------------------");

    }
    public String createObject(String className){
        switch (className){
            case ("Second"):
                Second second = new Second("vtoroy", 2);
                second.print();
                System.out.println("--------------------");
                break;
        }



      return" ";
    }
}
