
package peluqueria.logica;

import java.io.Serializable;
import javax.persistence.*;

@Entity
public class Mascota implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int num_cliente;
    private String nombreMascota;
    private String raza;
    private String color;
    private String alergico;
    private String atencion_especial;
    private String Observaciones;
    
    @OneToOne 
    private Duenio duenio;

    public Mascota() {
    }

    public Mascota(int num_cliente, String nombreMascota, String raza, String color, String alergico, String atencion_especial, String Observaciones, Duenio duenio) {
        this.num_cliente = num_cliente;
        this.nombreMascota = nombreMascota;
        this.raza = raza;
        this.color = color;
        this.alergico = alergico;
        this.atencion_especial = atencion_especial;
        this.Observaciones = Observaciones;
        this.duenio = duenio;
    }

    public int getNum_cliente() {
        return num_cliente;
    }

    public void setNum_cliente(int num_cliente) {
        this.num_cliente = num_cliente;
    }

    public String getNombreMascota() {
        return nombreMascota;
    }

    public void setNombreMascota(String nombreMascota) {
        this.nombreMascota = nombreMascota;
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

    public String getAlergico() {
        return alergico;
    }

    public void setAlergico(String alergico) {
        this.alergico = alergico;
    }

    public String getAtencion_especial() {
        return atencion_especial;
    }

    public void setAtencion_especial(String atencion_especial) {
        this.atencion_especial = atencion_especial;
    }

    public String getObservaciones() {
        return Observaciones;
    }

    public void setObservaciones(String Observaciones) {
        this.Observaciones = Observaciones;
    }

    public Duenio getDuenio() {
        return duenio;
    }

    public void setDuenio(Duenio duenio) {
        this.duenio = duenio;
    }

    @Override
    public String toString() {
        return "Mascota{" + "num_cliente=" + num_cliente + ", nombreMascota=" + nombreMascota + ", raza=" + raza + ", color=" + color + ", alergico=" + alergico + ", atencion_especial=" + atencion_especial + ", Observaciones=" + Observaciones + ", duenio=" + duenio + '}';
    }
    
    
    
}
