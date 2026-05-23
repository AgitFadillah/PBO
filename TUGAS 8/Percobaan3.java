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
            FileWriter fileWriter = new FileWriter("mahasiswa.txt");
            PrintWriter printwriter = new PrintWriter(fileWriter);

            printwriter.println("Nama = " + nama);
            printwriter.println("NIM = " + nim);
            printwriter.println("Prodi = " + prodi);

            printwriter.close();

            System.out.println("Data berhasil ditulis ke file mahasiswa.txt");
        } catch (IOException e) {
            System.out.println("Gagal menulis data kedalam mahasiswa.txt");
        }
    }
}
