
package com.mycompany.ejercicio15_actividad2;
import java.util.Scanner;
public class Ejercicio15_actividad2 {

    public static void main(String[] args) {
     Scanner leerporteclado = new Scanner(System.in);
      
      double PesoA, PesoB, PesoC, PesoD;
      
        System.out.print("Ingrese el peso de la esfera A: ");
        PesoA = leerporteclado.nextDouble();
        
        System.out.print("Ingrese el peso de la esfera B: ");
        PesoB = leerporteclado.nextDouble();
        
        System.out.print("Ingrese el peso de la esfera C: ");
        PesoC = leerporteclado.nextDouble();
        
        System.out.print("Ingrese el peso de la esfera D: ");
        PesoD = leerporteclado.nextDouble();
        
        
        if(PesoA==PesoB && PesoA==PesoC){
            System.out.print("La esfera D es la diferente");
            if(PesoD>PesoA){
            System.out.print(" Y es de mayor peso");
        }else {
            System.out.print(" Y es de menor Peso");
        }
        }
        
        
        
        if(PesoA==PesoB && PesoA==PesoD){
            System.out.print("La esfera C es la diferente ");
            if(PesoC>PesoA){
            System.out.print("Y es de mayor peso");
        }else {
            System.out.print("Y es de menor Peso");
        }
        } 
        
        if(PesoA==PesoC && PesoA==PesoD){
            System.out.print("La esfera B es la diferente ");
            if(PesoB>PesoA){
            System.out.print("y es de mayor peso");
        }else {
            System.out.print("y es de menor Peso");
        }
        } 
        
        else {
            System.out.print("La esfera A es la diferente ");
            if(PesoA>PesoB){
            System.out.print("Y es de mayor peso");
        }else {
            System.out.print("Y es de menor Peso");
        }
        } 
    }
}
