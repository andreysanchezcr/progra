package progra2;

import java.awt.Font;
import java.awt.Graphics;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.JPanel;
import progra2.Principal;

public class PanelDibujo extends JPanel {
 
 Principal p;
 ArrayList<Date> fechas=new ArrayList<Date>();
 int x=150;
 int y=20;
 
 public PanelDibujo(Principal prin){
  p=prin;
 }
 
 public void paintComponent(Graphics g){
  super.paintComponents(g);
  g.setFont(new Font("Verdana",Font.BOLD,12));
  for(int i=0;i<fechas.size();i++){
   SimpleDateFormat formato=new SimpleDateFormat("dd/MM/yyyy");
   g.drawString(""+formato.format(fechas.get(i)), x, y*(i+1));
  }
 }
 
 public void ordenarAscendente(){
  for(int i=0;i<fechas.size();i++){
   for(int j=0;j<fechas.size();j++){
    if(fechas.get(i).before(fechas.get(j))){
     Date aux=fechas.get(i);
     fechas.set(i, fechas.get(j));
     fechas.set(j, aux);
    }
   }
  }
 }
 
 public void ordenarDescendente(){
  for(int i=0;i<fechas.size();i++){
   for(int j=0;j<fechas.size();j++){
    if(fechas.get(i).after(fechas.get(j))){
     Date aux=fechas.get(i);
     fechas.set(i, fechas.get(j));
     fechas.set(j, aux);
    }
   }
  }
 }
 
 public void agregarFecha(int dia, int mes, int año){
  Date nuevafecha=new Date((año-1900),(mes-1),dia);
  fechas.add(nuevafecha);
 }
}