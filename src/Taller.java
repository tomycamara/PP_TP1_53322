public class Taller  extends Actividad{

    private boolean requiereNotebook;

    public Taller(int id, String titulo, int cupoMaximo, boolean requiereNotebook) {
        super(id, titulo, cupoMaximo);
        this.requiereNotebook = requiereNotebook;
    }

    public String getTipo(){
        return this.getClass().getTypeName();
    }

    @Override
    public double calcularCostoMateriales() {
        if (requiereNotebook){
            return 5000;
        } else{
            return 2000;
        }

    }
}
