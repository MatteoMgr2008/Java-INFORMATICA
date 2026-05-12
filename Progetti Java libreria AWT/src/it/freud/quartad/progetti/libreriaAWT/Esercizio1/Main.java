package it.freud.quartad.progetti.libreriaAWT.Esercizio1;

import java.awt.*;
import java.awt.event.*;

public class Main extends Frame {
    public static void main(String[] args) {
        Frame finestraProgramma = new Main();
        System.out.println("La finestra dell'esercizio 1 si è avviata");
        finestraProgramma.setVisible(true);
        finestraProgramma.setTitle("Esercizio 1");
        finestraProgramma.setSize(500, 500);
        finestraProgramma.setResizable(true);
        finestraProgramma.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.out.println("La finestra dell'esercizio 1 è stata terminata");
                System.exit(0);
            }
        });
    }
}