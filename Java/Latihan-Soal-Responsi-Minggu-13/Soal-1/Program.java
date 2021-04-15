import java.util.ArrayList;

public class Program {
    /**
     * Representasi tiap baris kode.
     * Perhatikan: indeks list mulai dari 0,
     *             tetapi representasi baris dimulai dari 1.
     */
    private ArrayList<String> lineOfCodes = new ArrayList<>();

    /**
     * Representasi nama file.
     */
    private String filename;

    /**
     * Konstruktor.
     * @param name nama file yang akan diset ke "filename"
     */
    public Program(String name) {
        this.filename = name;
    }

    /**
     * Menambahkan String input ke dalam lineOfCodes.
     * @param command perintah dalam program berupa satu baris kode
     */
    public void addCommand(String command) {
        this.lineOfCodes.add(command);
    }
 
    /**
     * Menghapus command pada baris tertentu.
     * Input dijamin valid. Tidak perlu dicek
     * @param line baris yang dipilih.
     */
    public void removeCommand(int line) {
        this.lineOfCodes.remove(line-1);
    }

    /**
     * Getter lineOfCodes.
     * @return lineOfCodes
     */
    public ArrayList<String> getCodes() {
        return this.lineOfCodes;
    }
 
    /**
     * Melakukan compile program.
     *
     * Langkah:
     * 1. Mengecek kebenaran atribut "filename" (harus diakhiri ".sumatrascript").
     *    Jika "filename" tidak valid, lemparkan FileFormatException
     * 2. Jika "filename" valid, cari error pada tiap baris dan catat lokasi barisnya
     *    pada sebuah ArrayList<Integer>
     * 3. Jika ada error, maka lemparkan CompileErrorException.
     *    Jika tidak ada error sama sekali, tidak melakukan apa-apa.
     */
    public void compile() throws CompileErrorException, FileFormatException {
        if(!this.filename.endsWith(".sumatrascript")){
            throw new FileFormatException();
        } else{
            ArrayList<Integer> errorLocations = new ArrayList<>();
            for(int i = 0; i < this.lineOfCodes.size(); i++){
                if(this.isError(this.lineOfCodes.get(i))){
                    errorLocations.add(i);
                }
            }

            if(errorLocations.size() != 0){
                throw new CompileErrorException(errorLocations);
            }
        }
    }

    /**
     * Fungsi untuk menentukan keberadaan error pada satu baris kode.
     * @return true, jika ada kesalahan
     *         false, jika tidak ada kesalahan
     */
    private boolean isError(String line) {
        if (line.startsWith("//")) {
            return false;
        }
        if (line.startsWith("var")) {
            String[] syntaxes = line.split(" ");
            if (syntaxes[0].equals("var")
                && syntaxes[2].equals("=")
                && syntaxes[syntaxes.length-1].endsWith(";")) {
                return false;
            }
        }
        return true;
    }
}

/*
Pada soal ini Anda diminta untuk membuat compiler super sederhana bahasa tiruan javascript bernama sumatrascript dengan menerapkan konsep Exceptions. Jangan khawatir karena compiler tersebut HANYA mengecek penulisan komentar dan assignment variabel mudah.

Fungsi untuk pengecekan kevalidan sintaks pun SUDAH DIBERIKAN pada outline yang tersedia dan TIDAK PERLU ditambahkan lagi. Sehingga Anda cukup mengimplementasikan bagian yang mengandung Exceptions saja.

Untuk membuat compiler tersebut, Anda harus membuat 3 file java, yaitu Program.java, CompileErrorException.java, dan FileFormatException.java dengan rincian sebagai berikut:

Program.java (outline)



FileFormatException.java

Memiliki sebuah member String bernama errorMessage.
Memiliki konstruktor tanpa parameter yang akan
mengeset errorMessage dengan "Format salah" (tanpa newline).
Memiliki getter getErrorMessage();

CompileErrorException.java

Memiliki sebuah member berupa list of integer 
(ArrayList<Integer>) errorLocations yang merupakan semua lokasi kesalahan pada kode.
Memiliki konstruktor dengan satu parameter bertipe list of integer. 
Konstruktor akan meng-assign errorLocations dengan parameter tsb.
Method showErrors(), menuliskan "Error di baris : <no_baris>"
(diakhiri newline) untuk setiap elemen errorLocations ke layar.


Catatan:

Format filename valid: <nama>.sumatrascript. <nama> bebas sesuai masukan pengguna
Representasi baris kode dimulai dari 1. (Tidak mungkin ada "Error di baris : 0")
Satu baris kode hanya bisa memiliki satu error.
Gunakan scanner.nextLine() untuk mengambil String (yang dapat mengandung karakter spasi di dalamnya) dari user (untuk membuat program testing).
Submit ketiga file yang dibuat ke dalam satu .zip

Contoh masukan command tidak error (perhatikan karakter spasi):

//komentar
//Ini adalah sebuah komentar
var t = 10;
var x = a + b;
var arr = [];
Contoh masukan command error:

tes
int x = 10;
// tes
method();


HINT:

Beberapa fungsi yang dapat Anda gunakan untuk membantu pekerjaan Anda:

String:

boolean startsWith(String pattern), mengembalikan true jika pattern terletak di awal String. Contoh: "1237856".startWith("1237") = true.
boolean endsWith(String pattern), mengembalikan true jika pattern terletak di akhir String. Contoh: "1237856".endsWith("7856") = true.
boolean equals(String s2), mengembalikan true jika String == s2;
String[] split(String regex), mengembalikan beberapa String yang dipecah berdasarkan suatu regex. Contoh "123@456".split("@") = [123, 456].
   
List:

boolean isEmpty(), mengembalikan true jika list kosong.
void add(Object o), menambahkan object o ke dalam list.
void remove(int i), menghapus object ke-i.
*/