#include "Hewan.h"


int main() {
	Hewan *array_hewan[3];
	Hewan a("a");
	Kucing b("b");
	Anjing c("c");
	array_hewan[0] = &a;
	array_hewan[1] = &b;
	array_hewan[2] = &c;
	
	for(int i=0;i<3;i++) {
		array_hewan[i]->print(); //Keluaran = "[Makhluk] ini namanya [nama]\n"
	}
	array_hewan[1] = &c;
	array_hewan[1]->print();
	Kucing *d = new KucingAnggora("d","1");
	Anjing *e = new AnjingBulldog("e","2");;
	d->print();
	e->print();
	KucingAnggora f("f","3");
	AnjingBulldog g("g","4");
	f.print();
	g.print();
	delete e;
	delete d;
	return 0;
}

/*
Terdapat sebuah base class bernama Hewan. Base class tersebut memiliki dua derived class yaitu Kucing dan Anjing. Selain itu terdapat juga derived class dari class Kucing yaitu KucingAnggora, dan terdapat juga derived class dari class Anjing yaitu AnjingBulldog. Setiap class hanya memiliki satu constructor dengan parameter dan satu destructor.

Untuk class Hewan: 

Memiliki satu attribute bertipe string yang bersifat protected yaitu nama.
Memiliki constructor dengan satu parameter yaitu string yang merupakan nama dari hewan. Parameter constructor tidak menggunakan reference. Constructor tidak menghasilkan keluaran apapun.
Memiliki dtor yang akan memberikan keluaran tentang kematian objek seperti pada contoh kasus dibawah.
Untuk class Anjing dan Kucing:

Memiliki constructor dengan satu parameter yaitu string yang merupakan nama dari hewan. Parameter constructor tidak menggunakan reference. Constructor tidak menghasilkan keluaran apapun.
Memiliki dtor yang akan memberikan keluaran tentang kematian objek  seperti pada contoh kasus dibawah.
Untuk class KucingAnggora dan AnjingBulldog:

Memiliki satu attribute bertipe string yang bersifat protected yaitu pemilik.
Memiliki constructor dengan dua parameter yaitu string yang merupakan nama dari hewan dan string yang merupakan nama dari pemilik hewan. Parameter constructor tidak menggunakan reference. Constructor tidak menghasilkan keluaran apapun.
Memiliki dtor yang akan memberikan keluaran tentang kematian objek seperti pada contoh kasus dibawah.
Perlu diperhatikan objek apapun yang dihasilkan dari base class Hewan dan derived classnya dipastikan dapat memanggil fungsi void print() yang akan menuliskan keluaran sesuai dengan studi kasus dibawah. Kompetensi yang diuji pada soal ini ialah pemahaman mahasiswa terhadap materi Polymorphism. Melalui soal ini diharapkan mahasiswa dapat memahami penggunaan fungsi virtual serta dynamic binding.

Silahkan membuat definisi dan implementasi dari class Hewan, Kucing, Anjing, KucingAnggora, dan AnjingBulldog sehingga main program berikut


int main() {
	Hewan *array_hewan[3];
	Hewan a("a");
	Kucing b("b");
	Anjing c("c");
	array_hewan[0] = &a;
	array_hewan[1] = &b;
	array_hewan[2] = &c;
	
	for(int i=0;i<3;i++) {
		array_hewan[i]->print(); //Keluaran = "[Makhluk] ini namanya [nama]\n"
	}
	array_hewan[1] = &c;
	array_hewan[1]->print();
	Kucing *d = new KucingAnggora("d","1");
	Anjing *e = new AnjingBulldog("e","2");;
	d->print();
	e->print();
	KucingAnggora f("f","3");
	AnjingBulldog g("g","4");
	f.print();
	g.print();
	delete e;
	delete d;
	return 0;
}
Dapat menghasilkan keluaran seperti dibawah, abaikan tulisan dalam {}, tulisan tersebut merupakan hint.

Hewan ini namanya a{dari fungsi print}
Hewan ini namanya b{dari fungsi print}
Anjing ini namanya c{dari fungsi print}
Anjing ini namanya c{dari fungsi print}
Kucing anggora ini namanya d. Pemiliknya adalah 1{dari fungsi print}
Anjing bulldog ini namanya e. Pemiliknya adalah 2{dari fungsi print}
Kucing anggora ini namanya f. Pemiliknya adalah 3{dari fungsi print}
Anjing bulldog ini namanya g. Pemiliknya adalah 4{dari fungsi print}
Anjing mati e{dari destructor}
Hewan mati e{dari destructor}
Kucing anggora mati d{dari destructor}
Kucing mati d{dari destructor}
Hewan mati d{dari destructor}
Anjing bulldog mati g{dari destructor}
Anjing mati g{dari destructor}
Hewan mati g{dari destructor}
Kucing anggora mati f{dari destructor}
Kucing mati f{dari destructor}
Hewan mati f{dari destructor}
Anjing mati c{dari destructor}
Hewan mati c{dari destructor}
Kucing mati b{dari destructor}
Hewan mati b{dari destructor}
Hewan mati a{dari destructor}
Kumpulkan Hewan.h yang merupakan deklarasi sekaligus definisi dari semua class (Hewan, Kucing, Anjing, KucingAnggora, AnjingBulldog) dalam satu file. Berikut merupakan contoh satu file contoh.h yang berisi multiclass.


*/