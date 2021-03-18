public class Main {
    public static void main(String[] args){
        Rekening r = new Rekening(10);
        if(r.simpanUang(10000.00)){
            System.out.println("Berhasil :)");
        } else{
            System.out.println("Gagal :(");
        }
        r.simpanUang(40000.00);
        r.simpanUang(30000.00);
        r.simpanUang(60000.00);
        Transaksi[] t = r.getLastTransaksi(2);
        for(int i = 0; i<2; i++){
            System.out.println("Ke-"+i+" = "+ t[i].getPerubahan());
        }
    }
}
