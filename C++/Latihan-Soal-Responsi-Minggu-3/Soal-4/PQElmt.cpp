// Nama: Prana Gusriana
// NIM: 13519195
// Tanggal: Kamis, 04 Februari 2021
// File: PQElmt.cpp
// Latihan Soal Responsi Minggu ke-3, Soal 4

/*
PrioQueue merupakan sebuah struktur data yang merepresentasikan antrian dengan prioritas. Elemen dari PrioQueue merupakan kelas PQElmt yang memiliki value dan prio. PrioQueue selalu terurut dari yang terbesar.

Selain itu, dapat dilakukan penggabungan 2 PrioQueue dengan operator penjumlahan +.

Contoh: (format queue dalam bentuk [(value, prio)]

A = [(3, 3), (5, 2), (1, 1)]
B = [(1, 3), (2, 2,)]
Maka

A + B = [(1, 3), (3, 3), (2, 2), (5, 2), (1, 1)]
PrioQueue juga punya aksesor [k] untuk mengakses elemen ke k.

PQElmt.hpp, PQElmt.cpp, PrioQueue.hpp, PrioQueue.cpp

Diberikan definisi dan sebagian realisasi PQElmt dan PrioQueue, lengkapilah bagian yang masih kosong!

Upload PQElmt.cpp dan PrioQueue.cpp yang sudah dilengkapi dan di-zip menjadi PrioQueue.zip
*/

// PQElmt.cpp
#include "PQElmt.hpp"

PQElmt::PQElmt() {
  this->value = 0;
  this->prio = 0;
}

PQElmt::PQElmt(int value, int prio) {
  this->value = value;
  this->prio = prio;
}

PQElmt::PQElmt(const PQElmt& other) {
  this->value = other.value;
  this->prio = other.prio;
}

PQElmt::~PQElmt() {
  //
}

int PQElmt::getValue() const {
  return this->value;
}

int PQElmt::getPrio() const {
  return this->prio;
}

bool PQElmt::operator==(const PQElmt& other) {
  // Implementasikan di sini
  return this->prio == other.getPrio() && this->value == other.getValue();
}

bool PQElmt::operator<(const PQElmt& other) {
  // Implementasikan di sini
  if (this->prio == other.getPrio()){
    return this->value > other.getValue();
  } else {
    return this->prio < other.getPrio();
  }
}

bool PQElmt::operator>(const PQElmt& other) {
  // Implementasikan di sini
  if (this->prio == other.getPrio()){
    return this->value < other.getValue();
  } else {
    return this->prio > other.getPrio();
  }
}
