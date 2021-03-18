// Nama: Prana Gusriana
// NIM: 13519195
// Tanggal: Kamis, 18 Maret 2021
// File: Main.java
// Latihan responsi minggu ke-9, Soal 1


public class Main {
    public static void main(String[] args){
        System.out.println("-----1-----");
        A.stat();
        B.stat();
        C.stat();
        D.stat();
        E.stat();
        System.out.println("-----------\n");

        System.out.println("-----2-----");
        E e1 = new E();
        C c1 = new C(10, 5);
        D d1 = new D(3, 3);
        A.stat();
        B.stat();
        C.stat();
        D.stat();
        E.stat();
        System.out.println("-----------\n");

        System.out.println("-----3-----");
        E e2 = new E(1, 2);
        C c2 = new C(1, 1);
        D d2 = new D(1, 1);
        A a1 = new A(1, 2);
        B b1 = new B(1, 1);
        b1.show();
        d2.show();
        e2.show();
        c2.show();
        a1.show();
        System.out.println("-----------\n");

        System.out.println("-----4-----");
        C c3 = new C(14, 4);
        C c4 = new C(15, 8);
        A a2 = new A(11, 3);
        B b2 = new B(12, 5);
        A a3 = new A(10, 1);
        D d3 = new D(16, 6);
        D d4 = new D(17, 7);
        E e3 = new E(18, 9);
        B b3 = new B(13, 2);
        E e4 = new E(19, 0);

        d3.calc();
        d4.calc();
        a2.calc();
        b2.calc();
        e4.calc();
        b3.calc();
        c3.calc();
        c4.calc();
        e3.calc();
        a3.calc();
        System.out.println("-----------\n");

        A.stat();
        B.stat();
        C.stat();
        D.stat();
        E.stat();
    }
}

/*
Berikut adalah imlementasi kelas A, B, C, D, dan E.

Anda diminta membuat sebuah kelas Main.java yang mengandung program main yang menghasilkan keluaran sebagai berikut.
-----1-----
Number of A objects: 0
Number of B objects: 0
Number of C objects: 0
Number of D objects: 0
Number of E objects: 0
-----------

-----2-----
ctor1 A
ctor1 B
ctor1 E
ctor2 A >> x = 10, y = 5
ctor2 C >> x = 10, y = 5
ctor2 A >> x = 3, y = 3
ctor2 D >> x = 3, y = 3
Number of A objects: 3
Number of B objects: 1
Number of C objects: 1
Number of D objects: 1
Number of E objects: 1
-----------

-----3-----
ctor2 A >> x = 1, y = 2
ctor2 B >> x = 1, y = 2
ctor2 E >> x = 1, y = 2
ctor2 A >> x = 1, y = 1
ctor2 C >> x = 1, y = 1
ctor2 A >> x = 1, y = 1
ctor2 D >> x = 1, y = 1
ctor2 A >> x = 1, y = 2
ctor2 A >> x = 1, y = 1
ctor2 B >> x = 1, y = 1
show B >> x = 1, y = 1
show A >> x = 1, y = 1
show B >> x = 1, y = 2
show C >> x = 1, y = 1
show A >> x = 1, y = 2
-----------

-----4-----
ctor2 A >> x = 14, y = 4
ctor2 C >> x = 14, y = 4
ctor2 A >> x = 15, y = 8
ctor2 C >> x = 15, y = 8
ctor2 A >> x = 11, y = 3
ctor2 A >> x = 12, y = 5
ctor2 B >> x = 12, y = 5
ctor2 A >> x = 10, y = 1
ctor2 A >> x = 16, y = 6
ctor2 D >> x = 16, y = 6
ctor2 A >> x = 17, y = 7
ctor2 D >> x = 17, y = 7
ctor2 A >> x = 18, y = 9
ctor2 B >> x = 18, y = 9
ctor2 E >> x = 18, y = 9
ctor2 A >> x = 13, y = 2
ctor2 B >> x = 13, y = 2
ctor2 A >> x = 19, y = 0
ctor2 B >> x = 19, y = 0
ctor2 E >> x = 19, y = 0
calc D >> result = 96
calc D >> result = 119
calc A >> result = 11
calc B >> result = 17
calc E >> result = 190
calc B >> result = 15
calc C >> result = 10
calc C >> result = 7
calc E >> result = 189
calc A >> result = 10
-----------

Number of A objects: 18
Number of B objects: 7
Number of C objects: 4
Number of D objects: 4
Number of E objects: 4
*/
