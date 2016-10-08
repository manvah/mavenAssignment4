package com.assignment_4.subclasses;
/**
 * SavingAccount är en subclass som arv från classen BankAccount
 * som skapar ett unikt id och id nummer, type av bankkonto, sparkonto 
 */
import com.assignment_4.superclasses.BankAccount;
import java.util.UUID;

public class SavingAccount extends BankAccount {
    public SavingAccount(){
       this.setAccountNumber(UUID.randomUUID().toString().substring(0, 6));
       this.setAccountType("Saving account");
       this.setBalance(0.0);
    }
}
