
package peluqueria.logica;

import java.util.List;
import peluqueria.persistencia.ControllerPersistencia;


public class Controllers {
    
    ControllerPersistencia controlPersistencia = new ControllerPersistencia();

    public void guardar(String nombreMascota, String raza, String color, String nombreDuenio, 
            String celDuenio, String observaciones, String alergico, String atencionEspecial) {
     
        
        
        Duenio duenio = new Duenio();
        duenio.setNombre(nombreDuenio);
        duenio.setCelDuenio(celDuenio);
        
        
        
        
        
        Mascota mascota = new Mascota();
        mascota.setNombreMascota(nombreMascota);
        mascota.setRaza(raza);
        mascota.setColor(color);
        mascota.setObservaciones(observaciones);
        mascota.setAlergico(alergico);
        mascota.setAtencion_especial(atencionEspecial);
        mascota.setDuenio(duenio);
        
        
        //llamar desde persistencia
        
         controlPersistencia.guardar(duenio,mascota);
        
        
    }

    public List<Mascota> traerMacota() {
        
        return controlPersistencia.traerMascotas();
        


    }

    public void borrarMascota(int num_cliente) {
        controlPersistencia.borrarMascota(num_cliente);

    }

    public Mascota mostrarMascota(int num_cliente) {
       return controlPersistencia.buscarMascotas(num_cliente);

    }

    public void modificarMascota(Mascota masco, String nombreMascota, String raza, String color, String observaciones, String alergico, String atencionEspecial, String nombreDuenio, String celDuenio) {
            
            masco.setNombreMascota(nombreMascota);
            masco.setRaza(raza);
            masco.setColor(color);
            masco.setAlergico(alergico);
            masco.setObservaciones(observaciones);
            masco.setAtencion_especial(atencionEspecial);
            
            //modificar mascota
            controlPersistencia.modificarMascota(masco);
            
            Duenio dueno = this.buscarDuenio(masco.getDuenio().getId_duenio());
            dueno.setNombre(nombreDuenio);
            dueno.setCelDuenio(celDuenio);
            //llamar duenio
            
            this.modificarDuenio(dueno);
        
    }

    private Duenio buscarDuenio(int id_duenio) {
        return controlPersistencia.traerDuenio(id_duenio);

    }

    private void modificarDuenio(Duenio dueno) {
            controlPersistencia.modificarDuenio(dueno);
    }
    
    
}
