// Nama: Prana Gusriana
// NIM: 13519195
// Tanggal: Kamis, 8 April 2021
// File: Utility.java
// Praktikum-4, Soal 1

class Utility{
    // getMidpoint, digunakan untuk mengembalikan elemen tengah sebuah array. Untuk kasus jumlah elemen bernilai genap, jika array memiliki tipe elemen yang merupakan Number, maka nilai yang dikembalikan berupa double yang merupakan nilai tengah dari dua buah bilangan yang menempati posisi tengah. 
    public static <T extends Number> double getMidpoint(T[] arr){
        if(arr.length % 2 == 1){
            return arr[arr.length / 2].doubleValue();
        } else{
            return (arr[(arr.length-1)/2].doubleValue() + arr[arr.length/2].doubleValue())/2;
        }
    }

    // Sedangkan jika elemen array bukan Number, cukup kembalikan elemen array dengan index tengah yang lebih tinggi.
    public static <T> T getMidpoint(T[] arr){
        return arr[arr.length/2];
    }

    // getLast, digunakan untuk mengembalikan elemen terakhir sebuah array.
    public static <T> T getLast(T[] arr){
        return arr[arr.length-1];
    }

    // getFirst, digunakan untuk mengembalikan elemen pertama sebuah array.
    public static <T> T getFirst(T[] arr){
        return arr[0];
    }

    // getAverage, digunakan untuk mengembalikan nilai rata-rata seluruh elemen array dengan tipe double. Method hanya bisa digunakan untuk array dengan tipe elemen berupa Number.
    public static <T extends Number> double getAverage(T[] arr){
        double sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i].doubleValue();
        }
        return sum/arr.length;
    }

    // getMin, digunakan untuk mengembalikan nilai minimum seluruh elemen array dengan tipe double. Method hanya bisa digunakan untuk array dengan tipe elemen berupa Number.
    public static <T extends Number> double getMin(T[] arr){
        double min = arr[0].doubleValue();
        for(int i = 0; i < arr.length; i++){
            if(min > arr[i].doubleValue()){
                min = arr[i].doubleValue();
            }
        }
        return min;
    }

    // getMax, digunakan untuk mengembalikan nilai maximum seluruh elemen array dengan tipe double. Method hanya bisa digunakan untuk array dengan tipe elemen berupa Number.
    public static <T extends Number> double getMax(T[] arr){
        double max = arr[0].doubleValue();
        for(int i = 0; i < arr.length; i++){
            if(max < arr[i].doubleValue()){
                max = arr[i].doubleValue();
            }
        }
        return max;
    }

    // getSize, digunakan untuk mengembalikan sebuah integer yang merupakan ukuran sebuah array.
    public static <T> int getSize(T[] arr){
        return arr.length;
    }
}

/*
Buatlah sebuah kelas dengan nama Utility. Di dalam kelas tersebut terdapat berbagai statik generic method yang dapat digunakan untuk mengelola sebuah array satu dimensi. Method-method tersebut adalah:

getMidpoint, digunakan untuk mengembalikan elemen tengah sebuah array. Untuk kasus jumlah elemen bernilai genap, jika array memiliki tipe elemen yang merupakan Number, maka nilai yang dikembalikan berupa double yang merupakan nilai tengah dari dua buah bilangan yang menempati posisi tengah. Sedangkan jika elemen array bukan Number, cukup kembalikan elemen array dengan index tengah yang lebih tinggi.
getLast, digunakan untuk mengembalikan elemen terakhir sebuah array.
getFirst, digunakan untuk mengembalikan elemen pertama sebuah array.
getAverage, digunakan untuk mengembalikan nilai rata-rata seluruh elemen array dengan tipe double. Method hanya bisa digunakan untuk array dengan tipe elemen berupa Number.
getMin, digunakan untuk mengembalikan nilai minimum seluruh elemen array dengan tipe double. Method hanya bisa digunakan untuk array dengan tipe elemen berupa Number.
getMax, digunakan untuk mengembalikan nilai maximum seluruh elemen array dengan tipe double. Method hanya bisa digunakan untuk array dengan tipe elemen berupa Number.
getSize, digunakan untuk mengembalikan sebuah integer yang merupakan ukuran sebuah array.
Kumpulkan file dengan nama Utility.java



Catatan:

Gunakan method .doubleValue() untuk mendapatkan nilai double dari suatu kelas turunan Number
*/