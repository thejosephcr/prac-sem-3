/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pilaspracsem3;

/**
 *
 * @author 
 */
public class Cola {
    private Nodo frente;
    private Nodo ultimo;
    private int largo;

    public Cola() {
        this.frente = null;
        this.ultimo = null;
        this.largo = 0;
    }
        
    public void encola(Nodo nuevoNodo){
        if(frente == null){  // significa que la cola esta vacia
            frente = nuevoNodo;
            ultimo = nuevoNodo;                    
        } else if(nuevoNodo.getDato().isDiscapacidad()){
            nuevoNodo.setAtras(frente);
            frente = nuevoNodo;
        }
        else{
            ultimo.setAtras(nuevoNodo);
            ultimo=nuevoNodo;
        }
        largo++;
    }
    
    public Nodo atiende(){
        Nodo aux = frente;
        if(frente!=null){
            frente=frente.getAtras();
            aux.setAtras(null);
            largo--;
        }
        return aux;
    }
    
    public boolean encuentra(Persona referencia){
        if(frente != null){
            if (ultimo.getDato().getCedCliente().equals(referencia.getCedCliente())){
                return true;
            }else{
                Nodo aux=frente;
                while(aux!=null){
                    if(aux.getDato().getCedCliente().equals(referencia.getCedCliente())){
                        return true;
                    }
                    aux=aux.getAtras();
                }
            }
        }
        return false;
    }
    
    public String imprimir(){
        String s="";
        Nodo aux=frente;
        while(aux!=null){
            s+=aux.getDato().getNombreCliente()+"\n";
            aux=aux.getAtras();
        }
        return s;
    }
}
