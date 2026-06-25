package tugas;

public class Barang {
    // Atribut barang
    private String nama;
    private double harga;
    private int stok;

    // Constructor
    public Barang(String nama, double harga, int stok) {
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
    }

    // Getter
    public String getNama() {
        return nama;
    }

    public double getHarga() {
        return harga;
    }

    public int getStok() {
        return stok;
    }

    // Method untuk mengubah objek menjadi satu baris teks dengan pemisah ";"
    public String keBaris() {
        return nama + ";" + harga + ";" + stok;
    }

    // Method untuk menampilkan keterangan barang
    public String info() {
        return nama + " | Harga: Rp" + harga + " | Stok: " + stok;
    }
}