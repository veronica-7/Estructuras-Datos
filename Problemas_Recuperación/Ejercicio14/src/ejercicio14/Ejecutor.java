/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio14;

public class Ejecutor {

    public static void main(String[] args) {
        int opc, numero;
        MetodosABB arbol = new MetodosABB();

        do {
            opc = arbol.menu();
            switch (opc) {
                case 1 -> {
                    System.out.println("Ingrese un numero:");
                    numero = arbol.entrada.nextInt();
                    arbol.raiz = arbol.insertar(numero, arbol.raiz);
                }
                
                case 2 -> {
                    System.out.println("InOrden:");
                    arbol.inOrden(arbol.raiz);
                    System.out.println("");
                }
                
                case 3 -> {
                    System.out.println("El arbol tiene una altura de: [" + 
                            arbol.altura(arbol.raiz) + "]");
                }
                
                default -> {
                }
            }
        } while (opc != 0);
    }

}
