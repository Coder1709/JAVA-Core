package org.example;

class main {


    public static void main(String[] args) {
        System.out.printf("Hi");


       Employee e = EmployeeFactory.getEmployee("Web developer");
       e.salary();

    }
}

