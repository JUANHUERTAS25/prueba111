package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import vista.VentanaPrincipal;
import modelo.Equipo;
import modelo.Jugador;


public class Controlador implements ActionListener
{
    //------------
    // Atributos
    //------------
    
        private VentanaPrincipal vista;
        private Equipo modelo;
        //private Jugador modelo2;
        
    
        //------------
        // Metodos
        //------------
    
        //metodo constructor
        public Controlador(VentanaPrincipal pVista, Equipo pModelo)
        {
            this.vista = pVista;
            this.modelo = pModelo;
            //this.modelo2 = pModelo2;
            this.vista.miPanelOperaciones.btDirector.addActionListener(this);
            this.vista.miPanelOperaciones.btJugador.addActionListener(this);
            this.vista.miPanelOperaciones.btInformacion.addActionListener(this);
            this.vista.miPanelOperaciones.btSalir.addActionListener(this);      
        }
        @Override
        public void actionPerformed(ActionEvent ae) 
        {
            // Identificar el comando generado [hallar,borrar, salir]
            String comando = ae.getActionCommand();
           
            
            if(comando.equals("jugador"))
            {
                vista.crearDialogoJugador();
                this.vista.miDialogoJugador.agregarOyentesBotones2(this);   
            }
        
            if(comando.equals("informacion"))
            {
                try 
                {
                    String pais = vista.miPanelEntradaDatos.getEquipo();
                    String continente = vista.miPanelEntradaDatos.getContinente();
                    int participaciones = Integer.parseInt(vista.miPanelEntradaDatos.getParticipaciones());
                    int copas = Integer.parseInt(vista.miPanelEntradaDatos.getCopas());
                    modelo = new Equipo(pais, continente, participaciones, copas);
                    vista.miPanelResultados.mostrarResultado("Los datos del equipo son los siguientes: \nPais = " + modelo.getPais() + "\nContinente = " + modelo.getContinente() + "\nParticipaciones = " + modelo.getParticipaciones() + "\nCopas = " + modelo.getCopas());
                    vista.miPanelOperaciones.activarBotones();
                
                } catch (Exception e) 
                {
                    JOptionPane.showMessageDialog(null, "Error en datos de entrada", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }

            if(comando.equals("director"))
            {   
                 vista.crearDialogoDirector();
                 this.vista.miDialogoDirector.agregarOyentesBotones(this);
            }

            if(comando.equals("aceptar"))
            {
                String nombre = vista.miDialogoDirector.getNombre();
                modelo.director.setNombre(nombre);
                vista.miPanelResultados.mostrarResultado("Datos del director: \nNombre = " + modelo.director.getNombre());
                vista.miDialogoDirector.cerrarDialogo();
            }
            
            
            if(comando.equals("aceptar2"))
            {
              try
            {
                if(vista.miDialogoJugador.getSeleccionar().equals("Titular")){
                    modelo.jugadoresTitulares[0].setNombre(vista.miDialogoJugador.getNombre());
                    modelo.jugadoresTitulares[0].setApellidos(vista.miDialogoJugador.getApellidos());
                    modelo.jugadoresTitulares[0].setEdad(Integer.parseInt(vista.miDialogoJugador.getEdad()));
                    modelo.jugadoresTitulares[0].setGoles(Integer.parseInt(vista.miDialogoJugador.getGoles()));
                    modelo.jugadoresTitulares[0].setPosicion(vista.miDialogoJugador.getPosicion());
                }
                vista.miPanelResultados.mostrarResultado(modelo.imprimirJugadores());
                vista.miDialogoJugador.cerrarDialogo();      
            }
    
            
            catch (Exception e) 
            {
                JOptionPane.showMessageDialog(null, "Error en datos de entrada", "Error", JOptionPane.ERROR_MESSAGE);
            }           
        }

            if(comando.equals("Salir"))
            {
                System.exit(0);
            }
        }
}
