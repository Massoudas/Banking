package com.company;

public class Main {
    public static void main(String[] args) {
        Customer c1= new Customer(0,"015654555", "Bob Burger", "109981");
        Customer c2= new Customer(0, "091882881", "Bruce Lee", "199283");
        c1.deposit(1000);
        c2.deposit(2000);
        c1.withdraw(200);
        c2.withdraw(300);
        c1.transfer(400, c2);

    }
}
