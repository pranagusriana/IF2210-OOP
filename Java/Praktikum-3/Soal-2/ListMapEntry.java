// Nama: Prana Gusriana
// NIM: 13519195
// Tanggal: Kamis, 25 Maret 2021
// File: ListMapEntry.java
// Praktikum-3, Soal 2

public class ListMapEntry extends MapEntry {
    private ListMapEntry next;

    public ListMapEntry(String key, String value) {
        super(key, value);
        this.next = null;
    } // next = null
    
    public ListMapEntry(String key, String value, ListMapEntry next) {
        super(key, value);
        this.next = next;
    }

    public ListMapEntry getNext() {
        return this.next;
    }
    public void setNext(ListMapEntry next) {
        this.next = next;
    }
}