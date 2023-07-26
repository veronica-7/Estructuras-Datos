/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio7;

import java.util.Scanner;

/*
    Escribe una función, que devuelve 1 si una lista dada está ordenada 
    ascendentemente de principio a final, 2 si está ordenada 
    descendentemente, o 0 si no está ordenada de ninguna forma.
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
        System.out.println("\nInsertar            [1]: ");
        System.out.println("Recorrer            [2]: ");
        System.out.println("Comprobar           [3]: ");
        System.out.println("Salir               [0]:");
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
            tail = nuevo;
            head.ant = null;
        } else {
            Nodo actual = head;

            while (actual.sig != null) {
                actual = actual.sig;
            }
            nuevo.ant = actual;
            actual.sig = nuevo;
            tail = nuevo;
            tail.ant = nuevo.ant;
            tail.sig = nuevo.sig;
        }
    }
      
    public int verificarOrden() {
        if (ascendente()) {
            return 1;
        } else if (descendente()) {
            return 2;
        }
        return 0;
    }
    
    public boolean ascendente() {
        Nodo actual = head;
        while (actual.sig != null) {
            if (actual.dato > actual.sig.dato) {
                return false;
            }
            actual = actual.sig;
        }
        return true;
    }

    public boolean descendente() {
        Nodo actual = head;
        while (actual.sig != null) {
            if (actual.dato < actual.sig.dato) {
                return false;
            }
            actual = actual.sig;
        }
        return true;
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
