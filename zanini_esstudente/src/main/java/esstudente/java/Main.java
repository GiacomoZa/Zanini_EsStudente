package esstudente.java;
import java.util.*;
import java.text.SimpleDateFormat;

public class Main {
    public static void main(String[] args) {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date dataNascita1, dataNascita2, dataNascita3;
        try {
            dataNascita1 = sdf.parse("15/03/2005");
            dataNascita2 = sdf.parse("10/06/2004");
            dataNascita3 = sdf.parse("22/10/2006");
        } catch (Exception e) {
            dataNascita1 = new Date();
            dataNascita2 = new Date();
            dataNascita3 = new Date();
        }

        Studente studente1 = new Studente("Mario", "Rossi", dataNascita1, 12345, "Ingegneria");
        Studente studente2 = new Studente("Laura", "Bianchi", dataNascita2, 67890, "Economia");
        Studente studente3 = new Studente("Marco", "Verdi", dataNascita3, 32860, "Biologia");

        // Assegnamento dei voti
        studente1.aggiungiVoto(28.0f, 0);
        studente1.aggiungiVoto(30.0f, 1);
        studente1.aggiungiVoto(25.0f, 2);

        studente2.aggiungiVoto(27.0f, 0);
        studente2.aggiungiVoto(29.0f, 1);
        studente2.aggiungiVoto(26.0f, 2);

        studente3.aggiungiVoto(28.0f, 0);
        studente3.aggiungiVoto(30.0f, 1);
        studente3.aggiungiVoto(26.0f, 2);

        System.out.println("Informazioni sullo Studente 1:");
        System.out.println(studente1.toString());
        System.out.println("Media dei voti dello studente 1: " + studente1.calcolaMediaVoti());
        System.out.println("Età dello studente 1: " + studente1.calcolaEta() + " anni");

        System.out.println("\nInformazioni sullo studente 2:");
        System.out.println(studente2.toString());
        System.out.println("Media dei voti dello studente 2: " + studente2.calcolaMediaVoti());
        System.out.println("Età dello studente 2: " + studente2.calcolaEta() + " anni");

        System.out.println("\nInformazioni sullo studente 3:");
        System.out.println(studente3.toString());
        System.out.println("Media dei voti dello studente 3: " + studente2.calcolaMediaVoti());
        System.out.println("Età dello studente 3: " + studente2.calcolaEta() + " anni");
    }
}