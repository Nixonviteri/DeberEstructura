/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ister.vista;

import ec.edu.ister.modelo.ListaEnlasada;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author USER
 */
public class Aplicacion {
    public static void main(String[] args) {
                
         Random r;
        int d;
        ListaEnlasada lista;
        int k;
        r=new Random(); 
        lista=new ListaEnlasada();                    
        k=Math.abs(r.nextInt()%55);             
       
        for(;k>0;k--){
            d=r.nextInt()%99;
            lista.insertarCabezaLista(d);   
        }
        JOptionPane.showMessageDialog(null,"Elementos de la lista generados al azar");
        lista.visualizar();  
         JOptionPane.showMessageDialog(null,"La lista se encuentra vacia:   "+lista.ListaVacia());
    }
    }
    
