package Kratos;

import java.util.Scanner;

public class Basic_Calculator {
    public static void main(String args[]){
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the operator of you choice: \"plus or +\", \"minus or -\", \"divide or /\", \"multiply or *\"");
            String operator = scanner.next();
            System.out.println("Enter the first operand: ");
            int num1 = scanner.nextInt();
            System.out.println("Enter the second operand: ");
            int num2 = scanner.nextInt();
            float result = 0;
            switch (operator) {
                case "plus","+" :
                    result = num1 + num2;
                    break;
                case "minus", "-" :
                    result = num1 - num2;
                    break;
                case "divide", "/" :
                    result = num1 - num2;
                    break;
                case "multiply", "*" :
                    result = num1 * num2;
                    break;
                default :
                    System.out.println("Input valid operators from the options previously provided.");
                    break;
            }
            System.out.println("The Answer to the equation " + num1 + " " + operator + " " + num2 + " = " + result);
            System.out.println("Do you wish to continue (y/n)?");
            String cont = scanner.next();
            if (cont.equals('n')) {
                continue;
            }
        }
    }
}
