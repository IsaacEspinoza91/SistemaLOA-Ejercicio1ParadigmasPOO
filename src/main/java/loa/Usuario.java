package loa;

public class Usuario {
    //Atributos
    protected int rut;
    protected String nombre;
    protected String apellido;
    protected String fechaIngreso;
    protected Horario horario;

    //Constructor
    public Usuario(){}
    public Usuario(int rut, String nombre, String apellido, String fechaIngreso, Horario horario) {
        this.rut = rut;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaIngreso = fechaIngreso;
        this.horario = horario;
    }

    //Metodos
    public int getRut() { return rut; }
    public void setRut(int rut) { this.rut = rut; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getApellido() { return apellido; }
    public void setApellido(String apellido) { this.apellido = apellido; }

    public String getFechaIngreso() { return fechaIngreso; }
    public void setFechaIngreso(String fechaIngreso) { this.fechaIngreso = fechaIngreso; }

    public Horario getHorario() { return horario; }
    public void setHorario(Horario horario) { this.horario = horario; }

}
