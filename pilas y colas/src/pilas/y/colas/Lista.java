/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pilas.y.colas;

import java.util.Arrays;

public class Lista {

    Integer[] tabla;

    Lista() {
        this.tabla = new Integer[0];

    }
    int cantidad (){
        
        return tabla.length;
    }
    Integer[] insertarInicio(int num){
        tabla = Arrays.copyOf(tabla, tabla.length + 1); // Añado 1 mas al espacio 
        System.arraycopy(tabla, 0, tabla, 1, tabla.length-1); // hace una copia desde el principio + 1 hasta el final
        tabla[0] = num;
        return tabla;
    }
    Integer[] insercionFinal(int num){
        tabla = Arrays.copyOf(tabla, tabla.length + 1); // hice una tabla con la posicion + 1
                tabla[tabla.length-1] = num;
        return tabla;
        
    }
    void insertar(int posicion ,Integer nuevo){
        tabla = Arrays.copyOf(tabla, tabla.length + 1);
        System.arraycopy(tabla, posicion, tabla, posicion + 1, tabla.length - posicion - 1);
        // el arraycopy indica la tabla a partir de la posicion que quieres copiar y luego en la tabla donde quieres 
        // ponerlo y a partir de que posicion quieras ponerlo y cuantos quieres poner
        tabla[posicion] = nuevo;
    }     
    void eliminar(int indice){
        if (indice < 0 || indice >tabla.length){
            System.out.println("Ese indice no se puede hacer, pon otro indice ");
           
        }else{
            System.arraycopy(tabla, indice + 1, tabla, indice, tabla.length- indice -1);
            tabla = Arrays.copyOf(tabla, tabla.length -1);
        }
        
        
        
    }
    Integer get (int indice){
      Integer resultado = null;
      
      if (indice >= 0 && indice < tabla.length){
          resultado = tabla[indice];
          System.out.println(resultado);
      }else{
         System.out.println("No esta"); 
      }
        
      return resultado;
    }
    int buscar(Integer claveBusqueda){
        int indice = -1;
        for(int i = 0; i < tabla.length && indice == -1; i++){
            if (tabla[i].equals(claveBusqueda)){
                indice = i;
            }
                
        }
        return indice;
    }
    public int numeroElementos(){
        return tabla.length; 
    }
    
    void Mostrar (){
        System.out.println( Arrays.toString(tabla));
        
    }
    
    
}
