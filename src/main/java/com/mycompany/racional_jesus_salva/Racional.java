/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.racional_jesus_salva;

import java.util.Random;

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

        System.out.println("Número racional " + a + "/" + b);
    }

    //Metodo toString()
    @Override
    public String toString() {
        return "Racional{" + "a=" + a + ", b=" + b + '}';
    }

    //Metodo sumar
    public void suma(Racional x) {
        if (this.b == x.b) {
            this.a = this.a + x.a;
        } else {
            this.a = (this.a * x.b) + (this.b * x.a);
            this.b = this.b * x.b;
        }
    }

    //A. Método resta(Racional x), que operará utilizando la misma lógica que el 
    //método suma anterior pero aplicando la resta.
    public void resta(Racional x) {
        if (this.b == x.b) {
            this.a = this.a - x.a;
        } else {
            this.a = (this.a * x.b) - (this.b * x.a);
            this.b = this.b * x.b;
        }
    }

    //Metodo multiplicar
    public void producto(Racional x) {
        this.a = this.a * x.a;
        this.b = this.b * x.b;

    }

//A. Método de clase division(Racional x, Racional y), que devolverá un objeto Racional con el resultado 
//de realizar la división de x entre y. Para ello se multiplica la primera fracción por la segunda 
//fracción invertida.
    public static Racional division(Racional x, Racional y) {
        return new Racional(x.a * y.b, x.b * y.a);
    }

    //Metodo comprueba igualdad
    public static boolean igualdad(Racional x, Racional y) {
        return x.a * y.b == x.b * y.a;

    }

    //A. Método de clase aleatorio(), que devuelva un número racional aleatorio, 
    //controlando que el denominador no sea cero.
    public static Racional aleatorio() {
        Random aleatorio = new Random();

        return new Racional(aleatorio.nextInt(20), aleatorio.nextInt(19) + 1);
    }
}
