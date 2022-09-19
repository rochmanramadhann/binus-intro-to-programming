import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String name, nim;
        int number;
        boolean isRunning = true;
        String divider = "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@";
        Scanner userInput = new Scanner(System.in);

        while (isRunning) {
            // section untuk menginput Nama
            System.out.print("Masukan Nama Anda [1..25] : ");
            name = userInput.nextLine();
            if (name.length() < 1 || name.length() > 25) {
                System.out.print("Nama tidak sesuai, panjang nama minimal 1 dan maximal 25 karakter");
                return;
            }

            // section untuk menginput NIM
            System.out.print("Masukan NIM Anda [harus 10 karakter] : ");
            nim = userInput.nextLine();
            if (nim.length() != 10) {
                System.out.print("Panjang NIM tidak sesuai, harus 10 karakter");
                return;
            }

            System.out.println();
            System.out.println(divider);
            System.out.println();
            System.out.println("Registrasi Sukses..");
            System.out.println("Selamat datang " + name + " [NIM :" + nim + "]" + ".. ^^v");
            System.out.println();
            System.out.println("Mari belajar macam-macam deret bilangan..");
            System.out.println();

            // section untuk menginput sembarang angka
            System.out.println(divider);
            System.out.println();
            System.out.print("Masukkan sembarang angka [5..20] : ");
            number = userInput.nextInt();
            if (number < 5 || number > 20) {
                System.out.print("Jumlah angka minimal 5 dan maximal 20");
                return;
            }
            System.out.println();

            // section untuk menampilkan deret bilangan
            System.out.println(divider);
            System.out.println("Deret Bilangan");
            System.out.println(divider);
            System.out.println(number + " Bilangan Genap : ");
            getEvenNumber(number);

            System.out.println();
            System.out.println(number + " Bilangan Ganjil : ");
            getOddNumber(number);

            System.out.println();
            System.out.println(number + " Bilangan Fibonacci : ");
            getFibonacciNumber(number);
            System.out.println();

            // section untuk menginput pengulangan program
            System.out.print("Apakah anda ingin mengulang[Y/T] : ");
            userInput.nextLine();
            String isExit = userInput.nextLine();
            if (isExit.equalsIgnoreCase("t")) {
                isRunning = false;
            }
        }
    }

    /**
     * Method ini menghasilkan list dan juga hasil penjumlahan bilangan genap
     *
     * @param number
     */
    private static void getEvenNumber(int number) {
        int total = 0;
        for (int i = 2; i <= number * 2; i += 2) {
            total += i;
            System.out.print(i + " ");
        }
        System.out.println("\nHasil Penjumlahan = " + total);
    }

    /**
     * Method ini menghasilkan list dan juga hasil penjumlahan bilangan ganjil
     *
     * @param number
     */
    private static void getOddNumber(int number) {
        int total = 0;
        for (int i = 1; i <= number * 2; i += 2) {
            total += i;
            System.out.print(i + " ");
        }
        System.out.println("\nHasil Penjumlahan = " + total);
    }

    /**
     * Method ini menghasilkan list dan juga hasil penjumlahan bilangan fibonacci
     *
     * @param number
     */
    private static void getFibonacciNumber(int number) {
        int num1 = 1, num2 = 1;
        int counter = 0;
        int total = 0;
        while (counter < number) {
            System.out.print(num1 + " ");
            total += num1;
            int num3 = num2 + num1;
            num1 = num2;
            num2 = num3;
            counter = counter + 1;
        }
        System.out.println("\nHasil Penjumlahan = " + total);
    }
}
