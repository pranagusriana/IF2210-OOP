// Nama: Prana Gusriana
// NIM: 13519195
// Tanggal: Kamis, 25 Maret 2021
// File: ListMap.java
// Praktikum-3, Soal 2

public class ListMap implements Map{
    private ListMapEntry first;
    /**
     * Menambahkan (key, value) ke dalam map
     * Melakukan overwrite jika sudah terdapat elemen dengan key yang sama.
     */
    @Override
    public void set(String key, String value){
        if(this.first == null){
            this.first = new ListMapEntry(key, value);
        } else{
            ListMapEntry p = this.first;
            boolean stop = false;
            while(p.getNext() != null && !stop){
                if(key.equals(p.getKey())){
                    p.setValue(value);
                    stop = true;
                } else{
                    p = p.getNext();
                }
            }
            if(!stop){
                p.setNext(new ListMapEntry(key, value));
            }
        }
        
    }

    /**
     * Mengembalikan value yang tersimpan untuk key tertentu pada map
     * Mengembalikan NULL apabila map tidak mengandung key masukan.
     */
    @Override
    public String get(String key){
        ListMapEntry p = this.first;
        while(p != null){
            if(key.equals(p.getKey())){
                return p.getValue();
            } else{
                p = p.getNext();
            }
        }
        return null;
    }

    /**
     * Menghitung jumlah elemen yang ada pada map
     */
    @Override
    public int size(){
        int size = 0;
        ListMapEntry p = this.first;
        while(p != null){
            size += 1;
            p = p.getNext();
        }
        return size;
    }
}

/*
Struktur data Map (atau yang biasa disebut dictionary) adalah sebuah struktur data Collection yang menyimpan elemen-elemennya dalam tuple (key, value).

Salah satu contoh aplikasi dari struktur data map adalah untuk menyimpan Phonebook.

map["Anies"] = "940329502345"
map["Basuki"]  = "382901849102"
map["Jokowi"]  = "481904189208"
Selanjutnya apabila kita mengeksekusi map.get("Jokowi") akan mengembalikan "481904189208", tetapi map.get("AAA") akan mengembalikan NULL (karena tidak terdapat pada dictionary).

Diberikan interface Map dan kelas MapEntry sebagai berikut.
Pengujian pada autograder dilakukan hanya untuk method-method yang didefinisikan pada interface Map. Artinya, Anda bebas menambahkan fungsi antara yang mungkin dapat mempermudah pekerjaan kalian. Anda juga dibebaskan untuk menggunakan pendekatan iteratif maupun rekursif untuk pemrosesan list nya.
Kumpulkan [ListMapEntry.java, ListMap.java] yang disatukan menjadi satu file zip!

Note : gunakan Object.equals() untuk membandingkan dua buah object String
*/