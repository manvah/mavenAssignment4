package com.assignment_4.subclasses;
/** PersonalAccount är en subclass som arv från classen BankAccount
som skapar ett unikt id och id nummer, type av bankkonto, sparkonto
*/
import com.assignment_4.superclasses.BankAccount;
import java.util.UUID;

public class PersonalAccount extends BankAccount {
   
    public PersonalAccount() {
        this.setAccountNumber(UUID.randomUUID().toString().substring(0, 6));
        this.setAccountType("Personal account");
        this.setBalance(0.0);
    }
}
