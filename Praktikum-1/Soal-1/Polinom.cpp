// Nama: Prana Gusriana
// NIM: 13519195
// Tanggal: Kamis, 11 Februari 2021
// File: Polinom.cpp
// Praktikum-1 Soal-1

#include <iostream>
#include "Polinom.hpp"

/*
Kali ini Anda diminta untuk mengimplementasikan kelas Polinom yang memanfaatkan struktur data array yang ukurannya dialokasikan secara dinamis.

Anda hanya perlu mengumpulkan file Polinom.cpp nya saja.
*/

using namespace std;

// ctor, cctor, dtor, op=
// untuk konstruktor, inisialisasi seluruh nilai koefisien dengan 0.
Polinom::Polinom():Polinom(0){}    // ctor Polinom dengan orde = 0

Polinom::Polinom(int n){
    this->derajat = n;
    this->koef = new int[n];
} // ctor Polinom dengan orde = n (sesuai parameter)

Polinom::Polinom(const Polinom& P){
    this->derajat = P.derajat;
    this->koef = new int[this->derajat];
    for (int i = 0; i<=this->derajat; i++){
        this->koef[i] = P.koef[i];
    }
}

Polinom::~Polinom(){
    delete[] this->koef;
}

Polinom& Polinom::operator=(const Polinom& P){
    this->derajat = P.derajat;
    delete[] this->koef;
    this->koef = new int[this->derajat];
    for(int i = 0; i<=this->derajat; i++){
        this->koef[i] = P.koef[i];
    }
    return *this;
}

// getter, setter
int Polinom::getKoefAt(int idx) const{
    return this->koef[idx];
}
int Polinom::getDerajat() const{
    return this->derajat;
}
void Polinom::setKoefAt(int idx, int val){
    this->koef[idx] = val;
}
void Polinom::setDerajat(int n){
    this->derajat = n;
}

// member function
// Melakukan pembacaan koefisien sejumlah derajat Polinom, dimulai dari x^0 (konstanta)
void Polinom::input(){
    for(int i = 0; i<=this->derajat; i++){
        cin >> this->koef[i];
    }
}

// Mencetak seluruh koefisien polinom. Untuk setiap koefisien akhiri dengan end-of-line
// Cetaklah apa adanya dari koefisien ke-0 hingga derajat tertinggi (termasuk apabila koefisien = 0)
void Polinom::printKoef(){
    for(int i = 0; i<=this->derajat; i++){
        cout << this->koef[i] << endl;
    }
}

// Menghitung hasil substitusi x dengan sebuah bilangan ke dalam polinom
int Polinom::substitute(int x){
    int sum = 0;
    for(int i = 0; i<=this->derajat; i++){
        int tempx = 1;
        for(int j=0; j<i; j++){
            tempx = tempx * x;
        }
        sum = sum + this->koef[i] * tempx;
    }
    return sum;
}

// Mencetak polinom dengan format: A+Bx^1+Cx^2+Dx^3...dst (diakhiri dengan end-of-line)
// Apabila suatu koefisien bernilai < 0, gunakan tanda "-" untuk menggantikan tanda "+"
// Apabila suatu koefisien bernilai 0, lewati koefisien tersebut dan lanjutkan ke koefisien selanjutnya
// Jika seluruh koefisien bernilai 0, keluarkan "0"
void Polinom::print(){
    bool allnol = true;
    for(int i = 0; i<=this->derajat;i++){
        if(this->koef[i] != 0){
            if (i == 0 && this->koef[i]<0){
                cout << "-";
            }
            if (i != 0 && this->koef[i]<0){
                cout << "-";
            }
            if (i != 0 && this->koef[i]>0){
                cout << "+";
            }
            if (i != 0 && abs(this->koef[i])!=1){
                cout << abs(this->koef[i]);
            }
            if (i == 0){
                cout << abs(this->koef[i]);
            }
            if (i != 0){
                cout << "x^" << i;
            }
            allnol = false;
        }
    }
    if (allnol){
        cout << "0";
    }
    cout << endl;
}