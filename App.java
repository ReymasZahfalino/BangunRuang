/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.inheritance;

/**
 *
 * @author WINDOWS 11
 */
public class App {

    public static void main(String[] args) {
        bangunRuang BangunRuang = new bangunRuang();
        
        bola Bola = new bola();
        Bola.r = 14;
        
        
        limasS3 limas = new limasS3();
        limas.LA = 12;
        limas.tinggiL = 10;
        limas.LST = 15;
        
        
        
        tabung Tabung = new tabung();
        Tabung.R = 10;
        Tabung.Tinggi = 12;
        Tabung.Luasalas = 12;
        Tabung.LSTb = 12;
        
        
        balok Balok = new balok();
        Balok.panjang = 12;
        Balok.lebar = 8;
        Balok.tinggi = 4;
        
        
        BangunRuang.Volume();
        BangunRuang.LP();
        
        
        Bola.Volume();
        Bola.LP();
        
        
        limas.Volume();
        limas.LP();
        
        
        Tabung.Volume();
        Tabung.LP();
        
        
        Balok.Volume();
        Balok.LP();
        
        
        
        
       
        
        
        
    }
}
