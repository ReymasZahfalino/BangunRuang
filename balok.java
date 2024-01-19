/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inheritance;

/**
 *
 * @author WINDOWS 11
 */
public class balok extends bangunRuang{
    double panjang,lebar,tinggi;
    
    @Override
    double Volume(){
       hasil = panjang*lebar*tinggi;
       System.out.println("Volume balok: " + hasil);
       return hasil;
    }
    
    
    @Override
    double LP(){
        hasil = (panjang*lebar+panjang*tinggi+lebar*tinggi)*2;
        System.out.println("LP Balok: " + hasil);
        return hasil;
    }
    
}
