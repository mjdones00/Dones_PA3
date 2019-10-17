import java.security.SecureRandom;
import java.util.Scanner;

public class DivisionTest {
    private static boolean result;
    private static double UserDivisionInput;
    private int rightCounter = 0;
    private int wrongCounter = 0;

    private  int getRandNum(SecureRandom rand, int bound) {
        return rand.nextInt(bound);
    }
    private String pseudoRanPositive(SecureRandom rand){
        int option = getRandNum(rand, 3);

        switch (option) {
            case 0:
                return "Very good!";
            case 1:
                return "Excellent!";
            case 2:
                return "Nice work!";
            default:
                return "Keep up the good work!";
        }
    }
    private String pseudoRanNegative(SecureRandom rand){
        int option = getRandNum(rand, 3);

        switch (option){
            case 0:
                return "No. Please try again.";
            case 1:
                return "Wrong. Try once more.";
            case 2:
                return "Don't give up!";
            default:
                return "No. Keep trying.";
        }

    }

    public int generateNewTest(Scanner scnr, SecureRandom rand, int numRuns,int numSize) {
        int i;
        rightCounter =0;
        wrongCounter = 0;
        while(numRuns > 0) {
            int num1 = getRandNum(rand, numSize);
            int num2 = getRandNum(rand, numSize);
            double Division = (double) num1 / num2;


            System.out.println("How much is " + num1 + " divided " + num2 + "?");
            UserDivisionInput = scnr.nextDouble();
            if (UserDivisionInput == Division) {
                System.out.println(pseudoRanPositive(rand));
                rightCounter++;
            }
            else if (UserDivisionInput != Division) {
                System.out.println(pseudoRanNegative(rand));
                wrongCounter++;

            }
        numRuns--;}

        return rightCounter;
    }
    public int percentageCalculator(double right){
        double division =  right/10 * 100;

        if (division < 75.0){
            System.out.println("Please ask your teacher for extra help");
            return 0;}
        else {
            System.out.println("Congratulation, you are ready to go to the next level");
            return 1;
        }
    }
    public void printWrong(){
        System.out .println("Wrong answers total: " + wrongCounter);
        wrongCounter = 0;
    }
    public void printRight(){
        System.out .println("Right answers total: " + rightCounter);
    rightCounter = 0;
    }



}
