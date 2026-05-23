import java.util.Scanner;

public class Percobaan1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan angka pertama  : ");
        int angka1 = scanner.nextInt();

        System.out.print("Masukkan angka kedua    : ");
        int angka2 = scanner.nextInt();

        try {
            int hasil = angka1 / angka2;
            System.out.println("\nHasil pembagian " + angka1 + " / " + angka2 + " = " + hasil);
        } catch (ArithmeticException e) {
            System.out.println("\n[ERROR] Tidak bisa membagi dengan nol!");
            System.out.println("Pesan error: " + e.getMessage());
        }

        scanner.close();
    }
}
