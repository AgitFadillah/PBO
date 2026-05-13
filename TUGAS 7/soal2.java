class mahasiswa {
    String nama;

    mahasiswa(String nama) {
        this.nama = nama;
    }
}

class kelaspraktikum {
    String namakelas;
    mahasiswa[] daftarmahasiswa;

    kelaspraktikum(String namakelas, mahasiswa[] daftarmahasiswa) {
        this.namakelas = namakelas;
        this.daftarmahasiswa = daftarmahasiswa;
    }

    void menampilkanDaftarMahasiswa() {
        System.out.println("Kelas Praktikum: " + namakelas);
        System.out.println("Daftar Mahasiswa:");
        for (mahasiswa mhs : daftarmahasiswa) {
            System.out.println("- " + mhs.nama);
        }
    }
}

public class soal2 {
    public static void main(String[] args) {

        mahasiswa m1 = new mahasiswa("Agit");
        mahasiswa m2 = new mahasiswa("Nayla");
        mahasiswa m3 = new mahasiswa("Agustria");

        mahasiswa[] daftar = {m1, m2, m3};

        kelaspraktikum kp = new kelaspraktikum("PBO A", daftar);

        kp.menampilkanDaftarMahasiswa();
    }
}
