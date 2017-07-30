package src;

/**
 *
 * Rivera maquera carlos joel
 *  roger franco ortiz
 */

import java.awt.event.ActionEvent;
import javax.swing.*;


public class VentanaInicial extends JFrame{
    
    //Declaración de Variables
    private JLabel TituloInicial;
    private JButton ImagenInicial;
    private JMenuBar BarraDeMenu;
    private JMenu MenuJugar,MenuOpciones,MenuAyuda,OpcionesNiveles,OpcionesCategorias;
    private JMenuItem JugarIniciar,JugarSalir;
    private JMenuItem Nivel1,Nivel2,Nivel3;
    private JRadioButtonMenuItem DibujosAnimados,Numeros,Abecedario,CuerpoHumano,FrutasyVerduras,Animales;
    private JMenuItem AcercaDe,Tutorial;
    private int level=4,cate=1;
    
    public VentanaInicial (){
        initComponets();
        
    }

    private void initComponets() {
        

         
        //Creo los Objetos
        TituloInicial = new JLabel();
        ImagenInicial = new JButton();
        BarraDeMenu = new JMenuBar();
        MenuJugar = new JMenu("Jugar");
        MenuOpciones = new JMenu("Opciones");
        MenuAyuda = new JMenu("Ayuda");
        OpcionesNiveles = new JMenu("Niveles");
        OpcionesCategorias = new JMenu("Categorias");
        JugarIniciar = new JMenuItem("Iniciar");
        JugarSalir = new JMenuItem("Salir");
       
        Nivel1 = new JMenuItem("Nivel 1");
        Nivel2 = new JMenuItem("Nivel 2");
        Nivel3 = new JMenuItem("Nivel 3");
      
        DibujosAnimados = new JRadioButtonMenuItem("Dibujos Animados");
        Numeros = new JRadioButtonMenuItem("Números");
        Abecedario = new JRadioButtonMenuItem("Abecedario");
        CuerpoHumano = new JRadioButtonMenuItem("Cuerpo Humano");
        FrutasyVerduras = new JRadioButtonMenuItem("Frutas y Verduras");
        Animales = new JRadioButtonMenuItem("Animales");
        
        AcercaDe = new JMenuItem("Acerca de...");
        Tutorial = new JMenuItem("Tutorial");
        
        ButtonGroup bg = new ButtonGroup();
        bg.add(DibujosAnimados);
        bg.add(Numeros);
        bg.add(Abecedario);
        bg.add(CuerpoHumano);
        bg.add(FrutasyVerduras);
        bg.add(Animales);
        
        
        
        setJMenuBar(BarraDeMenu);
        
        pack();

    }
    
        
}
