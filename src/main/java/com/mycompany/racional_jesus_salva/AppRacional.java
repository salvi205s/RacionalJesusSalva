/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.racional_jesus_salva;

/**
 *
 * @author salva
 */
public class AppRacional {
    
    public static void main(String[] args) {
                
//Crea dos racionales  con valores z=4/5 y k=3/4.
        Racional z=new Racional(4, 5);
        Racional k=new Racional(3, 4);
        
        //Creacion racional aleatorio
        System.out.println(Racional.aleatorio());
        
        
    }
}
