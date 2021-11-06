
package controlador;

import persistencia.Persistencia;
import modelo.Cliente;
import modelo.Dueno;

public class ControladorCliente {
    
    Persistencia p;
    
    public void CrearCliente (int id, String nombre, String raza, String color , String alergico, String atencion, String nombredueno, String celular, String observaciones){
        
        var dueno = new Dueno(nombredueno, celular, observaciones);
        var cliente = new Cliente (id, nombre, raza, color, alergico, atencion, dueno);

        p.iniciarTransaccion();
        p.insertar(cliente);
        p.confirmarTransaccion();
        
        
    }
    
}
