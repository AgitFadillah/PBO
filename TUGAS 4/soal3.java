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

class anjing extends hewan {
    String ras;

    void menggonggong(){
        System.out.println(nama + " sedang menggonggong");
    }

    void bermain(){
        System.out.println(nama + " sedang bermain");
    }
}
public class soal3 {
    public static void main(String[] args) {
        kucing k1 = new kucing();

        k1.nama = "Agit";
        k1.umur = 2;
        k1.ras = "Menkun";

        System.out.println("Nama: " + k1.nama);
        System.out.println("Umur: " + k1.umur + " tahun");
        System.out.println("Ras: " + k1.ras);

        anjing a1 = new anjing();
        a1.nama = "Nayla";
        a1.umur = 3;
        a1.ras = "Bulldog";

        System.out.println("Nama: " + a1.nama);
        System.out.println("Umur: " + a1.umur + " tahun");
        System.out.println("Ras: " + a1.ras);

    }
}
