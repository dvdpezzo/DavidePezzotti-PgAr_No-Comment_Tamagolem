package PgAr.NoComment.TamaGolem;

import java.util.Vector;

public class Main {
    private static final int G = 1; //valori da modificare
    private static final int V = 10; //valori da modificare
    private static final int P = 3; //valori da modificare
    private static final int S = (2*G*P); //valori da modificare

    public static void main(String[] args) {
        //fase di setup
        Integer[][] matrice = new Integer[0][0];
        Vector<Tamagolem> tamagolem1 = new Vector<>(G);
        Vector<Tamagolem> tamagolem2 = new Vector<>(G);
        Vector<PietraElementale> pietraElementale1 = new Vector<>(P);
        Vector<PietraElementale> pietraElementale2 = new Vector<>(P);
    /* Creazione equilibrio mondo di n elementi */
        EquilibrioMondo equilibrioMondo = new EquilibrioMondo();
        equilibrioMondo.generaEquilibrio(matrice, 10);

    /* Creazione di S pietre totali e casuali da suddividere tra i due giocatori in 2 gruppi da P = S/2 */

        Giocatore gioc1 = new Giocatore("Giocatore 1", tamagolem1, pietraElementale1 );
        gioc1.setPietrePerGiocatore(P);

        Giocatore gioc2 = new Giocatore("Giocatore 2", tamagolem2, pietraElementale2);
        gioc2.setPietrePerGiocatore(P);
        //fase di scontro

    /*2 giocatori con ciascuno G tamagolem, con ciascun tama con P pietre( di N elementi) e vita V */

        // Gioc1 schiera Tama
        gioc1.schieraTamagolem(V, G, P);

        // Gioc2 schiera Tama
        gioc2.schieraTamagolem(V, G, P);

    /* a questo punto ho 2 giocatori, ciascuno con un solo tamagolem, il quale è stato aggiunto al vettore dei tamgolems di ciascun giocatore
    alla prima posizione, e ciascun tamagolem ha mangiato P pietre */


    /*I tama scagliano Pietra
    Determinazione vincita scontro
    Inserire questi metodi in un ciclo do while(G > 0 per entrambi i giocatori)
     */
        Scontro scontro = new Scontro();

        scontro.vinciScontro(gioc1, gioc2);




        //fase dichiarazione vincitore
    /*
    vince chi ha G>0
    Stampa equilibrio
     */
        equilibrioMondo.stampaEquilibrio(matrice);
    }

}
