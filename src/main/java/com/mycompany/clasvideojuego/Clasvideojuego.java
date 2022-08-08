/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.clasvideojuego;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Clasvideojuego {
//corrida 
public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("1.Ingresar su nombre:");
        String persona = leer.nextLine();
        System.out.println("2.Estas por jugar FreeFire, Mario Bros  y Banana Kong y para cada juego tienes 30 min para cada juego. Escibre la palabra Listo cuando lo estes:  ");
        String juego = leer.nextLine();
        
        if ("Listo".equals(juego)) {
            System.out.println("3.Ingrese su puntaje(sumando los 3 juegos)PUNTAJE FINAL: ");
            String marcador = leer.nextLine();
            System.out.println("4.El puntaje de " +persona+ " es de: "+marcador);
        } else {
            System.out.println("Juegos no disponibles. Vuelva a poner el nombre del juego");
            System.exit(0);
        }
        

        }

    }








