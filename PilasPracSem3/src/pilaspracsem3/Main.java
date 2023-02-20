/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pilaspracsem3;

/**
 *
 * @author josep
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cola cola = new Cola();
        
        cola.encola(new Nodo(new Persona("123","Joseph",false)));
        cola.encola(new Nodo(new Persona("456","Naty",false)));
        cola.encola(new Nodo(new Persona("789","Bran",true)));
        
        System.out.println(cola.imprimir());
    }
    
}
