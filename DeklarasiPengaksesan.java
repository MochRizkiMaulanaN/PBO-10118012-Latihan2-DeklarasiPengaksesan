/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deklarasipengaksesan;

/**
 * Nama     : Moch Rizki Maulana N
 * Kelas    : IF-1 2018
 * Nim      : 10118012
 * Deskripsi Program : Deklarasi Pengaksesan
 *
 * @author LENOVO
 */
public class DeklarasiPengaksesan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //deklarasi variabel
        int nilaiint;
        final double PHI=3.14; //konstanta uppercase
        boolean nilailogika;
        char nilaikarakter;
        
        //memberi nilai ke variabel
        nilaiint= 78;
        nilailogika= false;
        nilaikarakter= 'D';
        
        //menampilkan hasil
        System.out.println();
        System.out.println("isi variabel nilai = "+nilaiint);
        System.out.println("isi variabel PHI = "+PHI);
        System.out.println("isi variabel logika = "+nilailogika);
        System.out.println("isi varibel karakter = "+nilaikarakter);
    }
    
}
