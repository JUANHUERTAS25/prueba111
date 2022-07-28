package vista;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class PanelEntradaDatos extends JPanel
{

    private JLabel lx;
    private JLabel ly;
    private JLabel lp;
    private JLabel lc;
    private JTextField tfp;
    private JTextField tfc;
    private JComboBox cbEquipos;
    private JComboBox cbContinentes;
    private String[] equipos = {"Qatar", "Alemania", "Dinamarca", "Brasil", "Francia", "Bélgica", "Croacia", 
    "España","Serbia", "Inglaterra", "Suiza", "Países Bajos", "Argentina", "Irán", "Corea del Sur", 
    "Japón", "Arabia Saudita", "Ecuador", "Uruguay", "Canadá", "Ghana", "Senegal", "Marruecos", "Túnez",
    "Portugal", "Polonia", "Camerún", "México", "Estados Unidos", "Gales", "Australia", "Costa Rica"};

    private String[] continentes = {"América","Asia","Europa","África"};


    public PanelEntradaDatos(){

        lx = new JLabel("Equipos participantes");
        lx.setBounds(300, 20, 150, 20);

        ly = new JLabel("Continentes");
        ly.setBounds(320, 70, 130, 20);

        lp = new JLabel("Participaciones");
        lp.setBounds(460, 20, 110, 20);
        
        tfp = new JTextField();
        tfp.setBounds(480, 50, 40, 20);
        add(tfp);

        lc = new JLabel("Copas");
        lc.setBounds(480, 70, 130, 20);

        tfc = new JTextField();
        tfc.setBounds(480, 100, 40, 20);
        add(tfc);

        this.add(lx);
        this.add(ly);
        this.add(lp);
        this.add(lc);
        
        cbEquipos = new JComboBox();
        for(int i=0; i<equipos.length;i++)
        {
            cbEquipos.addItem(equipos[i]);
        }
        cbEquipos.setBounds(300,50,110,20);
        this.add(cbEquipos);

        cbContinentes = new JComboBox();
        for(int i=0; i<continentes.length;i++)
        {
            cbContinentes.addItem(continentes[i]);
        }
        cbContinentes.setBounds(300,95,110,20);
        this.add(cbContinentes);

        // Definicion contenedor del panel
        this.setLayout(null);
        this.setBackground(Color.WHITE);

        //Borde y titulo al panel 
        TitledBorder borde = BorderFactory.createTitledBorder("Datos de entrada");
        borde.setTitleColor(Color.BLUE);
        this.setBorder(borde);
    }

    public String getEquipo()
    {
        return (String) cbEquipos.getSelectedItem();
    }

    public String getContinente()
    {
        return (String) cbContinentes.getSelectedItem();
    }

    public String getParticipaciones() {
        return tfp.getText();
    }

    public String getCopas() {
        return tfc.getText();
    }

}
