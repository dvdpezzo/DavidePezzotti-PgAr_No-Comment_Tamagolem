package PgAr.NoComment.TamaGolem;

import java.util.Vector;

public class Main {
    private static final int tamagolem = 1; //valori da modificare
    private static final int vita = 10; //valori da modificare
    private static final int pietre = 3; //valori da modificare
    private static final int sacchettoPietreGiocatore = (2* tamagolem * pietre); //valori da modificare

    public static void main(String[] args) {
        //fase di setup
        Integer[][] matrice = new Integer[0][0];
        Vector<Tamagolem> tamagolem1Vector = new Vector<>(tamagolem);
        Vector<Tamagolem> tamagolem2Vector = new Vector<>(tamagolem);
        Vector<PietraElementale> pietraElementale1 = new Vector<>(pietre);
        Vector<PietraElementale> pietraElementale2 = new Vector<>(pietre);
    /* Creazione equilibrio mondo di n elementi */
        EquilibrioMondo equilibrioMondo = new EquilibrioMondo();
        equilibrioMondo.generaEquilibrio(matrice, 10);

    /* Creazione di S pietre totali e casuali da suddividere tra i due giocatori in 2 gruppi da P = S/2 */

        Giocatore gioc1 = new Giocatore("Giocatore 1", tamagolem1Vector, pietraElementale1 );
        gioc1.setPietrePerGiocatore(pietre);

        Giocatore gioc2 = new Giocatore("Giocatore 2", tamagolem2Vector, pietraElementale2);
        gioc2.setPietrePerGiocatore(pietre);
        //fase di scontro

    /*2 giocatori con ciascuno G tamagolem, con ciascun tama con P pietre( di N elementi) e vita V */

        // Gioc1 schiera Tama
        gioc1.schieraTamagolem(vita, tamagolem, pietre);

        // Gioc2 schiera Tama
        gioc2.schieraTamagolem(vita, tamagolem, pietre);

    /* a questo punto ho 2 giocatori, ciascuno con un solo tamagolem, il quale è stato aggiunto al vettore dei tamgolems di ciascun giocatore
    alla prima posizione, e ciascun tamagolem ha mangiato P pietre */
        int scelta=0;
        Tamagolem tamaDelGioc1 = gioc1.scegliTamaPerScontro(scelta);
        Tamagolem tamaDelGioc2 = gioc2.scegliTamaPerScontro(scelta);

        for (int i = 0; i< pietre; i++){
            controlloDanni(tamaDelGioc1, tamaDelGioc2, i);
        }


    /*I tama scagliano Pietra
    Determinazione vincita scontro
    Inserire questi metodi in un ciclo do while(G > 0 per entrambi i giocatori)
     */

        Scontro scontro = new Scontro();

        scontro.eseguiScontro(gioc1, gioc2);




        //fase dichiarazione vincitore
    /*
    vince chi ha G>0
    Stampa equilibrio
     */
        equilibrioMondo.stampaEquilibrio(matrice);
    }

    private static void controlloDanni(Tamagolem tama1, Tamagolem tama2, int i) {
        int danni1 = tama1.scagliaPietra(i).getDanni();
        int danni2 = tama2.scagliaPietra(i).getDanni();
        if (danni1 < danni2) {
            tama1.togliVita(danni2);
            if (tama1.getVita()==0) System.out.println("Il tama è morto");
            else System.out.println("Tama1 ha subito danni");
        }
        else if (danni2 < danni1) {
            tama2.togliVita(danni1);
            if (tama2.getVita() == 0) System.out.println("Il tama è morto");
            System.out.println("Tama2 ha subito danni");
        } else if (danni1 == danni2) {
            System.out.println("pareggio");
        }
    }

}
