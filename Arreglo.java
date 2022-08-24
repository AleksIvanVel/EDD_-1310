package com.mycompany.clasearreglo;

import java.util.Scanner;

public class Arreglo {
    int indice;
    int valor;
    int tamanioArray;


    public Arreglo(){
       this.indice = 0;
       this.valor= 0;
       this.tamanioArray = 0;
    }

    public Arreglo(int indice, int valor, int tamanioArray){
       this.indice = indice;
       this.valor= valor;
       this.tamanioArray = tamanioArray;
    }

    public static void arreglo(int tamanioArray){
       int []arreglo = new int[tamanioArray];
       System.out.println("Arreglo creado");
    }

    public static int obtenerLongitud(){
       return "El tamanio del arreglo es: " + arreglo.length;
    }

    public void agregarElemento(int indice, int valor){
         Scanner entrada= new Scanner(System.in);
         System.out.println("Ingrese el nuevo elemento: ");
         valor = entrada.nextInt();
         System.out.println("Ingrese la pocision en que sera puesto:  ");
         indice = entrada.nextInt();
         for(int i=tamanioArray; i<indice; i++){
             arreglo[i+1] = arreglo[i];
         }
            arreglo[indice] = valor;    
        }

    public int getElemento(int indice){
         Scanner entrada= new Scanner(System.in);
         System.out.println("Ingrese un indice entre 0 y" + tamanioArray);
         indice = entrada.nextInt();
       return "El elemento seleccionado des: " + arreglo[indice];
    }

    public  void limpiar(int valor){
         Scanner entrada= new Scanner(System.in);
         System.out.println("Ingrese el valor con el desea limpiar el arreglo: ");
         valor = entrada.nextInt();
         for(int i=0; i==tamanioArray-1; i++){
             arreglo[i] = valor;
             arreglo[i] = arreglo[i+1];
         }
         System.out.println("Limpieza Realizada ");
        
    }

    public String toString(){
      return "elemento 1" + arreglo[0] + "elemento 2" + arreglo[1] + "elemento 3" + arreglo[2] 
              + "elemento 4" + arreglo[3]; 
    }
         
}
