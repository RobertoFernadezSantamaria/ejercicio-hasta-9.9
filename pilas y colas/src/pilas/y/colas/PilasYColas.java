/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pilas.y.colas;

/**
 *
 * @author roberto.fersan
 */
public class PilasYColas {

    public static void main(String[] args) {
        Lista p1 = new Lista();
       
        Lista p2 = new Lista();
        p1.insertarInicio(5);
        p1.insercionFinal(4);
        p1.insertarInicio(6);
        p1.Mostrar();
        p1.insertar(1, 7);
        p1.Mostrar();
        p1.eliminar(0);
        p1.Mostrar();
        p1.get(5);
        p1.get(2);
        System.out.println( p1.buscar(5));
        System.out.println(p1.cantidad());
        
    }

}
