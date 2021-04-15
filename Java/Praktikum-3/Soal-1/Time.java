// Nama: Prana Gusriana
// NIM: 13519195
// Tanggal: Kamis, 25 Maret 2021
// File: Time.java
// Praktikum-3, Soal 1

public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time() {
        // Set seluruh atribut dengan nilai 0
        this.hour = 0;
        this.minute = 0;
        this.second = 0;
    }

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public Time(Time t) {
        // Set atribut dengan atribut milik t
        this.hour = t.getHour();
        this.minute = t.getMinute();
        this.second = t.getSecond();
    }

    public int getHour() {
        return this.hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return this.minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecond() {
        return this.second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public int convertToSecond() {
        return this.hour*3600 + this.minute*60 + this.second;
    }

    public Time add(Time t) {
        // Return penjumlahan dua objek jam, yaitu *this* dan t.
        // Apabila hasil penjumlahan melebihi 23:59:59, maka Anda harus mengonversinya seperti tampilan jam digital asli.
        // Contoh : 24:00:00 dituliskan 00:00:00, 25:00:00 dituliskan 01:00:00, dst.
        int totalDetik = (this.convertToSecond() + t.convertToSecond()) % 86400;
        int hh = totalDetik/3600;
        int mm = (totalDetik%3600)/60;
        int ss = (totalDetik%3600)%60;
        Time tret = new Time(hh, mm, ss);
        return tret;
    }

    public Time minus(Time t) {
        // Return selisih antara dua objek jam, yaitu *this* dan t.
        // Perhitungan selisih hanya dapat dilakukan jika objek ruas kiri lebih akhir dari atau sama dengan objek ruas kanan.
        // Jika objek ruas kiri lebih awal, maka kembalikan nilai objek ruas kiri.
        // Contoh: 00:00:01 - 00:00:02 = 00:00:01
        int totalDetik = this.convertToSecond() - t.convertToSecond();
        if(totalDetik < 0){
            return this;
        } else{
            totalDetik %= 86400;
            int hh = totalDetik/3600;
            int mm = (totalDetik%3600)/60;
            int ss = (totalDetik%3600)%60;
            Time tret = new Time(hh, mm, ss);
            return tret;
        }
    }

    public boolean lessThan(Time t) {
        // Returns true jika *this* < t menurut definisi waktu
        return this.convertToSecond() < t.convertToSecond();
    }

    public boolean greaterThan(Time t) {
        // Returns true jika *this* > t menurut definisi waktu
        return this.convertToSecond() > t.convertToSecond();
    }

    public void printTime() {
        // Menuliskan jam dalam format hh:mm:ss diakhiri dengan newline. Perhatikan bahwa setiap parameter harus dituliskan 2 digit.
        String hh = "";
        String mm = "";
        String ss = "";
        if(this.hour < 10){
            hh += "0";
        }
        if(this.minute < 10){
            mm += "0";
        }
        if(this.second < 10){
            ss += "0";
        }
        hh += this.hour;
        mm += this.minute;
        ss += this.second;
        System.out.println(hh + ":" + mm + ":" + ss);
    }
}
