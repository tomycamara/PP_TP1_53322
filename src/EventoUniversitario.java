import java.util.ArrayList;
import java.util.List;

public class EventoUniversitario {
    private final String id;
    private String titulo;
    private double costoBase;
    private  boolean gratuito;
    private static int cantidadEventos;
    Sala sala;
    public List<Actividad> actividades;

    static {
        cantidadEventos = 0;
    }

    public EventoUniversitario(String id, String titulo, double costoBase, boolean gratuito) {
        this.id = id;
        this.titulo = titulo;
        this.costoBase = costoBase;
        this.gratuito = gratuito;
        this.actividades = new ArrayList<Actividad>();
        cantidadEventos++;
    }

    public EventoUniversitario( EventoUniversitario EventoUniversitarioOriginal){
        this.id = EventoUniversitarioOriginal.id;
        this.titulo = EventoUniversitarioOriginal.titulo;
        this.costoBase = EventoUniversitarioOriginal.costoBase;
        this.gratuito = EventoUniversitarioOriginal.gratuito;
        this.actividades = EventoUniversitarioOriginal.actividades;
        cantidadEventos++;
    }

    public double calcularCostoEstimado(){
        double costoTotal = costoBase;
        for (Actividad i: actividades){
            costoTotal += i.calcularCostoMateriales();

        }
        System.out.println("El costo total estimado es: $" + costoTotal);
        return costoTotal*1.21;
    }

    public void asignarSala(Sala sala){
        this.sala = sala;

    }

    public void crearActividad(int id, String titulo, int cupo, boolean requiereNotebook){
        actividades.add(new Taller(id,titulo,cupo, requiereNotebook));
    }
    public void crearActividad(int id, String titulo, int cupo, String disertante){
        actividades.add(new Charla(id,titulo,cupo, disertante));
    }


    public void mostrarDatos(){
        System.out.println("-----------EVENTO------------");
        System.out.println("Titulo: " + titulo);
        System.out.println("Id: " + id);
      System.out.println("Costo base: " + costoBase);
      System.out.println("Costo estimado: " + this.calcularCostoEstimado());
      System.out.println("Gratuito: " + gratuito);
      System.out.println("Sala: " + this.sala.getNombre());
      System.out.println("Sala ID: " + this.sala.getId());
      for(Actividad a: actividades) {
          System.out.println("-----------ACTIVIDAD------------");
          a.mostrarDatosAct();
          System.out.println("-----------------------");
      }
      System.out.println("-----------------------");
    }

    public static int getCantidadEventos(){
        return cantidadEventos;
    }
}
