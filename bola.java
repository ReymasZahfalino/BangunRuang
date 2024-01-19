/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inheritance;

/**
 *
 * @author WINDOWS 11
 */
public class bola extends bangunRuang{
    double r;
    
    @Override
    double Volume(){
       hasil = 4*Math.PI*r*r*r/3;
       System.out.println("Volume bola: " + hasil);
       return hasil;
    }
    
    
    @Override
    double LP(){
        hasil = 4*Math.PI*r*r;
        System.out.println("LP bola: " + hasil);
        return hasil;
    }
}

    
    

