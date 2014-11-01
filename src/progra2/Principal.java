package progra2;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class Principal extends JApplet {
 
 PanelDibujo pd;
 JTextField txtdia,txtmes,txtaño;
 JButton guardar;
 JRadioButton ascendente;
 JRadioButton descendente;
 
 public void init(){
  JPanel pdatos=new JPanel();
  pdatos.add(new JLabel("Fecha:"));
  txtdia=new JTextField(3);
  txtmes=new JTextField(3);
  txtaño=new JTextField(4);
  pdatos.add(txtdia);
  pdatos.add(new JLabel("/"));
  pdatos.add(txtmes);
  pdatos.add(new JLabel("/"));
  pdatos.add(txtaño);
  guardar=new JButton("Guardar");
  guardar.addActionListener(new ActionListener(){


   @Override
   public void actionPerformed(ActionEvent e) {
    pd.agregarFecha(Integer.parseInt(txtdia.getText()),Integer.parseInt(txtmes.getText()),Integer.parseInt(txtaño.getText()));
    if(ascendente.isSelected()){
     pd.ordenarAscendente();
    }else{
     if(descendente.isSelected()){
      pd.ordenarDescendente();
     }
    }
    pd.repaint();
    repaint();
   }
   
  });
  
  pdatos.add(guardar);
  
  add(pdatos,BorderLayout.NORTH);
  
  JPanel porden=new JPanel();
  ascendente=new JRadioButton("Ascendente");
  ascendente.setSelected(true);
  descendente=new JRadioButton("Descendente");
  ButtonGroup grupo=new ButtonGroup();
  grupo.add(ascendente);
  grupo.add(descendente);
  
  porden.add(ascendente);
  porden.add(descendente);
  
  add(porden,BorderLayout.SOUTH);
  
  pd=new PanelDibujo(this);
  add(pd);
 }
}



