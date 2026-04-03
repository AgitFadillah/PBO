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


public class soal2 {
    public static void main(String[] args) throws Exception {
        Mahasiswa mhs = new Mahasiswa();
        mhs.nama = "Agit Fadillah";
        mhs.nim = 124140157;
        mhs.prodi = "Teknik Informatika";
        mhs.tampilkandata(mhs);
    }
}
