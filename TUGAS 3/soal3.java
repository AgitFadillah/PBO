class mahasiswa{
    private String nama;
    private int NIM;
    private String prodi;
    private int semester;

    public void setNama(String nama){
        this.nama = nama;
    }

    public void setNIM(int NIM){
        this.NIM = NIM;
    }

    public void setProdi(String prodi){
        this.prodi = prodi;
    }

    public void setSemester(int semester){
        this.semester = semester;
    }
    
    public String getNama(){
        return nama;
    }

    public int getNIM(){
        return NIM;
    } 

    public String getprodi(){
        return prodi;
    }

    public int getSemester(){
        return semester;
    }

    public void tampilkanData(mahasiswa mhs){
        if (mhs.getSemester() > 0) {
            System.out.println("Nama: " + mhs.getNama());
            System.out.println("NIM: " + mhs.getNIM());
            System.out.println("Prodi: " + mhs.getprodi());
            System.out.println("Semester: " + mhs.getSemester());
        }
        else {
            System.out.println("Data tidak valid");
        }
    }
}

public class soal3 {
    public static void main(String[] args) {
        mahasiswa mhs1 = new mahasiswa();
        mhs1.setNama("Agit Fadillah");
        mhs1.setNIM(123456789);
        mhs1.setProdi("Teknik Informatika");
        mhs1.setSemester(4);
        mhs1.tampilkanData(mhs1);
    }
}

