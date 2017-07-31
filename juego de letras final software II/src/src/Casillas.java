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
	public void initComponents(int cat)
        {
            
            switch(cat){
                
                case 1:                                   
                int d = t.getDim();
                imagenes = new ImageIcon[d*d/2+1];
                imagenes[0] = null;
                                
                for (int i = 1; i <= d*d/2; i++)
                {
                    imagenes[i] = new ImageIcon(getClass().getResource("/Imagenes/DibujosAnimados/" + i + ".jpg"));
                    
                }
                JPanel A = new JPanel(new GridLayout(d,d));
                botones = new JButton[d][d];
                for (int i = 0; i < d; i++)
                {
                    for (int j = 0; j < d; j++)
                    {
                        botones[i][j] = new JButton();
                        botones[i][j].addActionListener(this);
                        A.add(botones[i][j]);
                    }
                }
                this.add(A,"Center");
                break;
                
                
                case 2:                                  
                int e = dimen;//t.getDim();
                imagenes = new ImageIcon[e*e/2+1];
                imagenes[0] = null;

                for (int i = 1; i <= e*e/2; i++)
                    imagenes[i] = new ImageIcon(getClass().getResource("/Imagenes/Numeros/" + i + ".gif"));
                JPanel B = new JPanel(new GridLayout(e,e));
                botones = new JButton[e][e];
                for (int i = 0; i < e; i++)
                {
                    for (int j = 0; j < e; j++)
                    {
                        botones[i][j] = new JButton();
                        botones[i][j].addActionListener(this);
                        B.add(botones[i][j]);
                    }
                }
                this.add(B,"Center");
                break;
                
                
                case 3:                                   
                int f = dimen;//t.getDim();
                imagenes = new ImageIcon[f*f/2+1];
                imagenes[0] = null;

                for (int i = 1; i <= f*f/2; i++)
                    imagenes[i] = new ImageIcon(getClass().getResource("/Imagenes/Abecedario/" + i + ".jpg"));
                JPanel C = new JPanel(new GridLayout(f,f));
                botones = new JButton[f][f];
                for (int i = 0; i < f; i++)
                {
                    for (int j = 0; j < f; j++)
                    {
                        botones[i][j] = new JButton();
                        botones[i][j].addActionListener(this);
                        C.add(botones[i][j]);
                    }
                }
                this.add(C,"Center");
                break;             
                
                
                case 4:                                   
                int g = dimen;//t.getDim();
                imagenes = new ImageIcon[g*g/2+1];
                imagenes[0] = null;

                for (int i = 1; i <= g*g/2; i++)
                    imagenes[i] = new ImageIcon(getClass().getResource("/Imagenes/CuerpoHumano/" + i + ".gif"));
                JPanel D = new JPanel(new GridLayout(g,g));
                botones = new JButton[g][g];
                for (int i = 0; i < g; i++)
                {
                    for (int j = 0; j < g; j++)
                    {
                        botones[i][j] = new JButton();
                        botones[i][j].addActionListener(this);
                        D.add(botones[i][j]);
                    }
                }
                this.add(D,"Center");
                break;  
                
                
                case 5:
                int h = dimen;//t.getDim();
                imagenes = new ImageIcon[h*h/2+1];
                imagenes[0] = null;

                for (int i = 1; i <= h*h/2; i++)
                    imagenes[i] = new ImageIcon(getClass().getResource("/Imagenes/FrutasyVerduras/" + i + ".jpg"));
                JPanel E = new JPanel(new GridLayout(h,h));
                botones = new JButton[h][h];
                for (int i = 0; i < h; i++)
                {
                    for (int j = 0; j < h; j++)
                    {
                        botones[i][j] = new JButton();
                        botones[i][j].addActionListener(this);
                        E.add(botones[i][j]);
                    }
                }
                this.add(E,"Center");
                break; 
                     
                
                case 6:                          
                int k = dimen;//t.getDim();
                imagenes = new ImageIcon[k*k/2+1];
                imagenes[0] = null;

                for (int i = 1; i <= k*k/2; i++)
                    imagenes[i] = new ImageIcon(getClass().getResource("/Imagenes/Animales/" + i + ".gif"));
                JPanel F = new JPanel(new GridLayout(k,k));
                botones = new JButton[k][k];
                for (int i = 0; i < k; i++)
                {
                    for (int j = 0; j < k; j++)
                    {
                        botones[i][j] = new JButton();
                        botones[i][j].addActionListener(this);
                        F.add(botones[i][j]);
                    }
                }
                this.add(F,"Center");
                break; 
  
                
                default:
                break;
                }
	}
        
        
	public void accion(int x, int y)
	{
		switch (sw)
		{
		case 0:
			if(!t.esClic(x, y))
			{
				t.clic(x, y);
				botones[x][y].setIcon(imagenes[t.getPos(x,y)]);
				sw = 1;
				a = x;
				b = y;
			}
			break;
		case 1:
			if(!t.esClic(x, y))
			{
				t.clic(x, y);
				botones[x][y].setIcon(imagenes[t.getPos(x,y)]);
				ii = x;
				jj = y;
				if(t.getPos(a, b) != t.getPos(ii, jj))
					sw = 2;
				else
					sw = 0;
			}
			break;
		case 2:
			botones[a][b].setIcon(null);
			botones[ii][jj].setIcon(null);
			t.clic(a, b);
			t.clic(ii, jj);
			sw = 0;
			break;
		}
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