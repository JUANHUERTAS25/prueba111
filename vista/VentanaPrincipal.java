package vista;

import javax.swing.JFrame;

public class VentanaPrincipal extends JFrame
{
        //----------
    // Atributos
    //----------
    public PanelEntradaDatos miPanelEntradaDatos;
    public PanelOperaciones miPanelOperaciones;
    public PanelResultados miPanelResultados;
    public DialogoDirector miDialogoDirector;
    public DialogoJugador miDialogoJugador;

    //----------
    // Metodos
    //----------

    /*Método constructor*/
    public VentanaPrincipal()
    {
        //Contenedor de la ventana
        this.setLayout(null);

        // Crear y agregar el PanelEntrada
        miPanelEntradaDatos = new PanelEntradaDatos();
        miPanelEntradaDatos.setBounds(10,10,660,240);
        this.add(miPanelEntradaDatos);

        // Crear y agregar el PanelOperaciones
        miPanelOperaciones = new PanelOperaciones();
        miPanelOperaciones.setBounds(10,255,660,100);
        this.add(miPanelOperaciones);

        // Crear y agregar el PanelEntrada
        miPanelResultados = new PanelResultados();
        miPanelResultados.setBounds(10,360,660,290);
        this.add(miPanelResultados);
        
        miDialogoDirector = null;
        
        

        // Caracteristicas de la ventana
        this.setTitle("APP FIFA");
        this.setSize(700,700);
        //this.setLocation(100,100);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public void crearDialogoDirector()
    {
        miDialogoDirector = new DialogoDirector();
    }
    
    public void crearDialogoJugador()
    {
        miDialogoJugador = new DialogoJugador();
    }
    
}
