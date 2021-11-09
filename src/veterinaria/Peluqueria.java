package veterinaria;

import controlador.ControladorCliente;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import persistencia.Persistencia;
import vista.PeluqueriaVista;


public class Peluqueria {
    
     public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("TPO2PU");
        Persistencia p = new Persistencia(emf);
        ControladorCliente c = new ControladorCliente(p);
        PeluqueriaVista pv = new PeluqueriaVista(c);
        pv.setResizable(false);
        pv.setVisible(true);
    }
}
