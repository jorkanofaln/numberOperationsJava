package com.company;

public class Prime {
    private int number;

    public Prime(int number){

        this.number = number;
    }

    public boolean isEven(){
        if(number % 2 ==0){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean isPrime(){
        if(number <= 1){
            return false;
        }
        else {
            for(int i =2; i < number ;i++){
                if(number % i ==0){
                    return false;
                }
            }
            return true;
        }
    }
}
