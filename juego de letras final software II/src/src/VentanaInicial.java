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
        
        //agrego los submenus a los menus.
        BarraDeMenu.add(MenuJugar);
        BarraDeMenu.add(MenuOpciones);
        BarraDeMenu.add(MenuAyuda);
        MenuJugar.add(JugarIniciar);
        MenuJugar.add(JugarSalir);
        MenuOpciones.add(OpcionesNiveles);
        MenuOpciones.add(OpcionesCategorias);
        OpcionesNiveles.add(Nivel1);
        OpcionesNiveles.add(Nivel2);
        OpcionesNiveles.add(Nivel3);
        
        OpcionesCategorias.add(DibujosAnimados);
        OpcionesCategorias.add(Numeros);
        OpcionesCategorias.add(Abecedario);
        OpcionesCategorias.add(CuerpoHumano);
        OpcionesCategorias.add(FrutasyVerduras);
        OpcionesCategorias.add(Animales);
        
        MenuAyuda.add(AcercaDe);
        MenuAyuda.add(Tutorial);
      
        //Propiedades de la ventana
        setLocationRelativeTo(null);//para centrar la ventana.
        setTitle("Juego de Letras");//Titulo de la ventana.
        setResizable(false);
        //setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
                    public void windowClosing(java.awt.event.WindowEvent evt) {
                    saludoFinal(evt);
                    }
        });
        setBackground(new java.awt.Color(255, 255, 255));
        setLocation(new java.awt.Point(500, 250));
 

        ImagenInicial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/PENSANDO.gif"))); 
        ImagenInicial.setBorder(null);
       
        //ImagenInicial.setMargin();
        
        //this.setIconImage(Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("icono.png")));

        TituloInicial.setFont(new java.awt.Font("Monotype Corsiva", 1, 24)); 
        TituloInicial.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TituloInicial.setText("CARLOS JOEL...ROGER FRANCO");
        

        //Acciones de los Menus
        JugarIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                JugarIniciarActionPerformed(evt);
            }
        });
        
        
        JugarSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                JugarSalirActionPerformed(evt);
            }
        });
        
        
        AcercaDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                AcercaDeActionPerformed(evt);
            }
        });
        
        Tutorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                TutorialActionPerformed(evt);
            }
        });
        
        Nivel1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                Nivel1ActionPerformed(evt);
            }
        });
        
        Nivel2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                Nivel2ActionPerformed(evt);
            }
        });
        
        Nivel3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                Nivel3ActionPerformed(evt);
            }
        });
        
        DibujosAnimados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(ActionEvent evt){
                DibujosAnimadosActionPerformed(evt);
            }
        });
        
        Numeros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(ActionEvent evt){
                NumerosActionPerformed(evt);
            }
        });
        
        Abecedario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(ActionEvent evt){
                AbecedarioActionPerformed(evt);
            }
        });
                
        CuerpoHumano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(ActionEvent evt){
                CuerpoHumanoActionPerformed(evt);
            }
        });
                        
        FrutasyVerduras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(ActionEvent evt){
                FrutasyVerdurasActionPerformed(evt);
            }
        });
                                
        Animales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(ActionEvent evt){
                AnimalesActionPerformed(evt);
            }
        });

        
        setJMenuBar(BarraDeMenu);
        

        
        pack();

    }

    
    private void saludoFinal(java.awt.event.WindowEvent evt){
        setVisible(false);
        JOptionPane.showMessageDialog(this,"Esta aplicacion fue creada por los alumnos de la Universidd Nacional Jose Maria Arguedas"
                + "\n Carrera Profesional de Ingenieria de Sistemas "
                + "\n alumnos:carlos joel rivera maquera, roger franco ortiz "
                + "\n 8vo Ciclo "
                + "\n  creado en  01/07/2017. \n ", "GRACIAS! - Espero lo haya disfrutado.",JOptionPane.INFORMATION_MESSAGE, null);
        System.exit(0);
    }
        
}
