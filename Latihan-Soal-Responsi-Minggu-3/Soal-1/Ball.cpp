// Nama: Prana Gusriana
// NIM: 13519195
// Tanggal: Kamis, 04 Februari 2021
// File: Ball.cpp
// Latihan Soal Responsi Minggu ke-3, Soal 1

/*
Diberikan header sebuah kelas Ball, yaitu bola yang memiliki jari-jari (radius).
Ball.hpp
Buatlah implementasi header tersebut dan kumpulkan sebagai Ball.cpp.
*/

#include "Ball.hpp"
using namespace std;

Ball::Ball(){
    this->radius = 1;
}

Ball::Ball(int r){
    this->radius = r;
}

Ball::Ball(const Ball& b){
    this->radius = b.radius;
}

Ball::~Ball() {}

void Ball::bounce(){
    cout << "bo";
    for (int i = 0; i< this->radius; i++){
        cout << "i";
    }
    cout << "ng" << endl;
}