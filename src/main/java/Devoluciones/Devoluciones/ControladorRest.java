package Devoluciones.Devoluciones;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
@CrossOrigin(origins="*")
public class ControladorRest {
    @Autowired
    private Servicio s = new Servicio();
       
    @GetMapping(value="/")
    public String getSaludo() {
    	return "Saludo";
    } 
               
    @GetMapping(value="/get")
    public List<devolucion> ObtenerCancelaciones(){
    	return s.ListaCancelacion();
    }
        
    @PostMapping(value="/post")
    public devolucion InsertarDevolucion(@RequestBody devolucion d) {
    	return s.InsertarDevolucion(d);
    }
    
}
