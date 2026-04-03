class Mahasiswa {
    String nama;
    long nim; //maap ya saya pake long atributnya karna saya mau pakai nim yang besar
    String prodi;
    String semester;

    Mahasiswa() {
        nama = "Agit Fadillah";
        nim = 124140157;
        prodi = "Teknik Informatika";
        semester = "4";
    }

    Mahasiswa(String nama, long nim, String prodi, String semester) {
        this.nama = nama;
        this.nim = nim;
        this.prodi = prodi;
        this.semester = semester;
    }

    void tampilkandata(Mahasiswa mhs) {
        System.out.println("Nama: " + mhs.nama);
        System.out.println("NIM: " + mhs.nim);
        System.out.println("Program Studi: " + mhs.prodi);
        System.out.println("Semester: " + mhs.semester);
        System.out.println();
    }
}

public class soal5 {
    public static void main(String[] args) throws Exception {
        System.out.println("Data Mahasiswa:");
        Mahasiswa mhs1 = new Mahasiswa();
        mhs1.tampilkandata(mhs1);

        Mahasiswa mhs2 = new Mahasiswa("Nayla Agustria Putri", 2415031002L, "Teknik Elektro", "4");
        mhs2.tampilkandata(mhs2);

        Mahasiswa mhs3 = new Mahasiswa("Nasywa Anya Ramadhani", 2412011529L, "Ilmu Hukum", "4");
        mhs3.tampilkandata(mhs3);
    }
}