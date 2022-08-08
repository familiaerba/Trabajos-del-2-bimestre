/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clasvideojuego;

/**
 *
 * @author PC
 */
public class Calificador extends Persona {
    //Atributos
    private int codigojugador;
    private float puntosalcanzados;
    
    public Calificador (String nombre,String apellido,int edad,int codigojugador,float puntosalcanzados){
         super(nombre,apellido,edad);
          this.codigojugador = codigojugador;
          this.puntosalcanzados = puntosalcanzados;     
    }    
    
    public void mostrardatos(){
        System.out.println ("Nombre:"+getNombre()+
  "\nApellido: "+getApellido()+
  "\nedad:"+getEdad()+
  "\nCodigo jugador"+codigojugador+
  "\nNota final"+puntosalcanzados);
                  
    }
}

