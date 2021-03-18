// Nama: Prana Gusriana
// NIM: 13519195
// Tanggal: Kamis, 4 Maret 2021
// File: main.cpp
// Latihan responsi minggu ke-7, Soal 1

// main.cpp
#include "A.hpp"
#include "B.hpp"
#include <iostream>

using namespace std;
int main() {
  B b; /** ANDA HARUS MENGGUNAKAN DEFAULT CONSTRUCTOR */
  
  A *a = &b;
  a->setValue(888);
  b.setValue(10888);
  
  b.print(); // OUTPUT: (888, 10888)
  return 0;
}