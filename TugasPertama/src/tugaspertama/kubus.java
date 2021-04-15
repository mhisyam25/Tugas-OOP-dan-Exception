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
public class kubus extends bangunDatarRuang{
    int sisi;

    public kubus(int sisi) {
        this.sisi = sisi;
    }

    @Override
    double keliling(){
        return 12*sisi;
    }
    
    @Override
    double luaspermukaan(){
        return sisi*sisi;
    }
    
    @Override
    double luas(){
        return 6*sisi*sisi;
    }
    
    @Override
    double volume(){
        return sisi*sisi*sisi;
    }
    
}
