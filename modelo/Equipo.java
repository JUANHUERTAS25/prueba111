package modelo;


public class Equipo 
{
    private String pais;
    private String continente;
    private int participaciones;
    private int copas;
    public Jugador[] jugadoresTitulares;
    public Jugador[] jugadoresSuplentes;
    public Tecnico director;

    public Equipo(String pPais, String pContinente, int pParticipaciones, int pCopas)
    {
        this.pais = pPais;
        this.continente = pContinente;
        this.participaciones = pParticipaciones;
        this.copas = pCopas;
        jugadoresTitulares = new Jugador[11];
        jugadoresSuplentes = new Jugador[11];
        director = new Tecnico();

        for(int i=0; i<2;i++)
        {
            crearJugador(i);
        }

        for(int i=0; i<2;i++)
        {
            cargarJugadorSuplente(i);
        }

        
    }

    public Jugador crearJugador(int indicador)
    {
        String nom = "";
        String ape = "";
        int e = 0;
        String pos = "";
        int g = 0;
        String selec = "";
        jugadoresTitulares[indicador]= new Jugador(nom,ape,e,pos,g,selec);
        return jugadoresTitulares[indicador];  
    }
    
    public Jugador cargarJugadorSuplente(int indicador)
    {
        
        return jugadoresSuplentes[indicador]= new Jugador();
    }
    public String getPais() {
        return pais;
    }
    
    public String getContinente() {
        return continente;
    }

    public int getParticipaciones() {
        return participaciones;
    }

    public int getCopas() {
        return copas;
    }

    public String imprimirJugadores()
    {
        
        String rta = "Equipo: ";        
        for(int i=0; i<2; i++)
        {     
            rta += "\n---\n TITULARES\n-------\nNombre No. "+ (i+1) +": " + jugadoresTitulares[i].getNombre() +"\nApellidos: " + jugadoresTitulares[i].getApellidos()+ "\nCantidad de goles: " + jugadoresTitulares[i].getGoles() + "\nedad: "+jugadoresTitulares[i].getEdad() + "\nposicion: " + jugadoresTitulares[i].getPosicion();

        }
        for(int i=0; i<2; i++)
        {     
            rta += "\n---\n SUPLENTES\n-------\nNombre No. "+ (i+1) +": " + jugadoresSuplentes[i].getNombre() +"\nApellidos: " + jugadoresSuplentes[i].getApellidos()+ "\nCantidad de goles: " + jugadoresSuplentes[i].getGoles() + "\nedad: "+jugadoresSuplentes[i].getEdad() + "\nposicion: " + jugadoresSuplentes[i].getPosicion();
        }

        return rta;
    }

    

}
