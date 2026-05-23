import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Percobaan3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan Nama     : ");
        String nama = scanner.nextLine();

        System.out.print("Masukkan NIM      : ");
        String nim = scanner.nextLine();

        System.out.print("Masukkan Prodi    : ");
        String prodi = scanner.nextLine();

        try {
            FileWriter fileWriter = new FileWriter("mahasiswa.txt", true);
            PrintWriter printwriter = new PrintWriter(fileWriter);

            printwriter.println("Nama = " + nama);
            printwriter.println("NIM = " + nim);
            printwriter.println("Prodi = " + prodi);

            printwriter.close();

            System.out.println("Data berhasil ditulis ke file mahasiswa.txt");
        } catch (IOException e) {
            System.out.println("Gagal menulis data kedalam mahasiswa.txt");
        }
        
        // Memanggil fungsi bacadata untuk menampilkan isi file
        bacadata();

        scanner.close();
    }

    static void bacadata() {
        try {
            File file = new File("mahasiswa.txt");
            Scanner baca = new Scanner(file);
            System.out.println("\nIsi dari file mahasiswa.txt :");
            while (baca.hasNextLine()) {
                System.out.println(baca.nextLine());
            }
            baca.close();
        } catch (FileNotFoundException e) {
            System.out.println("File tidak ditemukan");
        }
    }
}
