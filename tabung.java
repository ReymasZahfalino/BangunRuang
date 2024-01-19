/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inheritance;

/**
 *
 * @author WINDOWS 11
 */
public class tabung extends bangunRuang{
    double R,Tinggi,LSTb,Luasalas;
    
    @Override
    double Volume(){
       hasil = Math.PI*R*R*Tinggi;
       System.out.println("Volume tabung: " + hasil);
       return hasil;
    }
    
    
    @Override
    double LP(){
        hasil = 2*Luasalas+LSTb;
        System.out.println("LP Tabung: " + hasil);
        return hasil;
    }
    
}
