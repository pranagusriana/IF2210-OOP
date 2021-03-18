// Nama: Prana Gusriana
// NIM: 13519195
// Tanggal: Kamis, 25 Februari 2021
// File: PremiumUser.cpp
// Praktikum 2: Inheritance dan Polymorphism, Soal 2

#include "User.h"
#include "PremiumUser.h"
#include <iostream>
#include <cstring>

using namespace std;

//ctor, active = true, parameter: nama pengguna
PremiumUser::PremiumUser(char* nm): User(nm){
    this->num_of_music_downloaded = 0;
    this->active = true;
}
        
// cctor
PremiumUser::PremiumUser(const PremiumUser& u): User(u.name){
    this->num_of_favourite_music = u.getNumOfFavouriteMusic();
    this->music_list = new char*[1000];
    for (int i = 0; i<this->num_of_favourite_music; i++){
        this->music_list[i] = new char[strlen(u.music_list[i])];
        strcpy(this->music_list[i], u.music_list[i]);
    }
    this->num_of_music_downloaded = u.num_of_music_downloaded;
    this->active = u.active;
} 

PremiumUser::~PremiumUser(){
}

// print kata-kata sbg. berikut: "Music Downloaded: <judul><endl>"
// Contoh: 
// Music Downloaded: Loyal - Chris Brown, Lil Wayne, Tyga
//
// Jika akun premium tidak aktif, print: "Activate premium account to download music<endl>"
void PremiumUser::downloadMusic(char* judul_musik){
    if(this->active){
        this->num_of_music_downloaded++;
        cout << "Music Downloaded: " << judul_musik << endl;
    } else{
        cout << "Activate premium account to download music" << endl;
    }
}

void PremiumUser::inactivatePremium(){
    this->active = false;
}

void PremiumUser::activatePremium(){
    this->active = true;
}
        
int PremiumUser::getNumOfMusicDownloaded() const{
    return this->num_of_music_downloaded;
}

// mengembalikan nilai active
bool PremiumUser::getPremiumStatus() const{
    return this->active;
}