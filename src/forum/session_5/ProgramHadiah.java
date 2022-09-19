import java.util.Scanner;

public class ProgramHadiah {
    public static void main(String[] args) {
        // define variable and input scanner
        int totalBelanja;
        Scanner inputScanner = new Scanner(System.in);

        System.out.print("Input total belanja : ");
        totalBelanja = inputScanner.nextInt();

        if (totalBelanja > 100000) {
            System.out.println("Selamat! Anda mendapatkan hadiah berupa perlengkapan sekolah karena total belanja Anda diatas Rp. 100.000");
        }

        System.out.println("Program selesai dijalankan.");
    }
}
