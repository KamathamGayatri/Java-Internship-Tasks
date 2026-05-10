import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Simple Calculator");
        System.out.print("Enter first number:");
        int num1 = sc.nextInt();
        System.out.print("Enter second number:");
        int num2 = sc.nextInt();
        System.out.print("Choose opertion (+,-,*,/):");
        char operator = sc.next().charAt(0);
        switch(operator) {
            case '+':
                System.out.println("Addition = " + (num1 + num2));
                break;
            case '-':
                System.out.println("Subtraction = " + (num1 - num2));
                break;
            case '*':
                System.out.println("Multiplication = " + (num1 * num2));
                break;
            case '/':
                System.out.println("Division = " + (num1 / num2));
                break;
            default:
                System.out.println("Invalid Operator!");
        }
        sc.close();

    }
}