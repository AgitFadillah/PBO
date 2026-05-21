public class Obat {
    private String kodeObat;
    private String namaObat;
    private String kategori;
    private double harga;
    private int stok;

    // Constructor
    public Obat(String kodeObat, String namaObat, String kategori, double harga, int stok) {
        this.kodeObat = kodeObat;
        this.namaObat = namaObat;
        this.kategori = kategori;
        this.harga = harga;
        this.stok = stok;
    }

    // Getter dan Setter (Encapsulation)
    public String getKodeObat() {
        return kodeObat;
    }

    public void setKodeObat(String kodeObat) {
        this.kodeObat = kodeObat;
    }

    public String getNamaObat() {
        return namaObat;
    }

    public void setNamaObat(String namaObat) {
        this.namaObat = namaObat;
    }

    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

    // Method untuk mengurangi stok saat pembelian
    public boolean kurangiStok(int jumlah) {
        if (jumlah <= stok) {
            stok -= jumlah;
            return true;
        }
        return false;
    }

    // Method untuk menambah stok
    public void tambahStok(int jumlah) {
        stok += jumlah;
    }

    // Method untuk menampilkan info obat
    public void tampilInfo() {
        System.out.printf("| %-6s | %-20s | %-12s | Rp%,10.0f | %5d |\n",
                kodeObat, namaObat, kategori, harga, stok);
    }

    @Override
    public String toString() {
        return namaObat + " (Rp" + String.format("%,.0f", harga) + ")";
    }
}
