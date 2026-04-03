class mahasiswa{
    private String nama;
    private long NIM;
    private String prodi;
    private int semester;

    public void setNama(String nama){
        this.nama = nama;
    }

    public void setNIM(long NIM){
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

    public long getNIM(){
        return NIM;
    }

    public String getprodi(){
        return prodi;
    }

    public int getSemester(){
        return semester;
    }

    public void tampilkandata(mahasiswa mhs){
        if (mhs.getSemester() > 0) {
            System.out.println();
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

public class soal5 {
    public static void main(String[] args) {
        mahasiswa mhs1 = new mahasiswa();
        mhs1.setNama("Agit Fadillah");
        mhs1.setNIM(123456789);
        mhs1.setProdi("Teknik Informatika");
        mhs1.setSemester(4);

        mahasiswa mhs2 = new mahasiswa();
        mhs2.setNama("Nayla Agustria Putri");
        mhs2.setNIM(2415031002L);
        mhs2.setProdi("Teknik Elektro");
        mhs2.setSemester(4);

        mahasiswa mhs3 = new mahasiswa();
        mhs3.setNama("Nasywa Anya Ramadhani");
        mhs3.setNIM(2412011529L);
        mhs3.setProdi("Ilmu Hukum");
        mhs3.setSemester(4);

        mahasiswa mhs4 = new mahasiswa();
        mhs4.setNama("Lare La Ruso");
        mhs4.setNIM(241200012L);
        mhs4.setProdi("Ilmu Filsafat");
        mhs4.setSemester(12);

        System.out.println("Data Mahasiswa:");
        mhs1.tampilkandata(mhs1);
        mhs2.tampilkandata(mhs2);
        mhs3.tampilkandata(mhs3);
        mhs4.tampilkandata(mhs4);
    }
}