/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NumerosApp;

import java.util.ArrayList;
import java.util.Random;

public class GeneradorDeNumeros {
    
    private ArrayList<Integer> numeros;

    public GeneradorDeNumeros() {
        numeros=new ArrayList<>();
    }
    
    public ArrayList<Integer> generarNumeros(){
        Random rand=new Random();
        int numRandom;
        for(int i=0;i<10;i++){
        numRandom=rand.nextInt(11);
        numeros.add(numRandom);
        }
        
        return numeros;
    }
    

}
