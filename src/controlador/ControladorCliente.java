
package controlador;

import persistencia.Persistencia;
import modelo.Cliente;
import modelo.Dueno;

public class ControladorCliente {
    
    Persistencia persistencia;
    
    public ControladorCliente(Persistencia p) {
        this.persistencia = p;
    }
    public void CrearCliente (int id, String nombre, String raza, String color , String alergico, String atencion, String nombredueno, String celular, String observaciones){
        
        var cliente = new Cliente (id, nombre, raza, color, alergico, atencion);
        var dueno = new Dueno(nombredueno, celular, observaciones);
        
        cliente.setDueño(dueno);
        dueno.setMascota(cliente);

        this.persistencia.iniciarTransaccion();
        this.persistencia.insertar(dueno);
        this.persistencia.confirmarTransaccion();
        
        this.persistencia.iniciarTransaccion();
        this.persistencia.insertar(cliente);
        this.persistencia.confirmarTransaccion();
        

        
        System.out.println("Guardado correctamente!");

    }
}
