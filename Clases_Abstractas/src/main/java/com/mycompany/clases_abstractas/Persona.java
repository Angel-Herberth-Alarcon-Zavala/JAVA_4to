/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clases_abstractas;

/**
 *
 * @author L35103
 */
public abstract class Persona {
    protected String nombre;
    protected int DNI;
    protected float m_consumido;
    protected float m_a_pagar;
    protected String met_pago;

    public Persona(String nombre, int DNI, float m_consumido, String met_pago) {
        this.nombre = nombre;
        this.DNI = DNI;
        this.m_consumido = m_consumido;
        this.met_pago = met_pago;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }
    
    public abstract void CalcularPago();
    
    public abstract void Validacion();
    
    public String verInfo(){
        return "Nombre: "+this.nombre+
                "\nDNI: "+this.DNI+
                "\nMedio de pago: "+this.met_pago+
                "\nMonto consumido: "+this.m_consumido+
                "\nMonto a pagar: "+this.m_a_pagar;
    }
}
