import java.util.Scanner;

class buku {

    String buku;
    String Penulis;
    String Tahun;

    buku() {
        System.out.println("1. PBO");
        System.out.println("2. DRPL");
        System.out.println("3. SO");
    }

    void penulis() {
        switch (buku) {

            case "PBO":
                Penulis = "John Doe";
                break;

            case "DRPL":
                Penulis = "Jane Smith";
                break;

            case "SO":
                Penulis = "Bob Johnson";
                break;

            default:
                Penulis = "Tidak diketahui";
        }
    }

    void tahun() {
        switch (buku) {

            case "PBO":
                Tahun = "2020";
                break;

            case "DRPL":
                Tahun = "2019";
                break;

            case "SO":
                Tahun = "2018";
                break;

            default:
                Tahun = "Tidak diketahui";
        }
    }

    void cekbuku() {
        switch (buku) {

            case "PBO":
                System.out.println("Pemrograman Berorientasi Objek");
                break;

            case "DRPL":
                System.out.println("Dasar Rekayasa Perangkat Lunak");
                break;

            case "SO":
                System.out.println("Sistem Operasi");
                break;

            default:
                System.out.println("Buku tidak ditemukan");
        }
    }

    void cetakbuku() {
        System.out.println("Judul: " + buku);
        System.out.println("Penulis: " + Penulis);
        System.out.println("Tahun: " + Tahun);
    }
}

class peminjaman{
    int tanggalpinjam;
    int tanggalkembali;
    int lama;
    Scanner scanner = new Scanner(System.in);

    peminjaman(){
    System.out.print("Tanggal Pinjam: ");
    tanggalpinjam = scanner.nextInt();
    System.out.print("Tanggal Kembali: ");
    tanggalkembali = scanner.nextInt();

    lama = tanggalkembali - tanggalpinjam;  
    } 
    void cekpinjam(){
        System.out.println("Tanggal Pinjam: " + tanggalpinjam);
        System.out.println("Tanggal Kembali: " + tanggalkembali);
        System.out.println("Lama Peminjaman: " + lama + " hari");
    }
}

class anggota {

    String nama;
    String NIM;
    String Prodi;

    Scanner scanner = new Scanner(System.in);

    anggota() {

        System.out.print("Nama: ");
        nama = scanner.nextLine();

        System.out.print("NIM: ");
        NIM = scanner.nextLine();

        System.out.print("Prodi: ");
        Prodi = scanner.nextLine();
    }

    void cekanggota() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + NIM);
        System.out.println("Prodi: " + Prodi);
    }
}

public class PROGRAM {

    public static void main(String[] args) {
        System.out.println("=== Selamat datang di perpustakaan mini ===\n");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Daftar Buku yang tersedia:");
        buku buku1 = new buku();

        System.out.print("Masukkan nama buku yang ingin dipinjam: ");
        buku1.buku = scanner.nextLine();

        buku1.cekbuku();
        buku1.penulis();
        buku1.tahun();

        System.out.println("\nDaftar Anggota:");
        anggota anggota1 = new anggota();

        System.out.println("\nPeminjaman Buku:");
        peminjaman peminjaman1 = new peminjaman();

        System.out.println("\n--- Informasi Peminjaman ---");

        System.out.println("\nInformasi Anggota:");
        anggota1.cekanggota();

        System.out.println("\nInformasi Buku:");
        buku1.cetakbuku();
        System.out.println();
        
        System.out.println("Informasi Peminjaman:");
        peminjaman1.cekpinjam();
        scanner.close();
    }
}