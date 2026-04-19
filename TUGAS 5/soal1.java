package TUGAS 5;

public class soal1 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;

        // Menggunakan operator logika AND (&&)
        boolean hasilAnd = (a < b) && (b < c);
        System.out.println("Hasil AND: " + hasilAnd); // true

        // Menggunakan operator logika OR (||)
        boolean hasilOr = (a > b) || (b < c);
        System.out.println("Hasil OR: " + hasilOr); // true

        // Menggunakan operator logika NOT (!)
        boolean hasilNot = !(a > b);
        System.out.println("Hasil NOT: " + hasilNot); // true
    }
    
}
