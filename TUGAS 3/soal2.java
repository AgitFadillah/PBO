class mahasiswa{
    private String nama;
    private int NIM;
    private String prodi;

    public void setNama(String nama){
        this.nama = nama;
    }

    public void setNIM(int NIM){
        this.NIM = NIM;
    }

    public void setProdi(String prodi){
        this.prodi = prodi;
    }

    public String getNama(){
        return nama;
    }

    public int getNIM(){
        return NIM;
    } 

    public String Getprodi(){
        return prodi;
    }

    void tampilkanData(mahasiswa mhs){
        System.out.println("Nama: " + mhs.getNama());
        System.out.println("NIM: " + mhs.getNIM());
        System.out.println("Prodi: " + mhs.Getprodi());
    }
}

public class soal2 {
    public static void main(String[] args) {
        mahasiswa mhs1 = new mahasiswa();
        mhs1.setNama("Agit Fadillah");
        mhs1.setNIM(123456789);
        mhs1.setProdi("Teknik Informatika");
        mhs1.tampilkanData(mhs1);
    }
}

