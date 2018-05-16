
package boletin.pkg30;

/**
 *
 * @author David
 */
public class Masajista extends SeleccionFutbol{
    
    private String titulacion;
    private int aniosExperiencia;

    public Masajista() {
    }

    public Masajista(String titulacion, int aniosExperiencia, int id, String nome, String apelidos, int edade) {
        super(id, nome, apelidos, edade);
        this.titulacion = titulacion;
        this.aniosExperiencia = aniosExperiencia;
    }

    @Override
    public String toString() {
        return super.toString()+", titulacion: "+titulacion+", años experiencia: "+aniosExperiencia;
    }
    
    

    public void darMasaje(){
        System.out.println("O masaxista da un masaxe");
    }
    
    @Override
    public void concentrarse() {
        System.out.println("O masajista concentrase");
    }

    @Override
    public void viajar() {
        System.out.println("O masaxista viaxa");
    }

    @Override
    public void entrenar() {
        System.out.println("O masaxista entrena");
    }

    @Override
    public void jugarPartido() {
        System.out.println("O masaxista xoga o partido");
    }
    
}
