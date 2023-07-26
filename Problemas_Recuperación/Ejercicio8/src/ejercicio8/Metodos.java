/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio8;

import java.util.Random;
import java.util.Scanner;

/*
    Implemente una función que suprima de la lista todos los elementos 
    mayores que un número dado como límite. Por ejemplo, si la lista 
    inicial es
*/

public class Metodos {

    Nodo head;
    Scanner entrada;

    public Metodos() {
        this.head = null;
        this.entrada = new Scanner(System.in);
    }

    public int menu (){
        System.out.println("\nInsertar                     [1]: ");
        System.out.println("Recorrer                     [2]: ");
        System.out.println("Suprimir los números mayores [3]: ");
        System.out.println("Salir                        [0]:");
        return entrada.nextInt();         
    }
    
    public boolean listaVacia(Nodo aux) {
        return (aux == null);
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
        }
    }
    
    public void recorrer(Nodo aux, int limite) {
        Nodo actual = aux;
        while (actual != null) {
            if (actual.dato < limite) {
                System.out.print(actual.dato + " -> ");
            }
            actual = actual.sig;
        }
    }
    
    public boolean numMayor(int num, int dato) {
        return (num>dato);
    }
    
    public void recorrer(Nodo aux) {
        Nodo actual = aux;
        while (actual != null) {
            System.out.print(actual.dato + " -> ");
            actual = actual.sig;
        }
    }
}
