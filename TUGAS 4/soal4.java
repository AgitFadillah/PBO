class hewan {
    String nama;
    int umur;

    hewan(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    void makan(){
        System.out.println(nama + " sedang makan");
    }

    void tidur(){
        System.out.println(nama + " sedang tidur");
    }
}

class kucing extends hewan {
    String ras;

    kucing(String nama, int umur, String ras) {
        super(nama, umur);
        this.ras = ras;
    }

    void mengeong(){
        System.out.println(nama + " sedang mengeong");
    }

    void berburu(){
        System.out.println(nama + " sedang berburu");
    }

    void tampilkandata(){
        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur + " tahun");
        System.out.println("Ras: " + ras);
        mengeong();
        berburu();
    }
}

class anjing extends hewan {
    String ras;

    anjing(String nama, int umur, String ras) {
        super(nama, umur);
        this.ras = ras;
    }

    void menggonggong(){
        System.out.println(nama + " sedang menggonggong");
    }

    void bermain(){
        System.out.println(nama + " sedang bermain");
    }

    void tampilkandata(){
        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur + " tahun");
        System.out.println("Ras: " + ras);
        menggonggong();
        bermain();
    }
}
public class soal4 {
    public static void main(String[] args) {
        kucing k1 = new kucing("Agit", 2, "Menkun");
        anjing a1 = new anjing("Nayla", 3, "Bulldog");

        k1.tampilkandata();
        System.out.println();
        a1.tampilkandata();
    }
}
