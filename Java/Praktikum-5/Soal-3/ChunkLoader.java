// Nama: Prana Gusriana
// NIM: 13519195
// Tanggal: Kamis, 22 April 2021
// File: ChunkLoader.java
// Praktikum-5, Soal 3

import java.util.*;

public class ChunkLoader implements Runnable {
    // ... Anda boleh menambahkan atribut
    private Chunk chunk;
    private String chunkDataFileName;

    public ChunkLoader(Chunk chunk, String chunkDataFilename) {
        this.chunk = chunk;
        this.chunkDataFileName = chunkDataFilename;
    }

    @Override
    public void run() {
        // Membaca file dengan nama chunkDataFilename
        // Gunakan class CSVReader.
        // Contoh file chunkDataFilename:
        // x,y
        // 1,18
        // 10,8
        // 6,12
        // Untuk setiap x dan y, tambahkan tree ke Chunk
        // Jika ada IOException pada saat membaca reader, catch Exception
        // tidak ada tree yang ditambahkan pada Chunk (tidak dithrow lagi)
        try{
            CSVReader csvReader = new CSVReader(this.chunkDataFileName, ",");
            csvReader.setSkipHeader(true);
            List<String[]> isiFile = csvReader.read();
            for (String[] line : isiFile){
                this.chunk.addTree(new Position(Integer.parseInt(line[0]), Integer.parseInt(line[1])));
            }
        } catch (Exception e){
            // do nothing
        }
    }
}

/*
Multi-threading umum digunakan dalam game, seperti me-load resource. Misalnya, pada game open world, dunia permainan sangatlah luas. Jika game me-load seluruh dunia game, RAM akan habis digunakan untuk menyimpan seluruh dunia!

Untuk itu, dunia game dibagi menjadi beberapa chunk. Tiap chunk disimpan dalam file, dan hanya diload saat pemain ada di dekat chunk itu. Ada banyak yang disimpan oleh chunk, misalnya daftar bangunan, daftar pohon, dan lain-lain.

Tapi, membaca file jauh lebih lambat daripada membaca memori di RAM. Terdapat bottleneck dalam membaca filesystem OS. Untuk itu, lebih baik bila chunk di-load dalam thread.

Kelas Chunk, CSVReader, dan Position sudah dibuat. Anda diminta untuk melengkapi kelas ChunkLoader yang mengimplementasikan Runnable. Nantinya, program Main akan seperti ini:

import java.util.ArrayList;

public class Main {
   public static void main(String[] args) {
       int nChunk = 10;
       ArrayList<Chunk> chunks = new ArrayList<Chunk>();
       for (int i = 0; i < nChunk; i++) {
           chunks.add(new Chunk());
       }
       // Kode ini akan cepat ketika dijalankan,
       // tapi akan menjadi lebih lambat bila
       // - file sangat besar
       // - chunk sangat banyak
       // Selain itu, program akan hang sampai
       // chunk selesai diload jika tidak menggunakan thread
       for (int i = 0; i < nChunk; i++) {
           ChunkLoader loader = new ChunkLoader(chunks.get(i), "chunk-1.txt");
           Thread t = new Thread(loader);
           t.start();
       }
       System.out.println("done");
   }
}
Kumpulkan ChunkLoader.java.
*/