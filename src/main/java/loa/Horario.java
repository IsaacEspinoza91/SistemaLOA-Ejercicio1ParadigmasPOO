package loa;

public class Horario {
    //Atributos
    //arrays de int, correspondiente a los 9 bloques diarios, donde si hay clases en la posicion esta la id de la asignatura, sino es 0
    private int[] horasLunes;
    private int[] horasMartes;
    private int[] horasMiercoles;
    private int[] horasJueves;
    private int[] horasViernes;
    private int[] horasSabados;

    //Constructor
    public Horario() {
        horasLunes = new int[]{0,0,0,0,0,0,0,0,0};
        horasMartes = new int[]{0,0,0,0,0,0,0,0,0};
        horasMiercoles = new int[]{0,0,0,0,0,0,0,0,0};
        horasJueves = new int[]{0,0,0,0,0,0,0,0,0};
        horasViernes = new int[]{0,0,0,0,0,0,0,0,0};
        horasSabados = new int[]{0,0,0,0,0,0,0,0,0};
    }
    public Horario(String[] arrayHoras, int idAsignatura){
        horasLunes = new int[]{0,0,0,0,0,0,0,0,0};
        horasMartes = new int[]{0,0,0,0,0,0,0,0,0};
        horasMiercoles = new int[]{0,0,0,0,0,0,0,0,0};
        horasJueves = new int[]{0,0,0,0,0,0,0,0,0};
        horasViernes = new int[]{0,0,0,0,0,0,0,0,0};
        horasSabados = new int[]{0,0,0,0,0,0,0,0,0};

        for(int a=0;a<arrayHoras.length;a++){
            char diaActual = arrayHoras[a].charAt(0);
            String subStringNumero = arrayHoras[a].substring(1);
            int numHora = Integer.parseInt(subStringNumero);
            switch(diaActual){
                case 'L':
                    horasLunes[numHora-1] = idAsignatura;
                    break;
                case 'M':
                    horasMartes[numHora-1] = idAsignatura;
                    break;
                case 'W':
                    horasMiercoles[numHora-1] = idAsignatura;
                    break;
                case 'J':
                    horasJueves[numHora-1] = idAsignatura;
                    break;
                case 'V':
                    horasViernes[numHora-1] = idAsignatura;
                    break;
                case 'S':
                    horasSabados[numHora-1] = idAsignatura;
                    break;
            }
        }
    }

    //Metodos
    public int[] getHorasLunes() {
        return horasLunes;
    }
    public void setHorasLunes(int[] horasLunes) {
        this.horasLunes = horasLunes;
    }

    public int[] getHorasMartes() {
        return horasMartes;
    }
    public void setHorasMartes(int[] horasMartes) {
        this.horasMartes = horasMartes;
    }

    public int[] getHorasMiercoles() {
        return horasMiercoles;
    }
    public void setHorasMiercoles(int[] horasMiercoles) {
        this.horasMiercoles = horasMiercoles;
    }

    public int[] getHorasJueves() {
        return horasJueves;
    }
    public void setHorasJueves(int[] horasJueves) {
        this.horasJueves = horasJueves;
    }

    public int[] getHorasViernes() {
        return horasViernes;
    }
    public void setHorasViernes(int[] horasViernes) {
        this.horasViernes = horasViernes;
    }

    public int[] getHorasSabados() {
        return horasSabados;
    }
    public void setHorasSabados(int[] horasSabados) {
        this.horasSabados = horasSabados;
    }

    public void setHorarioAsignatura(String[] arrayHoras, int idAsignatura){
        for(int a=0;a<arrayHoras.length;a++){
            char diaAct = arrayHoras[a].charAt(0);
            String subStringNumero = arrayHoras[a].substring(1);
            int numHo = Integer.parseInt(subStringNumero);
            switch(diaAct){
                case 'L':
                    horasLunes[numHo-1] = idAsignatura;
                    break;
                case 'M':
                    horasMartes[numHo-1] = idAsignatura;
                    break;
                case 'W':
                    horasMiercoles[numHo-1] = idAsignatura;
                    break;
                case 'J':
                    horasJueves[numHo-1] = idAsignatura;
                    break;
                case 'V':
                    horasViernes[numHo-1] = idAsignatura;
                    break;
                case 'S':
                    horasSabados[numHo-1] = idAsignatura;
                    break;
            }
        }
    }

    public boolean verficarHorarioSinTope(Horario newHorario){
        for(int a=0;a<9;a++){
            if(horasLunes[a] != 0 && newHorario.horasLunes[a] != 0){return false;}
            if(horasMartes[a] != 0 && newHorario.horasMartes[a] != 0){return false;}
            if(horasMiercoles[a] != 0 && newHorario.horasMiercoles[a] != 0){return false;}
            if(horasJueves[a] != 0 && newHorario.horasJueves[a] != 0){return false;}
            if(horasViernes[a] != 0 && newHorario.horasViernes[a] != 0){return false;}
            if(horasSabados[a] != 0 && newHorario.horasSabados[a] != 0){return false;}
        }
        return true;
    }

    public void combinarHorario(Horario newHoras){//combina dos horarios. No verifica si hay tope, eso lo hace otro metodo
        for(int a=0;a<9;a++){
            if(horasLunes[a] == 0){horasLunes[a] = newHoras.horasLunes[a];}//solo cambia el valor cuando era 0
            if(horasMartes[a] == 0){ horasMartes[a] = newHoras.horasMartes[a];}
            if(horasMiercoles[a] == 0){horasMiercoles[a] = newHoras.horasMiercoles[a];}
            if(horasJueves[a] == 0){horasJueves[a] = newHoras.horasJueves[a];}
            if(horasViernes[a] == 0){horasViernes[a] = newHoras.horasViernes[a];}
            if(horasSabados[a] == 0){horasSabados[a] = newHoras.horasSabados[a];}
        }
    }

    public void descombinarHorario(Horario newHoras){
        for(int a=0;a<9;a++){
            if(newHoras.horasLunes[a] != 0){horasLunes[a] = 0;}
            if(newHoras.horasMartes[a] != 0){horasMartes[a] = 0;}
            if(newHoras.horasMiercoles[a] != 0){horasMiercoles[a] = 0;}
            if(newHoras.horasJueves[a] != 0){horasJueves[a] = 0;}
            if(newHoras.horasViernes[a] !=0){horasViernes[a] = 0;}
            if(newHoras.horasSabados[a] != 0){horasSabados[a] = 0;}
        }
    }

    public void mostrarHorario(){
        int[][] auxMatrizHorario = new int[][]{horasLunes,horasMartes,horasMiercoles,horasJueves,horasViernes,horasSabados};
        System.out.println("Horario\n     L       M       W       J       V       S");
        for (int i = 0; i < 9; i++) {
            System.out.print((i+1)+":");
            for (int j = 0; j < 6; j++) {
                System.out.printf(" %5d |", auxMatrizHorario[j][i]);
            }
            System.out.println();
        }
    }

}
