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
}

class anjing extends Hewan{
    anjing(String nama){
        super(nama);
    }

    @Override
    void suara(){
        System.out.println(nama + " berkata: Woof");
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
}

public class soal2 {
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
    }
}