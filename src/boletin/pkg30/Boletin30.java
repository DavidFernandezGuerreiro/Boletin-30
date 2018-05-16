
package boletin.pkg30;

import java.util.ArrayList;

/**
 *
 * @author David
 */
public class Boletin30 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SeleccionFutbol fut=new Futbolista(1,111,"Pepe","Lopez",20);//int dorsal, int id, String nome, String apelidos, int edade
        SeleccionFutbol ent=new Entrenador(1212,222,"Juan","Pérez",35);//int idFederacion, int id, String nome, String apelidos, int edade
        SeleccionFutbol mas=new Masajista("Masajista",5,333,"Pedro","Gonzalez",33);//String titulacion, int aniosExperiencia, int id, String nome, String apelidos, int edade
//        SeleccionFutbol sel=new Seleccionar(444,"Juanjo","Rodriguez",40);//int id, String nome, String apelidos, int edade
        
        ArrayList<SeleccionFutbol>lista=new ArrayList();
        
        lista.add(fut);
        lista.add(ent);
        lista.add(mas);
        
        /* ISTO É O POLIMORFISMO */
        Seleccionar sel=new Seleccionar();
        sel.amosarConcentracion(fut);
        sel.amosarConcentracion(ent);
        sel.amosarConcentracion(mas);
        
//        fut.concentrarse();
//        ent.concentrarse();
//        mas.concentrarse();
//        sel.concentrarse();
        
        System.out.println("\n");

        fut.viajar();
        ent.viajar();
        mas.viajar();
        
        System.out.println("\n");
        
//        System.out.println(fut.toString());
//        System.out.println(ent.toString());
//        System.out.println(mas.toString());
        
        for(SeleccionFutbol a:lista){
            System.out.println(a);
        }

        System.out.println("\n");
        
        /* NO POLIMORFISMO */
        Futbolista fut2=new Futbolista();
        fut2.entrevista();
        
        Entrenador ent2=new Entrenador();
        ent2.planificarEntrenamiento();
    }
    
}
