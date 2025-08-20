public class TypeCastingDemo {
    public static void main(String[] args) {
        int i = 100;
        double d = i; // implicit (widening)
        System.out.println("Int to Double: " + d);

        double pi = 3.14159;
        int x = (int) pi; // explicit (narrowing)
        System.out.println("Double to Int: " + x);
    }
}
