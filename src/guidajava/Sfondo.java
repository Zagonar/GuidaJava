/*
 * Questa classe definisce i costruttori per una classe Sfondo
 * che estende JFrame
 */
package guidajava;
import java.awt.*;
import javax.swing.*;

public class Sfondo extends JFrame {
    public Sfondo(){
        super();
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        setSize(400,300);
        setLocation((dim.width - this.getWidth())/2, (dim.height - this.getHeight())/2);
    }
    
    public Sfondo(String titolo){
        super(titolo);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        setSize(400,300);
        setLocation((dim.width - this.getWidth())/2, (dim.height - this.getHeight())/2);
    }
}
