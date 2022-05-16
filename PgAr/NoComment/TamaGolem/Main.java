package PgAr.NoComment.TamaGolem;

import java.util.Random;
import java.util.Vector;

public class Main {
    private static final int G = 10;
    private static final int V = 10;
    private static final int P = 10;
    private static final int S = 10;

    public static void main(String args[]) {
        //fase di setup
    /*
    Creazione equilibrio mondo di n elementi
    Creazione di S pietre totali e casuali da suddividere tra i due giocatori in 2 gruppi da P = S/2
    */
        Vector<PietraElementale> pietreGioc1 = new Vector<>();
        Vector<PietraElementale> pietreGioc2 = new Vector<>();


        //fase di scontro
    /*
    2 giocatori con ciascuno G tamagolem, con ciascuno P pietre( di N elementi) e vita V
    Gioc1 schiera Tama
    Gioc2 schiera Tama
    I tama scagliano Pietra
    Determinazione vincita scontro
    Inserire questi metodi in un ciclo do while(G > 0 per entrambi i giocatori)
     */
        Giocatore gioc1 = new Giocatore("Giocatore 1");
        Giocatore gioc2 = new Giocatore("Giocatore 2");
        gioc1.setPietrePerGiocatore(pietreGioc1, S);
        gioc2.setPietrePerGiocatore(pietreGioc2, S);

        for (int i = 0; i < G; i++) {
            Tamagolem tama1 = new Tamagolem(V);
            gioc1.aggiungiTamagolems(tama1);
            for(int j = 0; j < P; j++){
                tama1.mangiaPietra(new PietraElementale(Elementi.ACQUA.name())); //sistemare come sceglie il nome dell'elemento
            }
        }

        for (int i = 0; i < G; i++) {
            gioc2.aggiungiTamagolems(new Tamagolem(V));
        }

        //fase dichiarazione vincitore
    /*
    vince chi ha G>0
    Stampa equilibrio
     */
    }


}
