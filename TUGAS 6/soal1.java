abstract class hewan {
    String nama;

    hewan(String nama) {
        this.nama = nama;
    }

    abstract void suara();

    void makan() {
        System.out.println(nama + " sedang makan.");
    }
}

class kucing extends hewan {
    kucing(String nama) {
        super(nama);
    }

    void suara() {
        System.out.println(nama + " berkata: Meow!");
    }
}

class anjing extends hewan {
    anjing(String nama) {
        super(nama);
    }

    void suara() {
        System.out.println(nama + " berkata: Woof!");
    }
}

public class soal1 {
    public static void main(String[] args) {

    }
}
