/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio5;

/**
 *
 * @author D E L L
 */
public class Ejecutor {

    public static void main(String[] args) {
        
        int opc;
        Metodos mylista = new Metodos();
        mylista.menu();
        do {
            opc = mylista.menu();
            switch (opc) {
                case 1 ->
                    mylista.insertar();
                    
                case 2 ->
                    mylista.recorrer(mylista.head);
                    
                case 3 ->
                    mylista.crearListaNumRepetidos();                    
                    
                case 4 ->
                    mylista.recorrer(mylista.head2);
                    
                default -> {                    
                }
            }

        } while (opc != 0);        
    }    
}
