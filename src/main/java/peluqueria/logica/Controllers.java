
package peluqueria.logica;

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
    
    
}
