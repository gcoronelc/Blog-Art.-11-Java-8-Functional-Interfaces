package pe.egcc.app.prueba;

/**
 *
 * @author Eric Gustavo Coronel Castillo
 * @blog gcoronelc.blogspot.com
 */
public class Prueba02 {

  public static void main(String[] args) {
    
    IMate bean1 = (a,b) -> (a+b);
    IMate bean2 = (a,b) -> (a*b);
    
    System.out.println("5 + 8 = " + bean1.opera(5, 8));
    System.out.println("5 * 8 = " + bean2.opera(5, 8));
    
  }
}
