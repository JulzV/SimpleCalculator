package com.company;

public class Main {

    public static void main(String[] args) {
// Number declaration
        int firstNumber;
        int secondNumber;
        int answer;
// Number initialised
        firstNumber = 5;
        secondNumber = 7;
        answer = 0;

// Mathematical calculator
        String operator = "-";

        if (operator.equals("+")) {
            answer = firstNumber + secondNumber;
        } else if (operator.equals("-")){
            answer = firstNumber - secondNumber;
        } // Assignment

//  do theelse if statements for the multiplication and division
        System.out.println(answer);

    }
}
