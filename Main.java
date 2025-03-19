package Kratos;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

////        OUTPUT

//        System.out.printf("Hello and welcome!\n");
//        int age = 21;
//        System.out.println("User's age is: " + age);
//        float pi = 3.14159265f;
//        double e = 2.71828182818281828;
//        System.out.println("Value of pi is: " + pi);
//        System.out.println("Value of e is: " + e);
//        boolean is_possible = true;
//        System.out.println("Is Making Our Project Possible? (true/false): " + is_possible);
//        char users = '2';
//        String name = "Manas";
//        System.out.println("Total number of developers: " + users + ", Developer Name: " + name);
//
////        INPUT

//        Scanner scanner = new Scanner(System.in);
//        int number = scanner.nextInt();
//        float number2 = scanner.nextFloat();
//        System.out.println("Addition of Two number is: " + (number + number2));
//
//        scanner.nextLine();
//        String input = scanner.nextLine();
//        System.out.println("You just now inputted a String: " + input);
//        float sub;
//        float a = scanner.nextFloat();
//        float b = scanner.nextFloat();
//        sub = a - b;
//        System.out.println("Subtraction of 2 Numbers: " + sub);
//
//        System.out.println("Absolute (-100) is: " + Math.abs(-100));
//
//        int marks = 60;
//        int marksTopass = 75;
//        boolean hasPassedTest = marks >= marksTopass;
//        System.out.println("The User has passed the Test: " + hasPassedTest);
//
//        int health = scanner.nextInt();
//        boolean is_alive = health > 0;
//        System.out.println("The User is alive?\n" + is_alive);

////        COMPARISON OPERATORS & BOOLEAN USAGE
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Legal Age Scanner\n");
//        System.out.println("Are you from EU (true\\false): ");
//        boolean eu_resident = scanner.nextBoolean();
//        int eulegal = 18;
//        int usalegal = 21;
//        System.out.println("Enter your Age: ");
//        int age = scanner.nextInt();
//        boolean is_legal = eu_resident && age > eulegal || eu_resident && age > usalegal;
//        if (eu_resident){
//            System.out.println("User is from EU");
//        }
//        else {
//            System.out.println("User is from USA");
//        }
//        System.out.println("User can legally consume alcoholic drinks: " + is_legal);

////        IF & SWITCH STATEMENTS

////        IF STATEMENTS

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("How much health do you have?");
//        int health = scanner.nextInt();
//        boolean is_Alive = health > 0;
//
//        if (is_Alive) {
//            System.out.println("You are still Alive");
//        }
//        else {
//            System.out.println("You have lost the game");
//        }
//        System.out.println("How many points do you have?");
//        int points = scanner.nextInt();
//
//        if (points >= 100) {
//            System.out.println("You passed with 100");
//        } else if (points >= 50) {
//            System.out.println("You passed");
//        } else {
//            System.out.println("You failed");
//        }

////        SWITCH STATEMENTS
//
//        System.out.println("Enter value of integer X");
//        Scanner scanner = new Scanner(System.in);
//        int x = scanner.nextInt();
//        switch (x) {
//            case 0:
//                System.out.println("X integer is 0");
//                break;
//            case 1:
//                System.out.println("X Integer is 1");
//                break;
//            case 2:
//                System.out.println("X Integer is 2");
//                break;
//            case 3:
//                System.out.println("X Integer is 3");
//                break;
//            default:
//                System.out.println("X Integer is Unknown");
//                break;
//        }

////        FOR LOOPS & WHILE LOOPS

////        FOR LOOPS
//
//        for(int i = 0; i < 100; i++){
//            System.out.println(i);
//        }
//        System.out.println("-----------");
//        System.out.println("Printing Even Numbers: ");
//
//        for(int i = 0; i < 100; i++){
//            if (i % 2 == 0){
//                System.out.println(i);
//            }
//        }

////        TERNARY OPERATOR
//
//        int health = 1000;1
//        String status = "";
//        System.out.println("What is your status: " + status);
//
//        if (health > 0){
//            status = "Alive";
//        } else {
//            status = "Not Alive";
//        }
//        System.out.println("What is your status: " + status);
//        status = health > 0 ? "Alive" : "Dead";
//        System.out.println("What is your status: " + status);

////        CASTING VARIABLES
//
//        int health = 10;
//        float damage = 1.5f;
//
//        float fin_health = health - damage;
//        System.out.println("Final Health after taking damage: " + fin_health);
//
//        int fin_health2 = health - (int)damage;
//        System.out.println("Final Health after taking damage: " + fin_health2);
//
//        fin_health2 = (int)((float)health - damage);
//        System.out.println("Final Health after taking damage: " + fin_health2);

////        STRING OPERATIONS

//        String text = "Hello, How are you?";
//        System.out.println("Lower Case: " + text.toLowerCase());
//        System.out.println("Upper Case: " + text.toUpperCase());
//        System.out.println("Text Replace: " + text.replace("Hello", "Manas"));
//        System.out.println("Contains: " + text.contains("Hello"));
//        System.out.println("Slicing: " + text.charAt(1));
//        System.out.println("Concatenation: " + text.);

////        ARRAYS

//        String question1 = "What does WWW stands for?";
//        String question2 = "What is the world's largest ocean?";
//        String question3 = "Which year did India gain it's Independence?";
//        String question4 = "What is the capital of India?";
//
//        String answer1 = "World Wide Web";
//        String answer2 = "Pacific Ocean";
//        String answer3 = "1947";
//        String answer4 = "Delhi";
//
//        String[] questions = new String[4];
//        questions[0] = "What does WWW stands for?";
//        questions[1] = "What is the world's largest ocean?";
//        questions[2] = "Which year did India gain it's Independence?";
//        questions[3] = "What is the capital of India?";
//
//        String[] answers = new String[4];
//        answers[0] = "World Wide Web";
//        answers[1] = "Pacific Ocean";
//        answers[2] = "1947";
//        answers[3] = "Delhi";
//
//        System.out.println("Q: " + questions[0] + " -> A: " + answers[0]);
//        System.out.println("Q: " + questions[1] + " -> A: " + answers[1]);
//        System.out.println("Q: " + questions[2] + " -> A: " + answers[2]);
//        System.out.println("Q: " + questions[3] + " -> A: " + answers[3]);
//
//        System.out.println("\nUsing For Loop to print the array: ");
//        for(int i = 0; i < questions.length; i++){
//            System.out.println("Q: " + questions[i] + " -> A: " + answers[i]);
//        }

////        METHODS

        String[] questions = new String[4];
        questions[0] = "What does WWW stands for?";
        questions[1] = "What is the world's largest ocean?";
        questions[2] = "Which year did India gain it's Independence?";
        questions[3] = "What is the capital of India?";

        String[] answers = new String[4];
        answers[0] = "World Wide Web";
        answers[1] = "Pacific Ocean";
        answers[2] = "1947";
        answers[3] = "Delhi";

////        Using Method to write the questions and their answers:
        outputQnA(questions, answers);


        List<String> moreQuestions = new ArrayList<>();
        



    }




////        METHODS

    public static void outputQnA(String[] questions, String[] answers){
        for(int i = 0; i < questions.length; i++){
            System.out.println("Q: " + questions[i] + " -> A: " + answers[i]);
        }
    }

    public static int sum(int x, int y) {
        return x + y;
    }
}