package loa;

import java.util.ArrayList;

public class Profesor extends Usuario implements MisCursos{
    //Atributos
    private String departamento;
    private String especialidad;
    private ArrayList<Asignatura> cursosImpartidos;

    //Constructor
    public Profesor(){
        cursosImpartidos = new ArrayList<>();
    }
    public Profesor(int rut,String nombre, String apellido, String fechaIngreso, Horario horario,String departamento,
                    String especialidad, ArrayList<Asignatura> cursosImpartidos){
        super(rut,nombre,apellido,fechaIngreso,horario);
        this.departamento = departamento;
        this.especialidad = especialidad;
        this.cursosImpartidos = cursosImpartidos;
    }

    //Metodos
    public String getDepartamento() {
        return departamento;
    }
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getEspecialidad() {
        return especialidad;
    }
    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public ArrayList<Asignatura> getCursosImpartidos() {
        return cursosImpartidos;
    }
    public void setCursosImpartidos(ArrayList<Asignatura> cursos) {
        this.cursosImpartidos = cursos;
    }

    @Override
    public void verHorario(){
        System.out.println("Se supone que se imprime el horario, tengo que hacer el metodo printHorar en la clase horario");
    }

    @Override
    public void verListaCursos(){
        int tamanio = cursosImpartidos.size();
        Asignatura cursoActual;
        for(int i = 0; i < tamanio; i++){
            cursoActual = cursosImpartidos.get(i);
            System.out.print("\t Asignatura: " + cursoActual.getNombre() + "\n");
        }
    }

    @Override
    public void verMaterialDeClases(){
        System.out.print("Material de clases: Docs, archivos, clases grabadas, etc.\n");
    }
}
