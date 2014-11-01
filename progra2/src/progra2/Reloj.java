package progra2;

import java.util.Calendar; 
import java.util.Date; 
import java.util.GregorianCalendar; 
import javax.swing.JLabel; 

public class Reloj extends JLabel implements Runnable { 

    private String dia, mes, año, hora, minutos, segundos; 
    private Calendar calendario = new GregorianCalendar(); 
    Thread hilo; 


    public Reloj( int x, int y, int p, int p1) {  
        this.setBounds(x, y, p, p1); // posicion del reloj y el calendario
        hilo = new Thread(this); 
        hilo.start(); // comienza a ejecutarse el hilo

        } 

    
    @ Override 
    public void run() { 
        Thread hiloActual = Thread.currentThread(); 
        while (hiloActual == hilo) { 
            try { 
                actualiza(); 
                int mesE = Integer.valueOf(mes) + 1; 
                setText("<html><center>" + dia + " / " + mesE + " / " + año + "<br>" + hora + ":" + minutos + ":" + segundos); 
                Thread.sleep(1000); 
            } catch (InterruptedException ex) { 
                System.out.println(ex.getMessage()); 
            } 
        } 
    } 

    /**
     * Método que sirve para actualizar el reloj en tiempo real
     */
    public void actualiza() { 
        Date fechaHoraActual = new Date(); // guardara la fecha y hora actual 
        calendario.setTime(fechaHoraActual); //Proporciona la fecha y la hora actual segun el sistema
        
        hora = String.valueOf(calendario.get(Calendar.HOUR_OF_DAY)); // obtencion de la hora
        
        minutos = calendario.get(Calendar.MINUTE) > 9 ? "" + calendario.get(Calendar.MINUTE) : "0" 
                + calendario.get(Calendar.MINUTE); //obtencion de los minutos
        
        segundos = calendario.get(Calendar.SECOND) > 9 ? "" + calendario.get(Calendar.SECOND) : "0" 
                + calendario.get(Calendar.SECOND); // obtencion de los segundos
        
        dia = calendario.get(Calendar.DATE) > 9 ? "" + calendario.get(Calendar.DATE) : "0" 
                + calendario.get(Calendar.DATE); // optencion del día
        
        mes = calendario.get(Calendar.MONTH) > 9 ? "" + calendario.get(Calendar.MONTH) : "0" 
                + calendario.get(Calendar.MONTH); //optencion del mes 
        
        año = calendario.get(Calendar.YEAR) > 9 ? "" + calendario.get(Calendar.YEAR) : "0" 
                + calendario.get(Calendar.YEAR); // optencion del año
    } 
}

