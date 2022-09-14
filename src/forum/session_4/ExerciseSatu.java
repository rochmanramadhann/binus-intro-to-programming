import java.util.Scanner;

public class ExerciseSatu {
    public static void main(String[] args) {
        System.out.println("=== Ternary Operator Example ===");
        showTernaryOperatorExample();

        System.out.println();
        System.out.println("=========================");
        System.out.println();

        System.out.println("=== Bitwise Operator Example ===");
        showBitwiseOperatorExample();
    }

    /**
     * Ternary Operator Example
     */
    static void showTernaryOperatorExample() {
        // take input from users
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your marks: ");
        double marks = input.nextFloat();

        // ternary operator checks if
        // marks is greater than 40
        String result = (marks >= 80) ? "pass" : "fail";

        System.out.println("You " + result + " the exam.");
        input.close();
    }

    /**
     * Bitwise Operator Example
     */
    static void showBitwiseOperatorExample() {
        // Initial values
        int a = 5;
        int b = 7;

        // bitwise and
        // 0101 & 0111=0101 = 5
        System.out.println("a&b = " + (a & b));

        // bitwise or
        // 0101 | 0111=0111 = 7
        System.out.println("a|b = " + (a | b));

        // bitwise xor
        // 0101 ^ 0111=0010 = 2
        System.out.println("a^b = " + (a ^ b));

        // bitwise not
        // ~00000000 00000000 00000000 00000101=11111111 11111111 11111111 11111010
        // will give 1's complement (32 bit) of 5 = -6
        System.out.println("~a = " + ~a);

        // can also be combined with
        // assignment operator to provide shorthand
        // assignment
        // a=a&b
        a &= b;
        System.out.println("a= " + a);
    }
}
