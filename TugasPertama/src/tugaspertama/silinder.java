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
public class silinder extends bangunDatarRuang{
    int jari, tinggi;

    public silinder(int jari, int tinggi) {
        this.jari = jari;
        this.tinggi = tinggi;
    }
    
    @Override
    double luas(int jari, int tinggi){
        return Math.PI*jari*jari;
    }
    
    @Override
    double volume(int jari, int tinggi){
        return Math.PI*jari*jari*tinggi;
    }
    
}
