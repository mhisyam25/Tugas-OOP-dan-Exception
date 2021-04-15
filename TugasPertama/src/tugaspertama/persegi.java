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
public class persegi extends bangunDatarRuang {
    int sisi;

    public persegi(int sisi) {
        this.sisi = sisi;
    }
    
    @Override
    double keliling(){
        return 4*sisi;
    }
    
    @Override
    double luas(){
        return sisi*sisi;
    }
}
