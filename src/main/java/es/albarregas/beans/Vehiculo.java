package es.albarregas.beans;

import es.albarregas.Enum.Motor;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Jesús
 */
public class Vehiculo {
    
    private int idVehiculo;
    private int idUsuario;
    private String marca;
    private String modelo;
    private Motor motor;
    private String matricula;
    private int cilindrada;
    private int caballos;
    private int color;
    private Date fechaCompra;
    private Date fechaVenta;
    private double precioCompra;
    private double precioVenta;
 
    private List<Foto> fotos;

    public int getIdVehiculo() {
        return idVehiculo;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public Motor getMotor() {
        return motor;
    }

    public String getMatricula() {
        return matricula;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public int getCaballos() {
        return caballos;
    }

    public int getColor() {
        return color;
    }

    public Date getFechaCompra() {
        return fechaCompra;
    }

    public Date getFechaVenta() {
        return fechaVenta;
    }

    public double getPrecioCompra() {
        return precioCompra;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setIdVehiculo(int idVehiculo) {
        this.idVehiculo = idVehiculo;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    public void setCaballos(int caballos) {
        this.caballos = caballos;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public void setFechaCompra(Date fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public void setFechaVenta(Date fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    public void setPrecioCompra(double precioCompra) {
        this.precioCompra = precioCompra;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }
    
    
    
}
