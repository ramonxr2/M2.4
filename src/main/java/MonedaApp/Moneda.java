/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MonedaApp;
import java.util.Random;
import java.util.ArrayList;
/**
 *
 * @author JRamR
 */
public class Moneda {
    private ArrayList<String> resultado;
  
    
    public Moneda() {
        resultado=new ArrayList();
    }
    
    public ArrayList<String> lanzarMoneda(int lanzamientos){
    Random random = new Random();

      for (int i = 0; i < lanzamientos; i++) {
            int result = random.nextInt(2);

            if (result == 0) {
                resultado.add("Aguila");
            } else {
                resultado.add("Sello");
            }
    }
    return resultado;
}
    
}
