package org.example.factoryDesignPattern;

import org.example.factoryDesignPattern.Employee;
import org.example.factoryDesignPattern.EmployeeFactory;

class main {


    public static void main(String[] args) {
        System.out.printf("Hi");


       Employee e = EmployeeFactory.getEmployee("Web developer");
       e.salary();

    }
}

