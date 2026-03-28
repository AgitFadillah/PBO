class mahasiswa{
    String nama;
    int nim;
    String prodi;
}

public class soal1 {
    public static void main(String[] args) throws Exception {
        mahasiswa mhs = new mahasiswa();
        mhs.nama = "Agit Fadillah";
        mhs.nim = 124140157;
        mhs.prodi = "Teknik Informatika";
        System.out.println("Nama: " + mhs.nama);
        System.out.println("NIM: " + mhs.nim);
        System.out.println("Program Studi: " + mhs.prodi);
    }
}
