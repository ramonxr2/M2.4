/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CalculadoraComplejos;

/**
 *
 * @author JRamR
 */
public class CalculadoraComplejos {
    private double real;
    private double imaginario;

    public CalculadoraComplejos(double real, double imaginario) {
        this.real = real;
        this.imaginario = imaginario;
    }

    public CalculadoraComplejos suma(CalculadoraComplejos other) {
        double sumaReales = this.real + other.real;
        double sumaImgs = this.imaginario + other.imaginario;
        return new CalculadoraComplejos(sumaReales, sumaImgs);
    }

    public CalculadoraComplejos resta(CalculadoraComplejos other) {
        double restaReales = this.real - other.real;
        double restaImgs = this.imaginario - other.imaginario;
        return new CalculadoraComplejos(restaReales, restaImgs);
    }

    public CalculadoraComplejos multiplicacion(CalculadoraComplejos other) {
        double productoReales = this.real * other.real - this.imaginario * other.imaginario;
        double productoImgs = this.real * other.imaginario + this.imaginario * other.real;
        return new CalculadoraComplejos(productoReales, productoImgs);
    }

    public CalculadoraComplejos division(CalculadoraComplejos other) {
        double denominador = other.real * other.real + other.imaginario * other.imaginario;
        double cocienteReal = (this.real * other.real + this.imaginario * other.imaginario) / denominador;
        double cocienteImg = (this.imaginario * other.real - this.real * other.imaginario) / denominador;
        return new CalculadoraComplejos(cocienteReal, cocienteImg);
    }

    @Override
    public String toString() {
        if (imaginario >= 0) {
            return real + " + " + imaginario + "i";
        } else {
            return real + " - " + (-imaginario) + "i";
        }
    }
}
