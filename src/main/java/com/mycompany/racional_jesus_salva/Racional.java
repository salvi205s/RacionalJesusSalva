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
public class Racional {

    /*Un número Racional se representa por dos números enteros a/b, donde a es el numerador y b es el denominador, 
    ambos números enteros. Los objetos de tipo Racional estarán encapsulados.
     */
    private int a;
    private int b;
//A. Constructor por defecto, indicando como numerador y denominador el valor 1.

    public Racional() {
        this.a = 1;
        this.b = 1;
    }

    // Constructor parametrizado
    public Racional(int a, int b) {
        this.a = a;
        this.b = b;
        if (b == 0) {
            System.out.println("El denominador no puede ser 0, se le ha asignado el valor 1");
            this.b = 1;
        }
    }

    //Metodos getters
    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    //A. Métodos set, teniendo en cuenta la misma restricción que existe en el constructor parametrizado.
    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
        if (b == 0) {
            System.out.println("El denominador no puede ser 0, se le ha asignado el valor 1");
            this.b = 1;
        }

    }

    //A. Método imprimirConsola(), que imprimirá por consola el número racional mostrando un 
    //mensaje del tipo "Número racional a/b"
    public void imprimirConsola() {

        System.out.println("Número racional "+a+"/"+b);
    }

}
