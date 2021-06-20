package com.company;

public class Main {

    public static void main(String[] args) {
//  Number declaration
        float firstNumber;
        float secondNumber;
        float answer;

//  Number initialised
        firstNumber = 10;
        secondNumber = 3;
        answer = 0;

//  Defining operator
        String operator = "/";

//  Mathematical calculations

        if (operator.equals("+")) {
            answer = firstNumber + secondNumber;
        } else if (operator.equals("-")){
            answer = firstNumber - secondNumber;
        } else if (operator.equals("*")){
            answer = firstNumber * secondNumber;
        } else if (operator.equals("/")) {
            answer = firstNumber / secondNumber;
        }

//  Print answer
        System.out.println(answer);

    }
}
