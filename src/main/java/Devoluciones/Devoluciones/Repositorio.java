package Devoluciones.Devoluciones;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
interface Repositorio extends JpaRepository<devolucion,Integer>{}
