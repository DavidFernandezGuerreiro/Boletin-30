
package boletin.pkg30;

/**
 *
 * @author David
 */
public class Entrenador extends SeleccionFutbol{

    private int idFederacion;

    public Entrenador() {
    }

    public Entrenador(int idFederacion, int id, String nome, String apelidos, int edade) {
        super(id, nome, apelidos, edade);
        this.idFederacion = idFederacion;
    }

    @Override
    public String toString() {
        return super.toString()+", Id Federacion: "+idFederacion;
    }
    
    
    
    public void planificarEntrenamiento(){
        System.out.println("O entrenador planifica");
    }
    
    @Override
    public void concentrarse() {
        System.out.println("O entrenador concentrase");
    }

    @Override
    public void viajar() {
        System.out.println("O entrenador viaxa");
    }

    @Override
    public void entrenar() {
        System.out.println("O entrenador entrena");
    }

    @Override
    public void jugarPartido() {
        System.out.println("O entrenador xoga un partido");
    }
    
    
    
}
