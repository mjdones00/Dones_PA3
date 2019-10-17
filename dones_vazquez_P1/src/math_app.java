import java.security.SecureRandom;
import java.util.*;
public class math_app {
    public static void main(String [] args) {
        SecureRandom rand = new SecureRandom();
        MultiplicationTest multiTest = new MultiplicationTest();
        DivisionTest diviTest = new DivisionTest();
        SubstractionTest subTest = new SubstractionTest();
        AdditionTest addTest = new AdditionTest();
        RandomSelection randTest = new RandomSelection();
        Scanner scnr = new Scanner(System.in);

        int testLevel = 1;
        int result = 0;
        int option;


        System.out.println("For addition practice enter 1");
        System.out.println("For multiplication practice enter 2");
        System.out.println("For subtraction practice enter 3");
        System.out.println("For division practice enter 4");
        System.out.println("For mixed practice enter 5");
        System.out.println("Enter you choice (6 to finish):");

        option = scnr.nextInt();

        while (option != 6) {


            if (option == 1){
                while (testLevel != 0) {
                    System.out.println("Now entering level 1");
                    result =addTest.percentageCalculator(addTest.generateNewTest(scnr, rand, 10, 10));
                    addTest.printRight();
                    addTest.printWrong();
                    if (result == 1)
                        testLevel ++;
                    else
                        testLevel = 0;

                    if (testLevel == 2) {
                        result = 0;
                        System.out.println("Now entering level 2!");
                        result = addTest.percentageCalculator(addTest.generateNewTest(scnr, rand,10, 100));
                        addTest.printRight();
                        addTest.printWrong();
                        if (result == 3)
                            testLevel ++;
                        else
                            testLevel = 0;
                    }
                    if (testLevel == 4) {
                        result = 0;
                        System.out.println("Now entering level 3!");
                        result = addTest.percentageCalculator(addTest.generateNewTest(scnr, rand,10, 1000));
                        addTest.printRight();
                        addTest.printWrong();
                        if (result == 1)
                            testLevel ++;
                        else
                            testLevel = 0;
                    }
                    if (testLevel == 5) {
                        result = 0;
                        System.out.println("Now entering level 4!");
                        result = addTest.percentageCalculator(addTest.generateNewTest(scnr, rand,10, 10000));
                        addTest.printRight();
                        addTest.printWrong();
                        if (result == 1)
                            testLevel ++;
                        else
                            testLevel = 0;
                    }
                    if (testLevel == 5)
                        testLevel = 0;
                }
            }
          else if (option == 2){
            while (testLevel != 0) {
                System.out.println("Now entering level 1");
                result = multiTest.percentageCalculator(multiTest.generateNewTest(scnr, rand,10, 10));
                multiTest.printRight();
                multiTest.printWrong();

                if (result == 1)
                    testLevel ++;
                else
                    testLevel = 0;


                if (testLevel == 2) {
                    result = 0;
                    System.out.println("Now entering level 2!");
                    result = multiTest.percentageCalculator(multiTest.generateNewTest(scnr, rand, 10, 100));
                    multiTest.printRight();
                    multiTest.printWrong();
                    if (result == 1)
                        testLevel ++;
                    else
                        testLevel = 0;
                }
                if (testLevel == 3) {
                    result = 0;
                    System.out.println("Now entering level 3!");
                    result = multiTest.percentageCalculator(multiTest.generateNewTest(scnr, rand,10,1000));
                    multiTest.printRight();
                    multiTest.printWrong();
                    if (result == 1)
                        testLevel ++;
                    else
                        testLevel = 0;
                }
                if (testLevel == 4) {
                    result = 0;
                    System.out.println("Now entering level 4!");
                    result = multiTest.percentageCalculator(multiTest.generateNewTest(scnr, rand, 10,10000));
                    multiTest.printRight();
                    multiTest.printWrong();
                    if (result == 1)
                        testLevel ++;
                    else
                        testLevel = 0;
                }
                if (testLevel == 5)
                    testLevel = 0;
            }
            }
            else if (option == 3){
                while (testLevel != 0) {
                    System.out.println("Now entering level 1");
                    result = subTest.percentageCalculator(subTest.generateNewTest(scnr, rand, 10,10));

                    if (result == 1)
                        testLevel ++;
                    else
                        testLevel = 0;

                    if (testLevel == 2) {
                        result = 0;
                        System.out.println("Now entering level 2!");
                        result = subTest.percentageCalculator(subTest.generateNewTest(scnr, rand, 10, 100));
                        subTest.printRight();
                        subTest.printWrong();
                        if (result == 1)
                            testLevel ++;
                        else
                            testLevel = 0;
                    }
                    if (testLevel == 3) {
                        result = 0;
                        System.out.println("Now entering level 3!");
                        result = subTest.percentageCalculator(subTest.generateNewTest(scnr, rand, 10,1000));
                        subTest.printRight();
                        subTest.printWrong();
                        if (result == 1)
                            testLevel ++;
                        else
                            testLevel = 0;
                    }
                    if (testLevel == 4) {
                        result = 0;
                        System.out.println("Now entering level 4!");
                        result = subTest.percentageCalculator(subTest.generateNewTest(scnr, rand, 10,10000));
                        subTest.printRight();
                        subTest.printWrong();
                        if (result == 1)
                            testLevel ++;
                        else
                            testLevel = 0;
                    }
                    if (testLevel == 4)
                        testLevel = 0;

                }
            }
            else if (option == 4){
                while (testLevel != 0) {
                    System.out.println("Now entering level 1");
                    result = diviTest.percentageCalculator(diviTest.generateNewTest(scnr, rand, 10,10));
                    diviTest.printRight();
                    diviTest.printWrong();
                    if (result == 1)
                        testLevel ++;
                    else
                        testLevel = 0;

                    if (testLevel == 2) {
                        result = 0;
                        System.out.println("Now entering level 2!");
                        result = diviTest.percentageCalculator(diviTest.generateNewTest(scnr, rand, 10,100));
                        diviTest.printRight();
                        diviTest.printWrong();
                        if (result == 1)
                            testLevel ++;
                        else
                            testLevel = 0;
                    }
                    if (testLevel == 3) {
                        result = 0;
                        System.out.println("Now entering level 3!");
                        result = diviTest.percentageCalculator(diviTest.generateNewTest(scnr, rand, 10,1000));
                        diviTest.printRight();
                        diviTest.printWrong();
                        if (result == 1)
                            testLevel ++;
                        else
                            testLevel = 0;
                    }
                    if (testLevel == 4) {
                        result = 0;
                        System.out.println("Now entering level 4!");
                        result = diviTest.percentageCalculator(diviTest.generateNewTest(scnr, rand, 10,10000));
                        diviTest.printRight();
                        diviTest.printWrong();
                        if (result == 1)
                            testLevel ++;
                        else
                            testLevel = 0;
                    }
                    if (testLevel == 4)
                        testLevel = 0;

                }
            }
            else if (option == 5){
                while (testLevel != 0) {
                    System.out.println("Now entering level 1");
                    result = randTest.testSelection(scnr, rand, 10);
                    randTest.printRight();
                    randTest.printWrong();
                        if (result == 1)
                            testLevel ++;
                        else
                            testLevel = 0;

                    if (testLevel == 2) {
                        result = 0;
                        System.out.println("Now entering level 2!");
                        result = randTest.testSelection(scnr, rand, 100);
                        randTest.printRight();
                        randTest.printWrong();
                        if (result == 1)
                            testLevel ++;
                        else
                            testLevel = 0;
                    }
                    if (testLevel == 3) {
                        result = 0;
                        System.out.println("Now entering level 3!");
                        result = randTest.testSelection(scnr, rand, 1000);
                        randTest.printRight();
                        randTest.printWrong();
                        if (result == 1)
                            testLevel ++;
                        else
                            testLevel = 0;
                    }
                    if (testLevel == 4) {
                        result = 0;
                        System.out.println("Now entering level 4!");
                        result = randTest.testSelection(scnr, rand, 10000);
                        randTest.printRight();
                        randTest.printWrong();
                        if (result == 1)
                            testLevel ++;
                        else
                            testLevel = 0;
                    }
                    if (testLevel == 4)
                        testLevel = 0;
                }
            }
            System.out.println();
            System.out.println("For addition practice enter 1");
            System.out.println("For multiplication practice enter 2");
            System.out.println("For subtraction practice enter 3");
            System.out.println("For division practice enter 4");
            System.out.println("For mixed practice enter 5");
            System.out.println("Enter you choice (6 to finish):");
           result = 0;
           testLevel =1;
            option = scnr.nextInt();

        }
        System.out.println("Terminating program!");
    }
    }


