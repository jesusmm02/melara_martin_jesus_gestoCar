package es.albarregas.beans;

/**
 *
 * @author Jesús
 */
public class Usuario {
    
    private int idUsuario;
    private String nombre;
    private String apellidos;
    private String email;
    private String password;
    private String dni;
    private char campoBaja;

    public int getIdUsuario() {
        return idUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getDni() {
        return dni;
    }

    public char getCampoBaja() {
        return campoBaja;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setCampoBaja(char campoBaja) {
        this.campoBaja = campoBaja;
    }
    
    
    
    
}
