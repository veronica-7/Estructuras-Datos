/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tabla_Hash;

/**
 *
 * @author Usuario
 */
public class Nodo {
    String cadena;
    Nodo sig;
    
    public Nodo (String d){
        this.cadena = d.toUpperCase();
        this.sig = null;             
    } 

    public void setDato(String dato) {
        this.cadena = dato;
    }

    public void setSig(Nodo sig) {
        this.sig = sig;
    }

    public String getDato() {
        return cadena;
    }

    public Nodo getSig() {
        return sig;
    }
    
}
