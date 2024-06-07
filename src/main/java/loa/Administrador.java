package loa;

public class Administrador extends Usuario{
    //Atributos
    private String cargo;

    //Constructor
    public Administrador() {}
    public Administrador(int rut,String nombre, String apellido, String fechaIngreso, Horario horario,String cargoAd){
        super(rut,nombre,apellido,fechaIngreso,horario);
        this.cargo = cargoAd;
    }

    //Metodos
    public String getCargo() {
        return cargo;
    }
    public void setCargo(String cargo){
        this.cargo = cargo;
    }
}
