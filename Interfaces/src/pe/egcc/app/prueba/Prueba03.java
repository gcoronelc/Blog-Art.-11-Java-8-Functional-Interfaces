package pe.egcc.app.prueba;

import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Eric Gustavo Coronel Castillo
 * @blog gcoronelc.blogspot.com
 */
public class Prueba03 extends JFrame{
  
  private JButton button;

  public Prueba03() throws HeadlessException {
    super("Demo Clásico");
    setLayout(new GridLayout(1, 1));
    setSize(200, 200);
    setLocationRelativeTo(null);
    button = new JButton("Saludar");
    add(button);
    button.addActionListener(new ActionListener() {

      @Override
      public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(rootPane, "Hola Gustavo.");
      }
    });
  }

  public static void main(String[] args) {
    Prueba03 bean = new Prueba03();
    bean.setVisible(true);
  }
  
}
