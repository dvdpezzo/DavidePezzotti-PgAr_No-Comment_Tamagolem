package PgAr.NoComment.TamaGolem;

import java.util.Vector;


public class Scontro {

    public void vinciScontro(Giocatore g1, Giocatore g2){
        if(vinciParita(g1, g2) == true) {
            System.out.println("Partita finita!");
        } else {

        }
    }

    private boolean vinciParita(Giocatore g1, Giocatore g2){
        if (g1.getNumeroTamagolem() <= 0){
            System.out.println("Giocatore 2 ha vinto!");
            return true;
        }
        else if (g2.getNumeroTamagolem() <= 0) {
            System.out.println("Giocatore 1 ha vinto!");
            return true;
        } else return false;
    }

}
