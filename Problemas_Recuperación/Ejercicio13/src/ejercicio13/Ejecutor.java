/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio13;

public class Ejecutor {

    public static void main(String[] args) {

        Metodos m = new Metodos();
        int op;

        do {
            op = m.menu();
            switch (op) {
                case 1 ->
                    m.insertar();
                    
                case 2 -> {
                    m.recorrer();
                    System.out.println("null");
                }
                
                case 3 -> {
                    m.eliminarRepetidos();
                }
                
                default -> {
                }
            }
        } while (op != 0);
    }

}
