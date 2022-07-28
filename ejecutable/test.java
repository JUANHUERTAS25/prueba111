package ejecutable;

import vista.VentanaPrincipal;
import modelo.Equipo;
import controlador.Controlador;
public class test {
    public static void main(String[] args)
    {
        VentanaPrincipal miVentana = new VentanaPrincipal();
        Equipo miEquipo = null;
        Controlador miControlador = new Controlador(miVentana, miEquipo);        
        
    }
    
}
