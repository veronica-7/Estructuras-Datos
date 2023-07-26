/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2;

import java.util.Random;
import java.util.Scanner;

/*
    Crear una función que permita calcular el promedio de los elementos de 
    una lista ya creada.
 */

public class Metodos {

    Nodo head;
    int cont;
    Scanner entrada;
    Random random;
    int lim;

    public Metodos() {
        this.head = null;
        this.entrada = new Scanner(System.in);
        this.random = new Random();
        this.lim = 20;
        this.cont = 1;
    }
    public boolean listaVacia() {
        return (head == null);
    }

    public void insertar() {
        int num;
        num = random.nextInt(lim);
        Nodo nuevo = new Nodo(num);

        if (listaVacia()) {
            head = nuevo;
        } else {
            Nodo actual = head;

            while (actual.sig != null) {
                actual = actual.sig;
            }
            actual.sig = nuevo;
            cont++;
        }
    }

    public void recorrer() {
        Nodo actual = head;
        while (actual != null) {
            System.out.print(actual.dato + " -> ");
            actual = actual.sig;
        }
    }

    public double promedio() {
        double promedio = 0;
        Nodo actual = head;
        while (actual != null) {
            promedio += actual.dato;
            actual = actual.sig;
        }
        return promedio / cont;
    }
}
