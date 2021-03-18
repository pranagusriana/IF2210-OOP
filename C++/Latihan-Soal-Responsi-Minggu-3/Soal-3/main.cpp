// Nama: Prana Gusriana
// NIM: 13519195
// Tanggal: Kamis, 04 Februari 2021
// File: main.cpp
// Latihan Soal Responsi Minggu ke-3, Soal 3

/*
Berikut adalah deklarasi dan definisi dari kelas Box. Kelas Box menghasilkan keluaran khusus jika constructor, copy constructor, copy assignment operator, destructor, dan fungsi peek dipanggil.
Box.hpp
Box.cpp

Tugas anda: Unggah file main.cpp yang isinya adalah main program, yang menggunakan kelas A untuk menghasilkan keluaran berikut:
new empty box 2
new empty box with default id 0
new empty box 1
assign box 0 <- 2
copy box 1
box 2
box 1
destroy box 2
destroy box 1
destroy box 1
destroy box 2
*/
#include "Box.hpp"

int main(){
    Box *B1 = new Box(2);
    Box *B2 = new Box();
    Box *B3 = new Box(1);
    *B2 = *B1;
    Box *B4 = new Box(*B3);
    B1->peek();
    B3->peek();
    delete B1;
    delete B3;
    delete B4;
    delete B2;
    return 0;
}