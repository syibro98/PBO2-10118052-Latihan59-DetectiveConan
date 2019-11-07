/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118052.latihan59.detectiveconan;

/**
 *	
 * @author
 * NAMA     : Bagus Syibro Malisi
 * KELAS    : IF-2
 * NIM      : 10118052
 * Deskripsi Program : Membuat program dengan pendekatan berbasis objek untuk menampilkan
 * tokoh dalam detektif konan berdasarkan keahlian setiap tokoh
 */
public class Keahlian {
    private final String detektif, detektifCilik, belaDiri, teknologi, pengacara;

    public Keahlian() {
        detektif = "1. Kogoro Mouri\n2. Sonoko Suzuki\n3. Heiji Hattori";
        detektifCilik = "1. Conan Edogawa\n2. Genta Kojima\n3. Ayumi Yoshida\n" 
                + "4. Ai Haibara\n5. Mitsuhiko Tsuburaya";
        belaDiri = "1. Ran Mouri\n2. Kogoro Mouri\n3. Kazuha Toyama\n4. Heiji Hattori";
        teknologi = "1. Hiroshi Agasa\n2. Mitsuhiko Tsuburaya";
        pengacara = "1. Eri Kisaki";
    }
    
    public void tampilDaftarKeahlian() {
        System.out.println("1. Detekitf");
        System.out.println("2. Detektif Cilik");
        System.out.println("3. Bela Diri");
        System.out.println("4. Ahli/Suka Teknologi");
        System.out.println("5. Pengacara");
        System.out.println("6. Semua Keahlian");
        System.out.print("Pilih Keahlian [1-6] : ");
    }
    
    public String getNamaKeahlian(int keahlian) {
        String result;
        switch(keahlian) {
            case 1: result = "Detektif"; break;
            case 2: result = "Detektif Cilik"; break;
            case 3: result = "Bela Diri"; break;
            case 4: result = "Ahli Teknologi"; break;
            case 5: result = "Pengacara"; break;
            default: result = "Semua Keahlian"; break;
        }
        return result;
    }
    
    public String getKeahlian(int keahlian) {
        String result;
        switch(keahlian) {
            case 1: result = detektif; break;
            case 2: result = detektifCilik; break;
            case 3: result = belaDiri; break;
            case 4: result = teknologi; break;
            default: result = pengacara; break;
        }
        return result;
    }
    
    public void tampilKeahlian() {
        System.out.println("Detektif:");
        System.out.println(getKeahlian(1));
        System.out.println("\nDetektif Cilik:");
        System.out.println(getKeahlian(2));
        System.out.println("\nBela Diri:");
        System.out.println(getKeahlian(3));
        System.out.println("\nAhli Teknologi:");
        System.out.println(getKeahlian(4));
        System.out.println("\nPengacara:");
        System.out.println(getKeahlian(5));
    }
}
