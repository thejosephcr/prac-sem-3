/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pilaspracsem3;

/**
 *
 * @author joseriveratencio
 */
public class Persona {
    private String nombreCliente;
    private String cedCliente;
    private boolean discapacidad; 

    public Persona(String cedCliente, String nombreCliente, boolean discapacidad) {
        this.nombreCliente = nombreCliente;
        this.cedCliente = cedCliente;
        this.discapacidad = discapacidad;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public String getCedCliente() {
        return cedCliente;
    }

    public boolean isDiscapacidad() {
        return discapacidad;
    }
    
}
