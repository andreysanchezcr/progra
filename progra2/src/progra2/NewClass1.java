/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progra2;

/**
 *
 * @author ricardo
 */
public class NewClass1 {
    public static void main(String[] args){
        serializar g = new serializar();
        Object o = new Object();
        o="Hola";
        g.guardar(o, "hola.bin");
        
        Object h=g.leer("hola.bin");
        System.out.println("sddfsaf"+h);
    }
    
}
