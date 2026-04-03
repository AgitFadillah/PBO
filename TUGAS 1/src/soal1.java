import java.util.Scanner;

public class soal1 {
    public static void main(String[] args) throws Exception {
        System.out.println("Masukan nama : ");
        Scanner input = new Scanner(System.in);
        String nama = input.nextLine();
        System.out.println("Masukan nim : ");
        String nim = input.nextLine();
        System.out.println("Masukan prodi : ");
        String prodi = input.nextLine();
        input.close();
        System.out.println("=====================================");
        System.out.println("Nama yang dimasukan : " + nama);
        System.out.println("Nim yang dimasukan : " + nim);
        System.out.println("Prodi yang dimasukan : S1 " + prodi);
    }
}
