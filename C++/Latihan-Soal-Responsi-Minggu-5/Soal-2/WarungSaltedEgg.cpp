// Nama: Prana Gusriana
// NIM: 13519195
// Tanggal: Kamis, 18 Februari 2021
// File: main.cpp
// Latihan Soal Responsi Minggu ke-5, Soal 2

#include "WarungSaltedEgg.hpp"
#include <iostream>

/*
Untuk melancarkan mimpinya untuk memiliki 100 teman, Komi ingin mendirikan dinasti franchise warung nasi. Setelah mendirikan Warung Nasi, dia akan membuat warung nasi goreng dan warung Chicken Salted Egg. Untuk itu, bantulah Komi untuk membuat WarungNasgor dan WarungSaltedEgg dengan menurunkan kelas WarungNasi
Implementasi WarungNasi sudah diberikan, sementara WarungNasgor dan WarungSaltedEgg harus diimplementasikan dari header yang telah diberikan.

WarungNasi.hpp
WarungNasi.cpp
WarungNasgor.hpp
WarungSaltedEgg.hpp

Upload WarungNasgor.cpp dan WarungSaltedEgg.cpp dalam satu file zip menjadi WarungNasi.zip
*/

using namespace std;

// Masukan: Jumlah uang, nasi, telur, telur asin, dan ayam
WarungSaltedEgg::WarungSaltedEgg(int uang, int nasi, int telur, int telurAsin, int ayam): WarungNasi(uang, nasi, telur){
    this->telurAsin = telurAsin;
    this->ayam = ayam;
}

// Resep Nasi Ayam Salted Egg
//     1 Nasi
//     1 Telur
//     3 Telur Asin
//     1 Ayam
// Jika bahan yang dibutuhkan kurang, kembalikan false.
// Jika cukup, hitung pendapatan total. Pendapatan total dihitung dengan jumlah pesanan dikali 30000
// Setelah itu, tambahkan pendapatan total ke uang. Kembalikan true.
bool WarungSaltedEgg::masak(int pesanan){
    if (WarungNasi::getNasi()-pesanan>=0 && WarungNasi::getTelur()-pesanan>=0 && this->telurAsin-pesanan*3>=0 && this->ayam-pesanan>=0){
        WarungNasi::setUang(WarungNasi::getUang() + pesanan*30000);
        return true;
    } else{
        return false;
    }
}