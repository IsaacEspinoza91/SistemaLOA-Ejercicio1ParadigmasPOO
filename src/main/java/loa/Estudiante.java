package loa;

import java.util.ArrayList;

public class Estudiante extends Usuario implements MisCursos{
    //Atributos
    private ArrayList<Asignatura> asignaturasCursadas;
    private ArrayList<Asignatura> asignaturasReprobadas;
    private ArrayList<Asignatura> asignaturasInscritas;
    //podria haber atributo de asignaturasDisponibles que analice los ramos de la carrera y los ya cursados
    private Carrera carrera;

    //Constructor
    public Estudiante() {
        asignaturasCursadas = new ArrayList<>();
        asignaturasReprobadas = new ArrayList<>();
        asignaturasInscritas = new ArrayList<>();
    }
    public Estudiante(int rut, String nombre, String apellido, String fechaIngreso, Horario horario,
                      ArrayList<Asignatura> ramosCursados, ArrayList<Asignatura> ramosReprobados,
                      ArrayList<Asignatura> ramosInscritas, Carrera carrera) {
        super(rut, nombre, apellido, fechaIngreso, horario);
        this.asignaturasCursadas = ramosCursados;
        this.asignaturasReprobadas = ramosReprobados;
        this.asignaturasInscritas = ramosInscritas;
        this.carrera = carrera;
    }

    //Metodos
    public ArrayList<Asignatura> getAsignaturasCursadas() {
        return asignaturasCursadas;
    }
    public void setAsignaturasCursadas(ArrayList<Asignatura> asignaturasCursadas) {
        this.asignaturasCursadas = asignaturasCursadas;
    }

    public ArrayList<Asignatura> getAsignaturasReprobados() {
        return asignaturasReprobadas;
    }
    public void setAsignaturasReprobadas(ArrayList<Asignatura> asignaturasReprobadas) {
        this.asignaturasReprobadas = asignaturasReprobadas;
    }

    public ArrayList<Asignatura> getAsignaturasInscritas() {
        return asignaturasInscritas;
    }
    public void setAsignaturasInscritas(ArrayList<Asignatura> asignaturasInscritas) {
        this.asignaturasInscritas = asignaturasInscritas;
    }

    public Carrera getCarrera() {
        return carrera;
    }
    public void setCarrera(Carrera carrera) {
        this.carrera = carrera;
    }


    public void inscribirAsignatura(Asignatura asignatura){
        if(!(asignaturasInscritas.contains(asignatura)) && !(asignaturasCursadas.contains(asignatura))){ //no se pueden inscribir cursos aprobados
            if(horario.verficarHorarioSinTope(asignatura.getHorario())){//condicion no hay tope de horario
                horario.combinarHorario(asignatura.getHorario());
                asignaturasInscritas.add(asignatura);
            }else{
                System.out.println("Tope de horario con otras asignaturas. No fue posible la inscripcion");
            }
        }else{
            System.out.println("No fue posible inscribir la asignatura porque ya la tienes inscrita!!");
        }
    }

    public void desinscribirAsignatura(Asignatura asignatura) {
        if(asignaturasInscritas.contains(asignatura)) {   //tambien aca deberia ir el condicional antes de fecha det
            horario.descombinarHorario(asignatura.getHorario());
            asignaturasInscritas.remove(asignatura);
        }else{
            System.out.println("La asignatura que quieres desinscribir no la tienes inscrita");
        }
    }

    @Override
    public void verHorario(){
        horario.mostrarHorario();
    }

    @Override
    public void verListaCursos(){
        int tamanio = asignaturasInscritas.size();
        Asignatura cursoActual;
        for(int i = 0; i < tamanio; i++){
            cursoActual = asignaturasInscritas.get(i);
            System.out.print("\t Asignatura: " + cursoActual.getNombre() + " - Profesor: " + cursoActual.getNombreProfesor()+"\n");
        }
    }

    @Override
    public void verMaterialDeClases(){
        System.out.print("Material de clases: Docs, archivos, clases grabadas, etc.\n");
    }
}
