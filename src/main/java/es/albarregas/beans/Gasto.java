package es.albarregas.beans;

import java.util.Date;

/**
 *
 * @author Jesús
 */
public class Gasto {

    private int idGasto;
    private int idVehiculo;
    private String concepto;
    private Date fechaGasto;
    private String descripcion;
    private double importe;
    private String establecimiento;
    private int kilometros;

    public int getIdGasto() {
        return idGasto;
    }

    public int getIdVehiculo() {
        return idVehiculo;
    }

    public String getConcepto() {
        return concepto;
    }

    public Date getFechaGasto() {
        return fechaGasto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getImporte() {
        return importe;
    }

    public String getEstablecimiento() {
        return establecimiento;
    }

    public int getKilometros() {
        return kilometros;
    }

    public void setIdGasto(int idGasto) {
        this.idGasto = idGasto;
    }

    public void setIdVehiculo(int idVehiculo) {
        this.idVehiculo = idVehiculo;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public void setFechaGasto(Date fechaGasto) {
        this.fechaGasto = fechaGasto;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    public void setEstablecimiento(String establecimiento) {
        this.establecimiento = establecimiento;
    }

    public void setKilometros(int kilometros) {
        this.kilometros = kilometros;
    }
    
    
    
}
