package com.thoughtworks.tdd;

public class Game {
    public String getNumber(int number){
        if(number%3==0){
            return "Fizz";
        }else if(number%5==0){
            return "Buzz";
        }else if(number%7==0){
            return "Whizz";
        }else if(number%3==0&&number%5==0){
            return "FizzBuzz";
        }else if(number%3==0&&number%5==0&&number%7==0){
            return "FizzBuzzWhizz";
        }else if(number%5==0&&number%7==0){
            return "BuzzWhizz";
        }else if(number%3==0&&number%7==0){
            return "FizzWhizz";
        }else if(number==13){
            return "Fizz";
        }else{
            return "number";
        }
    }
}
