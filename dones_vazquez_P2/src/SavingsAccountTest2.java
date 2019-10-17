import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SavingsAccountTest2 {
    private int i;
    @Test
    public void testSaver1annualInterestCalculation4Percent(){
        SavingsAccount saver1 = new SavingsAccount(2000,4);
        System.out.println();
        System.out.println("Saver #1 interest over a year:");
        double balance = 2000;
        for (i=1;i < 13; i++) {
            balance += Math.floor((balance * .04)/12 * 100)/100;
           saver1.calculateMonthlyInterest();
           assertEquals(balance, saver1.getSavingsBalance());
           System.out.printf("%d. %.2f\n", i, saver1.getSavingsBalance());
       }
    }
    @Test
    public void testSaver2annualInterestCalculation5Percent(){
        SavingsAccount saver2 = new SavingsAccount(3000, 5);
        System.out.println();
        System.out.println("Saver #2 interest over a year at 4%%:");
        double balance = 3000;
        for (i=1;i < 13; i++) {
            balance += Math.floor((balance * .05)/12 * 100)/100;
            saver2.calculateMonthlyInterest();
            assertEquals(balance, saver2.getSavingsBalance());
            System.out.printf("%d. %.2f \n", i,  saver2.getSavingsBalance());
        }
    }
    @Test
    public void testSaver1annualInterestCalculation5Percent(){
        SavingsAccount saver1 = new SavingsAccount(2000,5);
        System.out.println();
        System.out.println("Saver #2 interest over a year at 5%%:");
        double balance = 2000;
        for (i=1;i < 13; i++) {
            balance += Math.floor((balance * .05)/12 * 100)/100;
            saver1.calculateMonthlyInterest();
            assertEquals(balance, saver1.getSavingsBalance());
            System.out.printf("%d. %.2f\n", i, saver1.getSavingsBalance());
        }
    }
    @Test
    public void testSaver2annualInterestCalculation4Percent(){
        SavingsAccount saver2 = new SavingsAccount(3000, 4);
        System.out.println();
        System.out.println("Saver #2 interest over a year at 5%%:");
        double balance = 3000;
        for (i=1;i < 13; i++) {
            balance += Math.floor((balance * .04)/12 * 100)/100;
            saver2.calculateMonthlyInterest();
            assertEquals(balance, saver2.getSavingsBalance());
            System.out.printf("%d. %.2f \n", i,  saver2.getSavingsBalance());
        }
    }

}