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

public class soal1 {
    public static void main(String[] args) {

    }
}