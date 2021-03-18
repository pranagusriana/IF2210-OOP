// Nama: Prana Gusriana
// NIM: 13519195
// Tanggal: Kamis, 18 Maret 2021
// File: Transaksi.java
// Latihan responsi minggu ke-9, Soal 2


public class Transaksi {
    // Rekening yang merupakan asal transaksi ini
    private Rekening rekening;
    // Perubahan saldo pada rekening oleh transaksi ini
    private double perubahan;

    // Konstruktor transaksi
    public Transaksi(Rekening rekening, double perubahan) {
        this.rekening = rekening;
        this.perubahan = perubahan;
    }

    // Mengembalikan rekening yang merupakan asal transaksi ini
    public Rekening getRekening() {
        return this.rekening;
    }

    // Mengembalikan perubahan untuk transaksi ini
    public double getPerubahan() {
        return this.perubahan;
    }
}

/*
Diberikan kerangka kelas Rekening dan Transaksi yang menyimpan detil penyimpanan dan penarikan uang sebagai berikut:
    Rekening.java
    Transaksi.java
Kumpulkan Rekening.java dan Transaksi.java dalam satu berkas .zip dengan nama bebas.
*/