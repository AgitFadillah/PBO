class ruangkelas {
    String namagedung;
    
ruangkelas(String namagedung){
        this.namagedung = namagedung;
    }
}

class gedung{
    String namagedung;
    ruangkelas[] daftarruangkelas;

    gedung(String namagedung){
        this.namagedung = namagedung;

        daftarruangkelas = new ruangkelas[3];

        daftarruangkelas[0] = new ruangkelas("Lab IOT");
        daftarruangkelas[1] = new ruangkelas("LAB TPB1");
        daftarruangkelas[2] = new ruangkelas("LAB TPB2");
    }

    void menampilkanDaftarRuangKelas(){
        System.out.println("Gedung: " + namagedung);
        System.out.println("Daftar Ruang Kelas:");
        for (ruangkelas rk : daftarruangkelas){
            System.out.println("- " + rk.namagedung);
        }
    }
}

public class soal3 {
    public static void main(String[] args) {
        gedung g = new gedung("Laboratorium Teknologi 3");
        g.menampilkanDaftarRuangKelas();
    }
    
}
