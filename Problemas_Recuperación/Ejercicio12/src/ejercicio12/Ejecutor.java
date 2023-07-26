/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio12;

public class Ejecutor {

    public static void main(String[] args) {
        int op, num;
        Metodos myArbol = new Metodos();
        do {
            op = myArbol.menu();
            switch (op) {
                case 1 -> {
                    myArbol.insertar();
                }
                case 2 -> {
                    myArbol.recorrer(myArbol.head);
                    System.out.println("null");
                }
                case 3 -> {
                    myArbol.particionar();
                    
                    System.out.println("Listas Creadas");
                    System.out.println("Lista uno");
                    myArbol.recorrer(myArbol.head01);
                    System.out.println("null");
                    
                    System.out.println("Lista dos");
                    myArbol.recorrer(myArbol.head02);
                    System.out.println("null");
                }
                default -> {

                }
            }
        } while (op != 0);
    }
}
