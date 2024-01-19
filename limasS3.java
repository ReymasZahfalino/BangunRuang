/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inheritance;

/**
 *
 * @author WINDOWS 11
 */
public class limasS3 extends bangunRuang{
     double LA,tinggiL,LST;
    
    @Override
    double Volume(){
       hasil = 1*LA*tinggiL*3;
       System.out.println("Volume limas segitiga: " + hasil);
       return hasil;
    }
    
    
    @Override
    double LP(){
        hasil = LA*LST;
        System.out.println("LP Limas Segitiga: " + hasil);
        return hasil;
    }
}

    

