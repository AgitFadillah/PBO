class matakuliah{
    String namamk;

    matakuliah(String namamk){
        this.namamk = namamk;
    }
}

class mahasiswa{
    String nama;

    mahasiswa(String nama){
        this.nama = nama;
    }

    void mengambil(matakuliah mk){
        System.out.println(nama + " mengambil matakuliah " + mk.namamk);
    }
}

public class soal1 {
    public static void main(String[] args) {
        mahasiswa mhs = new mahasiswa("Nayla");
        matakuliah mk = new matakuliah("Pemrograman Berorientasi Objek");

        mhs.mengambil(mk);
    }
}