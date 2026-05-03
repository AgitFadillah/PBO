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

interface terbang{
    void terbang();
}

class burung extends hewan implements terbang {
    burung(String nama) {
        super(nama);
    }

    void suara() {
        System.out.println(nama + " berkata: Kicau!");
    }

    public void terbang() {
        System.out.println(nama + " sedang terbang.");
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

public class soal3 {
    public static void main(String[] args) {
        burung b1 = new burung("Agit");
        kucing k1 = new kucing("Nayla");

        k1.suara();
        System.out.println();
        b1.suara();
        b1.terbang();
    
    }
}
