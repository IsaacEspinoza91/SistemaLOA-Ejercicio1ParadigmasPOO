package loa;

import java.util.ArrayList;

public class Coordinacion {
    //Atributos
    private ArrayList<Profesor> profesores;
    private ArrayList<Asignatura> asignaturas;

    //Constructor
    public Coordinacion() {
        profesores = new ArrayList<>();
        asignaturas = new ArrayList<>();
    }    //constructor vacio

    //Metodos
    public ArrayList<Profesor> getProfesores() {
        return profesores;
    }
    public void setProfesores(ArrayList<Profesor> profesores) {
        this.profesores = profesores;
    }

    public ArrayList<Asignatura> getAsignaturas() {
        return asignaturas;
    }
    public void setAsignaturas(ArrayList<Asignatura> asignaturas) {
        this.asignaturas = asignaturas;
    }
}
