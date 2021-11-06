package modelo;

import javax.persistence.*;

@Entity
@Table(name="Cliente")
public class Cliente {
    
    @Id
    @Column (name="Id")
    private int idCliente;
    
    @Column (name="Nombre")
    private String nombre;
    
    @Column (name="Raza")
    private String raza;
    
    @Column (name="Color")
    private String color;
    
    @Column (name="Alergia")
    private String alergia;
    
    @Column (name="AtencionEspecial")
    private String atencionEspecial;
    
    @OneToOne
    @JoinColumn (name="Dueño")
    private Dueno dueño;
    
    public Cliente(){
        
    }

    public Cliente(int idCliente, String nombre, String raza, String color, String alergia, String atencionEspecial) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.raza = raza;
        this.color = color;
        this.alergia = alergia;
        this.atencionEspecial = atencionEspecial;
    }

    public Cliente(int idCliente, String nombre, String raza, String color, String alergia, String atencionEspecial, Dueno dueño) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.raza = raza;
        this.color = color;
        this.alergia = alergia;
        this.atencionEspecial = atencionEspecial;
        this.dueño = dueño;
    }
    
    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getAlergia() {
        return alergia;
    }

    public void setAlergia(String alergia) {
        this.alergia = alergia;
    }

    public String getAtencionEspecial() {
        return atencionEspecial;
    }

    public void setAtencionEspecial(String atencionEspecial) {
        this.atencionEspecial = atencionEspecial;
    }

    public Dueno getDueño() {
        return dueño;
    }

    public void setDueño(Dueno dueño) {
        this.dueño = dueño;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cliente{idCliente=").append(idCliente);
        sb.append(", nombre=").append(nombre);
        sb.append(", raza=").append(raza);
        sb.append(", color=").append(color);
        sb.append(", alergia=").append(alergia);
        sb.append(", atencionEspecial=").append(atencionEspecial);
        sb.append(", due\u00f1o=").append(dueño);
        sb.append('}');
        return sb.toString();
    }

    
    
}
