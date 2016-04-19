package boletin25_1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author mgonzalezlorenzo
 */
public class Gui implements ActionListener {
    JFrame marco;
    JPanel panel;
    JButton boton;
    JLabel etiqueta;
    
    
    public void crearVentana(){
        marco = new JFrame();
        panel = new JPanel();
        boton = new JButton("Premer");
        etiqueta = new JLabel();
        
        marco.setSize(300, 200);
        
        boton.addActionListener(this);
        
        panel.add(boton);
        panel.add(etiqueta);
        marco.add(panel);
        
        marco.setVisible(true);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        etiqueta.setText("Premeches o boton");
    }
}
