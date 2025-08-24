import java.util.Scanner;
public class WhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int sum = 0;
        int i = 1; //Iterater
        while (i <= n) {
            sum += i;
            System.out.println("Sum: " + sum);
            i++;
        }
    }
    
}
