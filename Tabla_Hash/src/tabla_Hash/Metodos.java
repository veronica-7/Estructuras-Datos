/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tabla_Hash;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Metodos {
    Scanner entrada;
    Nodo[] tabla;

    public Metodos() {
        this.entrada = new Scanner(System.in);
        this.tabla = new Nodo[10];
    }

    public int menu() {
        System.out.println("\n       >> Menú <<");
        System.out.println("Insertar            [1]: ");
        System.out.println("Recorrer            [2]: ");
        System.out.println("Salir               [0]:");
        return entrada.nextInt();
    }
    
    // saca el indice de la casilla.
    private int sumaAscii(String cadena) {
        int totalSuma = 0;
        for (int i = 0; i < cadena.length(); i++) {
            totalSuma = totalSuma + (int) cadena.charAt(i);
        }
        return totalSuma % 10;
    }
    
    // este motodo nos permite insertar los elementos en la Tabla Hash.
    public void insertar(String cadena) {
        int indice = sumaAscii(cadena);
        Nodo nuevo = new Nodo(cadena);

        if (tabla[indice] == null) {
            tabla[indice] = nuevo; // crea un nuevo nodo segun el indice.
            System.out.printf("Almacenado en la casilla %d de la tabla: \n", indice+1);
        } else {
            Nodo actual = tabla[indice];
            while (actual.sig != null) {
                actual = actual.sig;
            }
            actual.sig = nuevo;
            System.out.printf("Almacenado en la casilla %d de la tabla: \n", indice+1);
        }
    }
    
    public String recorrer() {
        String cadena = String.format("\n¡ T A B L A  H A S H !\n");
        
        for (int i = 0; i < tabla.length; i++) {
            if (tabla[i] == null) {
                cadena = String.format("%s\n| Posición %d | Vacía ->", cadena, i+1);
                
            } else {
                Nodo actual = tabla[i];
                cadena = String.format("%s\n| Posición %d |", cadena, i+1);

                while (actual != null) {
                    cadena = String.format("%s %s ->", cadena, actual.cadena);
                    actual = actual.sig;
                }
            }
            
            cadena = String.format("%s null\n", cadena);
        }
        
        return cadena;
    }
}
