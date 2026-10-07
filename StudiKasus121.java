import java.util.Scanner;

public class StudiKasus121 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hargaPerCup = 18000;
        int jumlahCup, uangBayar, totalHarga, diskon = 0, totalBayar, kembalian, kurang;

        System.out.println("\n============Kedai Kopi Senja============");
        System.out.println("\nMenu: Kopi Susu Gula Aren");

        System.out.print("Masukkan jumlah cup yang ingin dibeli: ");
        jumlahCup = sc.nextInt();
        System.out.print("Masukkan jumlah uang yang dibayarkan: ");
        uangBayar = sc.nextInt();

        totalHarga = jumlahCup * hargaPerCup;

        if (totalHarga >= 100000) {
            diskon = totalHarga * 10 / 100;
        }

        totalBayar = totalHarga - diskon;
        System.out.println("\nTotal harga: Rp." + totalHarga);
        System.out.println("Diskon: Rp." + diskon);
        System.out.println("Total bayar: Rp." + totalBayar);
        
        if (uangBayar >= totalBayar) {
            kembalian = uangBayar - totalBayar;
            System.out.println("\nKembalian: Rp." + kembalian);
        } else {
            kurang = totalBayar - uangBayar;
            System.out.println("\nUang tidak cukup, kurang Rp." + kurang);
        }

        System.out.println("\nTerima kasih karena telah membeli kopi di Kedai Kopi Senja!");
        
        sc.close();
    }
}