/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.upeu.poo.arrayx;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Datos
 */
public class ArrayExample {
    static List<Persona> persona=new ArrayList<>();
    
    public static void main(String[] args) {

           Persona P=new Persona();
           P.setdni("73370821");
           P.setNombre("Heiner");
           P.setEdad(24);
           persona.add(P);
           P=new Persona();
           
           P.setDn("7446363");
           P.setNombre("Heiner");
           P.setEdad(24);
           
           System.out.println("DNI/t/tNombre/t/tEdad");
           for (Persona px : persona);
           System.out.println("");
           
    }
        
    }

