/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progra2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author ricardo
 */

public class VE extends JFrame {
    public static void main(String[] args){
        VE ventana = new VE();
        ventana.setBounds(100, 100, 100, 100);
        ventana.setVisible(true);
    }
    VE(){
        super();
        JPanel panel =new JPanel();
        JButton jla = new JButton(); 
        jla.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("ESta aquiiii");
            }
        });
        panel.add(jla);
        this.add(panel);
        
        
    }

    

}
