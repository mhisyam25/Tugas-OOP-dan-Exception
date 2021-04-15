/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugaspertama;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class TugasPertama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner pilih = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        
        
        String balik;
        int nomor, s=0, r=0, p=0, l=0, a=0, t=0, x=0;
        
        do{
        System.out.println("\tMENU");
        System.out.println("=== Bangun Datar ===");
        System.out.println("1. Persegi");
        System.out.println("2. Lingkaran");
        System.out.println("3. Pesegi Panjang");
        System.out.println("4. Segitiga");
        System.out.println("=== Bangun Ruang ===");
        System.out.println("5. Kubus");
        System.out.println("6. Balok");
        System.out.println("7. Silinder");
        System.out.println("0. Keluar");
        System.out.print("Pilih : ");
        
        nomor = pilih.nextInt();
                
        switch(nomor){
            case 1:
                try{
                    System.out.print("Masukkan Sisi = ");
                    s = input.nextInt();
                } 
                catch(InputMismatchException error){
                    System.out.println(error.getMessage() + " Error pada input kudu nomor aja ");
                    x=1;
                }
                finally{
                    if(!(x==1)){
                        bangunDatarRuang persegik = new persegi(s);
                        System.out.println("Keliling Persegi = " + persegik.keliling());
                        System.out.println("Luas Persegi = " + persegik.luas());
                    }  
                }
                break;
                
            case 2:
                try{
                    System.out.print("Masukkan Jari-jari = ");
                    r = input.nextInt();
                } 
                catch(InputMismatchException error){
                    System.out.println(error.getMessage() + " ! Error pada input kudu nomor aja !!");
                    x=1;                   
                }
                finally{
                    if(!(x==1)){
                        bangunDatarRuang lingkarank = new lingkaran(r);
                        System.out.println("Keliling lingkaran = " + lingkarank.keliling());
                        System.out.println("Luas Lingkaran = " + lingkarank.luas());
                    }  
                }
                break;
            
                
            case 3:
                try{
                    System.out.print("Masukkan Panjang = ");
                    p = input.nextInt();
                    System.out.print("Masukkan Lebar = ");
                    l = input.nextInt();
                } 
                catch(InputMismatchException error){
                    System.out.println(error.getMessage() + " ! Error pada input kudu nomor aja !!");
                    x=1;
                }
                finally{
                    if(!(x==1)){
                        bangunDatarRuang persegiPanjank = new persegiPanjang(p,l);
                        System.out.println("Keliling Persegi Panjang = " + persegiPanjank.keliling(p,l));
                        System.out.println("Luas Persegi Panjang = " + persegiPanjank.luas(p,l));
                    }  
                }
                break;
                
            case 4:
                try{
                    System.out.print("Masukkan Alas = ");
                    a = input.nextInt();
                    System.out.print("Masukkan Tinggi = ");
                    t = input.nextInt();
                } 
                catch(InputMismatchException error){
                    System.out.println(error.getMessage() + " ! Error pada input kudu nomor aja !!");
                    x=1;
                }
                finally{
                    if(!(x==1)){
                        bangunDatarRuang segitigak = new segitiga(a,t);
                        System.out.println("Keliling Segitiga = " + segitigak.keliling(a,t));
                        System.out.println("Luas Segitiga = " + segitigak.luas(a,t));
                    }  
                }
                break;
                
            case 5:
                try{
                    System.out.print("Masukkan Sisi = ");
                    s = input.nextInt();
                } 
                catch(InputMismatchException error){
                    System.out.println(error.getMessage() + " ! Error pada input kudu nomor aja !!");
                    x=1;
                }
                finally{
                    if(!(x==1)){
                        bangunDatarRuang kubusk = new kubus(s);
                        System.out.println("Keliling Kubus = " + kubusk.keliling());
                        System.out.println("Luas Permukaan Kubus = " + kubusk.luaspermukaan());
                        System.out.println("Luas Kubus = " + kubusk.luas());
                        System.out.println("Volume Kubus = " + kubusk.volume());
                    }  
                }
                break;
                
            case 6:
                try{
                    System.out.print("Masukkan Panjang = ");
                    p = input.nextInt();
                    System.out.print("Masukkan Lebar = ");
                    l = input.nextInt();
                    System.out.print("Masukkan Tinggi = ");
                    t = input.nextInt();
                } 
                catch(InputMismatchException error){
                    System.out.println(error.getMessage() + " ! Error pada input kudu nomor aja !!");
                    x=1;
                }
                finally{
                    if(!(x==1)){
                        bangunDatarRuang baloks = new balok(p,l,t);
                        System.out.println("Keliling Balok = " + baloks.keliling(p,l,t));
                        System.out.println("Luas Permukaan Balok = " + baloks.luaspermukaan(p,l,t));
                        System.out.println("Volume Balok = " + baloks.volume(p,l,t));
                    }  
                }
                break;
                
            case 7:
                try{
                    System.out.print("Masukkan Jari-jari = ");
                    r = input.nextInt();
                    System.out.print("Masukkan Tinggi = ");
                    t = input.nextInt();
                } 
                catch(InputMismatchException error){
                    System.out.println(error.getMessage() + " ! Error pada input kudu nomor aja !!");
                    x=1;
                }
                finally{
                    if(!(x==1)){
                        bangunDatarRuang silinders = new silinder(r,t);
                        System.out.println("Luas Permukaan Silinder = " + silinders.luas(r,t));
                        System.out.println("Volume Silinder = " + silinders.volume(r,t));
                    }  
                }
                break;
                
            case 0:
                System.exit(0);
  
        }
        System.out.print("Balik menu awal [y/n] ? ");
        balik = input.next();
        }while(!"n".equals(balik));
    }
    
}
