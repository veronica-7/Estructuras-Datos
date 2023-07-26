/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio12;

import java.util.Random;
import java.util.Scanner;

/*
    Diseñar un algoritmo que permita particionar en dos listas los nodos de una 
    lista lineal sencilla.
 */
public class Metodos {

    Nodo head;
    Nodo head01;
    Nodo head02;
    Scanner entrada;
    int cont;

    public Metodos() {
        this.head = null;
        this.head01 = null;
        this.head02 = null;
        this.entrada = new Scanner(System.in);
        this.cont = 0;
    }

    public int menu() {
        System.out.println("\nInsertar                  [1]: ");
        System.out.println("Recorrer                  [2]: ");
        System.out.println("Particionar en dos listas [3]: ");
        System.out.println("Salir                     [0]:");
        return entrada.nextInt();
    }

    public boolean listaVacia() {
        return (head == null);
    }

    public void insertar() {
        int num;
        System.out.print("Ingrese dato: ");
        num = entrada.nextInt();
        Nodo nuevo = new Nodo(num);
        if (listaVacia()) {
            head = nuevo;
        } else {
            Nodo actual = head;

            while (actual.sig != null) {
                actual = actual.sig;
            }
            actual.sig = nuevo;
            nuevo.ant = actual;
            cont++;
        }
    }

    public void particionar() {
        if (listaVacia() || head.sig == null) {
            System.err.println("Nos hay suficientes nodos/elementos");
        } else {

            head01 = head;
            head02 = head.sig;
            Nodo actual1 = head01;
            Nodo actual2 = head02;

            while (actual2 != null && actual2.sig != null) {
                actual1.sig = actual2.sig;
                actual1 = actual1.sig;
                actual2.sig = actual2.sig.sig;
                actual2 = actual2.sig;
            }

            actual1.sig = null;
        }
    }

    public void recorrer(Nodo aux) {
        Nodo actual = aux;
        if (listaVacia()) {
            System.err.println("Lista vacía");
        } else {
            while (actual != null) {
                System.out.print(actual.dato + " -> ");
                actual = actual.sig;
            }
        }
    }
}
