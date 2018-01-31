/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ister.controlador;

/**
 *
 * @author USER
 */
public class Nodo {
     int datos;
     private Nodo enlase;
    public Nodo enlace;
    public String dato;
    public Nodo(int dato) {
        this.datos=dato;
       
    }

    /**
     * @return the datos
     */
    public int getDatos() {
        return datos;
    }
    /**
     * @return the enlase
     */
    public Nodo getEnlase() {
        return enlase;
    }

    /**
     * @param enlase the enlase to set
     */
    public void setEnlase(Nodo enlase) {
        this.enlase = enlase;
    }
    
    
}
