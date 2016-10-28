/*
 * Qesto listener prende come argomento il button a cui lo dovrò assegnare
 * e l'indice lista che è un valore che recupero tramite il listener
 * della lista LanguageListener. Apre una nuova finestra con la spiegazione.
 */
package guidajava;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class ListenerPulsante implements ActionListener {
    JButton b;  
    JList lista;
    ListenerPulsante(JButton b, JList lista){
        this.b = b;
        this.lista = lista;
    }
    public void actionPerformed(ActionEvent e) {
        //creo una nuova finestra e pannello appena spingo un bottone
        JFrame nuova_finestra = new JFrame(b.getText());
        JPanel nuovo_panel = new JPanel();
        nuova_finestra.getContentPane().add(nuovo_panel);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        nuova_finestra.setSize(300,300);
        nuova_finestra.setLocation((dim.width - nuova_finestra.getWidth())/2, (dim.height - nuova_finestra.getHeight())/2);
        JLabel scritta = new JLabel("<html>Non hai selezionato alcuna lingua<br>You didn't select any language<br>No seleccionaste algun indioma</html>");
        JButton chiudi = new JButton("OK");
        nuovo_panel.setLayout(new BorderLayout());
        int indice_lista = lista.getSelectedIndex();
        /*a seconda di che button clicco scrivo una label diversa (primo switch),
         *che dipenderà anche dalla lingua selezionata (nested switch)
         */
        switch(b.getText()) {
            case "SWITCH":
                switch(indice_lista) {
                    case 0:
                        scritta.setText("<html>Switch è una istruzione condizionale che, a differenza di if/else, <br>contiene un certo numero di possibili casi<br> Forma:<br>switch(variabile) { <br>case valore1:<br>istruzione;<br>break;<br>case valore2:<br>istruzione;<br>......}</html>");
                        chiudi.setText("chiudi");
                        break;
                    case 1:
                        scritta.setText("<html>Switch is a conditional statement that,unlike if/else,<br>can have a number of possible execution paths<br> Form:<br>switch(variable) { <br>case valor1:<br>instruction;<br>break;<br>case valor2:<br>instruction;<br>......}</html>");
                        chiudi.setText("close");
                        break;
                    case 2:
                        scritta.setText("<html>Switch es una instruccion que, a diferencia de if/else,<br>puede tener una cierta quantidad de distintos casos<br> Forma:<br>switch(variabile) { <br>case valore1:<br>instruccion;<br>break;<br>case valore2:<br>instruccion;<br>......}</html>");
                        chiudi.setText("cerrar");
                        break;
                }
                break;
            case "IF/ELSE":
                switch(indice_lista) {
                    case 0:
                        scritta.setText("<html>If - else è una istruzione condizionale<br>Forma:<br>if(condition)<br>instruction;<br>else instruction;</html>");
                        chiudi.setText("chiudi");
                        break;
                    case 1:
                        scritta.setText("<html>If - else is a conditional statement<br>Form:<br>if(condition)<br>instruction;<br>else instruction;</html>");
                        chiudi.setText("close");
                        break;
                    case 2:
                        scritta.setText("<html>If - else es una instruccion condicional<br>Forma:<br>if(condition)<br>instruction;<br>else instruction;</html>");
                        chiudi.setText("cerrar");
                        break;
                }
                break;
            case "DO/WHILE":
                switch(indice_lista) {
                    case 0:
                        scritta.setText("<html>Do/while è un ciclo in cui la condizione è controllata<br>dopo aver eseguito l'sitruzione<br>Forma:<br>do<br>instruction;<br>while (condition);</html>");
                        chiudi.setText("chiudi");
                        break;
                    case 1:
                        scritta.setText("<html>Do/while is a cicle statement where the condition is checked<br>after the execution of the instruction<br>Form:<br>do<br>instruction;<br>while (condition);</html>");
                        chiudi.setText("close");
                        break;
                    case 2:
                        scritta.setText("<html>Do/while es un ciclo en el que la condicion es evaluada<br>despues la esecucion de la instruccion<br>Forma:<br>do<br>instruction;<br>while (condition);</html>");
                        chiudi.setText("cerrar");
                        break;
                }
                break;
            case "FOR":
                switch(indice_lista) {
                    case 0:
                        scritta.setText("<html>For è un ciclo che esegue una istruzione<br>un certo numero di volte<br>Forma:<br>for(initialization, condition, iteration)<br>instruction;</html>");
                        chiudi.setText("chiudi");
                        break;
                    case 1:
                        scritta.setText("<html>For is a cicle thtat executes an instruction<br>a certain number of times<br>Form:<br>for(initialization, condition, iteration)<br>instruction;</html>");
                        chiudi.setText("close");
                        break;
                    case 2:
                        scritta.setText("<html>For es un ciclo que repite una instruccion<br>una cierta quantidad de veces<br>Forma:<br>for(initialization, condition, iteration)<br>instruction;</html>");
                        chiudi.setText("cerrar");
                        break;
                }
                break;
            case "WHILE":
                switch(indice_lista) {
                    case 0:
                        scritta.setText("<html>While è un ciclo che ripete una istruzione<br>finchè la condizione è true<br>Forma:<br>while(condition)<br>instruction;</html>");
                        chiudi.setText("chiudi");
                        break;
                    case 1:
                        scritta.setText("<html>While is a cicle that executes an instruction<br>until the condition is true<br>Form:<br>while(condition)<br>instruction;</html>");
                        chiudi.setText("close");
                        break;
                    case 2:
                        scritta.setText("<html>While es un ciclo que repite una instruccion<br>hasta que la condicion sea true<br>Forma:<br>while(condition)<br>instruction;</html>");
                        chiudi.setText("cerrar");
                        break;
                }
                break;
        }
        
        //dispongo i componenti nei contenitori
        nuovo_panel.add("Center", scritta);
        nuovo_panel.add("South", chiudi);
        
        //aggiungo l'azione del button chiudi
        ActionListener azionechiudi = new ActionListener() {
            public void actionPerformed(ActionEvent a) {
                nuova_finestra.setVisible(false);
            }
        };
        chiudi.addActionListener(azionechiudi);
        nuova_finestra.setVisible(true);
    }
}
