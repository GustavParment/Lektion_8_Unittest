package com.Gustav.Unittest;




public class Main {
    public static void main(String[] args) {

        Student benny = new Student("Benny",15, false);
        School sti = new School("STI", 10);



        sti.introduceStudent(benny);

        System.out.println(benny);


        String name = "Teresa";
        int age = 15;


        if(age == 15 && name.equalsIgnoreCase("teresa")){
            System.out.println("YOU REALLY ARE TERESA");
        }
    }
}
