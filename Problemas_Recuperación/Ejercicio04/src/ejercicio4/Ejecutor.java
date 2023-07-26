/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio4;

public class Ejecutor {

    public static void main(String[] args) {
        
        int op;
        Metodos mylista = new Metodos();
        mylista.menu();
        do {
            op = mylista.menu();
            switch (op) {
                case 1 ->
                    mylista.insOrdenado(mylista.head);
                    
                case 2 ->
                    mylista.recorrer(mylista.head);
                    
                case 3 ->
                    mylista.insOrdenado(mylista.head2);                    
                    
                case 4 ->
                    mylista.recorrer(mylista.head2);
                    
                default -> {                    
                }
            }

        } while (op != 0);
    }
}
