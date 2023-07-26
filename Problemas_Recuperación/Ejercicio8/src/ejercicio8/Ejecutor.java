/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio8;

public class Ejecutor {

    public static void main(String[] args) {

        Metodos m = new Metodos();
        int opc;
        
        do {
            opc = m.menu();
            switch (opc) {
                case 1 -> m.insertar();
                
                case 2 -> {
                    m.recorrer(m.head);
                    System.out.println("null");
                }
                
                case 3 -> {
                    int num;
                    
                    System.out.println("Ingrese el límite:");
                    num = m.entrada.nextInt();
                    
                    m.recorrer(m.head, num);
                    System.out.println("null");
                }
                
                default -> {                    
                }
            }
        } while (opc!=0);
    }    
}
