// Nama: Prana Gusriana
// NIM: 13519195
// Tanggal: Kamis, 18 Maret 2021
// File: Rekening.java
// Latihan responsi minggu ke-9, Soal 2


public class Rekening {
    // Daftar transaksi yang telah dilakukan pada rekening ini
    private Transaksi[] daftarTransaksi;
    // Jumlah transaksi yang telah dilakukan pada rekening ini
    private int jumlahTransaksi;
    // Jumlah transaksi maksimum yang dapat disimpan
    private int maxTransaksi;

    // Konstruktor, dengan nilai maxTransaksi awal
    public Rekening(int maxTrans) {
        this.maxTransaksi = maxTrans;
        this.jumlahTransaksi = 0;
        this.daftarTransaksi = new Transaksi[this.maxTransaksi];
    }

    // Getter
    public int getJumlahTransaksi() {
        return this.jumlahTransaksi;
    }
    public int getMaxTransaksi() {
        return this.maxTransaksi;
    }

    // Mengembalikan array baru yang berisi `count` transaksi terakhir yang dilakukan
    public Transaksi[] getLastTransaksi(int count) {
        Transaksi[] tret = new Transaksi[count];
        for(int i=this.jumlahTransaksi-count; i<this.jumlahTransaksi; i++){
            tret[i-(this.jumlahTransaksi-count)] = this.daftarTransaksi[i];
        }
        return tret;
    }

    // Mengembalikan saldo pada rekening, yaitu hasil penjumlahan perubahan semua transaksi yang telah dilakukan
    public double getSaldo() {
        double sum = 0;
        for(int i = 0; i < this.jumlahTransaksi; i++){
            sum += this.daftarTransaksi[i].getPerubahan();
        }
        return sum;
    }

    // Membuat transaksi baru yang menambahkan `amount` uang pada rekening.
    // `amount` harus positif dan harus ada sisa tempat di rekening.
    // Mengembalikan status berhasil/gagal penyimpanan uang. (Jika berhasil, mengembalikan true)
    public boolean simpanUang(double amount) {
        if (amount<=0){
            return false;
        } else{
            if(this.jumlahTransaksi==this.maxTransaksi){
                return false;
            } else{
                this.daftarTransaksi[this.jumlahTransaksi] = new Transaksi(this, amount);
                this.jumlahTransaksi++;
                return true;
            }
        }
    }

    // Membuat transaksi baru yang mengurangi `amount` uang pada rekening.
    // `amount` harus positif dan lebih kecil dari saldo, dan harus ada sisa tempat di rekening.
    // Harus ada sisa tempat di rekening.
    // Mengembalikan status berhasil/gagal penarikan uang. (Jika berhasil, mengembalikan true)
    public boolean tarikUang(double amount) {
        if (amount<=0 || amount>this.getSaldo()){
            return false;
        } else{
            if(this.jumlahTransaksi==this.maxTransaksi){
                return false;
            } else{
                this.daftarTransaksi[this.jumlahTransaksi] = new Transaksi(this, amount*-1);
                this.jumlahTransaksi++;
                return true;
            }
        }
    }
}

/*
Diberikan kerangka kelas Rekening dan Transaksi yang menyimpan detil penyimpanan dan penarikan uang sebagai berikut:
    Rekening.java
    Transaksi.java
Kumpulkan Rekening.java dan Transaksi.java dalam satu berkas .zip dengan nama bebas.
*/