
import java.util.ArrayList;
import java.util.List;

public abstract class Actividad {
    private int id;
    private String titulo;
    private int cupoMaximo;
    public static final int cupoMinimo;
    private List<Inscripcion> inscripciones;

    static {
        cupoMinimo = 3;
    }

    public Actividad(int id, String titulo, int cupoMaximo) {
        this.id = id;
        this.titulo = titulo;
        this.cupoMaximo = cupoMaximo;
        this.inscripciones = new ArrayList<Inscripcion>();

    }

    public Inscripcion inscribir(Estudiante  estudiante){
        if(inscripciones.size() <= cupoMaximo){
    Inscripcion inscripcion = new Inscripcion(this, estudiante);
    inscripciones.add(inscripcion);
    return inscripcion;

} else{
    System.out.println("limite superado");
    return  null;
}
    }
    public void mostrarDatosAct(){

        System.out.println("Nombre: "+ this.titulo);
        System.out.println("Id: "+ this.id);
        System.out.println("Cupo Maximo: "+ this.cupoMaximo);
        System.out.println("----------------------");
        System.out.println("---INSCRIPCIONES---");
        mostrarInscripciones();
    }



    public void mostrarInscripciones(){
        for (Inscripcion i: inscripciones) {
            i.mostrarDatos();
        }

    }
    public abstract double calcularCostoMateriales();
     }