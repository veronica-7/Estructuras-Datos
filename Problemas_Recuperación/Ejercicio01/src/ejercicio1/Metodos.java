/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1;

import java.util.Scanner;

/*
    Crear una función que permita insertar un elemento inmediatamente 
    después de un número dado que se encuentre en la lista.
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
        System.out.println("\nInsertar                       [1]: ");
        System.out.println("Recorrer                       [2]: ");
        System.out.println("Insertar después de un número  [3]: ");
        System.out.println("Salir               [0]:");
        return entrada.nextInt();
    }

    public boolean listaVacia() {
        return (head == null);
    }

    public void insertar() {
        int num;
        System.out.print("Ingrese número: ");
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

    public void recorrer() {
        Nodo actual = head;
        while (actual != null) {
            System.out.print(actual.dato + " -> ");
            actual = actual.sig;
        }
    }
    
    public void insertarNum(int num, int num2) {
        Nodo actual = head;
        while (actual != null) {
            if (actual.dato == num) {
                Nodo nuevo = new Nodo(num2);
                nuevo.sig = actual.sig;
                actual.sig = nuevo;
                break;
            }            
            actual = actual.sig;
        }
        if (actual == null) {
            System.err.println("NO SE ENCONTRÓ EL NÚMERO");
        }
    }
}
