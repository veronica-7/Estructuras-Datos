/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio10;

import java.util.Scanner;

/*
    Diseñar un algoritmo que permita ordenar una lista lineal sencilla 
    utilizando el método burbuja.
*/

public class Metodos {

    Nodo head;
    Scanner entrada;

    public Metodos() {
        this.head = null;
        this.entrada = new Scanner(System.in);
    }

    public int menu (){
        System.out.println("\nInsertar            [1]: ");
        System.out.println("Recorrer            [2]: ");
        System.out.println("Ordenar Burbuja     [3]: ");
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
        } else {
            Nodo actual = head;

            while (actual.sig != null) {
                actual = actual.sig;
            }
            actual.sig = nuevo;
        }
    }

    public void burbuja() {
        
        if (listaVacia()) {
            System.err.println("Lista vacía");
            return;
        }
        
        Nodo listComp, nPeque;
        int auxiliar;

        for (listComp = head; listComp.sig != null; 
                listComp = listComp.sig) {
            
            Nodo minimo = listComp;
            
            for (nPeque = listComp.sig; 
                    nPeque != null; nPeque = nPeque.sig) {
                
                if (nPeque.dato < minimo.dato) {
                    minimo = nPeque;
                } 
                
            }
            
            if (minimo != listComp) {
                auxiliar = listComp.dato;
                listComp.dato = minimo.dato;
                minimo.dato = auxiliar;
            }
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
