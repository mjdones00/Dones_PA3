import java.security.SecureRandom;
import java.util.Scanner;

public class RandomSelection {
int choice;
private int result = 0;

    private int getRandNum(SecureRandom rand, int bound) {
        return rand.nextInt(bound);

    }
    public int testSelection(Scanner scnr, SecureRandom rand, int sizeInput){
        DivisionTest divide = new DivisionTest();
        AdditionTest add = new AdditionTest();
        SubstractionTest subtract = new SubstractionTest();
        MultiplicationTest multiply = new MultiplicationTest();
        int i;
        for (i= 0; i < 10; i++){
            choice = getRandNum(rand, 3);
            switch (choice){
                case 0:
                    result += add.generateNewTest(scnr,rand,1, sizeInput );
                            break;
                    case 1:
                        result += subtract.generateNewTest(scnr,rand,1, sizeInput);
                        break;
                    case 2:
                       result +=  multiply.generateNewTest(scnr,rand, 1, sizeInput);
                        break;
                default:
                     result += divide.generateNewTest(scnr,rand, 1, sizeInput);
                     break;
            }

        }
                return percentageCalculator(result);
    }

    private int percentageCalculator(int right){
        double division = (double)  right/10 * 100;

        if (division < 75.0){
          //  System.out.println("Please ask your teacher for extra help");
            return 0;}
        else {
           // System.out.println("Congratulation, you are ready to go to the next level");
            return 1;
        }
    }
    public void printRight(){
        System.out.println("Right answers: " + result);
    }
    public void printWrong(){
        int wrong = 10-result;
        System.out.println("Wrong answers: " + wrong);
        result = 0;
    }

}