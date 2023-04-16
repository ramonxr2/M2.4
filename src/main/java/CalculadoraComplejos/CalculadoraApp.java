/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CalculadoraComplejos;
import java.util.Scanner;
/**
 *
 * @author JRamR
 */
public class CalculadoraApp {
    public static void main(String[] args) {
    CalculadoraApp calc=new CalculadoraApp();
    calc.calculadora();
    }
    
    public void calculadora(){
    Scanner teclado = new Scanner(System.in);
    int opc;
        do{
        System.out.print("Ingrese la parte real del primer numero: ");
        double real1 = teclado.nextDouble();
        System.out.print("Ingrese la parte imaginaria del segundo numero: ");
        double imaginario1 = teclado.nextDouble();
        CalculadoraComplejos numComplejo1 = new CalculadoraComplejos(real1, imaginario1);

        System.out.print("Ingrese la parte real del segundo numero complejo: ");
        double real2 = teclado.nextDouble();
        System.out.print("Ingrese la parte imaginaria del segundo numero complejo: ");
        double imaginario2 = teclado.nextDouble();
        CalculadoraComplejos numComplejo2 = new CalculadoraComplejos(real2, imaginario2);

        System.out.println("Elija que operacion realizar: \n1.-Suma\n2.-Resta\n3.-Multiplicacion\n4.-Division\n5.-Salir");
        opc=teclado.nextInt();
        
        switch(opc){
            case 1 -> {
                CalculadoraComplejos suma = numComplejo1.suma(numComplejo2);
                 System.out.println("Suma: " + suma);

            }
            case 2 -> {
                CalculadoraComplejos resta = numComplejo1.resta(numComplejo2);
                System.out.println("Resta: " + resta);

            }
            case 3 -> {
                CalculadoraComplejos producto = numComplejo1.multiplicacion(numComplejo2);
                System.out.println("Producto: " + producto);

            }
            case 4 -> {
                CalculadoraComplejos cociente = numComplejo1.division(numComplejo2);
                System.out.println("Cociente: " + cociente);

            }
            case 5->{
                System.out.println("Saliendo.");
            }
            default -> {
                System.out.println("Opcion invalida");
            }
        }
        }while(opc!=5);
    }
}
