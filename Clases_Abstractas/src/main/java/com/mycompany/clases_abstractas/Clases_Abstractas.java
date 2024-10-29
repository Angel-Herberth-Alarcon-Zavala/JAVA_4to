/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.clases_abstractas;

import com.mycompany.clases_abstractas.NoSocio;
import com.mycompany.clases_abstractas.Persona;
import com.mycompany.clases_abstractas.Socio;
import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author L35103
 */

public static Persona crearPersona(int opcion) {
    Scanner p = new Scanner(System.in);
    System.out.println("Ingrese el nombre de la persona: ");
    String nombre = p.next();
    System.out.println("Ingrese el DNI: ");
    int DNI = p.nextInt();
    System.out.println("Ingrese el monto consumido: ");
    float m_consum = p.nextFloat();
    System.out.println("Ingrese el método de pago: ");
    String met_pago = p.next();
    if (opcion == 1) {
            System.out.println("Ingrese el codigo del socio: ");
            String codigo = p.next();
            System.out.println("Ingrese años de antiguedad");
            int antiguedad = p.nextInt();
}
    else  {
            System.out.println("Ingrese la cantida de veces que asistió (incluido esta): ");
            int num_veces = p.nextInt();
            }

}

public class Clases_Abstractas {

    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        boolean fin = true;
        while (fin){
            System.out.println("Ingrese el tipo de persona: ");
            System.out.println("1. Socio");
            System.out.println("2. No Socio");        
            System.out.println("3. Salir");        
            int opcion = p.nextInt();
            switch (opcion){
case 1:
case 2:
case 3: fin = false;
break;
            }
        for (Persona )
        }
        Persona s1 = new Socio("SOC-01",4,"Juan", 4025, 1000, "Tarjeta crédito");
        Persona s2 = new Socio("SOC-01",8,"Pedro", 3026, 600, "Tarjeta Débito");
        Persona s3 = new Socio("SOC-01",14,"Juana", 2002, 200, "Efectivo");
        Persona s4 = new Socio("SOC-01",-2,"Juan", 5016, 100, "Yape");
        System.out.println(s1.verInfo());
        
        LinkedList <Persona> listaPersona =
        Persona n1 = new NoSocio(2, "Roberto", 5314, 500, "Tarjeta crédito");
        Persona n2 = new NoSocio(2, "Roberto", 5314, 500, "Tarjeta crédito");
        Persona n3 = new NoSocio(2, "Roberto", 5314, 500, "Tarjeta crédito");
        Persona n4 = new NoSocio(2, "Roberto", 5314, 500, "Tarjeta crédito");
    }
}
