import java.util.*;

public class calculator {
    // A Calculator coded in java with following operations: +, -, *, /! Developed for practice.
    public static void main(String[]args ){
        System.out.println("Welcome to your portable Calculator!");
        System.out.println("You can do the following operations using this: '+', '-', '*', '/'. ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter your second number: ");
        int num2 = sc.nextInt();
        System.out.println("Enter the operation: ");
        String operator = sc.next();
        int result;

        switch (operator){
            case "+":
                result = num1 + num2;
                System.out.println("Your answer is: " + result);
            break;
            case "-":
                result = num1 - num2;
                System.out.println("Your answer is: " + result);
            break;
            case  "*":
                result = num1 * num2;
                System.out.println("Your answer is: " + result);
            break;
            case "/":
                result = num1 / num2;
                System.out.println("Your answer is: " + result);
            break;
            default:
                System.out.println("Invalid operator, Try again later!");


        }
        System.out.println("Thanks for using the portable calculator!");



    }

}
