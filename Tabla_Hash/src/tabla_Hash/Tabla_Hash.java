/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tabla_Hash;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Tabla_Hash {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Metodos tablaHash = new Metodos();
        int opc;

        do {
            opc = tablaHash.menu();
            switch (opc) {
                case 1 -> {
                    System.out.print("Ingrese un nombre: ");
                    String nombre = tablaHash.entrada.next().toUpperCase();
                    tablaHash.insertar(nombre);
                }
                case 2 -> {
                    System.out.printf("%s\n", tablaHash.presentar());
                }
            }
        } while (opc != 0);
    }
    
}
