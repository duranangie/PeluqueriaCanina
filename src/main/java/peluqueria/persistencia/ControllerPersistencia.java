
package peluqueria.persistencia;

import peluqueria.logica.Duenio;
import peluqueria.logica.Mascota;


public class ControllerPersistencia {
    
    DuenioJpaController djc = new DuenioJpaController();
    MascotaJpaController mjc = new MascotaJpaController();

    public void guardar(Duenio duenio, Mascota mascota) {
            
        djc.create(duenio);
        mjc.create(mascota);
        
    }
    
    
    
}