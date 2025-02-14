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
        tabla=  Arrays.copyOfRange(tabla, 1, tabla.length ); // hace una copia desde el principio + 1 hasta el final
        tabla[0] = num;
        return tabla;
    }
    Integer[] insercionFinal(int num){
        tabla = Arrays.copyOf(tabla, tabla.length + 1); // hice una tabla con la posicion + 1
                tabla[tabla.length-1] = num;
        return tabla;

        
    }
    Integer[] insercionlugar(int posicion, int num){
        
      System.arraycopy(tabla, posicion, tabla, tabla.length , tabla.length - posicion);
        
        
    }
    
    
    
    
}
