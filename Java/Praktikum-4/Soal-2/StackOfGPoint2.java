// Nama: Prana Gusriana
// NIM: 13519195
// Tanggal: Kamis, 8 April 2021
// File: StackOfGPoint2.java
// Praktikum-4, Soal 2

import java.util.ArrayList;

public class StackOfGPoint2 {
    private final int defaultStackSize = 10; //ukuran default stack
    private int size; //ukuran stack
    private int topStack; //indeks top (data teratas) dari stack
    private ArrayList<GPoint<Float>> data; //penyimpanan elemen stack
    private static int nStack = 0; //jumlah stack yang pernah dibuat

    public StackOfGPoint2() //Inisiasi stack berukuran default
    {
        this.size = this.defaultStackSize;
        this.topStack = -1;
        this.data = new ArrayList<>();
        nStack += 1;
    }
    public StackOfGPoint2(int size) //Inisiasi stack berukuran size
    {
        this.size = size;
        this.topStack = -1;
        this.data = new ArrayList<>();
        nStack += 1;
    }
    public void Push(GPoint<Float> p) //Menambahkan elemen baru ke stack
    {
        this.data.add(p);
        this.topStack += 1;
    }
    public GPoint<Float> Pop() //Mengeluarkan elemen top stack
    {
        GPoint<Float> top = this.data.get(this.topStack);
        this.data.remove(this.topStack);
        topStack -= 1;
        return top;
    }
    public int IsEmpty() //Memeriksa apakah stack kosong
    {
        if(this.topStack == -1){
            return 1;
        } else{
            return 0;
        }
    }
    public int IsFull() //Memeriksa apakah stack penuh
    {
        if(this.topStack == this.size-1){
            return 1;
        } else{
            return 0;
        }
    }
    public static int NumStackObj() //Mengembalikan jumlah stack yang pernah dibuat
    {
        return nStack;
    }
}