
package ejemploversiones;

import ejemploversiones.entidades.Cliente;
import ejemploversiones.entidades.Producto;

/**
 *
 * @author BETO
 */
public class EjemploVersiones {

    public static void main(String[] args) {
       Cliente cliente=new Cliente("Alberto", 4222222);
       Cliente c2=new Cliente("Sebas",12345678);
       
       Producto producto=new Producto("Aceite", 15, 22.50, 6);
    }
    
}
