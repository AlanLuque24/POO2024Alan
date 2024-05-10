/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.upeu.SysListasCRUD.modelo;

import lombok.Data;

@Data
public class Estudiante {

    
    String nombres;
    String apellidos;
    String carrera;
    int código;
    int ciclo;
    int grupo;
    
  
    public Estudiante() {
        
        this.nombres = null;
        this.apellidos = null;
        this.código = 0;
        this.ciclo = 0;
        this.grupo = 0;
        this.carrera = null;
        
        
    }

    public Estudiante(int código, String nombres, int ciclo, int grupo, String apellidos, String carrera) {
        
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.código = código;
        this.ciclo = ciclo;
        this.grupo = grupo;
        this.carrera = carrera;
       
    }
    
    public void setCódigo(int código){
        this.código = código;
    }
    
    public void setNombres(String nombres){
         this.nombres = nombres;
    }
    
    public void setCiclo(int ciclo){
        this.ciclo = ciclo;
    }
    
    public void setGrupo(int grupo){
        this.grupo = grupo;
    }
    
    public void setCarrera(String carrera){
        this.carrera = carrera;
    
    }
   
    public void setPromdio(String apellidos){
        this.apellidos = apellidos;
    }
    
        
    
    public int getCódigo(){
        return código;
    }
    public String getNombres(){
        return nombres;
    }
    public int getCiclo(){
        return ciclo;
    }
    public int getGrupo(){
        return grupo;
    }
    public String getCarrera(){
        return carrera;
    }
    public String getapellidos(){
        return apellidos;
    }
    
    
    
    public String getDatos(){
        return  
                "\nNombres: " + nombres +
                "\nApellidos: " + apellidos + 
                "\nCarrera: " + carrera +
                "\nCódigo: " + código +
                "\nCiclo: " + ciclo +
                "\nGrupo: " + grupo;
                
                
                
                
  }

}
    