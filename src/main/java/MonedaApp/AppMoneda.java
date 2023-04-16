/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MonedaApp;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author JRamR
 */
public class AppMoneda {
       
    public static void main(String args[]){
    AppMoneda monedas=new AppMoneda();
    
    monedas.jugar();
    }


    public void jugar(){
    Moneda moneda=new Moneda();
    
    Scanner teclado=new Scanner(System.in);
        ArrayList<String> monedas;
        System.out.println("Cuantas monedas desea lanzar? ");
        int lanzamientos=teclado.nextInt();
        monedas=moneda.lanzarMoneda(lanzamientos);
        System.out.println("Los resultados del lanzamiento son: "+monedas);
    }
    
}   

