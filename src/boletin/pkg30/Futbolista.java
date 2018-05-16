
package boletin.pkg30;

/**
 *
 * @author David
 */
public class Futbolista extends SeleccionFutbol{

    private int dorsal;

    public Futbolista() {
    }

    public Futbolista(int dorsal, int id, String nome, String apelidos, int edade) {
        super(id, nome, apelidos, edade);
        this.dorsal = dorsal;
    }
    
    public void entrevista(){
        System.out.println("O fubolista ten unha entrevista");
    }
    
    @Override
    public void concentrarse() {
        System.out.println("O futbolista concentrase");
    }

    @Override
    public void viajar() {
        System.out.println("O futbolista viaxa");
    }

    @Override
    public void entrenar() {
        System.out.println("O futbolista entrena");
    }

    @Override
    public void jugarPartido() {
        System.out.println("O futbolista xoga un partido");
    }

    @Override
    public String toString() {
        return super.toString()+", dorsal: "+dorsal;
    }


    
    
    
}
