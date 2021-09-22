package com.zipcodewilmington.scientificcalculator;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by leon on 2/9/18pointer
 * Updated by Diego of cohort10 2/17/2021
 */
public class Console  {

    private Double displayNum = 0.0;
    private Boolean isRunning = true;
    private String displayMode;
    private String[] displayModes = {"Binary", "Octal", "Decimal", "Hexadecimal"};
    private Integer modePointer = 0;
    private Double memStored = 0.0;
    private String unitsMode;
    private String[] unitsModes = {"Degrees","Radians"};

    //default constructor
    public Console(){

    }

    //concrete constructor method
    public Console(double displayNum, String displayMode, String unitsMode, Boolean isRunning, Double memStored){
        this.displayNum = displayNum;
        this.displayMode = displayMode;
        this.isRunning = isRunning;
        this.memStored = memStored;
        this.unitsMode = unitsMode;
    }

    //print methods
    public static void print(String output, Object... args) {
        System.out.printf(output, args);
    }
    public static void println(String output, Object... args) {
        print(output + "\n", args);
    }

    //Gets user input for a String
    public static String getStringInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        println(prompt);
        String userInput = scanner.nextLine();
        return userInput;
    }

    //Gets user input for a Integer
    public static Integer getIntegerInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        println(prompt);
        Integer userInput = scanner.nextInt();
        return userInput;
    }

    //Gets user input for a Double
    public static Double getDoubleInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        println(prompt);
        Double userInput = scanner.nextDouble();
        return userInput;
    }

    //----------------------------  CALCULATION METHODS  ---------------------------\\
    public double doAddition(){
        Integer x = Console.getIntegerInput("Enter a number");
        this.displayNum = displayNum + x;
        return displayNum;
    }

    public double doSubtraction(){
        Integer x = Console.getIntegerInput("Enter a number");
        this.displayNum = displayNum - x;
        return displayNum;
    }

    public double doDivision(){
        Integer x = Console.getIntegerInput("Enter a number");
        this.displayNum = displayNum / x;
        return displayNum;
    }

    public double doMultiplication(){
        Integer x = Console.getIntegerInput("Enter a number");
        this.displayNum = displayNum * x;
        return displayNum;
    }

    public double doSquare(double exponent){
        this.displayNum =  Math.pow(this.displayNum, exponent);
        return this.displayNum;
    }

    public double doSquareRoot(){
        this.displayNum = Math.sqrt(displayNum);
        return this.displayNum;
    }

    public double calculateInverse(){
        this.displayNum = 1 / displayNum;
        return this.displayNum;
    }

    public double calculateVariableExponentiation(){
        double x = getIntegerInput("Enter a value for x");
        double y = getIntegerInput("Enter a value for y");
        println("%s to the power of %s", x ,y);
        this.displayNum = Math.pow(x, y);
        return this.displayNum;
    }

    public void invertSign(){
        this.displayNum = (-1)*this.displayNum;
    }

    public void clear(){
        System.out.println("Cleared the calculator.");
        setDisplayNum(0.0);
    }

    public double doSine(){
        this.displayNum = Math.sin(this.displayNum);
        return this.displayNum;
    }

    public double doCosine(){
        this.displayNum = Math.cos(this.displayNum);
        return this.displayNum;
    }

    public double doTangent(){
        this.displayNum = Math.tan(this.displayNum);
        return this.displayNum;
    }

    //has bug
    public double doSineInverse(){
        this.displayNum = Math.asin(this.displayNum);
        return this.displayNum;
    }
    //has bug
    public double doCosineInverse(){
        this.displayNum = Math.acos(this.displayNum);
        return this.displayNum;
    }
    //has bug
    public double doTangentInverse(){
        this.displayNum = Math.atan(this.displayNum);
        return this.displayNum;
    }

    //-------------------------------------------------------------------------------\\

    //-----------------------------  DISPLAY METHODS  ----------------------------\\

    public String switchDisplayMode(String mode){
        if (mode.equalsIgnoreCase("binary")){
            println("Display set to %s", mode);
        }
        if (mode.equalsIgnoreCase("octal")){
            println("Display set to %s", mode);
        }
        if (mode.equalsIgnoreCase("decimal")){
            println("Display set to %s", mode);
        }
        if (mode.equalsIgnoreCase("hexadecimal")){
            println("Display set to %s", mode);
        }
        return this.displayMode;
    }

    public void switchDisplayMode(){
        this.displayMode = displayModes[this.modePointer];

        if(this.displayMode.equalsIgnoreCase("binary")){
            println("Display set to %s", this.displayMode);
        }
        if(this.displayMode.equalsIgnoreCase("octal")){
            println("Display set to %s", this.displayMode);
        }
        if(this.displayMode.equalsIgnoreCase("decimal")){
            println("Display set to %s", this.displayMode);
        }
        if(this.displayMode.equalsIgnoreCase("hexadecimal")){
            println("Display set to %s", this.displayMode);
        }

        this.modePointer++;

        if(this.modePointer > 3){
            this.modePointer = 0;
        }
    }


    public String switchUnitsMode(String mode){
        if (mode.equalsIgnoreCase("degrees")){
            println("Units set to %s", mode);
        }
        if (mode.equalsIgnoreCase("hexadecimal")){
            println("Units set to %s", mode);
        }
        return this.unitsMode;
    }

    public void switchUnitsMode(){
        this.unitsMode = unitsModes[this.modePointer];

        if(this.displayMode.equalsIgnoreCase("degrees")){
            println("Display set to %s", this.unitsMode);
        }
        if(this.displayMode.equalsIgnoreCase("radians")){
            println("Display set to %s", this.unitsMode);
        }
        this.modePointer++;

        if(this.modePointer > 1){
            this.modePointer = 0;
        }
    }


    //------------------------------------------------------------------------------\\

    //---------------------------  MEMORY RELATED METHODS  --------------------------\\
    public void storeDisplayNumInMemory(){
        this.memStored = this.displayNum;
        println("Saved %s to memory", this.memStored);
        clear();
    }

    public void clearMemory(){
        setMemStored(0.0);
    }

    public void setDisplayNumToMemory(){
        this.displayNum = this.memStored;
    }

    //-------------------------------------------------------------------------------\\

    //----------------------------  GETTER & SETTER METHODS  -------------------------\\
    public double getDisplayNum() {
        return this.displayNum;
    }

    public void setDisplayNum(double displayNum) {
        this.displayNum = displayNum;
    }

    public String getDisplayMode() {
        return displayMode;
    }

    public void setDisplayMode(String mode) {
        this.displayMode = displayMode;
    }

    public Integer getModePointer() {
        return modePointer;
    }

    public void setModePointer(Integer modePointer) {
        this.modePointer = modePointer;
    }

    public Boolean getIsRunning() {
        return isRunning;
    }

    public void setIsRunning(Boolean running) {
        this.isRunning = running;
    }

    public Double getMemStored() {
        return memStored;
    }

    public void setMemStored(Double memStored) {
        this.memStored = memStored;
    }
    //------------------------------------------------------------------------------\\


}



