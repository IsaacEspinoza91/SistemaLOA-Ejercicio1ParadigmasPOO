package loa;
/*
LOA es el sistema de gestión de asignaturas y calificaciones empleado por el registro curricular de Facultad de Ingeniería
de la Universidad de Santiago de Chile. Los usuarios de este sistema pertenecen a dicha universidad.
Un usuario tiene un id numérico que lo identifica, en este caso, es el RUT. Asimismo, tiene nombre y apellido. Un usuario
puede ser del tipo estudiante, profesor u administrativo, tiene asociada una fecha de ingreso y puede tener un horario asociado.
De igual forma, el estudiante tiene un historial de asignaturas cursadas y reprobadas. Finalmente, el horario se compone de días y horas.
Un usuario tiene acceso a la sección Mis Cursos, en el cual puede ver su horario de clases, listado de cursos y material de clases.
Con este sistema, los alumnos pueden inscribir asignaturas de acuerdo con su horario. Cada asignatura tiene un nombre, un id
que lo identifica, un cupo determinado y un horario asociado. También es posible desincribir ramos antes de una fecha particular.
Asimismo, cada asignatura tiene asociado un horario, es decir, se imparte en ciertos días y horarios. En esta línea, se
encuentra impartida por un profesor, el cual pertenece a una coordinación que dicta el ramo. Una coordinación es una
agrupación de profesores.
A partir de este enunciado, determine entidades, características y comportamientos que pueden ser representadas mediante
el Paradigma Orientado a Objetos para la construcción de este nuevo sistema. Tome las consideraciones que usted crea adecuadas.
*/


import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {


        //Definicion horarios de cursos
        // 1/2022
        Horario horarioCal1 = new Horario(new String[]{"L3","M2","W2","V3"},10101);
        Horario horarioAlg1 = new Horario(new String[]{"L2","M3","J3","V1"},10102);
        Horario horarioFis1 = new Horario(new String[]{"L1","W1","V2"},10103);
        Horario horarioMetEst = new Horario(new String[]{"S1"},10126);
        Horario horarioIntroIng = new Horario(new String[]{"M1"},10125);
        Horario horarioTallerDesa = new Horario(new String[]{"J1","J2"},10104);

        // 2/2022
        Horario horarioCal2 = new Horario(new String[]{"L4","M6","V6","S1"},10107);
        Horario horarioAlg2 = new Horario(new String[]{"M4","W5","J6"},10108);
        Horario horarioFis2 = new Horario(new String[]{"L5","W4","J4"},10109);
        Horario horarioQuimica = new Horario(new String[]{"L6","M5","V4"},10111);
        Horario horarioIntroInfor = new Horario(new String[]{"J2"},13287);
        Horario horarioFundamentosProgra = new Horario(new String[]{"J3","J5","V5"},10110);

        // 1/2023
        Horario horarioEstadistica = new Horario(new String[]{"L2","M2","V2"},10115);
        Horario horarioEdo = new Horario(new String[]{"M3","J3","V3"},10123);
        Horario horarioElectro = new Horario(new String[]{"M1","W2","J1"},10127);
        Horario horarioIngles1 = new Horario(new String[]{"L3"},10130);
        Horario horarioMetodosProgra = new Horario(new String[]{"L4","M4","M5","V4"},13201);
        Horario horarioComunicacionEfectiva = new Horario(new String[]{"J2"},10128);

        // 2/2023
        Horario horarioIngles3 = new Horario(new String[]{"V3"},10132);
        Horario horarioEda = new Horario(new String[]{"M2","J2","V2"},13204);
        Horario horarioIngesis = new Horario(new String[]{"L6","J5","J6"},13252);
        Horario horarioEstrucComp = new Horario(new String[]{"M6","J4","V4"},13273);
        Horario horarioEcono = new Horario(new String[]{"L5","M5","V5"},10116);

        // 1/2024
        Horario horarioInso = new Horario(new String[]{"L3","W1","V3"},13260);
        Horario horarioSIA = new Horario(new String[]{"M1","V1"},13261);
        Horario horarioIngles4 = new Horario(new String[]{"V2"},13260);
        Horario horarioParadigmas1 = new Horario(new String[]{"M2","W6","J2"},13204);//para crea un objeto cordinacion
        Horario horarioParadigmas2 = new Horario(new String[]{"W6","S1","S2"},13204);
        Horario horarioParadigmas3 = new Horario(new String[]{"M2","W6","W7"},13204);

        // Horarios de asignaturas que me faltan por cursar y que desconozco su info
        Horario horarioEvalPro = new Horario();
        Horario horarioDisenoBaseDatos = new Horario();
        Horario horarioOrgaComp = new Horario();
        Horario horarioFundaIngSoft = new Horario();
        Horario horarioAdminiProy = new Horario();
        Horario horarioTallerBaseDatos = new Horario();
        Horario horarioSistemasOpera = new Horario();
        Horario horarioTecnicasIngenieSoftware = new Horario();
        Horario horarioRedes = new Horario();
        Horario horarioProyectoIngenieSoftware = new Horario();
        Horario horarioEsp1 = new Horario();
        Horario horarioEsp2 = new Horario();
        Horario horarioEsp3 = new Horario();
        Horario horarioSeminario = new Horario();
        Horario horarioTrabajoTitulacion = new Horario();


        //Definicion de cursos
        // 1/2022
        Asignatura calculo1 = new Asignatura(10101,"Calculo 1","A1",70,horarioCal1,
                "Manuel Galaz",1,"1/2022");
        Asignatura algebra1 = new Asignatura(10102,"Algebra 1","A1",70,horarioAlg1,
                "Inge Alicera",1,"1/2022");
        Asignatura fisica1 = new Asignatura(10103,"Fisica 1","A2",30,horarioFis1,
                "Jose Rivera",1,"1/2022");
        Asignatura metodosDeEstudio = new Asignatura(10126,"Metodos de Estudio","A2",30,
                horarioMetEst,"Aurora Buendia",1,"1/2022");
        Asignatura introduccionIngenieria = new Asignatura(10125,"Introduccion a la Ingeniria","A1",56,horarioIntroIng,
                "Jorge Carvacho",1,"1/2022");
        Asignatura tallerDesarrollo = new Asignatura(10104,"Taller de Desarrollo Personal e Integral","A2",20,horarioTallerDesa,
                "Mario Castillo",1,"1/2022");

        // 2/2022
        Asignatura calculo2 = new Asignatura(10107,"Calculo 2","G1",70,horarioCal2,
                "Francisco Castillo",2,"2/2022");
        Asignatura algebra2 = new Asignatura(10108,"Algebra 2","G1",70,horarioAlg2,
                "Michael Yanez",2,"2/2022");
        Asignatura fisica2 = new Asignatura(10109,"Fisica 2","G1",30,horarioFis2,
                "Sidney Villagran",2,"2/2022");
        Asignatura quimica = new Asignatura(10111,"Quimica General","H1",25,horarioQuimica,
                "Francisco Turbina", 2,"2/2022");
        Asignatura introInforma = new Asignatura(13287,"Introduccion a Ingenieria Informatica","A1",20,
                horarioIntroInfor, "Pamela Aguirre",2,"2/2022");
        Asignatura fundamentosProgra = new Asignatura(10110,"Fundamentos de Computacion y Programacion","J9",50,
                horarioFundamentosProgra, "Andres Rice",2, "2/2022");

        // 1/2023
        Asignatura estadistica = new Asignatura(10115,"Analisis Estadistico Para Ingenieria", "B1",40,
                horarioEstadistica, "Francisco Valenzuela",3,"1/2023");
        Asignatura edo = new Asignatura(10123,"Ecuaciones Diferenciales y Metodos Numericos Para Ingenieria","A1",28,
                horarioEdo,"Gonzalo Castro",3,"1/2023");
        Asignatura electro = new Asignatura(10127,"Electricidad y Magnetismo Para Ingenieria","A1",50,horarioElectro,
                "Patricio Perez",3,"1/2023");
        Asignatura ingles1 = new Asignatura(10130,"Ingles 1","I16",30,horarioIngles1,
                "Ernaldo Menares",3,"1/2023");
        Asignatura metodosProgra = new Asignatura(13201,"Metodos de Programacion","A1",22,horarioMetodosProgra,
                "Alejandro Cisterna",3,"1/2023");
        Asignatura comunicacionEfectiva = new Asignatura(10128,"Comunicacion Efectiva","A2",24,horarioComunicacionEfectiva,
                "Ivonne Aguayo",3,"1/2023");

        // 2/2023
        Asignatura ingles3 = new Asignatura(10132,"Ingles 3","I4",20,horarioIngles3,
                "Cristian Alvarez",4,"2/2023");
        Asignatura paradigmasProgramacion2023 = new Asignatura(13204,"Paradigmas de Programacion", "B2",
                20, horarioParadigmas2, "Victor Flores",4,"2/2023");
        Asignatura eda = new Asignatura(13205,"Analisis de Algoritmos y Estructuras de Datos","A1",27,horarioEda,
                "Violeta Chang",4,"2/2023");
        Asignatura ingesis = new Asignatura(13252,"Ingenieria de Sistemas","F6",26,horarioIngesis,
                "Jose Munoz",4,"2/2023");
        Asignatura edeco = new Asignatura(13273,"Estructura de Computadores","B2",24,horarioEstrucComp,
                "Cesar Rivera",4,"2/2023");
        Asignatura econo = new Asignatura(13116,"Fundamentos de Economia","F1",20,horarioEcono,
                "Francisco Anguita",4,"2/2023");

        // 1/2024
        Asignatura informaticaYSociedad = new Asignatura(13260, "Informatica y Sociedad","A1", 30,
                horarioInso, "Eliana Covarrubias",5,"1/2024");
        Asignatura sistemasDeInformacion = new Asignatura(13261,"Sistemas de Informacion", "A1", 30,
                horarioSIA, "Edgardo Sepulveda",5,"1/2024");
        Asignatura ingles4 = new Asignatura(13260, "Ingles 4", "I16", 30,
                horarioIngles4, "Franco Huile",6,"1/2024");
        Asignatura paradigmasDeProgramacion1 = new Asignatura(13204,"Paradigmas de Programacion", "A1",
                20, horarioParadigmas1, "Edmundo Leiva",4,"1/2024");
        Asignatura paradigmasDeProgramacion2 = new Asignatura(13204,"Paradigmas de Programacion", "B2",
                20, horarioParadigmas2, "Victor Flores",4,"1/2024");
        Asignatura paradigmasDeProgramacion3 = new Asignatura(13204,"Paradigmas de Programacion", "A2",
                20, horarioParadigmas3, "Gonzalo Martinez",4,"1/2024");


        // Asignaturas que me faltan por cursar y que desconozco su info
        Asignatura ingles2 = new Asignatura(17, "Ingles 2", "", 30, horarioIngles4, "",4,"");
        Asignatura evalProyectosInf = new Asignatura(25,"Evalucion de Proyectos Informaticos","A1",20,horarioEvalPro,"",5,"");
        Asignatura disenoBaseDatos = new Asignatura(26,"Diseno de Base de Datos","A1",20,horarioDisenoBaseDatos,"",5,"");
        Asignatura organizaComp = new Asignatura(27,"Organizacion de Computadores","A1",20,horarioOrgaComp,"",5,"");
        Asignatura fundamentosIngSoft = new Asignatura(28,"Fundamentos de Ingenieria de Software","A1",20,horarioFundaIngSoft,"",5,"");
        Asignatura admiProyectosInf = new Asignatura(32,"Administracion de Proyectos Informaticos","A1",20,horarioAdminiProy,"",6,"");
        Asignatura tallerBaseDatos = new Asignatura(33,"Taller de Base de Datos","A1",20,horarioTallerBaseDatos,"",6,"");
        Asignatura sistemasOperativos = new Asignatura(34,"Sistemas Operativos","A1",20,horarioSistemasOpera,"",6,"");
        Asignatura tecnicasIngSoft = new Asignatura(35,"Tenicas de Ingenieria de Software","A1",20,horarioTecnicasIngenieSoftware,"",6,"");
        Asignatura redes = new Asignatura(36,"Redes Computacionales","A1",20,horarioRedes,"",6,"");
        Asignatura proyectoIngSoft = new Asignatura(38,"Proyecto de Ingenieria de Software","A1",20,horarioProyectoIngenieSoftware,"",7,"");
        Asignatura espe1 = new Asignatura(39,"Topicos de Especialidad 1","A1",20,horarioEsp1,"",7,"");
        Asignatura espe2 = new Asignatura(40,"Topicos de Especialidad 2","A1",20,horarioEsp2,"",7,"");
        Asignatura espe3 = new Asignatura(41,"Topicos de Especialidad 3","A1",20,horarioEsp3,"",7,"");
        Asignatura seminario = new Asignatura(42,"Seminario de Computacion e Informatica","A1",20,horarioSeminario,"",7,"");
        Asignatura titulacion = new Asignatura(43,"Trabajo de Titulacion","A1",10,horarioTrabajoTitulacion,"",8,"");

        //Creacion Carrera
        Carrera ingEjecuInformatica = new Carrera(1,"Ingenieria de Ejecucion en Computacion e Informatica","Licenciado en Ingenieria Aplicada",
                "Ingenierio de Ejecucion en Computacion e Informatica",
                new ArrayList<>(Arrays.asList(calculo1,algebra1,fisica1,introduccionIngenieria,metodosDeEstudio,
                        tallerDesarrollo,calculo2,algebra2,fisica2,fundamentosProgra,quimica,introInforma,electro,comunicacionEfectiva,
                        ingles1,estadistica,edo,metodosProgra,econo,ingles2,ingesis,edeco,paradigmasDeProgramacion1,eda,ingles3,
                        evalProyectosInf,disenoBaseDatos,organizaComp,fundamentosIngSoft,informaticaYSociedad,sistemasDeInformacion,
                        admiProyectosInf,tallerBaseDatos,sistemasOperativos,tecnicasIngSoft,redes,ingles4,proyectoIngSoft,espe1,
                        espe2,espe3,seminario,titulacion)));

        //Creacion de algunos objetos heredados de usuario
        Administrador admin1 = new Administrador(199288374,"Pablo","Admin","1991",new Horario(),"DirecctorDiinf");
        Profesor profe1 = new Profesor();

        //Def estudiante
        Estudiante yo = new Estudiante(212855652,"Isaac","Espinoza","2022",new Horario(),
                new ArrayList<>(),new ArrayList<>(),new ArrayList<>(),new Carrera());
        yo.setAsignaturasCursadas(new ArrayList<>(Arrays.asList(calculo1,algebra1,fisica1,introduccionIngenieria,metodosDeEstudio,
                tallerDesarrollo,calculo2,algebra2,fisica2,fundamentosProgra,quimica,introInforma,electro,comunicacionEfectiva,
                ingles1,estadistica,edo,metodosProgra,econo,ingles2,ingesis,edeco,eda,ingles3)));
        yo.setAsignaturasReprobadas(new ArrayList<>(Arrays.asList(paradigmasProgramacion2023)));
        yo.setCarrera( ingEjecuInformatica);



        //Inscribir asignaturas, en caso de tope horario, el horario del objeto estudiante no cambia
        yo.inscribirAsignatura(ingles4);
        yo.inscribirAsignatura(informaticaYSociedad);
        yo.inscribirAsignatura(paradigmasDeProgramacion1);
        yo.inscribirAsignatura(sistemasDeInformacion);
        yo.inscribirAsignatura(calculo2); //no inscribe asignatura ya cursada
        yo.inscribirAsignatura(paradigmasDeProgramacion2);//no inscribe asignatura con tope horario


        System.out.println("Asignaturas Inscristas para el presente semestre:");
        yo.verListaCursos();
        System.out.println("Presente Semestre");
        yo.verHorario();



        //Idea. Armado de los semestres cursados
        // 1/2022
        Horario hoSemestre1 = new Horario();
        hoSemestre1.combinarHorario(calculo1.getHorario());
        hoSemestre1.combinarHorario(algebra1.getHorario());
        hoSemestre1.combinarHorario(fisica1.getHorario());
        hoSemestre1.combinarHorario(introduccionIngenieria.getHorario());
        hoSemestre1.combinarHorario(metodosDeEstudio.getHorario());
        hoSemestre1.combinarHorario(tallerDesarrollo.getHorario());
        System.out.println("\nSemestre 1/2022");
        hoSemestre1.mostrarHorario();

        // 2/2022
        Horario hoSemestre2 = new Horario();
        hoSemestre2.combinarHorario(calculo2.getHorario());
        hoSemestre2.combinarHorario(algebra2.getHorario());
        hoSemestre2.combinarHorario(fisica2.getHorario());
        hoSemestre2.combinarHorario(fundamentosProgra.getHorario());
        hoSemestre2.combinarHorario(quimica.getHorario());
        hoSemestre2.combinarHorario(introInforma.getHorario());
        System.out.println("\nSemestre 2/2022");
        hoSemestre2.mostrarHorario();

        // 1/2023
        Horario hoSemestre3 = new Horario();
        hoSemestre3.combinarHorario(electro.getHorario());
        hoSemestre3.combinarHorario(comunicacionEfectiva.getHorario());
        hoSemestre3.combinarHorario(ingles1.getHorario());
        hoSemestre3.combinarHorario(estadistica.getHorario());
        hoSemestre3.combinarHorario(edo.getHorario());
        hoSemestre3.combinarHorario(metodosProgra.getHorario());
        System.out.println("\nSemestre 1/2023");
        hoSemestre3.mostrarHorario();

        // 2/2023
        Horario hoSemestre4 = new Horario();
        hoSemestre4.combinarHorario(econo.getHorario());
        hoSemestre4.combinarHorario(ingles3.getHorario());
        hoSemestre4.combinarHorario(ingesis.getHorario());
        hoSemestre4.combinarHorario(edeco.getHorario());
        hoSemestre4.combinarHorario(eda.getHorario());
        //hoSemestre4.combinarHorario(paradigmasProgramacion2023.getHorario()); //no pude desinscribir el ramo, pero no di el curso
        System.out.println("\nSemestre 2/2023");
        hoSemestre4.mostrarHorario();
    }
}
