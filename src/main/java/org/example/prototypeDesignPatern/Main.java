package org.example.prototypeDesignPatern;

public class Main {

    public static void main(String[] args) {


       NetworkConnection nc=  new NetworkConnection()  ;

       nc.setIp("192.33.4.12");
       nc.loadVeryImportantData();

        System.out.println(nc.toString());

        //we want new object of network connection
        NetworkConnection nc2 = null;


        try {
            nc2 = (NetworkConnection) nc.clone();

        }
        catch (CloneNotSupportedException e){
            System.out.println(e.getMessage());
        }





    }
}