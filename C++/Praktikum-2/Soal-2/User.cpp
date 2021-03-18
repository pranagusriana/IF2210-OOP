// Nama: Prana Gusriana
// NIM: 13519195
// Tanggal: Kamis, 25 Februari 2021
// File: User.cpp
// Praktikum 2: Inheritance dan Polymorphism, Soal 2


#include <iostream>
#include <cstring>
#include "User.h"

using namespace std;

int User::n_user = 0;

// ctor, parameter: nama pengguna
User::User(char* nm){
    this->name = new char[strlen(nm)];
    strcpy(this->name, nm);
    this->num_of_favourite_music = 0;
    this->music_list = new char*[1000]; // array of string (char*) dgn ukuran 1000
    n_user++;
}

// cctor
User::User(const User& u){
    this->name = new char[strlen(u.getName())];
    strcpy(this->name, u.getName());
    this->num_of_favourite_music = u.getNumOfFavouriteMusic();
    this->music_list = new char*[1000];
    for (int i = 0; i<this->num_of_favourite_music; i++){
        this->music_list[i] = new char[strlen(u.music_list[i])];
        strcpy(this->music_list[i], u.music_list[i]);
    }
    n_user++;
}

// dtor
// selain implementasi, print juga "User <nama user> deleted<endl>"
// Contoh:
// User A deleted
User::~User(){
    cout << "User " << this->name << " deleted" << endl;
    delete [] this->name;
    for(int i = 0; i < this->num_of_favourite_music;i++){
        delete [] this->music_list[i];
    }
    delete [] this->music_list;
}

// Asumsi: musik unik, parameter: judul musik
void User::addFavouriteMusic(char* judul_musik){
    this->music_list[this->num_of_favourite_music] = new char[strlen(judul_musik)];
    strcpy(this->music_list[this->num_of_favourite_music], judul_musik);
    this->num_of_favourite_music++;
}

void User::deleteFavouriteMusic(char* judul_musik){
    if(this->num_of_favourite_music > 0){
        if (this->num_of_favourite_music == 1){
            if(strcmp(this->music_list[0], judul_musik)==0){
                this->num_of_favourite_music--;
            }
        } else{
            for(int i = 0; i<this->num_of_favourite_music;i++){
                if(strcmp(this->music_list[i], judul_musik) == 0){
                    this->num_of_favourite_music--;
                    int p = i;
                    while (p<this->num_of_favourite_music){
                        strcpy(this->music_list[p], this->music_list[p+1]);
                        p++;
                    }
                    break;
                }
            }
        }
    }
}

void User::setName(char* nm){
    strcpy(this->name, nm);
}

char* User::getName() const{
    return this->name;
}

int User::getNumOfFavouriteMusic() const{
    return this->num_of_favourite_music;
}

// format print:
// <No>. <Judul musik><endl>
// contoh:
// 1. Starship - Nicki Minaj
// 2. To Be Human - Sia, Labrinth
//
 // jika tidak ada musik, print: "No music in your favourite list<endl>"
void User::viewMusicList() const{
    if(this->num_of_favourite_music>0){
        for(int i = 0; i < this->num_of_favourite_music; i++){
            cout << i+1 << ". " << this->music_list[i] << endl;
        }
    } else{
        cout << "No music in your favourite list" << endl;
    }
}

int User::getNumOfUser(){
    return User::n_user;
}

/*
Hari ini adalah hari Valentine. Banyak muda mudi pergi bersama untuk menikmati kebersamaan. Namun berbeda dengan Dilon. Dengan perginya Milia sejak 1990, ia merasa sendiri di Hari Valentine ini. Akhirnya Dilon memutuskan untuk masuk ke kamarnya dan mendengarkan Spottypie.

Ilustrasi logo Spottypie

Spottypie adalah aplikasi yang dapat digunakan untuk memainkan musik secara online. Pengguna aplikasi Spottypie terdiri dari tiga jenis, yaitu pengguna biasa, pengguna premium, dan artis/musisi. Pengguna biasa hanya dapat mendengarkan musik dan menyimpannya dalam daftar musik favorit. Pengguna premium dapat mengunduh musik sehingga dapat dijalankan secara offline. Pengguna artis dapat mengunggah musik.

Karena Dilon sangat tertarik dengan Spottypie, Dilon ingin membuat aplikasi tandingan dari Spottypie. Sebagai mahasiswa yang mengambil mata kuliah IF2210 Pemrograman berorientasi objek, Dilon meminta anda untuk membuat tandingan dari Spottypie.
 
Anda diminta oleh Dilon untuk membuat "aplikasi" kecil sejenis Spottypie. Yang perlu anda buat adalah implementasi kelas dalam .cpp saja. Header dari masing-masing kelas dapat diunduh melalui tautan berikut ini.
- User.h
- PremiumUser.h
- ArtistUser.h

Catatan:
Gunakan library <cstring> untuk menggunakan fungsi-fungsi pengolah string:
strcmp(str1, str2) untuk membandingkan str1 dan str2, jika hasil 0 berarti kedua string sama.
strcpy(str1, str2) untuk menyalin str2 ke str1
strlen(str) untuk memeriksa panjang sebuah string

Upload sebuah zip berisi file-file User.cpp, PremiumUser.cpp, dan ArtistUser.cpp.
*/