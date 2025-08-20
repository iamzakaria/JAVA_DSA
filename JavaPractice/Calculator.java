import java.util.*;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.print("Enter Number A: ");
        int A = scanner.nextInt();
        System.out.print("Enter Number B: ");
        int B = scanner.nextInt();
        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);


        switch (operator) {
            case '+':
                System.out.println("Result: " + (A + B));
                break;
            case '-':
                System.out.println("Result: " + (A - B));
                break;
            case '*':
                System.out.println("Result: " + (A * B));
                break;
            case '/':
                if (B != 0) {
                    System.out.println("Result: " + (A / B));
                } else {
                    System.out.println("Error: Division by zero");
                }
                break;
            default:
                System.out.println("Error: Invalid operator");
        }




     
    }
}
