import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // program header
        System.out.println("===============================================================");
        System.out.println("= Belajar Deret Aritmatika, Geometri dan Menghitung Faktorial =");
        System.out.println("===============================================================");
        System.out.println();

        String isRunning = "Y";

        while (isRunning.equals("Y") || isRunning.equals("y")) {
            int printNumber = 0;
            int diffNumber = 0;
            Scanner updateNumber;

            // input angka yang ingin dicetak
            while (printNumber < 2 || printNumber > 10) {
                System.out.print("Masukan banyak angka yang mau dicetak [2..10] : ");
                updateNumber = new Scanner(System.in);
                printNumber = updateNumber.nextInt();
                if (printNumber < 2 || printNumber > 10) {
                    System.out.println("Input tidak sesuai!");
                }
            }

            // input beda angka
            while (diffNumber < 2 || diffNumber > 9) {
                System.out.print("Masukan beda masing-masing angka [2..9] : ");
                updateNumber = new Scanner(System.in);
                diffNumber = updateNumber.nextInt();
                if (diffNumber < 2 || diffNumber > 9) {
                    System.out.println("Input tidak sesuai!");
                }
            }

            // kalkulasi aritmatika
            System.out.println("Deret Aritmatika : ");
            int j = 1;
            for (int i = 1; i <= printNumber; i++) {
                System.out.print(j + " ");
                j = j + diffNumber;
            }
            System.out.println();

            // kalkulasi geometri
            System.out.println("Deret Geometri : ");
            j = 1;
            for (int i = 1; i <= printNumber; i++) {
                System.out.print(j + " ");
                j = j * diffNumber;
            }
            System.out.println();

            // kalkulasi faktorial
            System.out.println("Deret Faktorial : ");
            for (int i = printNumber; i > 0; i--) {
                System.out.print(i);
                if (i == 1) {
                    System.out.print(" = ");
                } else {
                    System.out.print(" * ");
                }
            }
            int factorial = 1;
            for (int i = 1; i <= printNumber; i++) {
                factorial = factorial * i;
            }
            System.out.print(factorial);
            System.out.println();

            System.out.println("Anda Mau ulang (Y/T) ?");
            Scanner isContinue = new Scanner(System.in);
            isRunning = isContinue.nextLine().toUpperCase();
        }
        System.out.println("Terima kasih telah menggunakan program ini :D");
    }
}