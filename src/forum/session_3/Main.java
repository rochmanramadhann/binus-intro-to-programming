import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=================================================");
        System.out.println("=   PROGRAM TO CONVERT FROM POUND TO KILOGRAM   =");
        System.out.println("=================================================");

        System.out.print("Input your number in pound : ");
        try {
            double userInput = Double.parseDouble(scanner.nextLine());
            System.out.println(userInput + " pound is equal to " + convertPoundToKg(userInput) + " kilogram");
        } catch (Exception e) {
            System.out.println("Input must be a number!");
        }
    }

    static double convertPoundToKg(double poundValue) {
        return poundValue * 0.454d;
    }
}
