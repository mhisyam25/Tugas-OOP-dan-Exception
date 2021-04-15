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
public class persegiPanjang extends bangunDatarRuang{
    int panjang, lebar;

    public persegiPanjang(int panjang, int lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }
    
    @Override
    double keliling(int panjang, int lebar){
        return 2*(panjang+lebar);
    }
    
    @Override
    double luas(int panjang, int lebar){
        return panjang*lebar;
    }
}
