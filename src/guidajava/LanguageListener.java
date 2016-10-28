/*
 * Il LenguageListener si occupa solo di cambiare il testo nella label
 * della pagina iniziale. Il testo delle singole spiegazioni 
 * è gestito nella classe ListenerPulsante
 */
package guidajava;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class LanguageListener implements ListSelectionListener {
    public JList lista;
    public JLabel instructions;
    LanguageListener(JList lista, JLabel lab){
        this.lista = lista;
        instructions = lab;
    }
    public void valueChanged(ListSelectionEvent e) {
       int indice = lista.getSelectedIndex();
       switch(indice) {
            case 0:
                instructions.setText("Scegli una delle 5 opzioni");
                break;
            case 1:
                instructions.setText("choose one of the 5 options");
                break;
            case 2:
                instructions.setText("elige una de las 5 opciones");
                break;
       }
    }
}
