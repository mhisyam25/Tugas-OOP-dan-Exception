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
public class segitiga extends bangunDatarRuang{
    int alas, tinggi;

    public segitiga(int alas, int tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }
    
    @Override
    double keliling(int alas, int tinggi){
        return alas+alas+alas;
    }
    
    @Override
    double luas(int alas, int tinggi){
        return 0.5*alas*tinggi;
    }
}
