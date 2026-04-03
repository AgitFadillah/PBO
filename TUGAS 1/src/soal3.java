import java.util.Scanner;

public class soal3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukan NIM mahasiswa : ");
        int nim = input.nextInt();
        System.out.println("Masukan nilai :");
        int nilai = input.nextInt();
        input.close();
        System.out.println(" ");

        if (nilai >= 75){
            System.out.println("Mahasiswa dengan NIM " + nim + " dinyatakan lulus dengan nilai " + nilai);
        } else {
            System.out.println("Mahasiswa dengan NIM " + nim + " dinyatakan tidak lulus dengan nilai " + nilai);
        }
    System.out.println(" ");
    }
}