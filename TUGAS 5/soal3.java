class Hewan{
    String nama;

    Hewan(String nama){
        this.nama = nama;
    }

    void suara(){
        System.out.println("Suara hewan");
    }
}

class kucing extends Hewan{
    kucing(String nama){
        super(nama);
    }

    @Override
    void suara(){
        System.out.println(nama + " berkata: Meow");
    }

    void berburu(){
        System.out.println(nama + " sedang berburu");
    }
}

class anjing extends Hewan{
    anjing(String nama){
        super(nama);
    }

    @Override
    void suara(){
        System.out.println(nama + " berkata: Woof");
    }

    void bermain(){
        System.out.println(nama + " sedang bermain");
    }
}

class burung extends Hewan{
    burung(String nama){
        super(nama);
    }

    @Override
    void suara(){
        System.out.println(nama + " berkata: Tweet");
    }

    void terbang(){
        System.out.println(nama + " sedang terbang");
    }
}

public class soal3 {
    public static void main(String[] args) {

        Hewan[] daftarhewan = new Hewan[5] ;

            daftarhewan[0] = new kucing("Agit");
            daftarhewan[1] = new kucing("Nayla");
            daftarhewan[2] = new anjing("Gabriel");
            daftarhewan[3] = new anjing("Rizky");
            daftarhewan[4] = new burung("Cici");
            
        for (Hewan hewan : daftarhewan) {
            hewan.suara();
        }

        System.out.println();

        kucing kucing1 = (kucing) daftarhewan[0], kucing2 = (kucing) daftarhewan[1];
        kucing1.berburu();
        kucing2.berburu();
        System.out.println();

        anjing anjing1 = (anjing) daftarhewan[2], anjing2 = (anjing) daftarhewan[3];
        anjing1.bermain();
        anjing2.bermain();
        System.out.println();

        burung burung1 = (burung) daftarhewan[4];
        burung1.terbang();
    }
}