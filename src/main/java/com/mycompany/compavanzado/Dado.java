/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.compavanzado;

/**
 *
 * @author JRamR
 */
public class Dado {
    private int lados;
    private int valor;

    public Dado(int lados, int valor) {
        this.lados = lados;
        this.valor = valor;
    }

    public int getLados() {
        return lados;
    }

    public void setLados(int lados) {
        this.lados = lados;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
    
    @Override
    public String toString(){
    String string;
    
    string="Valor obtenido: "+valor;
        
        return string;
    }
    
}
