/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ister.modelo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author USER
 */
public class Ejercicios {
    
   private Integer arrayTemperaturas[];
    
    public void llenararreglo(){
        arrayTemperaturas=new Integer[10];
        for(int i=0;i<arrayTemperaturas.length;i++){
            arrayTemperaturas[i]=(int)(Math.random()*10);
        }
    }
    
     public void Imprimir(){
        String acu="";
       for (Integer arrayTemperatura : arrayTemperaturas) {
           acu += "" + arrayTemperatura;
       }
        JOptionPane.showMessageDialog(null,acu);
    }
     
     public void Imprimir1(){
        JOptionPane.showMessageDialog(null,Arrays.toString(arrayTemperaturas));
    }
     
     public void ordenar(){
         //ordenar el arreglo en orden ascendente utilizando una clase del JDK de java
         int array[]=new int[10];//se crea un arreglo
    for (int i=0; i<array.length; i++){//se cre un bucle for usando .length
        array[i]=(int)(Math.random()*10);
        Arrays.sort(array);//se utiliza la opcion .sort del JDK de java para ordenar el arreglo
       JOptionPane.showMessageDialog(null, array[i]);    
     }
     }
     
     public void maximo(){
        List<Integer> arr=new ArrayList();
        arr=Arrays.asList(arrayTemperaturas);
        Integer max= Collections.max(arr);
        JOptionPane.showMessageDialog(null,max);
    }
     
     public void menu(){
    
    int op;
    
    do {   
        
       op=Integer.parseInt( JOptionPane.showInputDialog("Ingrese lo que desea realizar\n\n"
               + "MENU OPCIONES\n\n"
               + "1) Llenar el Arreglo\n"
               + "2) Imprimir Arreglo \n"
               + "3) Imprimir Arreglo \n"
               + "4) Ordenar Arreglo\n"
               + "5) Maximo de un arreglo\n"
               + "6) SALIR\n"));
       
        
       switch(op){
           
           case 1:
               llenararreglo();
               break;
           case 2:
               Imprimir();
               break;
           case 3:
               Imprimir1();
               break;
           case 4:
               ordenar();
               break;
           case 5:
               maximo();
               break;
           
           case 6:
               System.exit(0);
               break;
                
       }
    } while (op!=6);
}
}
