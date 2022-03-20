package bankaccount;
import java.util.ArrayList;
import java.util.List;
import java.io.*;
public class BankAccountRepositoryImpl  implements  BankAccountRepository {

    private BankAccount bankAccount1;
    private BankAccount bankAccount2;

    public  BankAccountRepositoryImpl(){}

    public BankAccountRepositoryImpl(BankAccount bankAccount1, BankAccount bankAccount2) {
        this.bankAccount1 = bankAccount1;
        this.bankAccount2 = bankAccount2;
    }

    @Override
    public double getBalance(long accountId) {

  

        if(this.bankAccount1.getAccountId()==accountId){
           return bankAccount1.getAccountBalance();
        }
        else{
           return  bankAccount2.getAccountBalance();
        }




    }

    @Override
    public double updateBalance(long accountId, double newBalance) {

        double updatedBal=0;
         if(this.bankAccount1.getAccountId()==accountId){
             updatedBal = newBalance;
             bankAccount1.setAccountBalance(updatedBal);
         }
         else{
             updatedBal = newBalance;
             bankAccount2.setAccountBalance(updatedBal);
         }

     
        return updatedBal;
    }
}

