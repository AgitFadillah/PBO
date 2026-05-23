import java.util.Scanner;

public class Percobaan2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nilai mahasiswa: ");
        String input = scanner.nextLine();

        try {
            // Mencoba mengubah input menjadi angka
            double nilai = Double.parseDouble(input);

            // Validasi rentang nilai
            if (nilai < 0 || nilai > 100) {
                System.out.println("\n[ERROR] Nilai harus antara 0 - 100!");
                System.out.println("Anda memasukkan: " + nilai);
            } else {
                System.out.println("\nNilai mahasiswa yang dimasukkan: " + nilai);

                // Menentukan grade
                String grade;
                if (nilai >= 85) {
                    grade = "A";
                } else if (nilai >= 70) {
                    grade = "B";
                } else if (nilai >= 55) {
                    grade = "C";
                } else if (nilai >= 40) {
                    grade = "D";
                } else {
                    grade = "E";
                }
                System.out.println("Grade: " + grade);
            }
        } catch (NumberFormatException e) {
            // Menangani input yang bukan angka
            System.out.println("\n[ERROR] Input harus berupa angka!");
            System.out.println("Anda memasukkan: \"" + input + "\"");
        }

        scanner.close();
    }
}
