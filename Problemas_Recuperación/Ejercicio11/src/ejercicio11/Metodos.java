/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio11;

import java.util.Scanner;

/*
    Diseñar un algoritmo que permita eliminar n número de nodos a partir 
    de la posición x en una lista sencilla lineal.
 */

public class Metodos {

    Nodo head;
    Scanner entrada;
    int cont;

    public Metodos() {
        this.head = null;
        this.entrada = new Scanner(System.in);
        this.cont = 0;
    }

    public int menu() {
        System.out.println("\nInsertar                      [1]: ");
        System.out.println("Recorrer                      [2]: ");
        System.out.println("Eliminar desde x posición     [3]: ");
        System.out.println("Salir        [0]:");
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

    public void eliminarDesdePosicion() {
        System.out.print("Ingrese la posición: ");
        int posicion = entrada.nextInt();

        if (posicion > cont) {
            System.out.println("La posición no existe");
            return;
        }
        
        int contador = 0;
        
        if (listaVacia()) {
            System.out.println("");
            System.err.println("Lista Vacia");
        } else {
            Nodo actual = head;
            while (contador != posicion) {
                actual = actual.sig;
                contador++;
            }

            if (contador == 0) {
                head.sig = null;
                head = null;
            } else {
                actual = actual.ant;
                actual.sig = null;
                actual = null;
            }

            System.out.println("Nodos eliminados");
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
