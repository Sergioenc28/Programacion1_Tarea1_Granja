/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package animales;

/**
 *
 * @author Sergio and Clary
 */
public class Granja {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
        Perro perro = new Perro();
        Gato gato = new Gato();
        Gallina gallina = new Gallina();
        
        System.out.println(perro.decirQuienSoy());
        System.out.println(gato.decirQuienSoy());
        System.out.println(gallina.decirQuienSoy());
        
    }
}
