package com.company;
import java.lang.Math;
public class Calculator {
    private double firstNumber;
    private double secondNumber;
    public Calculator(double firstNumber, double secondNumber){
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }
    public double add(){

        return firstNumber + secondNumber;
    }
    public double substract(){

        return firstNumber - secondNumber;
    }
    public double multiply(){

        return firstNumber * secondNumber;
    }
    public double divide(){

        return firstNumber / secondNumber;
    }
    public double remainder(){
        return firstNumber % secondNumber;
    }
    public double powerOf(){
        double result= Double.MAX_VALUE/2;
        if (secondNumber >= 1){
            Math.pow(firstNumber,secondNumber);
        }
        else if (secondNumber == 0 && firstNumber >= 0){
            result = 1;
        }
        return result;
    }
    public double logOf(){
        double result = Double.MAX_VALUE/2;
        if(firstNumber > 1 && secondNumber > 1){
            result = Math.log(firstNumber) / Math.log(secondNumber);
        }
        return result;
    }

}
