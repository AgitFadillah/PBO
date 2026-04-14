class hewan {
    String nama;
    int umur;

    void makan(){
        System.out.println(nama + " sedang makan");
    }

    void tidur(){
        System.out.println(nama + " sedang tidur");
    }
}

class kucing extends hewan {
    String ras;

    void mengeong(){
        System.out.println(nama + " sedang mengeong");
    }

    void berburu(){
        System.out.println(nama + " sedang berburu");
    }
}
public class soal2 {
    public static void main(String[] args) {
        kucing k1 = new kucing();

        k1.nama = "Nayla";
        k1.umur = 2;
        k1.ras = "Mujair";

        System.out.println("Nama: " + k1.nama);
        System.out.println("Umur: " + k1.umur + " tahun");
        System.out.println("Ras: " + k1.ras);
    }
}
