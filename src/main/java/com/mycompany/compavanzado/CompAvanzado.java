/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.compavanzado;
import java.util.Scanner;
/**
 *
 * @author JRamR
 */
public class CompAvanzado {

    public static void main(String[] args) {
        CompAvanzado appDado=new CompAvanzado();
        
        appDado.jugar();
    }
    
    public void jugar(){
        Scanner teclado=new Scanner(System.in);
        JuegoDados juego=new JuegoDados();

        int opc;
        System.out.println("Desea usar dados de 6 o 12 lados?");
        int lados=teclado.nextInt();
        juego.setLados(lados);
        
        do{
            System.out.println("Elija una opcion:\n1.-Generar 1 dado\n2.-Generar 5 dados y elegir valor.\n3.-Salir.\n");
            opc=teclado.nextInt();
            
            switch(opc){
                case 1 -> {
                juego.generarDado();
                }
                case 2 -> {
                juego.generar5Dados();
                    System.out.println("Cual valor desea mostrar?");
                    int valorSelec=teclado.nextInt();
                juego.mostrarValor(valorSelec);
                }
                case 3 -> {
                    System.out.println("Programa Finalizado.");
                }
                default -> {
                    System.out.println("Valor invalido");
                }
            }
            
        }while(opc!=3);
        
    }
    
}
