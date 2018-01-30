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
     int dato;
    Nodo enlace;
    public Nodo getEnlace;
 public Nodo(int x){
     dato = x;
     enlace = null;
}
  public int getDato(){
     return dato;
}
  public Nodo getEnlace()
{
    return enlace;
}
  public void setEnlace(Nodo enlace)
{
    this.enlace = enlace;
  }
}
