import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Transaksi {
    private String idTransaksi;
    private Date tanggal;
    private ArrayList<Obat> daftarObatBeli;
    private ArrayList<Integer> daftarJumlah;
    private double totalHarga;

    // Constructor
    public Transaksi(String idTransaksi) {
        this.idTransaksi = idTransaksi;
        this.tanggal = new Date();
        this.daftarObatBeli = new ArrayList<>();
        this.daftarJumlah = new ArrayList<>();
        this.totalHarga = 0;
    }

    // Menambahkan item ke transaksi
    public void tambahItem(Obat obat, int jumlah) {
        daftarObatBeli.add(obat);
        daftarJumlah.add(jumlah);
        totalHarga += obat.getHarga() * jumlah;
    }

    // Getter
    public String getIdTransaksi() {
        return idTransaksi;
    }

    public double getTotalHarga() {
        return totalHarga;
    }

    public Date getTanggal() {
        return tanggal;
    }

    public int getJumlahItem() {
        return daftarObatBeli.size();
    }

    // Cetak struk belanja
    public void cetakStruk() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");

        System.out.println("\n╔══════════════════════════════════════════════╗");
        System.out.println("║          APOTEK MINI - STRUK BELANJA         ║");
        System.out.println("╠══════════════════════════════════════════════╣");
        System.out.println("  No. Transaksi : " + idTransaksi);
        System.out.println("  Tanggal       : " + sdf.format(tanggal));
        System.out.println("╠══════════════════════════════════════════════╣");
        System.out.printf("  %-20s %5s %12s\n", "Nama Obat", "Qty", "Subtotal");
        System.out.println("  ─────────────────────────────────────────");

        for (int i = 0; i < daftarObatBeli.size(); i++) {
            Obat obat = daftarObatBeli.get(i);
            int qty = daftarJumlah.get(i);
            double subtotal = obat.getHarga() * qty;
            System.out.printf("  %-20s %5d Rp%,10.0f\n", obat.getNamaObat(), qty, subtotal);
        }

        System.out.println("  ─────────────────────────────────────────");
        System.out.printf("  TOTAL                       Rp%,10.0f\n", totalHarga);
        System.out.println("╠══════════════════════════════════════════════╣");
        System.out.println("║       Terima kasih telah berbelanja!         ║");
        System.out.println("║            Semoga lekas sembuh!              ║");
        System.out.println("╚══════════════════════════════════════════════╝");
    }
}
