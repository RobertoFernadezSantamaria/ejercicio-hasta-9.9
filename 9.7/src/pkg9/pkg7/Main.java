/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg9.pkg7;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;

/**
 *
 * @author roberto.fersan
 */
// terminado
public class Main {

    public static void main(String[] args) {
        Socio[] ls = new Socio[3];
        Socio s1 = new Socio(21, "Roberto", "12-01-2019");
        ls[0] = s1;
        Socio s2 = new Socio(19, "Laura", "15-01-2020");
        ls[1] = s2;
        Socio s3 = new Socio(18, "Pepe", "15-04-2005");
        ls[2] = s3;
        
        System.out.println("Ordenado de forma alfabetica");
        Arrays.sort(ls);
        System.out.println(Arrays.toString(ls));

        System.out.println("Comparar edades");
        Comparator c1 = new Compara_nombres();
        Comparator c2 =  c1.reversed();
        Arrays.sort(ls ,c2);
        System.out.println(Arrays.toString(ls));
                

    }

}
