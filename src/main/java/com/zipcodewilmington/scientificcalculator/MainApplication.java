package com.zipcodewilmington.scientificcalculator;

/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {

    public static void main(String[] args) {

        Console console = new Console(0.0," ", " ", false, 0.0); //create console object
        console.setIsRunning(true); //runs the calculator
        Console.println("Welcome to my calculator!");

        //while calculator is running, run logic until user enters 'exit'
        while(console.getIsRunning()){
            console.println("%s", console.getDisplayNum());

            String option = console.getStringInput("Select an option ");
            console.println("Option: %s", option);

            switch (option.toUpperCase()){
                case "ADD":
                    console.doAddition();
                    break;

                case "SUBTRACT":
                    console.doSubtraction();
                    break;

                case "MULTIPLY":
                    console.doMultiplication();
                    break;

                case "DIVIDE":
                    console.doDivision();
                    break;

                case "VARIABLE EXPONENTIATION":
                    console.calculateVariableExponentiation();
                    break;

                case "EXIT":
                    System.out.println("Exiting the program");
                    console.setIsRunning(false);
                    break;

                case "NEXT DISPLAY MODE":
                    console.switchDisplayMode();
                    break;

                case "CHANGE DISPLAY MODE":
                    String mode = console.getStringInput("Enter a mode");
                    console.switchDisplayMode(mode);
                    break;

                case "INVERT":
                    console.invertSign();
                    break;

                case "INVERSE":
                    console.calculateInverse();
                    break;

                case "SET NUMBER":
                    Double num = console.getDoubleInput("Change display number to: ");
                    console.setDisplayNum(num);
                    break;

                case "TOTAL":
                    console.println("Display Number: %s", console.getDisplayNum());
                    break;

                case "SQUARE ROOT":
                    console.doSquareRoot();
                    break;

                case "SQUARE":
                    Double e = console.getDoubleInput("Enter an exponent");
                    console.doSquare(e);
                    break;

                case "CLEAR":
                    console.clear();
                    break;

                case "SAVE MEMORY":
                    console.storeDisplayNumInMemory();
                    break;

                case "CLEAR MEMORY":
                    console.clearMemory();
                    break;

                case "SHOW MEMORY":
                    console.setDisplayNumToMemory();
                    break;
                case "SINE":
                    console.doSine();
                    break;
                case "COSINE":
                    console.doCosine();
                    break;
                case "TANGENT":
                    console.doTangent();
                    break;
                case "SINE INVERSE":
                    console.doSineInverse();
                    break;
                case "COSINE INVERSE":
                    console.doCosineInverse();
                    break;
                case "TANGENT INVERSE":
                    console.doTangentInverse();
                    break;
                case "CHANGE UNITS MODE":
                    console.switchUnitsMode();
                    break;
                case "NEXT UNITS MODE":

            }
        }
    }
}
