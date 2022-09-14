import java.util.Scanner;

public class ExerciseDua {
    public static void main(String[] args) {
        System.out.println("=== Operator Pembanding Example ===");
        showOperatorPembandingExample();

        System.out.println();
        System.out.println("=========================");
        System.out.println();

        System.out.println("=== Logic Operator Example ===");
        showLogicOperatorExample();
    }

    static void showOperatorPembandingExample() {
        Scanner input = new Scanner(System.in);
        int tempInput;

        System.out.print("Input sembarang angka: ");
        tempInput = input.nextInt();

        if (tempInput % 2 != 0) {
            System.out.print(tempInput + " adalah angka ganjil");
        } else {
            System.out.print(tempInput + " adalah angka genap");
        }
    }

    static void showLogicOperatorExample() {
        boolean a = true;
        boolean b = false;
        boolean hasil;

        hasil = a && a;
        System.out.println("Hasil dari a && a : " + hasil);

        hasil = a && b;
        System.out.println("Hasil dari a && b : " + hasil);

        hasil = a || b;
        System.out.println("Hasil dari a || b : " + hasil);

        hasil = b || b;
        System.out.println("Hasil dari b || b : " + hasil);

        hasil = !a;
        System.out.println("Hasil dari !a : " + hasil);

        hasil = !b;
        System.out.println("Hasil dari !b : " + hasil);
    }
}
