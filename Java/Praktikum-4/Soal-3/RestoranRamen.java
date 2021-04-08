// Nama: Prana Gusriana
// NIM: 13519195
// Tanggal: Kamis, 8 April 2021
// File: RestoranRamen.java
// Praktikum-4, Soal 3

import java.util.*;

public class RestoranRamen{
  private   Map<Integer, Integer> daftarMeja;

  //constructor: membuat restoran dengan daftar meja kosong
  public RestoranRamen(){
    this.daftarMeja = new HashMap<>();
  }

  //menambahkan jumlah order yang dipesan oleh meja n, dengan harga p
  //jika meja sudah diisi maka akan menambah total yang telah dipesan
  public void tambahOrder(int n, int p){
    if(this.daftarMeja.containsKey(n)){
      this.daftarMeja.put(n, this.daftarMeja.get(n)+p);
    } else{
      this.daftarMeja.put(n, p);
    }
  }

  //mengembalikan total harga pesanan pada meja n
  //menghapus entri untuk meja tersebut
  public int tutupOrder(int n){
    return this.daftarMeja.remove(n);
  }

  //mengembalikan total harga pesanan pada meja n
  public int cekTotal(int n){
    return this.daftarMeja.get(n);
  }

  //mengembalikan jumlah meja yang terisi saat itu
  //restoran mungkin kosong
  public int totalMeja(){
    return this.daftarMeja.size();
  }

  //menjetak semua meja yang terisi pada restoran diakhiri dengan new line
  //contoh:
  /*
      Meja 1 = 5000
      Meja 2 = 3000
      Meja 3 = 10000
  */
  //jika restoran kosong akan mencetak "Restoran kosong" diakhiri new line
  public void cetakMeja(){
    if(this.totalMeja() == 0){
      System.out.println("Restoran kosong");
    } else{
      for (Map.Entry<Integer, Integer> me : this.daftarMeja.entrySet()) {
        System.out.println("Meja " + me.getKey() + " = " + me.getValue());
      }
    }
  }
}

/*
Kariya Ramen adalah sebuah restoran ramen milik Kariya-san. Seorang engineer dari restoran lain yang baru saja pensiun menyarankan Kariya-san untuk menghubungi anda untuk menyelesaikan masalahnya.

Terdapat banyak sekali meja di restoran Kariya Ramen sehingga Kariya-san kesulitan untuk mencatat berapa total yang dihabiskan oleh sebuah meja. Kariya-san meminta anda untuk membuat program yang dapat membantu untuk mengatasi persoalan pada restoran tersebut.

Implementasikan kelas RestoranRamen.java dengan menggunakan Java API map

Berikut merupakan penjelasan dari Java API map

Map merupakan sebuah interface yang mewakili pemetaan nilai key dan value. Jika didapatkan nilai key maka dapat diambil nilai value. Map bukanlah subtipe dari interface Collections. Key pada mapbersifat unik.

Pada interface Map terdapat sebuah pasangan nilai key dan value yang bernama Entry. Untuk mendapatkan key dan value dari sebuah Entry dapat menggunakan getKey() dan getValue(). Salah satu kelas yang mengimplementasikan interface Map adalah HashMap.

import java.util.*;
...
// Membuat sebuah map kosong
Map<String,Integer> mp = new HashMap<String,Integer>();
hm.put("A", new Integer(2));
for (Map.Entry<String, Integer> me : mp.entrySet()) {
   System.out.print(me.getKey() + ":"); //mencetak key
   System.out.println(me.getValue()); //mencetak value
}


Berikut merupakan beberapa method dasar pada map

import java.util.*;

// Membuat sebuah map kosong dengan key bertipe int dan value bertipe int
Map<Integer,Integer> test_map = new HashMap<Integer,Integer>();

test_map.put(1,5); // Memasukkan pasangan nilai key 1 dan value 5
test_map.put(2,6); // Memasukkan pasangan nilai key 2 dan value 6

System.out.println(test_map.get(1)); // Mengambil value dengan key 1 (nilai key 1 = 5)
test_map.put(2,3); // Mengubah nilai dengan key 2 menjadi 3 (karena key unik dan 2 sudah ada di key, maka value akan diubah)
test_map.remove(2); // Menghapus entry map dengan key 2

System.out.println(test_map.size()) // Mengembalikan jumlah entry pada map (jumlah entry tersisa = 1)
Set<Integer> keys = new HashSet<>();
keys = test_map.keySet(); //mengembalikan sebuah set berisi seluruh key pada map
System.out.println(test_map.containsKey(1)); //memeriksa apakah 1 sudah ada dalam himpunan key



Kumpulkan RestoranRamen.java
*/