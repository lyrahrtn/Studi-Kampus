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
public class pembeli extends transaksi{
    public int idPembeli;
    public String namaPembeli, alamat, noTelp;
    
    public pembeli(int idPembeli, String namaPembeli, String alamat, String noTelp, 
            int idBarang, String namaBarang, String merkBarang, int hargaBarang)
    {
        super(idBarang, namaBarang, merkBarang, hargaBarang);
        this.idPembeli = idPembeli;
        this.namaPembeli = namaPembeli;
        this.alamat = alamat;
        this.noTelp = noTelp;
    }
    public void tampilkan(){
        System.out.println("Id Pembeli : "+this.idPembeli);
        System.out.println("Nama Pembeli : "+this.namaPembeli);
        System.out.println("Alamat "+this.alamat);
        System.out.println("No. Telepon : "+this.noTelp);
        super.tampilkan();
    }
}
