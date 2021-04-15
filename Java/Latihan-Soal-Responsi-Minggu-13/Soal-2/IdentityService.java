// Nama: Prana Gusriana
// NIM: 13519195
// Tanggal: Kamis, 15 April 2021
// File: IdentityService.java
// Latihan soal responsi minggu ke 13, Soal 2

import java.util.*;

public class IdentityService extends AbstractService {
    private final ArrayList<String> identityList = new ArrayList<String>(); // Memiliki satu private attribute bernama identityList yang merupakan daftar dari identitas yang sudah terdaftar. Attribute ini bertipe ArrayList<String>. (private final ArrayList<String> identityList = new ArrayList<String>();)
    
    public IdentityService(String nama){ // Konstructor memiliki satu parameter yaitu String yang merupakan nama dari service ini. Lakukan pemanggilan konstruktor parent.
        super(nama);
    }

    public ArrayList<String> getIdentity(){ // Memiliki getter getIdentity()
        return this.identityList;
    }

    // Memiliki setter dalam bentuk addIdentity(String) dan removeIdentity(String). Buatlah validasi dimana setter ini bisa merubah identityList HANYA jika state dari IdentityService sudah RUNNING.
    public void addIdentity(String s){
        if(this.getServiceState() == STATE.RUNNING){
            this.identityList.add(s);
        }
    }

    public void removeIdentity(String s){
        if(this.getServiceState() == STATE.RUNNING){
            this.identityList.remove(s);
        }
    }

    // Implementasi init(), mengubah state IdentityService menjadi INIT.
    @Override
    public void init(){
        this.setServiceState(STATE.INIT);
    }

    // Implementasi start(), mengubah state IdentityService menjadi RUNNING.
    public void start(){
        this.setServiceState(STATE.RUNNING);
    }

    //Implementasi stop(), mengubah state IdentityService menjadi DIE.
    public void stop(){
        this.setServiceState(STATE.DIE);
    }

    // Memiliki sebuah method isIdentityExist(String) yang mengembalikan Boolean true jika parameter input terdapat pada identityList, dan false sebaliknya. Buatlah validasi dimana bila method ini dipanggil ketika state IdentityService BUKAN RUNNING maka akan menghasilkan keluaran berupa null.
    public Boolean isIdentityExist(String input){
        if(this.getServiceState() != STATE.RUNNING){
            return null;
        } else{
            for(String identity: this.identityList){
                if(identity.equals(input)){
                    return true;
                }
            }
            return false;
        }
    }
}

/*
IdentityService merupakan sebuah service yang berfungsi untuk mengecek suatu identitas sudah terdaftar atau belum. Berikut merupakan spesifikasi dari IdentityService:

- Konstructor memiliki satu parameter yaitu String yang merupakan nama dari service ini. Lakukan pemanggilan konstruktor parent.
- Memiliki satu private attribute bernama identityList yang merupakan daftar dari identitas yang sudah terdaftar. Attribute ini bertipe ArrayList<String>. (private final ArrayList<String> identityList = new ArrayList<String>();)
- Memiliki getter getIdentity()
- Memiliki setter dalam bentuk addIdentity(String) dan removeIdentity(String). Buatlah validasi dimana setter ini bisa merubah identityList HANYA jika state dari IdentityService sudah RUNNING.
- Implementasi init(), mengubah state IdentityService menjadi INIT.
- Implementasi start(), mengubah state IdentityService menjadi RUNNING.
- Implementasi stop(), mengubah state IdentityService menjadi DIE.
- Memiliki sebuah method isIdentityExist(String) yang mengembalikan Boolean true jika parameter input terdapat pada identityList, dan false sebaliknya. Buatlah validasi dimana bila method ini dipanggil ketika state IdentityService BUKAN RUNNING maka akan menghasilkan keluaran berupa null.
*/