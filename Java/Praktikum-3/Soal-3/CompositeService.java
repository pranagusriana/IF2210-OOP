// Nama: Prana Gusriana
// NIM: 13519195
// Tanggal: Kamis, 25 Maret 2021
// File: CompositeService.java
// Praktikum-3, Soal 3

import java.util.*;

public class CompositeService extends AbstractService {
    private ArrayList<AbstractService> serviceList = new ArrayList<AbstractService>(); // Memiliki satu private attribute bernama serviceList yang merupakan daftar service yang terdaftar. Attribute ini bertipe ArrayList<AbstractService>. (private ArrayList<AbstractService> serviceList = new ArrayList<AbstractService>();)

    public CompositeService(String nama){ // Konstructor memiliki satu parameter yaitu String yang merupakan nama dari service ini. Lakukan pemanggilan konstruktor parent.
        super(nama);
    }

    public ArrayList<AbstractService> getServices(){ // Memiliki getter getServices()
        return this.serviceList;
    }

    // Memiliki setter dalam bentuk addService(AbstractService) dan removeService(AbstractService). Buatlah validasi dimana setter ini bisa merubah serviceList HANYA jika state dari CompositeService BUKAN DIE.
    public void addService(AbstractService s){
        if(this.getServiceState() != STATE.DIE){
            this.serviceList.add(s);
        }
    }

    public void removeService(AbstractService s){
        if(this.getServiceState() != STATE.DIE){
            this.serviceList.remove(s);
        }
    }

    // Implementasi init(), memanggil fungsi init() pada setiap service yang ada pada serviceList dan mengubah state CompositeService menjadi INIT.
    @Override
    public void init(){
        for(int i = 0; i < this.serviceList.size(); i++){
            this.serviceList.get(i).init();
        }
        this.setServiceState(STATE.INIT);
    }

    // Implementasi start(), memanggil fungsi start() pada setiap service yang ada pada serviceList dan mengubah state CompositeService menjadi RUNNING. 
    public void start(){
        for(int i = 0; i < this.serviceList.size(); i++){
            this.serviceList.get(i).start();
        }
        this.setServiceState(STATE.RUNNING);
    }

    // Implementasi stop(), memanggil fungsi stop() pada setiap service yang ada pada serviceList dan mengubah state dari CompositeService menjadi DIE. Pada method ini anda diminta untuk mencatat jumlah service yang sedang dalam kondisi RUNNING dan menuliskannya melalui stdout "RUNNING service total : x" diakhiri newline, dimana x merupakan jumlah RUNNING service pada serviceList.
    public void stop(){
        this.setServiceState(STATE.DIE);
        int p = 0;
        for(int i = 0; i < this.serviceList.size(); i++){
            if(this.serviceList.get(i).getServiceState() == STATE.RUNNING){
                p++;
            }
            this.serviceList.get(i).stop();
        }
        System.out.println("RUNNING service total : " + p);
    }
}

/*
CompositeService merupakan kelas yang berisi kumpulan AbstractService lain. Kelas ini berfungsi untuk membungkus semua service agar dapat dikendalikan secara bersamaan. Berikut merupakan spesifikasi dari CompositeService:
- Konstructor memiliki satu parameter yaitu String yang merupakan nama dari service ini. Lakukan pemanggilan konstruktor parent.
- Memiliki satu private attribute bernama serviceList yang merupakan daftar service yang terdaftar. Attribute ini bertipe ArrayList<AbstractService>. (private ArrayList<AbstractService> serviceList = new ArrayList<AbstractService>();)
- Memiliki getter getServices()
- Memiliki setter dalam bentuk addService(AbstractService) dan removeService(AbstractService). Buatlah validasi dimana setter ini bisa merubah serviceList HANYA jika state dari CompositeService BUKAN DIE.
- Implementasi init(), memanggil fungsi init() pada setiap service yang ada pada serviceList dan mengubah state CompositeService menjadi INIT.
- Implementasi start(), memanggil fungsi start() pada setiap service yang ada pada serviceList dan mengubah state CompositeService menjadi RUNNING. 
- Implementasi stop(), memanggil fungsi stop() pada setiap service yang ada pada serviceList dan mengubah state dari CompositeService menjadi DIE. Pada method ini anda diminta untuk mencatat jumlah service yang sedang dalam kondisi RUNNING dan menuliskannya melalui stdout "RUNNING service total : x" diakhiri newline, dimana x merupakan jumlah RUNNING service pada serviceList.
*/