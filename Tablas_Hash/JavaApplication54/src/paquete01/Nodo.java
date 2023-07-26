/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete01;

public class Nodo {
    String dato;
    Nodo sig;
    Nodo ant;
    
    public Nodo (String d){
        this.dato=d;
        this.sig=null;       
        this.ant=null;       
    } 
}