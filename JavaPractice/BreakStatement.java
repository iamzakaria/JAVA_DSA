import java.util.Scanner;
public class BreakStatement {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
       
        do { 
            System.out.print("Enter a number: ");
            int n = sc.nextInt();
            if (n%10==0) {
                System.out.println("Negative number entered. Exiting...");
                break;
            }
        } while (true);
        }
    }


    

