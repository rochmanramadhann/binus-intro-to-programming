import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // declare variable
        String yourName, coupleName;
        int yourAge, coupleAge;

        // create new scanner object and random object
        Scanner scannerInput = new Scanner(System.in);
        Random random = new Random();

        // program header
        System.out.println("================================================");
        System.out.println("=    Selamat Datang Di Program Ramalan Cupu    =");
        System.out.println("================================================");
        System.out.println();

        // input your data
        System.out.println("Data Anda: ");
        System.out.println("❤❤❤❤❤❤❤❤❤");
        System.out.print("Masukan Nama Anda             : ");
        yourName = scannerInput.nextLine();
        System.out.print("Masukan Umur Anda             : ");
        yourAge = Integer.parseInt(scannerInput.nextLine());
        System.out.println();

        // input couple data
        System.out.println("Data Pasangan Anda");
        System.out.println("❤❤❤❤❤❤❤❤❤");
        System.out.print("Masukan Nama Pasangan Anda    : ");
        coupleName = scannerInput.nextLine();
        System.out.print("Masukan Umur Pasangan Anda    : ");
        coupleAge = Integer.parseInt(scannerInput.nextLine());
        System.out.println();

        // print data
        System.out.println(yourName + " [" + yourAge + "] tahun");
        System.out.println();
        System.out.println("  ❤❤❤   ❤❤❤ ");
        System.out.println(" ❤❤❤❤  ❤❤❤❤");
        System.out.println("❤❤❤❤❤❤❤❤❤❤");
        System.out.println("  ❤❤❤❤❤❤❤❤");
        System.out.println("    ❤❤❤❤❤❤");
        System.out.println("       ❤❤❤");
        System.out.println("        ❤❤");
        System.out.println();
        System.out.println(coupleName + " [" + coupleAge + "] tahun");

        System.out.print("Tekan ENTER untuk melihat hasil ramalan...");
        scannerInput.nextLine();

        double randomValue = 50 + (100 - 50) * random.nextDouble();
        String formatRandomValue = String.format("%.2f", randomValue);

        System.out.println("Kecocokan Anda dengan pasangan Anda adalah : " + formatRandomValue + " %");
        System.out.println();

        System.out.println("Terima Kasih karena Anda telah menggunakan jasa Ramalan kami.. ^^v");
    }
}
