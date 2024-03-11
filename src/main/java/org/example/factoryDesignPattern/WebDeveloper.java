package org.example.factoryDesignPattern;

import org.example.factoryDesignPattern.Employee;

public class WebDeveloper implements Employee {


    @Override
    public int salary() {
        System.out.println("Web Developer Salary");
        return 44440;
    }
}
