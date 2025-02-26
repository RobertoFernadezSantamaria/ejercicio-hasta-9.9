/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg9.pkg7;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

/**
 *
 * @author roberto.fersan
 */
public class Socio implements Comparable{
    
        int id;
        String nombre;
        LocalDate fechanacimiento;
        
        public Socio (int id, String nombre, String fechanacimiento){
            this.id = id;
            this.nombre = nombre;
            DateTimeFormatter f = DateTimeFormatter.ofPattern("dd-MM-yyyy");
            this.fechanacimiento = LocalDate.parse(fechanacimiento, f);
            
        }
        int edad(){
            return (int)fechanacimiento.until(LocalDate.now(),ChronoUnit.YEARS);
        }
// el de aqui es del ejercicio 9.7
    @Override
//    public int compareTo(Object ob) {
//        
//      int resultado;
//      Socio otroSocio = (Socio) ob;
//      if (id < otroSocio.id){
//          resultado = -1;
//      }else if (id > otroSocio.id){
//          resultado = -1;
//      }else{
//          resultado = 0;
//      }
//      return resultado;
//            
//    }
    // este es del ejercicio 9.8
    public int compareTo(Object otro) {
        
      return nombre.compareTo(((Socio) otro).nombre);
    }
    
        @Override
    public String toString(){
        return "ID " + id + " Nombre: " + nombre + " Edad: " + edad() + "\n" ;
    }
  
    
        
        
        
    }
        
       
        

