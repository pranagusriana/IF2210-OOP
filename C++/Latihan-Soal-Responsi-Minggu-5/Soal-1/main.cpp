// Nama: Prana Gusriana
// NIM: 13519195
// Tanggal: Kamis, 18 Februari 2021
// File: main.cpp
// Latihan Soal Responsi Minggu ke-5, Soal 1

#include "Vehicle.h"
#include "Car.h"
#include "Bike.h"
#include <iostream>

using namespace std;

/*
Berikut adalah implementasi dari kelas Vehicle, Car, dan Bike. Kelas-kelas tersebut merepresentasikan kendaraan yang mempunyai turunan mobil dan motor. Atribut dan method dari kelas-kelas tersebut dapat dilihat pada kode implementasi tersebut, di mana setiap method akan menghasilkan keluaran khusus jika dipanggil.

Vehicle.zip

Sebagai contoh program berikut:

int main() {
    Vehicle v(4,4);
    v.show();
    return 0;
}
akan menghasilkan keluaran sebagai berikut:
ctor vehicle 4 4
wheels 4 capacity 4
dtor vehicle 4 4

Unggahlah file main.cpp yang berisi main program, untuk menghasilkan keluaran sebagai berikut:
ctor vehicle 3 2
cctor vehicle 3 2
ctor vehicle 6 50
ctor vehicle 4 8
ctor car 4 8
cctor vehicle 4 8
cctor car 4 8
ctor vehicle 4 6
ctor car 4 6
ctor vehicle 2 2
ctor bike 2 2
someone is driving this car 4 6
wheels 2 capacity 2
someone is riding this bike2 2
dtor bike 2 2
dtor vehicle 2 2
dtor car 4 6
dtor vehicle 4 6
dtor car 4 8
dtor vehicle 4 8
dtor car 4 8
dtor vehicle 4 8
dtor vehicle 6 50
dtor vehicle 3 2
dtor vehicle 3 2
*/

// g++ -o main main.cpp vehicle.cpp car.cpp bike.cpp
int main(){
    Vehicle *v1 = new Vehicle(3, 2);
    Vehicle *v2 = new Vehicle(*v1);
    Vehicle *v3 = new Vehicle(6, 50);
    Car *c1 = new Car(8);
    Car *c2 = new Car(*c1);
    Car *c3 = new Car(6);
    Bike *b1 = new Bike();
    c3->drive();
    b1->show();
    b1->ride();
    delete b1;
    delete c3;
    delete c2;
    delete c1;
    delete v3;
    delete v2;
    delete v1;
    return 0;
}