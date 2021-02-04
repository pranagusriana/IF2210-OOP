// Nama: Prana Gusriana
// NIM: 13519195
// Tanggal: Kamis, 04 Februari 2021
// File: Bottle.cpp
// Latihan Soal Responsi Minggu ke-3, Soal 2

/*
Diberikan kelas Bottle yang merupakan botol dengan radius alas botol (radius) dan tinggi botol (height). Kelas Bottle menyimpan berapa banyak botol yang telah diciptakan (numOfBottle). Botol yang diciptakan sedang menampung cairan setinggi waterHeight dan menyimpan nomor urutan diciptakannya botol ini (id).
Keterangan: Nilai id didapat dari jumlah botol yang telah diciptakan (numOfBottle + 1)
Bottle.hpp
Buatlah definisi dari Bottle.cpp
*/

/*
private:
  float height;           // tinggi Bottle
  float radius;           // radius alas Bottle
  float waterHeight;      // tinggi isi Bottle
  const int id;           // nomor urutan Bottle
  static int numOfBottle; // banyaknya Bottle yang telah diciptakan
*/

#include "Bottle.hpp"
#include <iostream>

using namespace std;

int Bottle::numOfBottle = 0;
/* Ctor default Bottle kosong dengan tinggi = 10.00 dan radius = 10.00 */
Bottle::Bottle(): id(numOfBottle + 1) {
    this->height = float(10);
    this->radius = float(10);
    this->waterHeight = float(0);
    numOfBottle += 1;
}

/* Ctor Bottle jika diketahui nilai tinggi dan radius, Bottle kosong*/
Bottle::Bottle(float height, float radius): id(numOfBottle+1) {
    this->height = height;
    this->radius = radius;
    this->waterHeight = float(0);
    numOfBottle += 1;
}

/* Cctor Bottle. id juga dicopy dan numOfBottle tidak bertambah */
Bottle::Bottle(const Bottle& bottle): id(bottle.id) {
    this->height = bottle.height;
    this->radius = bottle.radius;
    this->waterHeight = bottle.waterHeight;
}

/* Destruktor Bottle */
Bottle::~Bottle(){}

/* Mengembalikan id Bottle */
int Bottle::getId() const{
    return this->id;
}

/* Mengembalikan volume air dalam botol */
float Bottle::getWaterVolume() const{
    return PI * this->radius * this->radius * this->waterHeight;
}

/* Mengembalikan volume botol */
float Bottle::getBottleVolume() const{
    return PI * this->radius * this->radius * this->height;
}

/*
   * Mengubah tinggi Bottle. Jika tinggi baru kurang dari tinggi air,
   * maka tinggi air = tinggi yang baru.
*/
void Bottle::setHeight(float height){
    this->height = height;
    if (this->height < this->waterHeight){
        this->waterHeight = this->height;
    }
}

/*
   * Menambahkan air ke dalam botol. Jika botol tidak muat, biarkan
   * botol penuh.
*/
void Bottle::addWater(float waterVolume){
    float heightAddition = waterVolume/(this->radius * this->radius * PI);
    if (this->waterHeight + heightAddition > this->height){
        this->waterHeight = this->height;
    } else{
        this->waterHeight += heightAddition;
    }
}

/*
   * Mengurangi air dari botol. Jika air yang tersedia kurang, biarkan
   * botol kosong.
*/
void Bottle::substractWater(float waterVolume){
    float heightSubs = waterVolume/(this->radius * this->radius * PI);
    if (this->waterHeight - heightSubs < 0){
        this->waterHeight = float(0);
    } else{
        this->waterHeight -= heightSubs;
    }
}

/*
   * Mengembalikan tinggi air dari botol jika diketahui suatu volume air.
   * Tinggi botol diabaikan, dianggap tidak akan terlalu penuh.
*/
float Bottle::getWaterHeightIfVolume(float waterVolume) const{
    return waterVolume/(this->radius * this->radius * PI);
}

/*
   * Menuang isi botol ini ke botol lain sampai botol ini kosong.
   * Jika botol lain penuh sebelum semua air pindah, maka penuangan
   * berhenti dan terdapat sisa air di botol ini.
*/
void Bottle::pourWaterTo(Bottle& other){
    float minVolume = other.getBottleVolume() - other.getWaterVolume();
    float minHeight = getWaterHeightIfVolume(minVolume);
    if (this->waterHeight - minHeight > 0){
        this->waterHeight -= minHeight;
        other.waterHeight = other.height;
    } else{
        other.addWater(PI * this->radius * this->radius * this->waterHeight);
        this->waterHeight = float(0);
    }
}