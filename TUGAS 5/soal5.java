class hewan{
    String nama;
    String jenis;

    hewan(String nama, String jenis){
        this.nama = nama;
        this.jenis = jenis;
    }

    String suara(){
        return "Suara hewan";
    }

    void info(){
        System.out.println("Nama: " + nama + " | Jenis: " + jenis + " | Suara: " + suara());
    }
}

class kucing extends hewan{
    kucing(String nama){
        super(nama, "Kucing");
    }

    @Override
    String suara(){
        return "Meow";
    }
}

class anjing extends hewan{
    anjing(String nama){
        super(nama, "Anjing");
    }

    @Override
    String suara(){
        return "Woof";
    }
}

class burung extends hewan{
    burung(String nama){
        super(nama, "Burung");
    }

    @Override
    String suara(){
        return "Tweet";
    }
}

public class soal5 {
    public static void main(String[] args) {
        hewan[] daftarhewan = new hewan[5] ;

            daftarhewan[0] = new kucing("Agit");
            daftarhewan[1] = new kucing("Nayla");
            daftarhewan[2] = new anjing("Anya");
            daftarhewan[3] = new anjing("Jidan");
            daftarhewan[4] = new burung("Aler");
            
        for (hewan hewan : daftarhewan) {
            hewan.info();
        }
    }
}