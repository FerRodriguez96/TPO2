package modelo;

import javax.persistence.*;

@Entity
@Table(name="Dueno")
public class Dueno {
    
    @Id
    @SequenceGenerator(name = "sec_due", initialValue = 1, allocationSize = 1)
    @GeneratedValue(generator = "sec_due", strategy = GenerationType.SEQUENCE)
    private int idDueño;
    
    @Column (name="Nombre")
    private String nombre;
    
    @Column (name="Celular")
    private String celular;
    
    @Column (name="observaciones")
    private String observaciones;
    
    @OneToOne
    @JoinColumn (name="Mascota")
    private Cliente mascota;
    
    public Dueno(){
        
    }

    public Dueno(String nombre, String celular, String observaciones) {
        this.nombre = nombre;
        this.celular = celular;
        this.observaciones = observaciones;
    }

    public Dueno(String nombre, String celular, String observaciones, Cliente mascota) {
        this.nombre = nombre;
        this.celular = celular;
        this.observaciones = observaciones;
        this.mascota = mascota;
    }

    public int getIdDueño() {
        return idDueño;
    }

    public void setIdDueño(int idDueño) {
        this.idDueño = idDueño;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public Cliente getMascota() {
        return mascota;
    }

    public void setMascota(Cliente mascota) {
        this.mascota = mascota;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Due\u00f1o{idDue\u00f1o=").append(idDueño);
        sb.append(", nombre=").append(nombre);
        sb.append(", celular=").append(celular);
        sb.append(", observaciones=").append(observaciones);
        sb.append(", mascota=").append(mascota);
        sb.append('}');
        return sb.toString();
    }
}
