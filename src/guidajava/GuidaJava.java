/*
 * Questa è la classe contenente il metodo main,
 * Qui vengono solo creati e posizionati i contenitori
 * e instanziati gli oggetti listener.
 */
package guidajava;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;


public class GuidaJava {

    
    public static void main(String[] args) {
        //creo finestra e pannelli
        Sfondo finestra = new Sfondo("Guida Java");
        JPanel selectionpanel = new JPanel();
        JPanel languagepanel = new JPanel();
        finestra.getContentPane().add(selectionpanel, BorderLayout.CENTER);
        finestra.getContentPane().add(languagepanel, BorderLayout.EAST);
        selectionpanel.setLayout(new GridLayout(3,2));
        languagepanel.setLayout(new FlowLayout());
        
        //creo i components
        JLabel instructions = new JLabel("<html>Scegli una lingua<br>Chose a language<br>Elige a un idioma</html>"); 
        JButton b1 = new JButton("SWITCH");
        JButton b2 = new JButton("FOR");
        JButton b3 = new JButton("WHILE");
        JButton b4 = new JButton("DO/WHILE");
        JButton b5 = new JButton("IF/ELSE");
        String lan[] = {"Italiano", "English", "Español"};
        JList language = new JList(lan);
        language.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
        //posiziono i compontents nei panels
        selectionpanel.add(instructions);
        selectionpanel.add(b1);
        selectionpanel.add(b2);
        selectionpanel.add(b3);
        selectionpanel.add(b4);
        selectionpanel.add(b5);
        languagepanel.add(language);
        
        //gestitsco gli eventi con ActionListener
        language.addListSelectionListener(new LanguageListener(language, instructions));
        b1.addActionListener(new ListenerPulsante(b1, language));
        b2.addActionListener(new ListenerPulsante(b2, language));
        b3.addActionListener(new ListenerPulsante(b3, language));
        b4.addActionListener(new ListenerPulsante(b4, language));
        b5.addActionListener(new ListenerPulsante(b5, language));
        
        
        
        finestra.setVisible(true);
    }
    
}
