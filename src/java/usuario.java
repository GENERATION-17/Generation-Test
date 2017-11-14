/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author diana
 */
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.event.AjaxBehaviorEvent;

public class usuario {

    /**
     * @return the nombre
     */
     private String nombre;
    private String mensajeErrorNombre;
    private String password;
    private String mensajeErrorPassword;
    private int edad;
    
    public usuario(){}
    
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    public String getMensajeErrorNombre() {
        return mensajeErrorNombre;
    }

    /**
     * @param mensajeErrorNombre the mensajeErrorNombre to set
     */
    public void setMensajeErrorNombre(String mensajeErrorNombre) {
        this.mensajeErrorNombre = mensajeErrorNombre;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the mensajeErrorPassword
     */
    public String getMensajeErrorPassword() {
        return mensajeErrorPassword;
    }

    /**
     * @param mensajeErrorPassword the mensajeErrorPassword to set
     */
    public void setMensajeErrorPassword(String mensajeErrorPassword) {
        this.mensajeErrorPassword = mensajeErrorPassword;
    }

    /**
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }
    
        
    /**
     * Comprueba que la longitud del nombre este en el rango correcto
     * 
     * @param evento 
     */
    public void validarNombre(AjaxBehaviorEvent evento) {
        if (nombre.length() < 4) {
            mensajeErrorNombre = "El nombre tiene que tener como minimo 4 caracteres";
        } else {
            if (nombre.length() > 10) {
                mensajeErrorNombre = "El nombre puede tener como maximo 10 caracteres";
            } else {
                mensajeErrorNombre = "";
            }
        }
    }
    
    /**
     * Comprueba que la longitud de la password este en el rango correcto
     * 
     * @param evento 
     */
    public void validarPassword(AjaxBehaviorEvent evento) {
        if (password.length() < 6) {
            mensajeErrorPassword = "La contraseña tiene que tener como minimo 6 caracteres";
        } else {
            if (password.length() > 15) {
                mensajeErrorPassword = "La contraseña puede tener como maximo 15 caracteres";
            } else {
                mensajeErrorPassword = "";
            }
        }
    }
   
    
}
