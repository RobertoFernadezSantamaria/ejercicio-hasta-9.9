/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg9.pkg7;

/**
 *
 * @author roberto.fersan
 */
import java.util.Comparator;
public class Compara_nombres implements Comparator{

    @Override
    public int compare(Object ob1, Object ob2) {
        return ((Socio)ob1).edad() - ((Socio)ob2).edad();
        
        


    }
   
    
}
