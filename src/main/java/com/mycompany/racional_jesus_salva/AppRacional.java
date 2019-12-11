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
        
        System.out.println("-----------------------------");
        //Imprime los tres racionales.
        System.out.println(z);
        System.out.println(k);
        System.out.println(Racional.aleatorio());
        
        //Comprueba igualdad entre z y k
        System.out.println(Racional.igualdad(z, k));

        //Suma z y k. Muestra el resultado.
        z.suma(k);
        System.out.println("sumando\n"+z);
        
        //Divide z y k
        System.out.println(Racional.division(z, k));
                
        //Multiplica z y k. Muestra el resultado.
        z.producto(k);
        System.out.println("Multiplicando\n"+z);
        
    }
}
