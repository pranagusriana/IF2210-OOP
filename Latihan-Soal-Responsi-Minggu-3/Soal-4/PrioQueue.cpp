// Nama: Prana Gusriana
// NIM: 13519195
// Tanggal: Kamis, 04 Februari 2021
// File: PrioQueue.cpp
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

#include "PrioQueue.hpp"
#include <iostream>

PrioQueue::PrioQueue() {
  this->neff = 0;
  this->maxEl = 20;
  this->queue = new PQElmt[this->maxEl];
}

PrioQueue::PrioQueue(int maxEl) {
  this->neff = 0;
  this->maxEl = maxEl;
  this->queue = new PQElmt[this->maxEl];
}

PrioQueue::PrioQueue(const PrioQueue& pq) {
  this->neff = pq.neff;
  this->maxEl = pq.maxEl;
  this->queue = new PQElmt[this->maxEl];
  for (int i = 0; i < this->maxEl; i++) {
    this->queue[i] = pq.queue[i];
  }
}

PrioQueue::~PrioQueue() {
  delete[] this->queue;
}

void PrioQueue::push(PQElmt el) {
  int idx = this->neff;
  while (idx > 0 && el > this->queue[idx - 1]) {
    this->queue[idx] = this->queue[idx - 1];
    idx--;
  }
  this->queue[idx] = el;
  this->neff += 1;
}

PQElmt PrioQueue::pop() {
  PQElmt val = this->queue[0];
  for (int i = 0; i < this->neff - 1; i++) {
    this->queue[i] = this->queue[i + 1];
  }
  this->neff -= 1;
  return val;
}

PQElmt PrioQueue::operator[](int k) {
  // Implementasikan di sini
  if ((k>=this->neff)||k<0){
    return {0,0};
  } else{
    return this->queue[k];
  }
}

PrioQueue operator+(const PrioQueue& a, const PrioQueue& b) {
  // Implementasikan di sini
  PrioQueue P(a.maxEl+b.maxEl);
  for (int i = 0; i<a.neff;i++){
    P.push(a.queue[i]);
  }
  for (int j = 0; j<b.neff; j++){
    P.push(b.queue[j]);
  }
  return P;
}
