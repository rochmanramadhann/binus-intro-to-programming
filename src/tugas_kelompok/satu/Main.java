import java.util.*;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
    /**
     * Documentation for some keywords
     * <p>
     * ngs stands for Nasi Goreng Special
     * abs stands for Ayam Bakar Special
     * sss stands for Steak Sirloin Special
     * kss stands for Kwetiaw Siram Special
     * kgs stands for Kambing Guling Special
     */
    public static void main(String[] args) {
        Scanner intInput = new Scanner(System.in);
        Scanner stringInput = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("00.00");

        final double discount = 0.10;
        final Double ngsPrice = 9999.99, absPrice = 12345.67, sssPrice = 21108.40, kssPrice = 13579.13, kgsPrice = 98765.43;

        int totalPerson;

        String bookingName;
        double ngsTotalPrice, absTotalPrice, sssTotalPrice, kssTotalPrice, kgsTotalPrice;

        System.out.println("Selamat Siang ...");
        System.out.print("Pesan untuk berapa orang : ");
        totalPerson = intInput.nextInt();

        System.out.print("Pesanan atas nama : ");
        bookingName = stringInput.nextLine();

        showMenuEntry(ngsPrice, absPrice, sssPrice, kssPrice, kgsPrice);

        List<Integer> foodOrders = getTotalFoodOrders(intInput);

        System.out.println("");
        System.out.println("Selamat Menikmati Makanan Anda...");
        System.out.println("");
        System.out.println("Pembelian : ");
        System.out.println("");

        System.out.println("1. Nasi Goreng Spesial       " + foodOrders.get(0) + " porsi * " + ngsPrice + "\t = Rp. \t" + df.format(ngsTotalPrice = foodOrders.get(0) * ngsPrice));
        System.out.println("2. Ayam Bakar Spesial        " + foodOrders.get(1) + " porsi * " + absPrice + "\t = Rp. \t" + df.format(absTotalPrice = foodOrders.get(1) * absPrice));
        System.out.println("3. Steak Sirloin Spesial     " + foodOrders.get(2) + " porsi * " + sssPrice + "\t = Rp. \t" + df.format(sssTotalPrice = foodOrders.get(2) * sssPrice));
        System.out.println("4. Kwetiaw Siram Spesial     " + foodOrders.get(3) + " porsi * " + kssPrice + "\t = Rp. \t" + df.format(kssTotalPrice = foodOrders.get(3) * kssPrice));
        System.out.println("5. Kambing Guling Spesial    " + foodOrders.get(4) + " porsi * " + kgsPrice + "\t = Rp. \t" + df.format(kgsTotalPrice = foodOrders.get(4) * kgsPrice) + " +");
        System.out.println("===================================================================");

        double totalPrice = ngsTotalPrice + absTotalPrice + sssTotalPrice + kssTotalPrice + kgsTotalPrice;
        System.out.println("Total Pembelian                                  = Rp. \t" + df.format(totalPrice));
        System.out.println("");
        System.out.println("Disc. 10 % (Masa Promosi)                        = Rp. \t" + df.format(totalPrice * discount) + "   -");
        System.out.println("===================================================================");

        double priceWithDiscount = totalPrice * discount;
        System.out.println("Total Pembelian Setelah Disc 10 %                = Rp. \t" + df.format(totalPrice - priceWithDiscount));

        double averagePayByPerson = totalPrice - priceWithDiscount;
        System.out.println("");
        System.out.println("Pembelian per Orang (" + totalPerson + ") orang                    = Rp. \t" + df.format(averagePayByPerson / totalPerson));
        System.out.println("");
        System.out.println("               Terimakasih atas Kunjungan Anda...               ");
        System.out.println("                  Tekan ENTER untuk Keluar               ");

        intInput.close();
        stringInput.close();
    }

    /**
     * @param ngsPrice stands for Nasi Goreng Special
     * @param absPrice stands for Ayam Bakar Special
     * @param sssPrice stands for Steak Sirloin Special
     * @param kssPrice stands for Kwetiaw Siram Special
     * @param kgsPrice stands for Kambing Guling Special
     */
    private static void showMenuEntry(Double ngsPrice, Double absPrice, Double sssPrice, Double kssPrice, Double kgsPrice) {
        System.out.println("Menu Spesial Hari Ini");
        System.out.println("=====================");
        System.out.println("1. Nasi Goreng Spesial    \t \t \t @ Rp. " + ngsPrice);
        System.out.println("2. Ayam Bakar Spesial     \t \t \t @ Rp. " + absPrice);
        System.out.println("3. Steak Sirloin Spesial  \t \t \t @ Rp. " + sssPrice);
        System.out.println("4. Kwetiaw Siram Spesial  \t \t \t @ Rp. " + kssPrice);
        System.out.println("5. Kambing Guling Spesial \t \t \t @ Rp. " + kgsPrice);
        System.out.println("");
    }

    /**
     * @param intInput for taking user input
     * @return List of Integer to take the total order on each food
     */
    private static List<Integer> getTotalFoodOrders(Scanner intInput) {
        List<Integer> totalOrder = new ArrayList<Integer>();

        System.out.println("Pesanan Anda [batas pesanan 0 - 10 porsi]");
        System.out.print("1. Nasi Goreng Spesial    : ");
        totalOrder.add(intInput.nextInt());
        if (totalOrder.get(0) >= 10) {
            System.out.println("Mohon masukan jumlah yang benar dan ulang programnya");
            System.exit(0);
        }

        System.out.print("2. Ayam Bakar Spesial     : ");
        totalOrder.add(intInput.nextInt());
        if (totalOrder.get(1) >= 10) {
            System.out.println("Mohon masukan jumlah yang benar dan ulang programnya");
            System.exit(0);
        }

        System.out.print("3. Steak Sirloin Spesial  : ");
        totalOrder.add(intInput.nextInt());
        if (totalOrder.get(2) >= 10) {
            System.out.println("Mohon masukan jumlah yang benar dan ulang programnya");
            System.exit(0);
        }

        System.out.print("4. Kwetiaw Siram Spesial  : ");
        totalOrder.add(intInput.nextInt());
        if (totalOrder.get(3) >= 10) {
            System.out.println("Mohon masukan jumlah yang benar dan ulang programnya");
            System.exit(0);
        }

        System.out.print("5. Kambing Guling Spesial : ");
        totalOrder.add(intInput.nextInt());
        if (totalOrder.get(4) >= 10) {
            System.out.println("Mohon masukan jumlah yang benar dan ulang programnya");
            System.exit(0);
        }

        return totalOrder;
    }
}