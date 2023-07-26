/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio13;

import java.util.Scanner;

/*
    Diseñar un algoritmo que permita eliminar todos los elementos repetidos 
    en una lista lineal sencilla.
 */
public class Metodos {

    Nodo head;
    Scanner entrada;

    public Metodos() {
        this.head = null;
        this.entrada = new Scanner(System.in);
    }

    public int menu() {
        System.out.println("\nInsertar                       [1]: ");
        System.out.println("Recorrer                       [2]: ");
        System.out.println("Eliminar repetidos             [3]: ");
        System.out.println("Salir                          [0]:");
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
        }
    }

    public void eliminarRepetidos() {
        Nodo actual = head;
        Nodo previo = null;

        while (actual != null) {
            
            int datoActual = actual.dato;
            Nodo siguiente = actual.sig;
            boolean repetido = false;

            while (siguiente != null && siguiente.dato == datoActual) {
                repetido = true;
                siguiente = siguiente.sig;
            }

            if (repetido) {
                if (previo == null) {
                    head = siguiente;
                } else {
                    previo.sig = siguiente;
                }
            } else {
                previo = actual;
            }

            actual = siguiente;
        }
    }

    public void recorrer() {
        Nodo actual = head;
        
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
