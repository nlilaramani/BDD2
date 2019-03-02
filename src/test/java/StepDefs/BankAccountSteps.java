/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StepDefs;

import com.itexps.bdd2.BankAccount;
import com.itexps.bdd2.BankCustomer;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

/**
 *
 * @author Owner
 */
public class BankAccountSteps {
    BankCustomer bc;
    BankAccount saving;
    BankAccount checking;
    @Given("^Tom is a Bank Customer$")
    public void createBC(){
        bc=new BankCustomer("Tom","aa",123);
    }
    @And("Tom has a Savings account with balance of 5000.00")
             public void createSaving(){
        saving=new BankAccount(123,bc,"saving",5000.00);
    }
    @And("has a Checking account with balance of 2500.00")
     public void createChecking(){
       checking=new BankAccount(123,bc,"checking",2500.00);
    }
    
   
    
}
