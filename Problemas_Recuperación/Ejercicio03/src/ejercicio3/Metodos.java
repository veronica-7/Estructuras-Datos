/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3;

import java.util.Scanner;

/*
    Implemente una función que para una lista dada, elimine el nodo que 
    tenga el valor mayor.
 */
public class Metodos {

    Nodo head;
    Nodo tail;
    Scanner entrada;

    public Metodos() {
        this.head = null;
        this.tail = null;
        this.entrada = new Scanner(System.in);
    }

    public int menu() {
        System.out.println("\nInsertar                [1]: ");
        System.out.println("Recorrer                [2]: ");
        System.out.println("Eliminar numero mayor   [3]: ");
        System.out.println("Salir                   [0]:");
        return entrada.nextInt();
    }

    public boolean listaVacia() {
        return (head == null);
    }

    public void insertar() {
        int num;
        System.out.println("Ingrese dato:");
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

    public int buscarMayor() {
        Nodo actual = head;
        int aux = actual.dato;
        while (actual.sig != null) {
            if (aux < actual.sig.dato) {
                aux = actual.sig.dato;
            }
            actual = actual.sig;
        }
        return aux;
    }

    public void eliminarNumeroMayor() {
        int num;
        num = buscarMayor();

        Nodo nuevo = new Nodo(num);

        if (listaVacia()) {
            System.err.println("No hay nada que eliminar");
        } else {
            if (num == head.dato) {
                if (head.sig == null) {
                    tail = null;
                }
                head = head.sig;
            } else {
                Nodo actual = head;
                while (actual.sig != null && actual.sig.dato != num) {
                    actual = actual.sig;
                }
                if (actual.sig == tail) {
                    tail = actual;
                }
                if (actual.sig != null) {
                    actual.sig = actual.sig.sig;
                } else {
                    System.err.println("No está :(");
                }

            }
        }
        System.out.println("Eliminado correctamente");
    }

    public void recorrer() {
        Nodo actual = head;
        while (actual != null) {
            System.out.print(actual.dato + " -> ");
            actual = actual.sig;
        }
    }
}
