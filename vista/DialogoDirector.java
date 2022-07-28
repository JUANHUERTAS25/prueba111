package vista;

import java.awt.Font;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JDialog;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class DialogoDirector extends JDialog
{
    //Atributos
    private JLabel lbTitulo;
    private JLabel lbNombre;
    private JTextField txNombre;
    private JButton btAceptar;

    //Métodos
    
    //Método constructor
    public DialogoDirector()
    {
        //Definición del contenedor de la ventana
        setLayout(null);

        //Creación y adición de elementos
        lbTitulo = new JLabel("Datos Director",JLabel.CENTER);
        lbTitulo.setFont(new Font("Arial", Font.BOLD, 20));
        lbTitulo.setBounds(150,10,300,20);
        add(lbTitulo);

        lbNombre= new JLabel("Nombre = ",JLabel.RIGHT);
        lbNombre.setFont(new Font("Arial", Font.BOLD, 15));
        lbNombre.setBounds(10,50,100,20);
        add(lbNombre);
        
        txNombre= new JTextField();
        txNombre.setFont(new Font("Arial", Font.BOLD, 15));
        txNombre.setBounds(115,45,100,25);
        add(txNombre);
        
    
        // Creación de botón aceptar
        btAceptar = new JButton("Aceptar");
        btAceptar.setFont(new Font("Arial", Font.BOLD, 25));
        btAceptar.setBounds(200,190,200,25);
        btAceptar.setActionCommand("aceptar");
        add(btAceptar);

        //Caracteristicas de la ventana
        setTitle("Datos Director Técnico");
        setSize(570,350);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
    }

    
    public String getNombre()
    {
        return txNombre.getText();
    }
    
    public void agregarOyentesBotones(ActionListener pAL)
    {
        btAceptar.addActionListener(pAL);
    }
    
    public void cerrarDialogo()
    {
        this.dispose();
    }         
}
