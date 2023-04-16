
package com.mycompany.compavanzado;
import java.util.ArrayList;
import java.util.Random;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author JRamR
 */
public class JuegoDados {
    
    private Dado dado;
    private ArrayList<Dado> dados;
    private int lados;
    private int valorSelec;
    
    public JuegoDados() {
        dado=new Dado(0,0);
        dados=new ArrayList<Dado>();
    }

    public void setLados(int lados) {
        this.lados = lados;
    }
    
    
    public void generarDado(){
    Random rand=new Random();
    int rmd=rand.nextInt(lados)+1;
    dado.setLados(lados);
    dado.setValor(rmd);
    System.out.println(dado.toString());
    }
    
    public void generar5Dados(){
    Random rand=new Random();
    dados.clear();
    for(int i=0;i<5;i++){
    int rmd=rand.nextInt(lados)+1;
    dados.add(new Dado(lados,rmd));
    }
    
        System.out.println("Se generaron 5 dados.");
        
    
    }
    
    public void mostrarValor(int valorSelec){
    this.valorSelec=valorSelec;
    
        System.out.println(dados.get(valorSelec).toString());
    
    }
}
