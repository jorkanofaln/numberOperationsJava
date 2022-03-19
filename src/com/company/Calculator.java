package com.company;

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
    public double powerOf(){
        double result= Double.MAX_VALUE/2;
        if (secondNumber >= 1){
            if(firstNumber == 0){
                result = 0;
            }
            else{
                result = 1;
                for(int i=0;i < secondNumber; i++){
                    result *= firstNumber;
                }
            }
        }
        else if (secondNumber == 0 && firstNumber >= 0){
            result = 1;
        }

        return result;
    }

}
