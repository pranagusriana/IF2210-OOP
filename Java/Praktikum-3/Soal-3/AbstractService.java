/**
 * This is the base implementation class for services.
 */
public abstract class AbstractService {

  public enum STATE {
    NEW,INIT,RUNNING,DIE
  }

  /**
   * Service name.
   */
  private final String name;

  /** service state */
  private STATE serviceState;

  /**
   * Construct the service.
   * @param name service name
   */
  public AbstractService(String name) {
    this.name = name;
    this.serviceState = STATE.NEW;
  }

  public final STATE getServiceState() {
    return serviceState;
  }

  public abstract void init();

  public abstract void start();

  public abstract void stop(); 

  public String getName() {
    return name;
  }

  public void setServiceState(STATE state){
    this.serviceState = state;
  }

  public String toString() {
    return "Service " + name + " in state " + serviceState;
  }

}

/*
Pada praktikum ini anda akan membuat implementasi dari simulasi service. Terdapat sebuah abstract class bernama AbstractService yang dapat dilihat disini.

Anda diiminta untuk membuat dua kelas yang merupakan turunan dari AbstractService yaitu CompositeService dan IdentityService.

CompositeService merupakan kelas yang berisi kumpulan AbstractService lain. Kelas ini berfungsi untuk membungkus semua service agar dapat dikendalikan secara bersamaan. Berikut merupakan spesifikasi dari CompositeService:
Konstructor memiliki satu parameter yaitu String yang merupakan nama dari service ini. Lakukan pemanggilan konstruktor parent.
Memiliki satu private attribute bernama serviceList yang merupakan daftar service yang terdaftar. Attribute ini bertipe ArrayList<AbstractService>. (private ArrayList<AbstractService> serviceList = new ArrayList<AbstractService>();)
Memiliki getter getServices()
Memiliki setter dalam bentuk addService(AbstractService) dan removeService(AbstractService). Buatlah validasi dimana setter ini bisa merubah serviceList HANYA jika state dari CompositeService BUKAN DIE.
Implementasi init(), memanggil fungsi init() pada setiap service yang ada pada serviceList dan mengubah state CompositeService menjadi INIT.
Implementasi start(), memanggil fungsi start() pada setiap service yang ada pada serviceList dan mengubah state CompositeService menjadi RUNNING. 
Implementasi stop(), memanggil fungsi stop() pada setiap service yang ada pada serviceList dan mengubah state dari CompositeService menjadi DIE. Pada method ini anda diminta untuk mencatat jumlah service yang sedang dalam kondisi RUNNING dan menuliskannya melalui stdout "RUNNING service total : x" diakhiri newline, dimana x merupakan jumlah RUNNING service pada serviceList.
IdentityService merupakan sebuah service yang berfungsi untuk mengecek suatu identitas sudah terdaftar atau belum. Berikut merupakan spesifikasi dari IdentityService:

Konstructor memiliki satu parameter yaitu String yang merupakan nama dari service ini. Lakukan pemanggilan konstruktor parent.
Memiliki satu private attribute bernama identityList yang merupakan daftar dari identitas yang sudah terdaftar. Attribute ini bertipe ArrayList<String>. (private final ArrayList<String> identityList = new ArrayList<String>();)
Memiliki getter getIdentity()
Memiliki setter dalam bentuk addIdentity(String) dan removeIdentity(String). Buatlah validasi dimana setter ini bisa merubah identityList HANYA jika state dari IdentityService sudah RUNNING.
Implementasi init(), mengubah state IdentityService menjadi INIT.
Implementasi start(), mengubah state IdentityService menjadi RUNNING.
Implementasi stop(), mengubah state IdentityService menjadi DIE.
Memiliki sebuah method isIdentityExist(String) yang mengembalikan Boolean true jika parameter input terdapat pada identityList, dan false sebaliknya. Buatlah validasi dimana bila method ini dipanggil ketika state IdentityService BUKAN RUNNING maka akan menghasilkan keluaran berupa null.
Berikut merupakan dokumentasi dari kelas ArrayList : https://docs.oracle.com/javase/7/docs/api/java/util/ArrayList.html

Kumpulkan CompositeService.java dan IdentityService.java dalam satu file zip.
*/