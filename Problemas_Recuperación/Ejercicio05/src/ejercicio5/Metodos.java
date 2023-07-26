/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio5;

import java.util.Scanner;

/*
    Escribe una función que dada una lista L devuelva otra lista R 
    conteniendo los elementos repetidos de L. Por ejemplo, si L almacena 
    los valores 5, 2, 7, 2, 5, 5, 1, debe construirse una lista R con los
    valores 5, 2. Si en L no hay elementos repetidos, R será la lista vacía.
*/

public class Metodos {

    Nodo head;
    Nodo head2;
    Nodo tail2;
    int cont;
    Scanner entrada;

    public Metodos() {
        this.head = null;
        this.head2 = null;
        this.tail2 = null;
        this.entrada = new Scanner(System.in);
        this.cont = 0;
    }
    
    public boolean listaVacia(Nodo aux) {
        return (aux == null);
    }
    
    public int menu() {
        System.out.println("\nInsertar lista uno  [1]: ");
        System.out.println("Recorrer lista uno  [2]: ");
        System.out.println("Crear lista dos     [3]: ");
        System.out.println("Recorrer lista dos  [4]: ");
        System.out.println("Salir               [0]:");
        return entrada.nextInt();
    }

    public void insertar() {
        int num;
        System.out.println("Ingrese un número:");
        num = entrada.nextInt();
        Nodo nuevo = new Nodo(num);
        if (listaVacia(head)) {
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

    public void crearListaNumRepetidos() {
        Nodo actual = head;
        while (actual != null) {
            int num = numRepetidos(actual.dato);
            if (num != -1) {
                Nodo nuevo = new Nodo(num);
                if (listaVacia(head2)) {
                    head2 = nuevo;
                    tail2 = nuevo;
                } else {
                    if (num != tail2.dato) {
                        tail2.sig = nuevo;
                        tail2 = tail2.sig;
                    }
                }
            }
            actual = actual.sig;
        }
    }

    public int numRepetidos(int num) {
        Nodo actual = head;
        int cont = 0;
        while (actual != null) {
            if (num == actual.dato) {
                cont++;
            }
            actual = actual.sig;
        }
        if (cont > 1) {
            return num;
        }
        return -1;
    }
    
    public void recorrer(Nodo aux) {
        Nodo actual = aux;
        while (actual != null) {
            System.out.print(actual.dato + " -> ");
            actual = actual.sig;
        }
    }
}
