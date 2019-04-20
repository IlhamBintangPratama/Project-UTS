import entity.*;
import maintance.*;
import java.util.*;

public class Aplikasi {
    private static mainPerpus maintance;
    private static Scanner scanner;

    public static void main(String[] args) {
        maintance = new mainPerpus();
        int opsi = 5;
        do {
            cetakMenu();
            scanner = new Scanner(System.in);
            try {
                opsi = scanner.nextInt();
            }catch (Exception e){
                System.out.println("Tolong cek kembali inputan anda");
                opsi = 0;
            }
            prosesMenu(opsi);
        }while (opsi != 5) ;
    }
    private static void prosesMenu(int opsi){
        switch (opsi){
            case 1:
                tambahData();
                break;
            case 2:
                formUbahData();
                break;
            case 3:
                formHapusData();
                break;
            case 4:
                maintance.cetakData();
                break;
        }
    }
    private static void formHapusData(){
        System.out.println("\n form Hapus Data");
        scanner = new Scanner(System.in);
        System.out.println("Kode Buku : ");
        String kode_buku = scanner.nextLine();
        maintance.hapusData(kode_buku);
    }
    private static void formUbahData(){
        String kode_buku, judul_buku, pengarang, penerbit, tahun, jumlah;
        System.out.println("\nForm Ubah Data");
        scanner = new Scanner(System.in);
        System.out.print("Kode Buku : ");
        kode_buku = scanner.nextLine();
        System.out.print("Judul Buku : ");
        judul_buku = scanner.nextLine();
        System.out.print("Pengarang : ");
        pengarang = scanner.nextLine();
        System.out.print("Penerbit : ");
        penerbit = scanner.nextLine();
        System.out.print("Tahun : ");
        tahun = scanner.nextLine();
        System.out.print("Jumlah : ");
        jumlah = scanner.nextLine();
        maintance.ubahData(new perpus(kode_buku, judul_buku, pengarang, penerbit, tahun, jumlah));
    }

    private static void tambahData(){
        String kode_buku, judul_buku, pengarang, penerbit, tahun, jumlah;
        System.out.println("\nForm Tambah Data");
        scanner = new Scanner(System.in);
        System.out.print("Kode Buku : ");
        kode_buku = scanner.nextLine();
        System.out.print("Judul Buku : ");
        judul_buku = scanner.nextLine();
        System.out.print("Pengarang : ");
        pengarang = scanner.nextLine();
        System.out.print("Penerbit : ");
        penerbit = scanner.nextLine();
        System.out.print("Tahun : ");
        tahun = scanner.nextLine();
        System.out.print("Jumlah : ");
        jumlah = scanner.nextLine();
        simpanDataBaru(new perpus(kode_buku, judul_buku, pengarang, penerbit, tahun, jumlah));
    }
    private static void simpanDataBaru(perpus prps){
        maintance.tambahData(prps);
    }
    private static void cetakMenu () {
        System.out.println("--- Aplikasi CRUD Buku Perpus =---");
        System.out.println("1. tambah data");
        System.out.println("2. ubah data");
        System.out.println("3. hapus data");
        System.out.println("4. tampilkan data");
        System.out.println("5. KELUAR");
        System.out.println("----------------------------------");
        System.out.println("Pilihan > ");
    }
}
