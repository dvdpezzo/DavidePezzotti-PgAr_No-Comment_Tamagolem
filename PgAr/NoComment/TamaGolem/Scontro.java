package PgAr.NoComment.TamaGolem;


public class Scontro {

    public void vinciScontro(Giocatore g1, Giocatore g2){
        if(vinciParita(g1, g2) == true) {
            System.out.println("Partita finita!");
        } else {
            for (int i=0; i< g1.getNumeroTamagolem(); i++){
                Tamagolem tama1 = g1.scegliTamaPerScontro(i);
                tama1.attacca();
                Tamagolem tama2 = g2.scegliTamaPerScontro(i);
                tama2.attacca();
                //da completare, prima settare come fanno ad attaccare e subire danni i tamagolem
            }
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
