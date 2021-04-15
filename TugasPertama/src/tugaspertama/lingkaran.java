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
public class lingkaran extends bangunDatarRuang{
    int jari;

    public lingkaran(int jari) {
        this.jari = jari;
    }
    
    
    @Override
    double keliling(){
        return 2*Math.PI*jari;
    }
    
    @Override
    double luas(){
        return Math.PI*jari*jari;
    }
}
