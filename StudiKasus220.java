import java.util.Scanner;

public class StudiKasus220 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String namaMahasiswa, jenisKegiatan, lolosPendanaan;
        int jumlahDokumen, peringkatJuara;

        System.out.println("\n============Program Dana Penghargaan Mahasiswa============");

        System.out.print("Masukkan nama mahasiswa: ");
        namaMahasiswa = sc.nextLine();
        System.out.print("Jenis kegiatan (BELMAWA, BAKORMA, Mandiri, PKM, atau Lainnya): ");
        jenisKegiatan = sc.nextLine();

        if (jenisKegiatan.equalsIgnoreCase("belmawa") || jenisKegiatan.equalsIgnoreCase("bakorma")|| jenisKegiatan.equalsIgnoreCase("Mandiri")) {
            System.out.print("Masukkan jumlah dokumen (0-4): ");
            jumlahDokumen = sc.nextInt();
            System.out.print("Masukkan peringkat juara (1-3, atau 0 jika tidak juara): ");
            peringkatJuara = sc.nextInt();

            if (jumlahDokumen == 4 && peringkatJuara < 4 && peringkatJuara != 0) {
                System.out.println("Status: Selamat " + namaMahasiswa + "! Anda mendapatkan dana penghargaan dari institusi.");
            } else if (jumlahDokumen < 4 && peringkatJuara < 4 && peringkatJuara != 0) {
                System.out.println("Status: Dokumen tidak lengkap, Anda tidak diberi dana penghargaan.");
            } else if (jumlahDokumen == 4 && peringkatJuara == 0 || peringkatJuara == 4) {
                System.out.println("Status: Dana penghargaan tidak diberikan karena hanya juara harapan atau peserta.");
            } else if (jumlahDokumen < 4 && peringkatJuara == 0 || peringkatJuara == 4) {
                System.out.println("Status: Dokumen tidak lengkap dan Anda hanya juara harapan atau peserta, sehingga dana penghargaan tidak diberikan.");
            } else if (jumlahDokumen < 0 || jumlahDokumen > 4 && peringkatJuara < 4 && peringkatJuara != 0) {
                System.out.println("Status: Dokumen Anda tidak valid");
            } else {
                System.out.println("Status: Dokumen dan peringkat juara Anda tidak valid");
            }

        } else if (jenisKegiatan.equalsIgnoreCase("pkm")) {
            System.out.print("Apakah tim PKM Anda lolos Pendanaan? (Ya/Tidak): ");
            lolosPendanaan = sc.next();
            if (lolosPendanaan.equalsIgnoreCase("Ya")) {
                System.out.print("Masukkan jumlah dokumen (0-4): ");
                jumlahDokumen = sc.nextInt();
                if (jumlahDokumen == 4) {
                    System.out.println("Status: Selamat " + namaMahasiswa + "! Anda mendapatkan dana penghargaan dari institusi.");
                } else if (jumlahDokumen < 4) {
                    System.out.println("Status: Dokumen tidak lengkap, Anda tidak diberi dana penghargaan.");
                } else if (jumlahDokumen < 0 || jumlahDokumen > 4) {
                    System.out.println("Status: Dokumen Anda tidak valid");
                }

            } else if (lolosPendanaan.equalsIgnoreCase("Tidak")) {
                System.out.println("Status: Dana penghargaan tidak diberikan karena tim PKM Anda tidak lolos pendanaan.");
            } else {
                System.out.println("Status: Input tidak valid. Silakan masukkan 'Ya' atau 'Tidak'.");
            }

        }

        else if (jenisKegiatan.equalsIgnoreCase("Lainnya")) {
            System.out.println("Status: Dana penghargaan tidak diberikan karena jenis kegiatan tidak termasuk dalam kategori yang ditentukan.");
        } else {
            System.out.println("Status: Dana penghargaan tidak diberikan karena jenis kegiatan tidak termasuk dalam kategori yang ditentukan.");
        }

        sc.close();
    }

}
