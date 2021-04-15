// Nama: Prana Gusriana
// NIM: 13519195
// Tanggal: Kamis, 15 April 2021
// File: CompileErrorException.java
// Latihan soal responsi minggu ke 13, Soal 1

import java.util.*;

public class CompileErrorException extends Exception {
    private ArrayList<Integer> errorLocations; // Memiliki sebuah member berupa list of integer (ArrayList<Integer>) errorLocations yang merupakan semua lokasi kesalahan pada kode.

    public CompileErrorException(ArrayList<Integer> arr){ // Memiliki konstruktor dengan satu parameter bertipe list of integer. Konstruktor akan meng-assign errorLocations dengan parameter tsb.
        this.errorLocations = arr;
    }

    public void showErrors(){ // Method showErrors(), menuliskan "Error di baris : <no_baris>" (diakhiri newline) untuk setiap elemen errorLocations ke layar.
        for(int no_baris : this.errorLocations){
            System.out.println("Error di baris : " + (no_baris+1));
        }
    }
}

/*
CompileErrorException.java
- Memiliki sebuah member berupa list of integer (ArrayList<Integer>) errorLocations yang merupakan semua lokasi kesalahan pada kode.
- Memiliki konstruktor dengan satu parameter bertipe list of integer. Konstruktor akan meng-assign errorLocations dengan parameter tsb.
- Method showErrors(), menuliskan "Error di baris : <no_baris>" (diakhiri newline) untuk setiap elemen errorLocations ke layar.
*/