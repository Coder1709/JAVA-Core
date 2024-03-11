package org.example;

public class EmployeeFactory {


    //get the employee

    public static Employee getEmployee(String empType)
    {

        if(empType.trim().equalsIgnoreCase("Android Developer")) {
            return new AndroidDeveloper();
        }
        else if (empType.trim().equalsIgnoreCase("Web developer")){
            return new WebDeveloper();

        }
        else {
            return null;
        }

    }
}