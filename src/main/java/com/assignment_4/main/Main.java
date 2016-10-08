package com.assignment_4.main;

import com.assignment_4.superclasses.BankAccount;
import com.assignment_4.subclasses.SavingAccount;
import com.assignment_4.subclasses.PersonalAccount;
import com.assignment_4.subclasses.BankCustomer;

public class Main {

    public static void main(String[] args) {

        //skapr en kund med tre bankkonto och visar som en String 
        BankCustomer customer = new BankCustomer("Mandana", 27);
        customer.addAccount(new BankAccount());
        customer.addAccount(new PersonalAccount());
        customer.addAccount(new SavingAccount());
        System.out.println(customer.toString());

        //setta pengar i  kunds forsta bankonto och visar som String
        String account = customer.getCustomerAccounts().get(0).getAccountNumber();
        System.out.println("Dipositing 30,0 to the first account");
        customer.depositToAccount(account, 30.0);
        System.out.println(customer.toString());

        //tar bort pengar från kunds andra konto och visar som String
        System.out.println("Withdrawing 200.0 to the first account");
        account = customer.getCustomerAccounts().get(1).getAccountNumber();
        customer.withdrawFromAccount(account, 200.0);
        System.out.println(customer.toString());

        // setta pengar i  kunds tredje bankonto och visar som String
        System.out.println("Dipositing 200.0 to the first account");
        account = customer.getCustomerAccounts().get(2).getAccountNumber();
        customer.depositToAccount(account, 200.0);
        System.out.println(customer.toString());
    }
}
