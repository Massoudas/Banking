package com.company;

public class Customer extends Account {


    String customerName;
    String customerPhoneNumber;
    Account account;

    public Customer(double balance, String accountNumber, String customerName, String customerPhoneNumber) {
        super(balance, accountNumber);
        this.customerName = customerName;
        this.customerPhoneNumber = customerPhoneNumber;

    }

}
