package PgAr.NoComment.TamaGolem;


public class Scontro {

    public void eseguiScontro(Giocatore g1, Giocatore g2){
        if(vinciParita(g1, g2)) {
            System.out.println("Partita finita!");
        } else {
            /*Tamagolem tama1 = g1.scegliTamaPerScontro(0);
            Tamagolem tama2 = g2.scegliTamaPerScontro(0);
            int vita = calcoloDanni(tama1, tama2);*/

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
