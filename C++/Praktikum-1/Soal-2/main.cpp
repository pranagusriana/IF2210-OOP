// Nama: Prana Gusriana
// NIM: 13519195
// Tanggal: Kamis, 11 Februari 2021
// File: main.cpp
// Praktikum-1 Soal-2

#include "A.hpp"

/*
Penggunaan Kelas 1

Berikut adalah implementasi dari kelas A, yaitu kelas yang menyimpan suatu karakter dan menghasilkan keluaran khusus jika constructor, copy constructor, copy assignment operator, destructor, dan fungsi show dipanggil.

A.cpp

A.hpp

Sebagai contoh, program sebagai berikut:

int main() {
    A x('1');
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
ccons 1
cassign 1 = 2
show 2
dest 2
dest 2
dest 1
*/

using namespace std;

int main(){
    A *A1 = new A('1');
    A *A2 = new A('2');
    A *A3 = new A(*A1);
    *A3 = *A2;
    A3->show();
    delete A3;
    delete A2;
    delete A1;
    return 0;
}