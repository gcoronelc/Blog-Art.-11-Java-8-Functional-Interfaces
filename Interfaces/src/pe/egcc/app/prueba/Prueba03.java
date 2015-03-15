package pe.egcc.app.prueba;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Eric Gustavo Coronel Castillo
 * @blog gcoronelc.blogspot.com
 */
public class Prueba03 {

  public static void main(String[] args) {

    List<String> lista = new ArrayList<>();
    lista.add("Gustavo");
    lista.add("Guino");
    lista.add("Sergio");
    lista.add("Cesar");
    lista.add("Ernesto");

    System.out.println(lista);
    
    Collections.sort(lista, (o1,o2) -> o1.compareTo(o2) );
 
    System.out.println(lista);

  }
}
