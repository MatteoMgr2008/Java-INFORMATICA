package it.freud.quartad.progetti.libreriaAWT.Esercizio2;

import java.awt.*;
import java.awt.event.*;

public class Main extends Frame {
    int counter = 0;
    Label valoreNumeroCorrente = new Label("Counter: " + counter);
    Button incrementoValoreNumeroCorrente = new Button("+");
    Button decrementoValoreNumeroCorrente = new Button("-");

    public Main() {
        setLayout(null);
        valoreNumeroCorrente.setVisible(true);
        valoreNumeroCorrente.setSize(100,100);
        valoreNumeroCorrente.setLocation(150,300);

        incrementoValoreNumeroCorrente.setVisible(true);
        incrementoValoreNumeroCorrente.setSize(100,100);
        incrementoValoreNumeroCorrente.setLocation(50,100);

        decrementoValoreNumeroCorrente.setVisible(true);
        decrementoValoreNumeroCorrente.setSize(100,100);
        decrementoValoreNumeroCorrente.setLocation(250,100);

        add(valoreNumeroCorrente);
        add(incrementoValoreNumeroCorrente);
        add(decrementoValoreNumeroCorrente);

        incrementoValoreNumeroCorrente.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                counter++;
                valoreNumeroCorrente.setText("Counter: " + counter);
            }
        });

        decrementoValoreNumeroCorrente.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                counter--;
                valoreNumeroCorrente.setText("Counter: " + counter);
            }
        });
    }

    public static void main(String[] args) {
        Frame finestraProgramma = new Main();
        finestraProgramma.setVisible(true);
        System.out.println("La finestra dell'esercizio 2 si è avviata");
        finestraProgramma.setTitle("Esercizio 2");
        finestraProgramma.setSize(500, 500);
        finestraProgramma.setResizable(true);
        finestraProgramma.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.out.println("La finestra dell'esercizio 2 è stata terminata");
                System.exit(0);
            }
        });
    }
}