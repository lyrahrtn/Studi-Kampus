/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TokoBuku;

/**
 *
 * @author SMK TELKOM
 */
public class transaksi {
    public int idBarang, hargaBarang;
    public String namaBarang, merkBarang;
    
    public transaksi(int idBarang, String namaBarang, String merkBarang, int hargaBarang){
        this.idBarang = idBarang;
        this.namaBarang = namaBarang;
        this.merkBarang = merkBarang;
        this.hargaBarang = hargaBarang;
    }
    
    public void tampilkan(){
        System.out.println("Id Barang : "+this.idBarang);
        System.out.println("Nama Barang : "+this.namaBarang);
        System.out.println("Merk Barang : "+this.merkBarang);
        System.out.println("Harga Barang : "+this.hargaBarang);
    }
}
