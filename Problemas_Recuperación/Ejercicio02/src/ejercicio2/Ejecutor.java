/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2;

public class Ejecutor {

    public static void main(String[] args) {

        Metodos m = new Metodos();

        System.out.println("Cuántos números desea que se creen?");
        int num = m.entrada.nextInt();

        for (int i = 0; i < num; i++) {
            m.insertar();
        }

        System.out.println("Promedio: " + m.promedio());
        m.recorrer();
        System.out.println("null");
    }
}
