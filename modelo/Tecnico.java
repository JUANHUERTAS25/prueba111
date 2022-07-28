package modelo;

public class Tecnico {

    private String nombre;

    public Tecnico()
    {
        
    }

    public Tecnico(String n)
    {
        nombre = n;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String mostrarTecnico()
    {
        return "Nombre: " + nombre;
    }

}
