package com.assignment_4.subclasses;

import java.util.ArrayList;
import com.assignment_4.superclasses.BankAccount;
import com.assignment_4.superclasses.Human;
//BankCustomer suclass to human
public class BankCustomer extends Human {

    private ArrayList<BankAccount> customerAccounts = new ArrayList<BankAccount>();

    public BankCustomer(String name, int age) {
        super(name, age);
    }

    public void setCustomerAccounts(ArrayList<BankAccount> customerAccounts) {
        this.customerAccounts = customerAccounts;
    }

    public ArrayList<BankAccount> getCustomerAccounts() {
        return customerAccounts;
    }
    //skapar bankkonto till kunder
    public void addAccount(BankAccount bankAccount) {
        customerAccounts.add(bankAccount);

    }
     //kollar bankkonto om det stämmer setta  pengar i bankkonto
    public void depositToAccount(String accountNumber, double amount) {
        for (int i = 0; i < customerAccounts.size(); i++) {
            if (customerAccounts.get(i).getAccountNumber().equals(accountNumber)) {
                customerAccounts.get(i).depositMoney(amount);
            }
        }
    }
     // kollar bankkonto om det stämmer tar bort pengar från bankonto
    public void withdrawFromAccount(String accountNumber, double amount) {
        for (int i = 0; i < customerAccounts.size(); i++) {
            if (customerAccounts.get(i).getAccountNumber().equals(accountNumber)) {
                customerAccounts.get(i).withdrawMoney(amount);

            }
        }
    }

    // retunera kund informathion som en String
    public String toString(){
        String customerInfo = "Customer: " + getName() + " Age: " + getAge() + "\n";
        for (int i=0 ; i < getCustomerAccounts().size() ; i++) {
            customerInfo = customerInfo + " " + getCustomerAccounts().get(i) + "\n";
        }
        return customerInfo;
    }
       
}
