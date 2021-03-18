// Nama: Prana Gusriana
// NIM: 13519195
// Tanggal: Kamis, 4 Maret 2021 09.49 - Jumat, 12 Maret 2021 07.00
// File: Vektor.hpp
// Latihan responsi minggu ke-7 (2), Soal 2

#ifndef _VECTOR_HPP_
#define _VECTOR_HPP_

#include <iostream>

using namespace std;

template <class T, int N>
class Vector {
private:
    T* elements;

public:
    Vector() {
        this->elements = new T[N];
    }

    Vector(const Vector& other) {
        this->elements = new T[N];
        for (int i = 0; i<N; i++){
            this->elements[i] = other.elements[i];
        }
    }

    ~Vector() {
        delete[] this->elements;
    }

    T& operator[](int idx) {
        return this->elements[idx];
    }

    Vector operator+(const Vector& other) {
        Vector<T, N> result;
        for (int i = 0; i<N; i++){
            result.elements[i] = this->elements[i] + other.elements[i];
        }
        return result;
    }

    Vector operator-(const Vector& other) {
        Vector<T, N> result;
        for (int i = 0; i<N; i++){
            result.elements[i] = this->elements[i] - other.elements[i];
        }
        return result;
    }

    bool operator<(const Vector& other) {
        for (int i = 0; i<N; i++){
            if (this->elements[i] != other.elements[i]){
                return this->elements[i] < other.elements[i];
            }
        }
        return false;
    }

    bool operator>(const Vector& other) {
        for (int i = 0; i<N; i++){
            if (this->elements[i] != other.elements[i]){
                return this->elements[i] > other.elements[i];
            }
        }
        return false;
    }

    friend std::ostream& operator<<(ostream& os, Vector vector) {
        os << "<";
        for(int i = 0; i<N; i++){
            os << vector.elements[i];
            if (i != N-1){
                os << ",";
            }
        }
        os << ">";
        return os;
    }

    friend std::istream& operator>>(istream& is, Vector& vector) {
        for(int i = 0; i<N; i++){
            is >> vector.elements[i];
        }
        return is;
    }
};

#endif

/*
Diberikan sebuah file deklarasi sekaligus definisi Vector2, yakni sebuah kelas yang merepresentasikan vektor, sama seperti vektor pada fisika atau matematika ( bedakan dengan STL vector C++, yang sebenarnya adalah array dinamis).

Tugas anda adalah mengubah kelas ini menjadi generic, yakni:

mampu menerima tipe data apa saja
mampu menerima panjang vector berapa saja
Contoh program utama:

int main() {
    Vector<int, 4> v1, v2;

    cout << "Masukkan vektor 4 elemen: ";
    cin >> v1;

    v2[0] = -1;
    v2[1] = -2;
    v2[2] = -3;
    v2[3] = -4;

    cout << v1 << " + " << v2 << " = " << v1 + v2 << endl;
    cout << v1 << " - " << v2 << " = " << v1 - v2 << endl;

    return 0;
}
*/