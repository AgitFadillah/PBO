import java.util.Scanner;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;

public class perocobaan4 {
    static void simpandata(String nama, String NIM, Integer semester) {
        try {
            FileWriter fileWriter = new FileWriter("data_mahasiswa.txt", true);
            PrintWriter printwriter = new PrintWriter(fileWriter);

            printwriter.println("Nama : " + nama);
            printwriter.println("NIM : " + NIM);
            printwriter.println("Semester : " + semester);

            printwriter.close();
            System.out.println("Data mahasiswa berhasil disimpan.");
        } catch (IOException e) {
            System.out.println("Terjadi masalah!");
        }
    }

    static void bacadata() {
        try {
            File file = new File("data_mahasiswa.txt");
            Scanner baca = new Scanner(file);

            System.out.println("\n isi file data mahasiswa");
            while (baca.hasNextLine()) {
                System.out.println(baca.nextLine());
            }
            baca.close();
        } catch (FileNotFoundException e) {
            System.out.println("File data_mahasiswa.txt belum ditemukan.");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            System.out.println("SISTEM DATA MAHASISWA\n");
            System.out.println("Masukan Nama : ");
            String nama = input.nextLine();
            System.out.println("Masukan NIM : ");
            String NIM = input.nextLine();
            System.out.println("Masukan semester : ");
            Integer semester = input.nextInt();

            if (nama.isEmpty() || NIM.isEmpty() || semester < 0) {
                throw new IllegalArgumentException("data tidak boleh kosong & semester > 0");
            }
            simpandata(nama, NIM, semester);
            bacadata();
        } catch (IllegalArgumentException e) {
            System.out.println("Kesalahan input: " + e.getMessage());
        } finally {
            System.out.println("\nProgram selesai dijalankan.");
        }
    }
}
