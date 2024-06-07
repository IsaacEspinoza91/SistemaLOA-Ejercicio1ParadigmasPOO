package loa;

public class Asignatura {
    //Atributos
    private int id;
    private String nombre;
    private String seccion;
    private int cupo;
    private Horario horario;
    private String nombreProfesor;
    private int nivel;
    private String semestre;

    //Constructor
    public Asignatura() {}
    public Asignatura(int id, String nombre,String seccion, int cupo, Horario horario, String nombreProfesor, int nivel, String semestre) {
        this.id = id;
        this.nombre = nombre;
        this.seccion = seccion;
        this.cupo = cupo;
        this.horario = horario;
        this.nombreProfesor = nombreProfesor;
        this.nivel = nivel;
        this.semestre = semestre;
    }

    //Metodos
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSeccion() {
        return seccion;
    }
    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    public int getCupo() {
        return cupo;
    }
    public void setCupo(int cupo) {
        this.cupo = cupo;
    }

    public Horario getHorario() {
        return horario;
    }
    public void setHorario(Horario horario) {
        this.horario = horario;
    }

    public String getNombreProfesor() {
        return nombreProfesor;
    }
    public void setNombreProfesor(String nombreProfesor) {
        this.nombreProfesor = nombreProfesor;
    }

    public int getNivel() {
        return nivel;
    }
    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public String getSemestre() {
        return semestre;
    }
    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }


}
