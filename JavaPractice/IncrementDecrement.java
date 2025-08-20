public class IncrementDecrement {
    public static void main(String[] args) {
        int x = 5;

        System.out.println("x = " + x);
        System.out.println("Post-increment (x++): " + (x++)); // prints 5, then x=6
        System.out.println("Now x = " + x);
        System.out.println("Pre-increment (++x): " + (++x));  // increments first, then prints 7
    }
}
