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
public class AppNumeros {
    
    public static void main(String args[]){
    AppNumeros numGen=new AppNumeros();
    numGen.jugar();
    }
    
    public void jugar(){
    GeneradorDeNumeros gennum=new GeneradorDeNumeros();
    Comparador comp=new Comparador();
    ArrayList<Integer> numerosGenerados;
    numerosGenerados=gennum.generarNumeros();
    comp.mostrarNumeros(numerosGenerados);
    
    for(int i=0;i<numerosGenerados.size();i++){
    int repetidos=comp.mostrarRepetidos(numerosGenerados,numerosGenerados.get(i));
        System.out.println("El numero "+numerosGenerados.get(i)+" se repite "+repetidos+" veces.");
    }
    
    }
    
}
