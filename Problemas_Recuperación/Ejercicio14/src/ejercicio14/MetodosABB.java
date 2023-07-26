/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio14;

import java.util.Scanner;

/*
    Escribir una función para calcular la altura de un árbol binario
 */

public class MetodosABB {

    Scanner entrada;
    Nodo raiz;

    public MetodosABB() {
        this.entrada = new Scanner(System.in);
        this.raiz = null;
    }

    public int menu() {
        System.out.println("");
        System.out.println("    << MENU PRINCIPAL >>");
        System.out.println("Insertar            [1]");
        System.out.println("Presentar           [2]");
        System.out.println("Altura              [3]");
        System.out.println("Salir               [0]");
        return entrada.nextInt();
    }

    public boolean arbolVacio(Nodo actual) {
        return (actual == null);
    }

    public int altura(Nodo actual) {
        if (actual == null) {
            return -1;
        }

        int altIzq = altura(actual.izq);
        int altDer = altura(actual.der);

        return Math.max(altIzq, altDer) + 1;
    }

    public Nodo insertar(int num, Nodo actual) {
        if (arbolVacio(actual)) {
            Nodo nuevo = new Nodo(num);
            return nuevo;
        } else {
            if (num > actual.dato) {
                actual.der = insertar(num, actual.der);
            } else {
                actual.izq = insertar(num, actual.izq);
            }
        }

        return actual;
    }

    public void inOrden(Nodo actual) {
        if (actual != null) {
            inOrden(actual.izq);
            System.out.print(actual.dato + " ");
            inOrden(actual.der);
        }
    }
}
