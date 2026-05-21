import java.util.ArrayList;
import java.util.Scanner;

public class ApotikMini {
    private ArrayList<Obat> daftarObat;
    private ArrayList<Transaksi> riwayatTransaksi;
    private int counterTransaksi;
    private Scanner scanner;

    // Constructor - inisialisasi data awal apotek
    public ApotikMini() {
        daftarObat = new ArrayList<>();
        riwayatTransaksi = new ArrayList<>();
        counterTransaksi = 1;
        scanner = new Scanner(System.in);

        // Tambah data obat awal
        daftarObat.add(new Obat("OB001", "Paracetamol", "Analgesik", 5000, 100));
        daftarObat.add(new Obat("OB002", "Amoxicillin", "Antibiotik", 8500, 50));
        daftarObat.add(new Obat("OB003", "Antangin", "Herbal", 3000, 200));
        daftarObat.add(new Obat("OB004", "Promag", "Maag", 4000, 150));
        daftarObat.add(new Obat("OB005", "Bodrex", "Analgesik", 4500, 120));
        daftarObat.add(new Obat("OB006", "OBH Combi", "Batuk", 12000, 80));
        daftarObat.add(new Obat("OB007", "Betadine", "Antiseptik", 15000, 60));
        daftarObat.add(new Obat("OB008", "Vitamin C 1000mg", "Vitamin", 7500, 90));
        daftarObat.add(new Obat("OB009", "Ibuprofen", "Analgesik", 6000, 70));
        daftarObat.add(new Obat("OB010", "Diapet", "Diare", 5500, 85));
    }

    // Tampilkan menu utama
    private void tampilMenu() {
        System.out.println("\n╔══════════════════════════════════════════════╗");
        System.out.println("║        SIMULASI APOTEK MINI - PBO            ║");
        System.out.println("╠══════════════════════════════════════════════╣");
        System.out.println("║  1. Lihat Daftar Obat                       ║");
        System.out.println("║  2. Cari Obat                               ║");
        System.out.println("║  3. Beli Obat                               ║");
        System.out.println("║  4. Tambah Obat Baru                        ║");
        System.out.println("║  5. Tambah Stok Obat                        ║");
        System.out.println("║  6. Riwayat Transaksi                       ║");
        System.out.println("║  7. Keluar                                  ║");
        System.out.println("╚══════════════════════════════════════════════╝");
        System.out.print("Pilih menu (1-7): ");
    }

    // 1. Tampilkan semua obat
    private void lihatDaftarObat() {
        System.out.println("\n╔══════════════════════════════════════════════════════════════════════════╗");
        System.out.println("║                           DAFTAR OBAT TERSEDIA                          ║");
        System.out.println("╠════════╦══════════════════════╦══════════════╦═════════════╦═══════╣");
        System.out.println("║ Kode   ║ Nama Obat            ║ Kategori     ║    Harga    ║ Stok  ║");
        System.out.println("╠════════╬══════════════════════╬══════════════╬═════════════╬═══════╣");

        for (Obat obat : daftarObat) {
            obat.tampilInfo();
        }

        System.out.println("╚════════╩══════════════════════╩══════════════╩═════════════╩═══════╝");
        System.out.println("Total jenis obat: " + daftarObat.size());
    }

    // 2. Cari obat berdasarkan nama
    private void cariObat() {
        System.out.print("\nMasukkan nama obat yang dicari: ");
        String keyword = scanner.nextLine().toLowerCase();

        ArrayList<Obat> hasil = new ArrayList<>();
        for (Obat obat : daftarObat) {
            if (obat.getNamaObat().toLowerCase().contains(keyword)) {
                hasil.add(obat);
            }
        }

        if (hasil.isEmpty()) {
            System.out.println("Obat dengan kata kunci \"" + keyword + "\" tidak ditemukan.");
        } else {
            System.out.println("\nHasil pencarian (" + hasil.size() + " ditemukan):");
            System.out.println("────────────────────────────────────────────────────");
            for (Obat obat : hasil) {
                obat.tampilInfo();
            }
        }
    }

    // 3. Beli obat
    private void beliObat() {
        String idTrx = String.format("TRX%03d", counterTransaksi);
        Transaksi transaksi = new Transaksi(idTrx);

        System.out.println("\n═══ TRANSAKSI PEMBELIAN OBAT ═══");

        // Tampilkan daftar obat agar konsumen tahu kode obatnya
        System.out.println("\nDaftar obat yang tersedia:");
        System.out.println("┌────────┬──────────────────────┬─────────────┬───────┐");
        System.out.println("│ Kode   │ Nama Obat            │    Harga    │ Stok  │");
        System.out.println("├────────┼──────────────────────┼─────────────┼───────┤");
        for (Obat obat : daftarObat) {
            System.out.printf("│ %-6s │ %-20s │ Rp%,8.0f │ %5d │\n",
                    obat.getKodeObat(), obat.getNamaObat(), obat.getHarga(), obat.getStok());
        }
        System.out.println("└────────┴──────────────────────┴─────────────┴───────┘");

        System.out.println("\n(Ketik 'selesai' untuk menyelesaikan transaksi)\n");

        while (true) {
            System.out.print("Masukkan kode obat (atau 'selesai'): ");
            String input = scanner.nextLine().trim();

            if (input.equalsIgnoreCase("selesai")) {
                break;
            }

            // Cari obat berdasarkan kode
            Obat obatDitemukan = null;
            for (Obat obat : daftarObat) {
                if (obat.getKodeObat().equalsIgnoreCase(input)) {
                    obatDitemukan = obat;
                    break;
                }
            }

            if (obatDitemukan == null) {
                System.out.println("Obat dengan kode \"" + input + "\" tidak ditemukan!");
                continue;
            }

            System.out.println("Obat: " + obatDitemukan.getNamaObat() +
                    " | Harga: Rp" + String.format("%,.0f", obatDitemukan.getHarga()) +
                    " | Stok: " + obatDitemukan.getStok());

            System.out.print("Jumlah beli: ");
            int jumlah;
            try {
                jumlah = Integer.parseInt(scanner.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Input tidak valid! Masukkan angka.");
                continue;
            }

            if (jumlah <= 0) {
                System.out.println("Jumlah harus lebih dari 0!");
                continue;
            }

            if (obatDitemukan.kurangiStok(jumlah)) {
                transaksi.tambahItem(obatDitemukan, jumlah);
                System.out.println(">> " + obatDitemukan.getNamaObat() + " x" + jumlah + " ditambahkan ke keranjang.");
            } else {
                System.out.println("Stok tidak mencukupi! Stok tersedia: " + obatDitemukan.getStok());
            }
        }

        // Proses transaksi jika ada item
        if (transaksi.getJumlahItem() > 0) {
            transaksi.cetakStruk();
            riwayatTransaksi.add(transaksi);
            counterTransaksi++;
        } else {
            System.out.println("Transaksi dibatalkan (tidak ada item).");
        }
    }

    // 4. Tambah obat baru
    private void tambahObatBaru() {
        System.out.println("\n═══ TAMBAH OBAT BARU ═══");

        System.out.print("Kode Obat   : ");
        String kode = scanner.nextLine().trim();

        // Cek apakah kode sudah ada
        for (Obat obat : daftarObat) {
            if (obat.getKodeObat().equalsIgnoreCase(kode)) {
                System.out.println("Kode obat \"" + kode + "\" sudah ada!");
                return;
            }
        }

        System.out.print("Nama Obat   : ");
        String nama = scanner.nextLine().trim();

        System.out.print("Kategori    : ");
        String kategori = scanner.nextLine().trim();

        System.out.print("Harga (Rp)  : ");
        double harga;
        try {
            harga = Double.parseDouble(scanner.nextLine().trim());
        } catch (NumberFormatException e) {
            System.out.println("Input harga tidak valid!");
            return;
        }

        System.out.print("Stok Awal   : ");
        int stok;
        try {
            stok = Integer.parseInt(scanner.nextLine().trim());
        } catch (NumberFormatException e) {
            System.out.println("Input stok tidak valid!");
            return;
        }

        Obat obatBaru = new Obat(kode, nama, kategori, harga, stok);
        daftarObat.add(obatBaru);
        System.out.println("Obat \"" + nama + "\" berhasil ditambahkan!");
    }

    // 5. Tambah stok obat yang sudah ada
    private void tambahStok() {
        System.out.println("\n═══ TAMBAH STOK OBAT ═══");
        System.out.print("Masukkan kode obat: ");
        String kode = scanner.nextLine().trim();

        Obat obatDitemukan = null;
        for (Obat obat : daftarObat) {
            if (obat.getKodeObat().equalsIgnoreCase(kode)) {
                obatDitemukan = obat;
                break;
            }
        }

        if (obatDitemukan == null) {
            System.out.println("Obat dengan kode \"" + kode + "\" tidak ditemukan!");
            return;
        }

        System.out.println("Obat: " + obatDitemukan.getNamaObat() + " | Stok saat ini: " + obatDitemukan.getStok());
        System.out.print("Jumlah tambah stok: ");

        int jumlah;
        try {
            jumlah = Integer.parseInt(scanner.nextLine().trim());
        } catch (NumberFormatException e) {
            System.out.println("Input tidak valid!");
            return;
        }

        if (jumlah <= 0) {
            System.out.println("Jumlah harus lebih dari 0!");
            return;
        }

        obatDitemukan.tambahStok(jumlah);
        System.out.println("Stok \"" + obatDitemukan.getNamaObat() + "\" berhasil ditambah. Stok sekarang: " + obatDitemukan.getStok());
    }

    // 6. Tampilkan riwayat transaksi
    private void riwayatTransaksi() {
        if (riwayatTransaksi.isEmpty()) {
            System.out.println("\nBelum ada riwayat transaksi.");
            return;
        }

        System.out.println("\n═══ RIWAYAT TRANSAKSI ═══");
        System.out.println("Total transaksi: " + riwayatTransaksi.size());
        System.out.println("─────────────────────────────────");

        double totalPendapatan = 0;
        for (Transaksi trx : riwayatTransaksi) {
            System.out.printf("  %s | Rp%,.0f\n", trx.getIdTransaksi(), trx.getTotalHarga());
            totalPendapatan += trx.getTotalHarga();
        }

        System.out.println("─────────────────────────────────");
        System.out.printf("  Total Pendapatan: Rp%,.0f\n", totalPendapatan);

        // Tanya apakah mau lihat detail
        System.out.print("\nLihat detail transaksi? (y/n): ");
        String jawab = scanner.nextLine().trim();
        if (jawab.equalsIgnoreCase("y")) {
            System.out.print("Masukkan ID Transaksi: ");
            String idCari = scanner.nextLine().trim();
            for (Transaksi trx : riwayatTransaksi) {
                if (trx.getIdTransaksi().equalsIgnoreCase(idCari)) {
                    trx.cetakStruk();
                    return;
                }
            }
            System.out.println("Transaksi tidak ditemukan.");
        }
    }

    // Method utama untuk menjalankan simulasi
    public void jalankan() {
        System.out.println("╔══════════════════════════════════════════════╗");
        System.out.println("║     Selamat Datang di Apotek Mini!           ║");
        System.out.println("║     Simulasi Apotek - Tugas PBO              ║");
        System.out.println("╚══════════════════════════════════════════════╝");

        boolean berjalan = true;
        while (berjalan) {
            tampilMenu();
            String pilihan = scanner.nextLine().trim();

            switch (pilihan) {
                case "1":
                    lihatDaftarObat();
                    break;
                case "2":
                    cariObat();
                    break;
                case "3":
                    beliObat();
                    break;
                case "4":
                    tambahObatBaru();
                    break;
                case "5":
                    tambahStok();
                    break;
                case "6":
                    riwayatTransaksi();
                    break;
                case "7":
                    berjalan = false;
                    System.out.println("\n╔══════════════════════════════════════════════╗");
                    System.out.println("║   Terima kasih telah menggunakan Apotek Mini! ║");
                    System.out.println("║              Sampai jumpa lagi!               ║");
                    System.out.println("╚══════════════════════════════════════════════╝");
                    break;
                default:
                    System.out.println("Pilihan tidak valid! Silakan pilih 1-7.");
            }
        }
        scanner.close();
    }

    // Main method
    public static void main(String[] args) {
        ApotikMini apotek = new ApotikMini();
        apotek.jalankan();
    }
}
