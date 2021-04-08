// Nama: Prana Gusriana
// NIM: 13519195
// Tanggal: Kamis, 8 April 2021
// File: StackOfGPoint1.java
// Praktikum-4, Soal 2

import java.util.ArrayList;

public class StackOfGPoint1 {
    private final int defaultStackSize = 10; //ukuran default stack
    private int size; //ukuran stack
    private int topStack; //indeks top (data teratas) dari stack
    private ArrayList<GPoint<Integer>> data; //penyimpanan elemen stack
    private static int nStack = 0; //jumlah stack yang pernah dibuat

    public StackOfGPoint1() //Inisiasi stack berukuran default
    {
        this.size = this.defaultStackSize;
        this.topStack = -1;
        this.data = new ArrayList<>();
        nStack += 1;
    }
    public StackOfGPoint1(int size) //Inisiasi stack berukuran size
    {
        this.size = size;
        this.topStack = -1;
        this.data = new ArrayList<>();
        nStack += 1;
    }
    public void Push(GPoint<Integer> p) //Menambahkan elemen baru ke stack
    {
        this.data.add(p);
        this.topStack += 1;
    }
    public GPoint<Integer> Pop() //Mengeluarkan elemen top stack
    {
        GPoint<Integer> top = this.data.get(this.topStack);
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