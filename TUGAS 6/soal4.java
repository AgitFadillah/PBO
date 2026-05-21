abstract class hewan {
    String nama;

    hewan(String nama) {
        this.nama = nama;
    }

    abstract void suara();

    void info() {
        System.out.println("Nama: " + nama);
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

        void info(){
        System.out.println("Nama: " + nama);
    }
}

class kucing extends hewan {
    kucing(String nama) {
        super(nama);
    }

    void suara() {
        System.out.println(nama + " berkata: Meow!");
    }

        void info(){
        System.out.println("Nama: " + nama);
    }
}

class anjing extends hewan {
    anjing(String nama) {
        super(nama);
    }

    void suara() {
        System.out.println(nama + " berkata: Woof!");
    }

        void info(){
        System.out.println("Nama: " + nama);
    }
}

public class soal4 {
    public static void main(String[] args) {

        hewan[] hewanArray = new hewan[5];
        hewanArray[0] = new burung("Agit");
        hewanArray[1] = new kucing("Nayla");
        hewanArray[2] = new anjing("Lare");
        hewanArray[3] = new burung("Budi");
        hewanArray[4] = new kucing("Mia");
        for (hewan h : hewanArray) {
            h.info();
            h.suara();
            if (h instanceof terbang) {
                ((terbang) h).terbang();
            }
            System.out.println();
        }
    }
}
