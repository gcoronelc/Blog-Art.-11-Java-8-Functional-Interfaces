package pe.egcc.app.prueba;

import java.awt.GridLayout;
import java.awt.HeadlessException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Eric Gustavo Coronel Castillo
 * @blog gcoronelc.blogspot.com
 */
public class Prueba04 extends JFrame{
  
  private JButton button;

  public Prueba04() throws HeadlessException {
    super("Demo Clásico");
    setLayout(new GridLayout(1, 1));
    setSize(200, 200);
    setLocationRelativeTo(null);
    button = new JButton("Saludar");
    add(button);
    button.addActionListener( e -> 
      JOptionPane.showMessageDialog(rootPane, "Hola Gustavo."));
  }

  public static void main(String[] args) {
    Prueba04 bean = new Prueba04();
    bean.setVisible(true);
  }
  
}
