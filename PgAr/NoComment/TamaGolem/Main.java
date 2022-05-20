package PgAr.NoComment.TamaGolem;

//import it.unibs.fp.mylib.InputDati;

import java.util.Vector;

public class Main {
    private static final int VITA = 10;
    public static final String SCELTA = "Premere 1, per iniziare una nuova partita, premere 0 per chiudere il programma";
    public static final String MEX_BENVENUTO = "Benvenuta/o su Tamagolem, prima di iniziare facci sapere con quanti tipi di pietre vuoi iniziare:";
    public static final String LIVELLO_FACILE = "4. Livello facile";
    public static final String LIVELLO_MEDIO = "7. Livello medio";
    public static final String LIVELLO_DIFFICILE = "9. Livello difficile";
    public static final String IN_NOME = "Inserisci il tuo nome giocatore";
    public static final String SCONTRO_VINTO = "Lo scontro l'ha vinto il Tamagolem di ";

    public static void main(String[] args) {
        int scelta =0;
        do {



            scelta = InputDati.leggiIntero(SCELTA, 0, 1);
            switch (scelta) {
                case 1:
                    //fase di setup
                    EquilibrioMondo equilibrioMondo = new EquilibrioMondo();

                    //menu
                    System.out.println(MEX_BENVENUTO);
                    System.out.println(LIVELLO_FACILE);
                    System.out.println(LIVELLO_MEDIO);
                    System.out.println(LIVELLO_DIFFICILE);
                    //fase di setUp
                    int livello = 0;
                    livello = InputDati.leggiIntero("");
                    int S = 0, P = 0, G = 0;
                    P = (int)Math.round((livello + 1) / 3)+1;

                    G = (int)Math.round(((livello-1)*(livello-2))/2*P);
                    S = (int)Math.round((2 * G * P) / livello) * livello;
                    System.out.println(S);
                    EquilibrioMondo equi = new EquilibrioMondo();
                    equi.generaEquilibrio(equi.getEquilibrio(), livello);
                    /* Creazione di S pietre totali*/
                    equi.generaPietre(S, livello);
                    Vector<Tamagolem> tams1 = new Vector<>();
                    Vector<Tamagolem> tams2 = new Vector<>();
                    Vector<String> pietreElementali1 = new Vector<>();
                    Vector<String> pietreElementali2 = new Vector<>();
                    int i = 0;
                    int j = 0;

                    //fase di scontro
                    int G1=G, G2=G;
                    /*Inizializzazione del giocatore 1 con il suo tamagolem*/
                    Giocatore player1 = new Giocatore(InputDati.leggiStringa(IN_NOME +1), tams1, pietreElementali1);
                    player1.schieraTamagolem(VITA, G1);
                    Tamagolem tama1 = player1.scegliTamaPerScontro(i);
                    player1.setPietrePerGiocatore(P, S, pietreElementali1, equi.getPietreTotali(), tama1);

                    /*inizializzazione del giocatore 2 con il suo tamagolem*/
                    Giocatore player2 = new Giocatore(InputDati.leggiStringa(IN_NOME + 2), tams2, pietreElementali2);
                    player2.schieraTamagolem(VITA, G2);
                    Tamagolem tama2 = player2.scegliTamaPerScontro(j);
                    player2.setPietrePerGiocatore(P, S, pietreElementali2, equi.getPietreTotali(), tama2);

                    Scontro scontro = new Scontro();
                    String pietra1 ="";
                    String pietra2="";







                    do {
                        //k1 e k2 sono gli indici delle pietre da scagliare
                        int k1 = 0;
                        int k2 = 0;
                        do {

                            /*date due pietre che vengono lanciate contemporaneamente, si confrontano e
                             si effettuano opportuni calcoli sulla vita*/

                            pietra1 = tama1.scagliaPietra(k1);
                            tama1.mangiaPietra(tama1.scagliaPietra(k1));
                            pietra2 = tama2.scagliaPietra(k2);
                            tama2.mangiaPietra(tama2.scagliaPietra(k2));
                            scontro.calcoloDanno(tama1, tama2, pietra1, pietra2, equi.getEquilibrio(), equi.getTipo());
                            k2++;
                            k1++;
                            //controllo per evitare di uscire dalla dimensione della linkedList
                            if (k1>=P)
                                k1=0;
                            if (k2>=P)
                                k2=0;
                            //il secondo controllo serve per evitare che riproduca in loop "Pareggio"
                        } while (!scontro.controlloVita(tama1, tama2) && scontro.calcoloDanno(tama1, tama2, pietra1, pietra2, equi.getEquilibrio(), equi.getTipo()));
                        //controllo in caso di parità e si ricomincia lo socntro
                        if (!scontro.calcoloDanno(tama1, tama2, pietra1, pietra2, equi.getEquilibrio(), equi.getTipo())) {
                            i++; j++;
                            player1.schieraTamagolem(VITA, G1);
                            tama1 = player1.scegliTamaPerScontro(i);
                            player1.setPietrePerGiocatore(P, S, pietreElementali1, equi.getPietreTotali(), tama1);
                            player2.schieraTamagolem(VITA, G2);
                            tama2 = player2.scegliTamaPerScontro(j);
                            player2.setPietrePerGiocatore(P, S, pietreElementali2, equi.getPietreTotali(), tama2);

                        }
                        //solo il giocatore sconfitto deve ricreare un tamagolem
                        else if (scontro.vinciScontro(tama1, tama2).equals(tama1)) {
                            System.out.println(SCONTRO_VINTO + player1.getNome());
                            j++;
                            G2--;
                            player2.schieraTamagolem(VITA, G2);
                            tama2 = player2.scegliTamaPerScontro(j);
                            player2.setPietrePerGiocatore(P, S, pietreElementali2, equi.getPietreTotali(), tama2);
                        } else if (scontro.vinciScontro (tama1, tama2).equals(tama2)){
                            System.out.println(SCONTRO_VINTO + player2.getNome());
                            i++;
                            G1--;
                            player1.schieraTamagolem(VITA, G1);
                            tama1 = player1.scegliTamaPerScontro(i);
                            player1.setPietrePerGiocatore(P, S, pietreElementali1, equi.getPietreTotali(), tama1);

                        }
                    } while (!scontro.vinciPartita(player1, player2,G1, G2));

                    equi.stampaEquilibrio(equi.getEquilibrio());
                    break;
                case 0:
                    break;
            }

        }while (scelta!=0);

    }





}
