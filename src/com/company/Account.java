package com.company;

public class Account {

    double balance;
    String accountNumber;

    public Account(double balance, String accountNumber) {
        this.balance = balance;
        this.accountNumber = accountNumber;
    }


    public void deposit(double amount){
        if(amount>0){
            balance+=amount;
            System.out.println("you have deposited "+ amount + " and your current balance is: "+ balance);
        }else{
            System.out.println("Unsuccessful transaction");
        }
    }
    public void withdraw(double amount){
        if(amount>0&& balance>amount){
            balance-=amount;
            System.out.println("you have withdrawn "+ amount + " and your current balance is: "+ balance);
        }else{
            System.out.println("Unsuccessful transaction");
        }

    }
    public void transfer(double amount, Customer customer){
        if(amount>0&& balance>amount){
            this.balance-=amount;
            customer.balance+=amount;
            System.out.println(customer.customerName + " current balance is: " + customer.balance);

            System.out.println("you have transferred "+ amount + " to account number: "+ accountNumber + " account holder:" +customer.customerName );
            System.out.println("your new balance is: " +balance);
        }else{
            System.out.println("Unsuccessful transaction");
        }

    }
}
