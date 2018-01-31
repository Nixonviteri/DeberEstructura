/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ister.modelo;

import ec.edu.ister.controlador.Nodo;


/**
 *
 * @author USER
 */
public class ListaEnlasada {
 
    protected Nodo primero;
    public ListaEnlasada(){
        primero=null;
    }
    public ListaEnlasada insertarCabezaLista(int entrada){
        Nodo nuevo;
        nuevo=new Nodo(entrada);
        nuevo.enlace=primero;
        primero=nuevo;
        return this;   
    }
    public void visualizar(){
        Nodo n;
        int k=0;
        n=primero;
        while(n!=null){
            System.out.print(n.dato+" ");
            n=n.enlace;
            k++;
            System.out.print((k%15!=0?" ":"\n"));
        }
    }
    // Creamos el metodo  para que devuelva cierto si la lista está vacía.

    public boolean ListaVacia () {
        return(primero==null);
        
    }

    public String estaVacio() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    

}
   
