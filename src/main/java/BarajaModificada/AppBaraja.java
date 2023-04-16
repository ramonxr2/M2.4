/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BarajaModificada;

import java.util.ArrayList;


/**
 *
 * @author JRamR
 */
public class AppBaraja {
    
    public static void main(String args[]){
    AppBaraja baraja=new AppBaraja();
    
    baraja.jugar();
    }
    
    public void jugar(){
    ArrayList<Carta> cartas;
    Baraja baraja=new Baraja();
    Carta carta;
    cartas=baraja.inicializa();
    baraja.barajar();
    carta=baraja.repartirUnaCarta(cartas);
        System.out.println("Carta generada: ");
    System.out.println(carta.toString());
    }
}
