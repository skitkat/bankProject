package org.example;

public class SavingAccount {

    public double balance;
    public SavingAccount(double balance) {
        this.balance = balance;
    }
    public void withdraw(double amount){
        if(balance >= amount){
            balance -= amount;
            // intentionally wrong behavior of method
//            balance -= 1;
            System.out.println("Withdraw Successful");
        }
        else {
            System.out.println("Insufficient balance");
        }
    }
    public void deposit(double amount){
        balance += amount;
        System.out.println("balance is updated");
    }

    public double getBalance(){
        System.out.println("Current balance is: " + balance);
        return balance;
    }
//    public static void main(String[] args) {
//
//    }
}
