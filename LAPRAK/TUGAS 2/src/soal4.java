class Mahasiswa{
    String nama;
    int nim;
    String prodi;

    void tampilkandata(Mahasiswa mhs) {
    System.out.println("Nama: " + mhs.nama);
    System.out.println("NIM: " + mhs.nim);
    System.out.println("Program Studi: " + mhs.prodi);
}
}

class Dosen{
    String nama;
    int nidn;
    String prodi;

    void tampilkandata(Dosen dsn) {
    System.out.println("Nama: " + dsn.nama);
    System.out.println("NIDN: " + dsn.nidn);
    System.out.println("Program Studi: " + dsn.prodi);
}
}

class Matakuliah{
    String namaMK;
    int sks;

    Matakuliah(){
        namaMK = "Pemrograman Berorientasi Objek";
        sks = 3;
    }

    Matakuliah(String namaMK, int sks){
        this.namaMK = namaMK;
        this.sks = sks;
    }

    void tampilkandata() {
    System.out.println("Nama: " + namaMK);
    System.out.println("SKS: " + sks);
    System.out.println("\n");
}
}

public class soal4 {
    public static void main(String[] args) throws Exception {
        Mahasiswa mhs = new Mahasiswa();
        Dosen dsn = new Dosen();
        Dosen dsn2 = new Dosen();
        Matakuliah mk = new Matakuliah();
        Matakuliah mk2 = new Matakuliah("Struktur Data", 4);
        
        System.out.println("Data Mahasiswa:");

        mhs.nama = "Agit Fadillah";
        mhs.nim = 124140157;
        mhs.prodi = "Teknik Informatika\n";
        mhs.tampilkandata(mhs);

        System.out.println("Data Dosen:");

        dsn.nama = "Eko Dwi Nugroho, S.Kom., M.Cs.";
        dsn.nidn = 898400001;
        dsn.prodi = "Teknik Informatika\n";
        dsn.tampilkandata(dsn);

        dsn2.nama = "Leslie Anggraini, S.Kom., M.Cs.";
        dsn2.nidn = 898400000;
        dsn2.prodi = "Teknik Informatika\n";
        dsn2.tampilkandata(dsn2);

        System.out.println("Data Mata Kuliah:");
        mk.tampilkandata();
        mk2.tampilkandata();
    }
}
