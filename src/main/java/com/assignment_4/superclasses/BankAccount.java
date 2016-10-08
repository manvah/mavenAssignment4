package com.assignment_4.superclasses;

import com.assignment_4.interfaces.BankOperations;
import java.util.UUID;
// BankAccount Implements to the bankoperation
public class BankAccount implements BankOperations {
    
    private String accountNumber = " ";
    private String accountType = " ";
    private double balance = 0.0;
    
    public BankAccount() {
        this.accountNumber = UUID.randomUUID().toString().substring(0, 6);
        this.accountType = "Bank account";
        this.balance = 0;
    }
    public void setAccountNumber (String accountNumber){
     
        this.accountNumber = accountNumber;  
    }
    public void setAccountType(String accountType) {
       
        this.accountType = accountType;
    }
    public void setBalance(double balance) {
        
        this.balance = balance;
    }
    public String getAccountNumber() {
        return accountNumber;
    }
    
      public String getAccountType() {
        return accountType;
    }
       public double getBalance() {
        return balance;
    }
       // tar ut pengar från bankkonto
      public void withdrawMoney(double amount){
          if (amount >= 0){
              setBalance (getBalance() - amount);
          }else {
              System.out.println("You can not withdraw a negative value!  ");
          }
      }
      // seta in pengar på bankkonto
       public void depositMoney (double amount) {
           if (amount >= 0){
              setBalance (getBalance() + amount);
          }else {
              System.out.println("You can not deposit a negative value!  ");
          } 
           
       }
       // retunera alla kunds bankkonto som en String
       public String toString (){
         return "BankAccount [accountNumber= " + accountNumber + ", accountType= " + accountType + ", balance= " + balance + "]";
				
       }
}
