/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio7;

public class Ejecutor {

    public static void main(String[] args) {

        Metodos m = new Metodos();
        int opc;

        do {
            opc = m.menu();
            switch (opc) {
                case 1 ->
                    m.insertar();
                case 2 -> {
                    m.recorrer();
                    System.out.println("null");
                }
                case 3 -> {
                    int n = m.verificarOrden();

                    if (n == 0) {
                        System.out.println("No está ordenada");
                    } else if (n == 1) {
                        System.out.println("Está ordenada ascendentemente");
                    } else {
                        System.out.println("Está ordenada descendentemente");
                    }
                }
                default -> {                    
                }
            }
        } while (opc != 0);
    }
}
