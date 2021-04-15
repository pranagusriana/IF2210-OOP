// Nama: Prana Gusriana
// NIM: 13519195
// Tanggal: Kamis, 15 April 2021
// File: FileFormatException.java
// Latihan soal responsi minggu ke 13, Soal 1

import java.util.*;

public class FileFormatException extends Exception{
    private String errorMessage; // Memiliki sebuah member String bernama errorMessage.

    public FileFormatException(){ // Memiliki konstruktor tanpa parameter yang akan mengeset errorMessage dengan "Format salah" (tanpa newline).
        this.errorMessage = "Format salah";
    }

    public String getErrorMessage(){ // Memiliki getter getErrorMessage();
        return this.errorMessage;
    }
}

/*
FileFormatException.java
- Memiliki sebuah member String bernama errorMessage.
- Memiliki konstruktor tanpa parameter yang akan mengeset errorMessage dengan "Format salah" (tanpa newline).
- Memiliki getter getErrorMessage();
*/