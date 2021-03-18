// Nama: Prana Gusriana
// NIM: 13519195
// Tanggal: Kamis, 25 Februari 2021
// File: Hewan.h
// Praktikum 2: Inheritance dan Polymorphism, Soal 1

#include <iostream>

using namespace std;

class Hewan{
    public:
        Hewan(string nm){nama = nm;}
        ~Hewan(){cout << "Hewan mati "<< nama << endl;}
        virtual void print(){cout << "Hewan ini namanya " << nama << endl;}
    protected:
        string nama;
};

class Kucing: public Hewan{
    public:
        Kucing(string nm) : Hewan(nm){}
        virtual ~Kucing(){cout << "Kucing mati " << Hewan::nama << endl;}
        //void print(){cout << "Kucing ini namanya " << Hewan::nama << "{dari fungsi print}" << endl;}
};

class Anjing: public Hewan{
    public:
        Anjing(string nm) : Hewan(nm){}
        ~Anjing(){cout << "Anjing mati " << Hewan::nama << endl;}
        void print(){cout << "Anjing ini namanya " << Hewan::nama << endl;}
};

class KucingAnggora: public Kucing{
    public:
        KucingAnggora(string nm, string pm) : Kucing(nm){pemilik = pm;}
        virtual ~KucingAnggora(){cout << "Kucing anggora mati " << Kucing::Hewan::nama << endl;}
        void print(){cout << "Kucing anggora ini namanya " << Kucing::Hewan::nama << ". Pemiliknya adalah " << pemilik << endl;}
    protected:
        string pemilik;
};

class AnjingBulldog: public Anjing{
    public:
        AnjingBulldog(string nm, string pm) : Anjing(nm){pemilik = pm;}
        virtual ~AnjingBulldog(){cout << "Anjing bulldog mati " << Anjing::Hewan::nama << endl;}
        void print(){cout << "Anjing bulldog ini namanya " << Kucing::Hewan::nama << ". Pemiliknya adalah " << pemilik << endl;}
    protected:
        string pemilik;
};