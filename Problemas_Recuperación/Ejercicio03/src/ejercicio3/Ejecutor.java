/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio3;

public class Ejecutor {

    public static void main(String[] args) {

        int op;
        Metodos mylista = new Metodos();

        do {
            op = mylista.menu();
            switch (op) {
                case 1 ->
                    mylista.insertar();
                case 2 -> {
                    mylista.recorrer();
                    System.out.println("null");
                }
                case 3 ->
                    mylista.eliminarNumeroMayor();
                default -> {
                    System.out.println("Adiós");
                    op = 0;
                }
            }

        } while (op != 0);
    }
}
