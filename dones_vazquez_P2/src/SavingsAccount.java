import java.util.*;


public class SavingsAccount  {
    private static double annualInterestRate;
    private  double savingsBalance;

    public SavingsAccount(){

    }

    public SavingsAccount(double balance, double interestRate)
    {
        savingsBalance = balance;
    annualInterestRate = interestRate;
    }

    public void calculateMonthlyInterest() {
        savingsBalance += Math.floor((savingsBalance * (annualInterestRate/100)/12) *100) / 100 ;

    }

    public void modifyInterestRate(double newInterestRate){
    annualInterestRate = newInterestRate;
    }

    public double getAnnualInterestRate(){
       return annualInterestRate;

    }
    public double getSavingsBalance(){

        return savingsBalance;
    }

}