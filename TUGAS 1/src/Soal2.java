import java.util.Scanner;

public class Soal2 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Masukan angka 1 : ");
        float angka1 = input.nextFloat();
        
        System.out.println("Masukan angka 2 : ");
        float angka2 = input.nextFloat();
        
        System.out.println("\nMasukan angka saja");
        System.out.println("Ingin melakukan operasi apa? (1. Penjumlahan, 2. Pengurangan, 3. Perkalian, 4. Pembagian)");
        int operasi = input.nextInt();
        
        switch (operasi) {
            case 1:
                System.out.println("Hasil penjumlahan : " + (angka1 + angka2));
                break;
            case 2:
                System.out.println("Hasil pengurangan : " + (angka1 - angka2));
                break;
            case 3:
                System.out.println("Hasil perkalian : " + (angka1 * angka2));
                break;
            case 4:
                System.out.println("Hasil pembagian : " + (angka1 / angka2));
                break;
            default:
                System.out.println("Operasi tidak valid");
        }
        
        input.close();
    }
}