package forum.session_5;

import java.util.Scanner;

public class CekKelulusan {
    public static void main(String[] args) {
        // define variable and input scanner
        int nilai;
        Scanner inputScanner = new Scanner(System.in);

        System.out.print("Input nilai ujian: ");
        nilai = inputScanner.nextInt();

        if (nilai > 70) {
            System.out.println("Selamat, Anda lulus!");
        } else {
            System.out.println("Maaf, silahkan coba lagi tahun depan");
        }
    }
}
