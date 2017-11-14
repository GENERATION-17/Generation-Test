/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Validacion;

/**
 *
 * @author diana
 */
public class Preguntas {
    private String primera_preg;
    private String segunda_preg;

    /**
     * @return the primera_preg
     */
    public String getPrimera_preg() {
        return primera_preg;
    }

    /**
     * @param primera_preg the primera_preg to set
     */
    public void setPrimera_preg(String primera_preg) {
        this.primera_preg = primera_preg;
    }

    /**
     * @return the segunda_preg
     */
    public String getSegunda_preg() {
        return segunda_preg;
    }

    /**
     * @param segunda_preg the segunda_preg to set
     */
    public void setSegunda_preg(String segunda_preg) {
        this.segunda_preg = segunda_preg;
    }
    
    public void Preguntas(){
      primera_preg = "te llamas Fermin?";
      segunda_preg = "Te llamas Jannette?";
    }
    
    
}
