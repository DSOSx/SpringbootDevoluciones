package Devoluciones.Devoluciones;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Servicio {
    @Autowired 
    private Repositorio r;
    
    public List<devolucion> ListaCancelacion() {
    	return r.findAll();
    }
    
    public devolucion InsertarDevolucion(devolucion d) {
    	return r.save(d);
    }
}
