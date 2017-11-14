/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Validacion;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
@ManagedBean
@SessionScoped
/**
 *
 * @author diana
 */
public class Respuestas {
    
    private String primera_p;
    private String segunda_p;
    private String respuesta;
    private String name1 = "si";
    private int contador;

    public String getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }
    public String getPrimera_p() {
        return primera_p;
    }

    public void setPrimera_p(String primera_p) {
        this.primera_p = primera_p;
    }
     /**
     * @return the segunda_p
     */
    public String getSegunda_p() {
        return segunda_p;
    }

    /**
     * @param segunda_p the segunda_p to set
     */
    public void setSegunda_p(String segunda_p) {
        this.segunda_p = segunda_p;
    }
    
    public int login(){
       if (primera_p.equals("si")){
       respuesta = "jiji funcionó";
       contador +=90;
       }
       else if(primera_p.equals("no")){
       respuesta="no lo lograste:C";
       }
       return contador;
    }
    
    
    
    
}
