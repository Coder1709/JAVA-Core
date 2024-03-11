package org.example.builderDesignPattern;

public class Main {

    public static void main(String[] args) {
       User user =  new User.UserBuilder()
               .setUserId("12")
               .setUserName("arpit")
               .setAddress("lko")
               .setEmail("arpit@gmail.com,")
               .build();


        System.out.println(user);
    }


}
