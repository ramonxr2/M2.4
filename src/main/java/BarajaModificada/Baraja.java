package BarajaModificada;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Baraja {
  private ArrayList<Carta> mazo;
  private ArrayList<Carta> baraja;
  private Carta cartaRandom;
  public Baraja() {
    this.mazo = new ArrayList<>();
  }

   
  public ArrayList<Carta> inicializa() {
    for (Figura f: Figura.values()) {
      for( int v= 1 ; v <= 13 ; v++) {
        try {
          mazo.add(new Carta(v,f));
           // System.out.println("CARTA N: "+(k+1));
         //   k++;
        } catch (FueraDeRangoException e) {
          System.out.println(e);
        }
      }
    }
      
    return mazo;
  }

  public void barajar() {
    Collections.shuffle(mazo);
  }

  public ArrayList<Carta> repartir(int n, ArrayList<Carta> baraja,int barajaSize) {
      //darle a un jugador 5 cartas
      Random rand=new Random();
    ArrayList<Carta> mano = new ArrayList<>();
    this.baraja=baraja;
    
    int index=0;
      
    for(int i=0; i<n; i++) {
      mano.add(baraja.get(index));
      baraja.remove(index);
      index++;
    }
    return mano;
  }
  
  public Carta repartirUnaCarta(ArrayList<Carta> baraja){
  Random rmd=new Random();
  int indexRandom=rmd.nextInt(52);
  cartaRandom=baraja.get(indexRandom);
  return cartaRandom;
  }
  
  public ArrayList<Carta> getBaraja(){
  
  return baraja;
  }

  @Override
  public String toString() {
    StringBuffer mazoStr = new StringBuffer();
    for (Carta c : mazo) {
      mazoStr.append(c.toString()+"\n");
    }
    return mazoStr.toString();
  }


}
