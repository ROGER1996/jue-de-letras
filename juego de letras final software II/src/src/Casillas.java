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
        
	public Casillas(int dime, int cat)
	{
		dimen = dime;
                cate = cat;
                sw = 0;
		t = new Tablero(dimen);
		t.genAleatorio();
		initComponents(cate);
		configVentana();
	}
	
        //hecho
	public void configVentana()
	{
                setLocationRelativeTo(null);//para centrar la ventana.
                setTitle("Juego de Letras");//Titulo de la ventana.
                setSize(720,720);
                setLocationRelativeTo(null);
                //setLocation(new java.awt.Point(500,250));
                setExtendedState(JFrame.MAXIMIZED_BOTH);
                //setResizable(true);
		//para llamar a un metodo que contiene el evento de volver a mostrar la ventana inicial
                addWindowListener(new java.awt.event.WindowAdapter() {
                    public void windowClosing(java.awt.event.WindowEvent evt) {
                    cerrar(evt);
                    }
                });
                setVisible(true);
	}
	
        

	public void actionPerformed(ActionEvent ae)
	{
		int d = dimen;//t.getDim();
		for (int i = 0; i < d; i++)
		{
			for (int j = 0; j < d; j++)
			{
				if(botones[i][j] == ae.getSource())
				{
					accion(i,j);
					if(t.esCompleto())
					{
						JOptionPane.showMessageDialog(this,"Felicidades, has ganado!!!... ahora intenta con otro nivel", "¡¡¡FELICIDADES!!!",JOptionPane.INFORMATION_MESSAGE, null);
						setVisible(false);
                                                new VentanaInicial().setVisible(true);
					}
					return;
				}
			}
		}
	}
    private void cerrar(java.awt.event.WindowEvent evt) {                   
        new VentanaInicial().setVisible(true);
    }    
}