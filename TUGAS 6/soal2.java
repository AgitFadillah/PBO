interface terbang {
    void terbang();
}

class burung implements terbang {
    String nama;

    burung(String nama) {
        this.nama = nama;
    }

    public void terbang() {
        System.out.println(nama + " sedang terbang.");
    }
}

class pesawat implements terbang {
    String nama;

    pesawat(String nama) {
        this.nama = nama;
    }

    public void terbang() {
        System.out.println(nama + " sedang terbang di udara.");
    }
}

public class soal2 {
    public static void main(String[] args) {

    }
}
