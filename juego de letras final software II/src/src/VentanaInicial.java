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
        

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ImagenInicial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TituloInicial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TituloInicial, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ImagenInicial))
        );

        pack();

    }
    //acciones de los botones
    private void JugarIniciarActionPerformed(java.awt.event.ActionEvent evt) {
        setVisible(false);
        new Casillas(level,cate);
    }                                            

    private void JugarSalirActionPerformed(java.awt.event.ActionEvent evt) {                                           
        setVisible(false);
        JOptionPane.showMessageDialog(this,"Esta aplicacion fue creada por los alumnos de la Universidd Nacional Jose Maria Arguedas"
                + "\n Carrera Profesional de Ingenieria de Sistemas "
                + "\n alumnos:carlos joel rivera maquera, roger franco ortiz "
                + "\n 8vo Ciclo "
                + "\n  creado en  01/07/2017. \n ", "GRACIAS! - Espero lo haya disfrutado.",JOptionPane.INFORMATION_MESSAGE, null);
        System.exit(0);
    }
    
    private void AcercaDeActionPerformed(ActionEvent evt) {
        JOptionPane.showMessageDialog(this,"Esta aplicacion fue creada por los alumnos de la Universidd Nacional Jose Maria Arguedas"
                + "\n Carrera Profesional de Ingenieria de Sistemas "
                + "\n alumnos:carlos joel rivera maquera, roger franco ortiz "
                + "\n 8vo Ciclo "
                + "\n  creado en  01/07/2017. \n ", "GRACIAS! - Espero lo haya disfrutado.",JOptionPane.INFORMATION_MESSAGE, null);
    }
    
    private void TutorialActionPerformed(ActionEvent evt) {
        
        JOptionPane.showMessageDialog(this,"*En este juego debe tratar de recordar la ubicación de cada imagen y ubicar su pareja."
                +"\n*Al ismo tiempo de recordar aprender las palabras y vocabulario."
                +"\n*Aprenderas de la manera mas didactica las vocales y abecedarios."
                +"\n*Cada casilla mostrara su imagen oculta al hacer click sobre ella y se ocultara si la pareja no coincide."
                + "\n*Cuando halla encontrado todos los pares de imagenes habra logrado completar el juego."
                + "\n*Si lo desea podrá cambiar de nivel de dificultad o de categoria.", "Instruciones del juego",JOptionPane.INFORMATION_MESSAGE, null);
    }
    
    private void Nivel1ActionPerformed(ActionEvent evt) {
        level=4;
        JOptionPane.showMessageDialog(this,"Por favor elija la categoria que se desea jugar."
                + " dirigase al menu Opciones Categorias y elija uno", "DEBE ELEGIR UNA CATEGORIA",JOptionPane.INFORMATION_MESSAGE, null);
    }
    
    private void Nivel2ActionPerformed(ActionEvent evt) {
        level=6;
        JOptionPane.showMessageDialog(this,"Por favor elija la categoria que se desea jugar."
                + " dirigase al menu Opciones Categorias y elija uno", "DEBE ELEGIR UNA CATEGORIA",JOptionPane.INFORMATION_MESSAGE, null);
   }
    
    private void Nivel3ActionPerformed(ActionEvent evt) {
        level=8;
        JOptionPane.showMessageDialog(this,"Por favor elija la categoria que se desea jugar."
                + " dirigase al menu Opciones Categorias y elija uno", "DEBE ELEGIR UNA CATEGORIA",JOptionPane.INFORMATION_MESSAGE, null);
    }
    
    private void DibujosAnimadosActionPerformed(ActionEvent evt) {
        setVisible(false);
        cate=1;
        new Casillas(level,cate);
    }
        
    private void NumerosActionPerformed(ActionEvent evt) {
        setVisible(false);
        cate=2;
        new Casillas(level,cate);
    }
            
    private void AbecedarioActionPerformed(ActionEvent evt) {
        setVisible(false);
        cate=3;
        new Casillas(level,cate);
    }
    
    private void CuerpoHumanoActionPerformed(ActionEvent evt) {
        setVisible(false);
        cate=4;
        new Casillas(level,cate);
    }
        
    private void FrutasyVerdurasActionPerformed(ActionEvent evt) {
        setVisible(false);
        cate=5;
        new Casillas(level,cate);
    }
            
    private void AnimalesActionPerformed(ActionEvent evt) {
        setVisible(false);
        cate=6;
        new Casillas(level,cate);
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
