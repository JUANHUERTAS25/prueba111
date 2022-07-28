package modelo;

public class Jugador 
{
    private String nombre;
    private String apellidos;
    private int edad;
    private String posicion;
    private int goles;
    private String seleccionar;
   

    

    public Jugador()
    {

    }

    public Jugador(String nombre, String apellidos, int edad, String posicion, int goles, String seleccionar)
    {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.posicion = posicion;
        this.goles = goles;
        this.seleccionar = seleccionar;
        
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public int getGoles() {
        return goles;
    }

    public void setGoles(int goles) {
        this.goles = goles;
    }

    public String getSeleccionar() {
        return seleccionar;
    }

    public void setSeleccionar(String seleccionar) {
        this.seleccionar = seleccionar;
    }


    
}
