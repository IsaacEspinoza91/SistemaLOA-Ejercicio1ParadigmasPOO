package loa;

import java.util.ArrayList;

public class Carrera {
    //Atributos
    private int id;
    private String nombre;
    private String gradoAcademico;
    private String tituloProfesional;
    private ArrayList<Asignatura> cursos;

    //Constructor vacio
    public Carrera(){
        cursos = new ArrayList<>();
    }
    public Carrera(int id,String nombre,String gradoAcademico,String tituloProfesional,ArrayList<Asignatura> cursos){
        this.cursos = cursos;
        this.id = id;
        this.nombre = nombre;
        this.gradoAcademico = gradoAcademico;
        this.tituloProfesional = tituloProfesional;
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

    public String getGradoAcademico() {
        return gradoAcademico;
    }
    public void setGradoAcademico(String gradoAcademico) {
        this.gradoAcademico = gradoAcademico;
    }

    public String getTituloProfesional() {
        return tituloProfesional;
    }
    public void setTituloProfesional(String tituloProfesional) {
        this.tituloProfesional = tituloProfesional;
    }

    public ArrayList<Asignatura> getCursos() {
        return cursos;
    }
    public void setCursos(ArrayList<Asignatura> cursos) {
        this.cursos = cursos;
    }
}
