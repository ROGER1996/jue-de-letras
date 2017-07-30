package src;

/**
* Rivera maquera carlos joel
 *  roger franco ortiz
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

//nos muestra los botones que jala la ventanainicial
public class Casillas extends JFrame implements ActionListener
{
	private Tablero t;
	private JButton[][] botones;
	private ImageIcon[] imagenes;
	private static int sw;
	private static int a, b, ii, jj;
	private int dimen;
        private int cate;
        
	
	
       
	
    private void cerrar(java.awt.event.WindowEvent evt) {                   
        new VentanaInicial().setVisible(true);
    }    
}