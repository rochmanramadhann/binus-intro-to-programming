import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // declare variable
        String name, address;
        int age, salary;

        // create new scanner object
        Scanner scannerInput = new Scanner(System.in);

        System.out.print("Name      : ");
        // using scannerInput to store the user input into name variable
        name = scannerInput.nextLine();

        System.out.print("Address   : ");
        // using scannerInput to store the user input into address variable
        address = scannerInput.nextLine();

        System.out.print("Age       : ");
        // using scannerInput to store the user input into age variable
        age = scannerInput.nextInt();

        System.out.print("Salary    : ");
        // using scannerInput to store the user input into salary variable
        salary = scannerInput.nextInt();


        // print every single variable into console
        System.out.println("==============================");
        System.out.println("Name        : " + name);
        System.out.println("Address     : " + address);
        System.out.println("Age         : " + age + " years");
        System.out.println("Salary      : Rp " + salary);
    }
}