package org.example.threads;


class A{

    public  void show(){

        for (int i = 0; i < 10; i++) {
            System.out.println("Hi");

        }

}



public class main {
    public static void main(String[] args) {
        A a = new A();

        B b = new B();

    }





    }
}
class B {

    public void show() {

        for (int i = 0; i < 10; i++) {
            System.out.println("Hi");

        }

    }
}

