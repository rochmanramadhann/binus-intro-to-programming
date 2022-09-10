import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // declare variable
        String name, productName;
        int productStock;
        float productPurchasePrice, productSellPrice;

        // create new scanner object
        Scanner scannerInput = new Scanner(System.in);

        System.out.print("Masukkan nama Anda      : ");
        // using scannerInput to store the user input into name variable
        name = scannerInput.nextLine();

        System.out.println("==================================");
        System.out.println("=    Stok Gudang Input Barang    =");
        System.out.println("==================================");

        System.out.println("Selamat Datang " + name);

        System.out.print("Masukan nama barang yang mau ditambah     : ");
        // using scannerInput to store the user input into productName variable
        productName = scannerInput.nextLine();

        System.out.print("Masukan jumlah barang yang mau ditambah   : ");
        // using scannerInput to store the user input into productStock variable
        productStock = scannerInput.nextInt();

        System.out.print("Masukan harga beli untuk barang tersebut  : ");
        // using scannerInput to store the user input into productPurchasePrice variable
        productPurchasePrice = scannerInput.nextFloat();

        System.out.print("Masukan harga jual untuk barang tersebut  : ");
        // using scannerInput to store the user input into productSellPrice variable
        productSellPrice = scannerInput.nextFloat();

        System.out.println();
        System.out.println("==================================");
        System.out.println("=   Stok Gudang Rincian Barang   =");
        System.out.println("==================================");

        // print every single variable into console
        System.out.println("==============================");
        System.out.println("Nama Barang     : " + productName);
        System.out.println("Jumlah Barang   : " + productStock);
        System.out.println("Harga Beli      : Rp " + productPurchasePrice);
        System.out.println("Harga Jual      : Rp " + productSellPrice);
    }
}