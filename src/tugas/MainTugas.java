// Nama : Muhammad Syahru Ramadhan (Syhar)
// NPM  : [ISI DENGAN NPM KAMU DI SINI]

package tugas;

public class MainTugas {
    public static void main(String[] args) {
        System.out.println("=====================================");
        System.out.println("Sistem Pengelolaan Data Barang Toko");
        System.out.println("=====================================\n");

        // 1. Menyimpan dan menampilkan daftar nama kategori dalam array String
        String[] kategori = {"Elektronik", "Pakaian", "Makanan", "Alat Tulis"};
        System.out.println("Kategori Barang Tersedia:");
        for (String k : kategori) {
            System.out.println("- " + k);
        }
        System.out.println();

        // 2. Membuat objek Gudang dan menambahkan 5 barang
        Gudang gudangUtama = new Gudang("barang.txt");
        gudangUtama.tambahBarang(new Barang("Laptop ASUS", 12000000, 5));
        gudangUtama.tambahBarang(new Barang("Mouse Wireless", 150000, 20));
        gudangUtama.tambahBarang(new Barang("Keyboard Mekanik", 750000, 10));
        gudangUtama.tambahBarang(new Barang("Flashdisk 64GB", 90000, 30));
        gudangUtama.tambahBarang(new Barang("Monitor 24 Inch", 2500000, 8));

        // Menampilkan barang sebelum disimpan
        gudangUtama.tampilkanSemua();
        System.out.println("Total Nilai Persediaan: Rp" + gudangUtama.totalNilai());
        
        // Menyimpan ke file teks
        gudangUtama.simpanKeBerkas();
        System.out.println();

        // 3. Membuat objek Gudang baru untuk membuktikan data tersimpan
        System.out.println("--- Menguji Muat Data dari File ---");
        Gudang gudangVerifikasi = new Gudang("barang.txt");
        gudangVerifikasi.muatDariBerkas();
        gudangVerifikasi.tampilkanSemua();
        System.out.println("Total Nilai Persediaan yang dimuat: Rp" + gudangVerifikasi.totalNilai());
    }
}