public class Main {
    public static void main(String[] args) {

    EventoUniversitario evento = new EventoUniversitario("1", "primer evento", 300000, false);
    EventoUniversitario evento2 = new EventoUniversitario("2", "segundo evento", 3000, true);
    EventoUniversitario evento3 = new EventoUniversitario("3", "tercer evento", 10000, false);

    System.out.println("Cantidad de eventos creados: " + EventoUniversitario.getCantidadEventos());

    Estudiante estudiante1 = new Estudiante("53322", "Tomas");
    Estudiante estudiante2 = new Estudiante("59782", "Jose");
    Estudiante estudiante3 = new Estudiante("57232", "Andrea");

    Sala sala1 = new Sala(1, "primer sala");
    Sala sala2 = new Sala(2, "segunda sala");
    Sala sala3 = new Sala(3, "tercer sala");

    evento.asignarSala(sala1);
    evento2.asignarSala(sala2);
    evento3.asignarSala(sala3);

    evento.crearActividad(1,"primer taller", 33, false);
    evento.crearActividad(2,"segundo taller", 3300, true);
    evento.crearActividad(3,"primera charla", 98, "Miguel");
    evento.crearActividad(4,"segunda charla", 12, "Jose");


    evento2.crearActividad(44, "taller carpinteria", 15, false);
    evento2.crearActividad(67,"taller de soldadura",25, true);

    evento3.crearActividad(95, "charla importante", 78, "Shakespeare");
    evento3.crearActividad(10, "Boca jrs", 12, "Palermo");

    evento.actividades.get(0).inscribir(estudiante1);
    evento.actividades.get(0).inscribir(estudiante2);
    evento.actividades.get(0).inscribir(estudiante3);
    evento.actividades.get(1).inscribir(estudiante1);
    evento.actividades.get(2).inscribir(estudiante1);
    evento.actividades.get(2).inscribir(estudiante1);

    evento2.actividades.get(0).inscribir(estudiante2);
    evento2.actividades.get(1).inscribir(estudiante3);

    evento3.actividades.get(1).inscribir(estudiante1);
    evento3.actividades.get(0).inscribir(estudiante2);

    evento.mostrarDatos();
    evento2.mostrarDatos();
    evento3.mostrarDatos();


    }
}