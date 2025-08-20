import java.util.Scanner;

public class StudentPassFail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student marks: ");
        int marks = sc.nextInt();

        // Pass if marks >= 40, else Fail
        String result = (marks >= 40) ? "Pass" : "Fail";

        System.out.println("Result: " + result);
    }
}
