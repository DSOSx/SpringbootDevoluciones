package Devoluciones.Devoluciones;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "devolucion")
public class devolucion implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;
    @Column(name="rfccliente")
    private String rfccliente;
    @Column(name="rfcfacturacion")
    private String rfcfacturacion;
    @Column(name="idventa")
    private String idventa;
    @Column(name="nombrecancelo")
    private String nombrecancelo;
    @Column(name="fechacancelacion")
    private Date fechacancelacion;
    @Column(name="fechafacturacion")
    private Date fechafacturacion;

    public devolucion() {}

	public devolucion(int id, String rfccliente, String rfcfacturacion, String idventa, String nombrecancelo,
			Date fechacancelacion, Date fechafacturacion) {
		this.id = id;
		this.rfccliente = rfccliente;
		this.rfcfacturacion = rfcfacturacion;
		this.idventa = idventa;
		this.nombrecancelo = nombrecancelo;
		this.fechacancelacion = fechacancelacion;
		this.fechafacturacion = fechafacturacion;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRfccliente() {
		return rfccliente;
	}

	public void setRfccliente(String rfccliente) {
		this.rfccliente = rfccliente;
	}

	public String getRfcfacturacion() {
		return rfcfacturacion;
	}

	public void setRfcfacturacion(String rfcfacturacion) {
		this.rfcfacturacion = rfcfacturacion;
	}

	public String getIdventa() {
		return idventa;
	}

	public void setIdventa(String idventa) {
		this.idventa = idventa;
	}

	public String getNombrecancelo() {
		return nombrecancelo;
	}

	public void setNombrecancelo(String nombrecancelo) {
		this.nombrecancelo = nombrecancelo;
	}

	public Date getFechacancelacion() {
		return fechacancelacion;
	}

	public void setFechacancelacion(Date fechacancelacion) {
		this.fechacancelacion = fechacancelacion;
	}

	public Date getFechafacturacion() {
		return fechafacturacion;
	}

	public void setFechafacturacion(Date fechafacturacion) {
		this.fechafacturacion = fechafacturacion;
	}
    
    
}