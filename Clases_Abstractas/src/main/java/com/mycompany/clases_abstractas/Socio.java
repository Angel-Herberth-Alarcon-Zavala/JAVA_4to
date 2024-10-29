/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clases_abstractas;

import java.util.Scanner;

/**
 *
 * @author L35103
 */
public class Socio extends Persona {
    private String codigo;
    private int antiguedad;

    public Socio(String codigo, int antiguedad, String nombre, int DNI, float m_consumido, String met_pago) {
        super(nombre, DNI, m_consumido, met_pago);
        this.codigo = codigo;
        this.antiguedad = antiguedad;
        CalcularPago();
    }
   
       public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }
    
    @Override
    public String verInfo(){
        return super.verInfo()+"\nCódigo: "+this.codigo+
                "\nAntiguedad: "+this.antiguedad;
    }
    
    @Override
    public void CalcularPago() {
        if (this.antiguedad <= 5) {this.m_a_pagar = this.m_consumido*0.4f;}
        else if (this.antiguedad > 10) {this.m_a_pagar = this.m_consumido*0.2f;}
        else {this.m_a_pagar = this.m_consumido *0.3f;}
    }
    
    @Override
    public void Validacion() {
        Scanner p = new Scanner(System.in);
        if (this.antiguedad < 0) {System.out.println("Dato en antiguedad eróneo. Ingrese nuevo dato:"); this.antiguedad = p.nextInt();}
    }
    
    
}
