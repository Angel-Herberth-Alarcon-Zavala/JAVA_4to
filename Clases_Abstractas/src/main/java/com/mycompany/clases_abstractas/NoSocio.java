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
public class NoSocio extends Persona{
    private int num_visitas;

    public NoSocio(int num_visitas, String nombre, int DNI, float m_consumido, String met_pago) {
        super(nombre, DNI, m_consumido, met_pago);
        this.num_visitas = num_visitas;
        CalcularPago();
    }

    public int getNum_visitas() {
        return num_visitas;
    }

    public void setNum_visitas(int num_visitas) {
        this.num_visitas = num_visitas;
    }
    
    @Override
    public String verInfo(){
        return super.verInfo()+"\nNúmero de visitas: "+this.num_visitas;
    }
    
    @Override
    public void CalcularPago(){
        if (this.num_visitas == 1) {this.m_a_pagar = this.m_consumido+250;}
        else if (this.num_visitas > 6) {this.m_a_pagar = this.m_consumido+100;}
        else {this.m_a_pagar = this.m_consumido +150;}
    }
    
    @Override
    public void Validacion() {
        Scanner p = new Scanner(System.in);
        if (this.num_visitas < 0) {System.out.println("Dato en antiguedad eróneo. Ingrese nuevo dato:"); this.num_visitas = p.nextInt();}
    }
}
