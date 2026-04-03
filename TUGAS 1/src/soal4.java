import java.util.Scanner;

public class soal4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String mahasiswa[] = new String[5];

        mahasiswa[0] = "1. Agit Fadillah 124140157";
        mahasiswa[1] = "2. Nayla Agustria P 2415031002"; 
        mahasiswa[2] = "3. Nasywa Anya Ramadhani 2412011529";
        mahasiswa[3] = "4. Ranggita Zahwa K.W 2416031066";
        mahasiswa[4] = "5. Jidan Albani Nambela 124140208";

        

        for (int i = 0; i < 5; i++) {
            System.out.println(mahasiswa[i]);
        }
        System.out.println("Nomor urut mahasiswa : ");
            int nomor = input.nextInt();
            System.out.println("Data yang di pilih adalah : ");
            System.out.println(mahasiswa[nomor - 1]);
        input.close();
    }
}