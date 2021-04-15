/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugaspertama;

/**
 *
 * @author ASUS
 */
public class balok extends bangunDatarRuang{
    int panjang, lebar, tinggi;

    public balok(int panjang, int lebar, int tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }
    
    @Override
    double keliling(int panjang, int lebar, int tinggi){
        return 4*(panjang+lebar+tinggi);
    }
    
    @Override
    double luaspermukaan(int panjang, int lebar, int tinggi){
        return 2*(panjang*lebar+panjang*tinggi+lebar+tinggi);
    }
    
    @Override
    double volume(int panjang, int lebar, int tinggi){
        return panjang*lebar*tinggi;
    }
    
}
