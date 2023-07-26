/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1;

public class Ejecutor {

    public static void main(String[] args) {        
        
        Metodos m = new Metodos();
        int op;
        
        do {
            op = m.menu();
            switch (op) {
                case 1 -> m.insertar();
                case 2 -> {
                    m.recorrer();
                    System.out.println("null");
                }
                case 3 -> {
                    System.out.println("Número de la lista: ");
                    int n1 = m.entrada.nextInt();
                    System.out.println("Número a ingresar: ");
                    int n2 = m.entrada.nextInt();
                    System.out.println("PRIMERA LISTA");
                    m.recorrer();
                    System.out.println("null");
                    m.insertarNum(n1, n2);
                    System.out.println("SEGUNDA LISTA");
                    m.recorrer();
                    System.out.println("null");
                }
            }
        } while (op!=0);

        
    }
}
