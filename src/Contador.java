/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Kenneth Martinez
 */
public class Contador {
    private int contPd;
    private int contAm;
    private int contMe;
    private int contCc;
    private int contCr;

    
    public Contador(){
   
    }

    public String asignar(String prioridad){
        String temp = "";
        if("Persona con discapacidad".equals(prioridad)){
           
            temp = "Pd" + Integer.toString(contPd);
            contPd ++;
        }
        if("Adulto Mayor".equals(prioridad)){
            temp = "Am" + Integer.toString(contAm);
            contAm ++;
        }
        if("Mujer embarazada".equals(prioridad)){
            temp = "Me" + Integer.toString(contMe);
            contMe ++;
        }
        if("Cliente corporativo".equals(prioridad)){
            temp = "Cc" + Integer.toString(contCc);
            contCc ++;
        }
        if("Cliente Regular".equals(prioridad)){
            temp = "Cr" + Integer.toString(contCr);
            contCr ++;
        }
        System.out.println(contPd);
        System.out.println(contAm);
        System.out.println(contMe);
        System.out.println(contCc);
        System.out.println(contCr);
        return temp;
    }
}
