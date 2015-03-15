package pe.egcc.app.prueba;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author Eric Gustavo Coronel Castillo
 * @blog gcoronelc.blogspot.com
 */
public class Prueba01 {

  public static void main(String[] args) {

    List<String> lista = new ArrayList<>();
    lista.add("Gustavo");
    lista.add("Guino");
    lista.add("Sergio");
    lista.add("Cesar");
    lista.add("Ernesto");

    System.out.println(lista);
    
    Collections.sort(lista, new Comparator<String>() {

      @Override
      public int compare(String o1, String o2) {
        return o1.compareTo(o2);
      }
    });
 
    System.out.println(lista);

  }
}
