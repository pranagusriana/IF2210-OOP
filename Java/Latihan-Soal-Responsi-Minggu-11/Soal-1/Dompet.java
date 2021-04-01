// Nama: Prana Gusriana
// NIM: 13519195
// Tanggal: Kamis, 1 April 2021
// File: Dompet.java
// Latihan soal responsi minggu ke 11, Soal 1

import java.util.*;

public class Dompet<T extends Number> {
    private ArrayList<Transaction<T>> transactions;


     public Dompet() {
        // Constructor tanpa parameter, transactions diinisialisasi dengan array list baru
        this.transactions = new ArrayList<>();
    }


    public Dompet(T initialBalance) {
        // Constructor dengan parameter T initialBalance, inisialisasi transactions dengan array list baru dan tambahkan transaksi tambah dengan value initial balance
        /* contoh transaksi tambah: new Transaction<T>('+', initialBalance) */
        this.transactions = new ArrayList<>();
        this.addMoney(initialBalance);
    }

    public void addMoney(T money) {
        // Buat prosedur addMoney dengan parameter T money, tambahkan transaksi tambah dengan senilai money
        this.transactions.add(new Transaction<T>('+', money));
    }

    public boolean takeMoney(T money) {
        // Tambahkan transaksi kurang sebesar money (perlu ada pengecekan apakah balance cukup atau tidak)
        // false bila transaksi gagal, true bila berhasil
        if(money.doubleValue() <= this.getBalance()){
            this.transactions.add(new Transaction<T>('-', money));
            return true;
        } else{
            return false;
        }
    }

    public void setBalance(T balance) {
        // Mengganti transaksi agar bernilai sama dengan balance
        // Tips: inisialisasi ulang transactions, lalu tambahkan transaksi tambah sebanyak balance
        this.transactions = new ArrayList<>();
        this.addMoney(balance);
    }

    // Akses nilai Double dilakukan dengan .doubleValue()
    // Contoh: amount.doubleValue()

    public Double getBalance(){
        // Mencari balance dompet dari transaksi dengan cara menghitung total transaksi
        Double total = 0.00;
        for(Transaction<T> tr : this.transactions){
            if(tr.getType() == '+'){
                total += tr.getAmount().doubleValue();
            } else{
                total -= tr.getAmount().doubleValue();
            }
        }
        return total;
    }

    public void printTransactions() {
        // Print seluruh transaksi yang ada pada array
        // Format: Transactions [indeks + 1]: [tipe transaksi] [amount]
        // Contoh: Transactions 3: + 500
        int i = 0;
        for(Transaction<T> tr : this.transactions){
            System.out.println("Transactions " + (i+1) + ": " + tr.getType() + " " + tr.getAmount());
            i++;
        }
    }

    public Double getAverageTransaction() {
        // Mencari rata-rata transaksi (jika tidak ada transaksi, berikan hasil null)
        if(this.transactions.size() == 0){
            return null;
        } else{
            Double sum = this.getBalance();
            int count = this.transactions.size();
            return sum/count;
        }
    }

    public Double getMinimumTransaction() {
        // Mencari nilai minimum transaksi (jika tidak ada transaksi, berikan hasil null; hanya perlu membandingkan nilainya saja tanpa peduli type)
        if(this.transactions.size() == 0){
            return null;
        } else{
            double min = (double) this.transactions.get(0).getAmount().doubleValue();
            for(Transaction<T> tr : this.transactions){
                if(min > tr.getAmount().doubleValue()){
                    min = tr.getAmount().doubleValue();
                }
            }
            return min;
        }
    }

    public Double getMaximumTransaction() {
        // Mencari nilai maksimum transaksi (jika tidak ada transaksi, berikan hasil null; hanya perlu membandingkan nilainya saja tanpa peduli type)
        if(this.transactions.size() == 0){
            return null;
        } else{
            double max = this.transactions.get(0).getAmount().doubleValue();
            for(Transaction<T> tr : this.transactions){
                if(max < tr.getAmount().doubleValue()){
                    max = tr.getAmount().doubleValue();
                }
            }
            return max;
        }
    }
}

/*
Diberikan implementasi kelas Transaction ada pada Transaction.java berikut. Buatlah implementasi dari kelas Dompet pada file Dompet.java. Kemudian, kumpulkan Dompet.java.
*/