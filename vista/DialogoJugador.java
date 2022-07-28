package vista;

import java.awt.Font;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class DialogoJugador extends JDialog
{
    //Atributos
    private JLabel lbTitulo;
    private JLabel lbNombre;
    private JLabel lbApellidos;
    private JLabel lbEdad;
    private JLabel lbPosicion;
    private JLabel lbGoles;
    private JLabel lbSeleccionar;
    private JTextField txNombre;
    private JTextField txApellidos;
    private JTextField txEdad;
    private JTextField txGoles;
    private JComboBox cbPosicion;
    private JComboBox cbSeleccionar;
    private String[] posiciones = {"Portero", "Central Derecho", "Central Izquierdo","Lateral Izquierdo","Lateral Derecho","Mediocentro","Interior Izquierdo",
                                   "Interior Derecho", "Extremo Izquierdo","Extremo Derecho","Portero"};
    private String[] seleccionar = {"Titular", "Suplente"};
    private JButton btAceptar2;

    public DialogoJugador()
    {
        //Definición del contenedor de la ventana
        setLayout(null);

        //Creación y adición de elementos
        lbTitulo = new JLabel("Datos Jugador",JLabel.CENTER);
        lbTitulo.setFont(new Font("Arial", Font.BOLD, 20));
        lbTitulo.setBounds(150,5,300,40);
        add(lbTitulo);

        lbNombre= new JLabel("Nombre = ",JLabel.RIGHT);
        lbNombre.setFont(new Font("Arial", Font.BOLD, 15));
        lbNombre.setBounds(10,50,80,20);
        add(lbNombre);

        lbApellidos = new JLabel("Apellidos = ",JLabel.RIGHT);
        lbApellidos.setFont(new Font("Arial", Font.BOLD, 15));
        lbApellidos.setBounds(10,80,90,20);
        add(lbApellidos);

        lbEdad = new JLabel("Edad = ",JLabel.RIGHT);
        lbEdad.setFont(new Font("Arial", Font.BOLD, 15));
        lbEdad.setBounds(10,110,60,20);
        add(lbEdad);

        lbPosicion = new JLabel("Posicion = ",JLabel.RIGHT);
        lbPosicion.setFont(new Font("Arial", Font.BOLD, 15));
        lbPosicion.setBounds(10,140,85,20);
        add(lbPosicion);

        lbGoles = new JLabel("Goles = ",JLabel.RIGHT);
        lbGoles.setFont(new Font("Arial", Font.BOLD, 15));
        lbGoles.setBounds(15,170,60,20);
        add(lbGoles);

        lbSeleccionar = new JLabel("Seleccionar = ",JLabel.RIGHT);
        lbSeleccionar.setFont(new Font("Arial", Font.BOLD, 15));
        lbSeleccionar.setBounds(300,50,130,20);
        add(lbSeleccionar);

        txNombre = new JTextField();
        txNombre.setFont(new Font("Arial", Font.BOLD, 15));
        txNombre.setBounds(110,50,140,20);
        add(txNombre);

        txApellidos = new JTextField();
        txApellidos.setFont(new Font("Arial", Font.BOLD, 15));
        txApellidos.setBounds(110,80,140,20);
        add(txApellidos);

        txEdad = new JTextField();
        txEdad.setFont(new Font("Arial", Font.BOLD, 15));
        txEdad.setBounds(110,110,30,20);
        add(txEdad);

        cbPosicion = new JComboBox();
        for(int i=0; i<posiciones.length;i++)
        {
            cbPosicion.addItem(posiciones[i]);
        }
        cbPosicion.setBounds(110,140,180,20);
        this.add(cbPosicion);

        cbSeleccionar = new JComboBox();
        for(int i=0; i<seleccionar.length;i++)
        {
            cbSeleccionar.addItem(seleccionar[i]);
        }
        cbSeleccionar.setBounds(440,50,80,20);
        this.add(cbSeleccionar);

        txGoles = new JTextField();
        txGoles.setFont(new Font("Arial", Font.BOLD, 15));
        txGoles.setBounds(110,170,30,20);
        add(txGoles);


        // Creación de botón aceptar
        btAceptar2 = new JButton("Aceptar");
        btAceptar2.setFont(new Font("Arial", Font.BOLD, 25));
        btAceptar2.setBounds(200,220,200,25);
        btAceptar2.setActionCommand("aceptar2");
        add(btAceptar2);

        //Caracteristicas de la ventana
        setTitle("Datos Jugador");
        setSize(600,400);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
    }
    public String getNombre()
    {
        return txNombre.getText();
    }

    public String getApellidos()
    {
        return txApellidos.getText();
    }

    public String getEdad()
    {
        return txEdad.getText();
    }

    public String getPosicion()
    {
        return (String) cbPosicion.getSelectedItem();
    }

    public String getSeleccionar()
    {
        return (String) cbSeleccionar.getSelectedItem();
    }

    public String getGoles()
    {
        return txGoles.getText();
    }

    public void agregarOyentesBotones2(ActionListener pAL)
    {
        btAceptar2.addActionListener(pAL);
    }
    
    public void cerrarDialogo()
    {
        this.dispose();
    }         
    
    public void borrar()
    {
        txNombre.setText("");
        txApellidos.setText("");
        txEdad.setText("");
        txGoles.setText("");
    }
}
