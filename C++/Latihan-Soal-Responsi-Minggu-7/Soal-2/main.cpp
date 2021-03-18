// Nama: Prana Gusriana
// NIM: 13519195
// Tanggal: Kamis, 4 Maret 2021
// File: main.cpp
// Latihan responsi minggu ke-7, Soal 2

#include "Vehicle.h"
#include "Bike.h"
#include "Car.h"

int main(){
    Car c1(4);
    Vehicle *v1 = new Car(10);
    Bike *b1 = new Bike();
    Vehicle *v2 = new Vehicle(*b1);
    delete b1;
    v1->drive();
    v2->clean();
    c1.drive();
    v2->park();
    delete v1;
    delete v2;
    return 0;
}
// g++ Vehicle.cpp Bike.cpp Car.cpp main.cpp -o main

/*
Berikut adalah implementasi dari kelas Vehicle, Car, dan Bike. Kelas-kelas tersebut merepresentasikan kendaraan yang mempunyai turunan mobil dan motor. Atribut dan method dari kelas-kelas tersebut dapat dilihat pada kode implementasi tersebut, di mana setiap method akan menghasilkan keluaran khusus jika dipanggil.

Berikut adalah header untuk kelas Vehicle, Car, dan Bike.

Contoh Main

int main() {
  Bike v;
  v.clean();
  v.park();
  return 0;
}
Contoh Output

ctor vehicle 2 2
ctor bike 2 2
someone is cleaning this bike 2 2
someone is parking this bike 2 2
dtor bike 2 2
dtor vehicle 2 2
Unggahlah file main.cpp yang berisi main program, untuk menghasilkan keluaran sebagai berikut:

ctor vehicle 4 4
ctor car 4 4
ctor vehicle 4 10
ctor car 4 10
ctor vehicle 2 2
ctor bike 2 2
cctor vehicle 2 2
dtor bike 2 2
dtor vehicle 2 2
someone is driving this vehicle 4 10
someone is cleaning this vehicle 2 2
someone is driving this car 4 4
someone is parking this vehicle 2 2
dtor car 4 10
dtor vehicle 4 10
dtor vehicle 2 2
dtor car 4 4
dtor vehicle 4 4
*/