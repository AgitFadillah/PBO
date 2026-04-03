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

class dosen{
    String nama;
    int nidn;
    String prodi;

    void tampilkandata(dosen dsn) {
    System.out.println("Nama: " + dsn.nama);
    System.out.println("NIDN: " + dsn.nidn);
    System.out.println("Program Studi: " + dsn.prodi);
}
}

public class soal3 {
    public static void main(String[] args) throws Exception {
        Mahasiswa mhs = new Mahasiswa();
        dosen dsn = new dosen();
        dosen dsn2 = new dosen();
        
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
    }
}
