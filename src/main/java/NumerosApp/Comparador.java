/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NumerosApp;

import java.util.ArrayList;
/**
 *
 * @author JRamR
 */
public class Comparador {
    private ArrayList<Integer> numeros;

    public Comparador() {
        this.numeros = numeros;
    }

    
    
    public void mostrarNumeros(ArrayList<Integer> numeros){
        this.numeros=numeros;
        System.out.println("Numeros generados: ");
    for(int i=0;i<10;i++){
        System.out.println(numeros.get(i));
    }
    
    }
    
   public int mostrarRepetidos(ArrayList<Integer> numeros, int valor){
    int acum=0;
    for(int num : numeros){
    if(num==valor){
    acum++;
    }
    
    }
    return acum;
    }
    
    
}
