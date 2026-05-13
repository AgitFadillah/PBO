class Mahasiswa {
    String nama;

    Mahasiswa(String nama) {
        this.nama = nama;
    }
}

class MataKuliah {
    String namaMK;

    MataKuliah(String namaMK) {
        this.namaMK = namaMK;
    }
}

class JadwalPraktikum {
    String hari;
    String jam;

    JadwalPraktikum(String hari, String jam) {
        this.hari = hari;
        this.jam = jam;
    }
}

class KelasPraktikum {

    String namaKelas;

    // Aggregation
    Mahasiswa[] daftarMahasiswa;

    // Association
    MataKuliah mk;

    // Composition
    JadwalPraktikum jadwal;

    KelasPraktikum(String namaKelas, MataKuliah mk,
                    Mahasiswa[] daftarMahasiswa) {

        this.namaKelas = namaKelas;
        this.mk = mk;
        this.daftarMahasiswa = daftarMahasiswa;

        // Object dibuat di dalam class
        this.jadwal = new JadwalPraktikum("Senin", "08.00 WIB");
    }

    void tampilkanInfo() {

        System.out.println("=== INFORMASI KELAS PRAKTIKUM ===");
        System.out.println("Nama Kelas : " + namaKelas);
        System.out.println("Mata Kuliah: " + mk.namaMK);
        System.out.println("Jadwal     : " + jadwal.hari +" - " + jadwal.jam);

        System.out.println("Daftar Mahasiswa:");

        for (Mahasiswa m : daftarMahasiswa) {
            System.out.println("- " + m.nama);
        }
    }
}





public class soal4 {
    public static void main(String[] args) {

        Mahasiswa m1 = new Mahasiswa("Agit");
        Mahasiswa m2 = new Mahasiswa("Nayla");
        Mahasiswa m3 = new Mahasiswa("Agustria");

        Mahasiswa[] daftar = {m1, m2, m3};

        MataKuliah mk =
            new MataKuliah("Pemrograman Berorientasi Objek");

        KelasPraktikum kp =
            new KelasPraktikum("PBO RD", mk, daftar);

        kp.tampilkanInfo();
    }
}