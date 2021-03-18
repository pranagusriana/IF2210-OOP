// Nama: Prana Gusriana
// NIM: 13519195
// Tanggal: Kamis, 11 Februari 2021
// File: main.cpp
// Praktikum-1 Soal-3

#include "A.hpp"

/*
Penggunaan Kelas 2

Berikut adalah implementasi dari kelas A, yaitu kelas yang menyimpan suatu karakter dan menghasilkan keluaran khusus jika constructor, copy constructor, copy assignment operator, destructor, dan fungsi show dipanggil.

A.cpp

A.hpp

Sebagai contoh, program sebagai berikut:

int main() {
    A x(1);
    x.show();
    return 0;
}
Akan menghasilkan keluaran berikut (angka 1 adalah nilai yang dimasukkan ke constructor):

cons 1
show 1
dest 1
Tugas anda: Unggah file main.cpp yang isinya adalah main program, yang menggunakan kelas A untuk menghasilkan keluaran berikut:

cons 1
cons 2
cons 3
cons 4
cassign 3 = 1
cons 5
cassign 4 = 5
dest 5
cons 6
ccons 5
ccons 2
cassign 2 = 6
cassign 1 = 5
show 2
dest 2
dest 5
dest 6
dest 5
dest 1
dest 6
dest 5
*/

int main(){
    A *A1 = new A(1);
    A *A2 = new A(2);
    A *A3 = new A(3);
    A *A4 = new A(4);
    *A3 = *A1;
    A *A5 = new A(5);
    *A4 = *A5;
    delete A5;
    A *A6 = new A(6);
    A5 = new A(*A4);
    A *A7 = new A(*A2);
    *A7 = *A6;
    *A3 = *A5;
    A2->show();
    delete A2;
    delete A3;
    delete A7;
    delete A5;
    delete A1;
    delete A6;
    delete A4;
    return 0;
}