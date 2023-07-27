/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete01;

import java.util.Scanner;

public class Metodos {
    
    Scanner entrada;
    Nodo[] lista;

    public Metodos() {
        this.entrada = new Scanner(System.in);
        this.lista = new Nodo[10];
    }

    public int menu() {
        System.out.println("\nInsertar            [1]: ");
        System.out.println("Recorrer            [2]: ");
        System.out.println("Salir               [0]:");
        return entrada.nextInt();
    }

    public int sumarCaracteres(String texto) {
        //char[] caracteres = texto.toCharArray();
        int suma = 0;

        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);
            int ascii = (int) c;
            suma += ascii;
        }

        return suma %= 10;
    }

    public void llenarTabla(String nombre) {
        int posición = sumarCaracteres(nombre);
        Nodo nuevo = new Nodo(nombre);

        if (lista[posición] == null) {
            lista[posición] = nuevo;
        } else {
            nuevo.sig = lista[posición];
            lista[posición] = nuevo;
        }
        
        System.out.println("Nombre ingresado correctamente en la posición: " + posición);
    }

    public String recorrer() {
        String cadena = String.format("TABLA HASH\n");
        
        for (int i = 0; i < lista.length; i++) {
            if (lista[i] == null) {
                cadena = String.format("%s\nPosición [%d]: Vacía", cadena, i);
            } else {
                Nodo actual = lista[i];
                cadena = String.format("%s\nPosición [%d]:\n\t", cadena, i);

                while (actual != null) {
                    cadena = String.format("%s -> %s", cadena, actual.dato);
                    actual = actual.sig;
                }
            }
            
            cadena = String.format("%s -> null\n", cadena);
        }
        
        return cadena;
    }
}