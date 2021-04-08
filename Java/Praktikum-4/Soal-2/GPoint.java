// Nama: Prana Gusriana
// NIM: 13519195
// Tanggal: Kamis, 8 April 2021
// File: GPoint.java
// Praktikum-4, Soal 2

public class GPoint<T>{
    private T x;
    private T y;
    public GPoint(T newx, T newy){
        this.x = newx;
        this.y = newy;
    }
    public T GetAbsis(){
        return this.x;
    }
    public T GetOrdinat(){
        return this.y;
    }

    public void SetAbsis(T newx){
        this.x = newx;
    }

    public void SetOrdinat(T newy){
        this.y = newy;
    }

    public int IsEqual(GPoint P){
        if (this.x == P.GetAbsis() && this.y == P.GetOrdinat()){
            return 1;
        } else{
            return 0;
        }
    }
}

/*
Berikut adalah header file dari sebuah Point generik bernama GPoint yang ditulis dalam bahasa C++, yang belum diimplementasi kode methodnya.



Pertama-tama, anda harus mengimplementasi sebuah kelas Generik GPoint di atas menjadi kelas generik dalam bahasa JAVA.

Kemudian, anda harus membuat dua buah kelas JAVA yang akan memanfaatkan GPoint, yaitu StackOfGPoint1 dan StackOfGPoint2. Kedua kelas ini berfungsi sebagai stack. StackOfGPoint1 dan StackOfGPoint2 bukan kelas generik.

Elemen dari StackOfGPoint1 adalah GPoint<Integer>, sedangkan elemen StackOfGPoint2 adalah GPoint<Float>.

Berikut adalah "header" file  StackOfGPoint1.java dan StackOfGPoint2.java.



Tugas anda:

1. Implementasi kelas GPoint, StackOfGPoint1, dan StackOfGPoint2

2. Unggah file GPoint.zip yang berisi GPoint.java, StackOfGPoint1.java dan StackOfGPoint2.java
 */
