package PgAr.NoComment.TamaGolem;


public class Scontro {
    public static final String TAMAGOLEM_DEL_GIOCATORE = "Il tamagolem del giocatore ";
    public static final String PERSO_PT = " ha perso vita";


    //gestire scontropietre e togli vita

    //EquilibrioMondo equi = new EquilibrioMondo();
    /*
    * dati due tamagolem e due pietre lanciate farà i dovuti controlli ed eventualmente toglierà vita  * */
    public boolean calcoloDanno (Tamagolem tama1, Tamagolem tama2, String pietra1, String pietra2, Integer matrice[][], String[]tipo){
        int danno=0;
        for (int i=0; i<tipo.length; i++)
            for (int j=0; j<tipo.length; j++)
                if (tipo[j] == pietra2 && tipo[i]==pietra1){
                    danno = matrice[i][j];
                    if (danno>0) {
                        tama1.togliVita(danno);
                        System.out.println(TAMAGOLEM_DEL_GIOCATORE + 1 + PERSO_PT);
                    }
                    else if(danno<0) {
                        tama2.togliVita(-danno);
                        System.out.println(TAMAGOLEM_DEL_GIOCATORE + 2 + PERSO_PT);
                    }
                    else {
                        System.out.println("Pareggio!");
                        return false;
                    }
                }
        return true;
    }

    public boolean controlloVita (Tamagolem tama1, Tamagolem tama2){
        if (tama1.getVita()<=0||tama2.getVita()<=0)
            return true;
        else return false;
    }

    public Tamagolem vinciScontro(Tamagolem tama1, Tamagolem tama2){
        if (tama1.getVita()<=0)
            return tama2;
        else return tama1;
    }


    public boolean vinciPartita(Giocatore g1, Giocatore g2, int G1, int G2){
        if (G1 <= 0){
            System.out.println(g2.getNome()+ " ha vinto!");
            return true;
        }
        else if (G2<= 0) {
            System.out.println(g1.getNome()+" ha vinto!");
            return true;
        } else return false;
    }

}
