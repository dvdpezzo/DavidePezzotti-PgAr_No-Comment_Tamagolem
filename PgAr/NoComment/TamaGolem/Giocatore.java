package PgAr.NoComment.TamaGolem;

import java.util.Random;
import java.util.Vector;

public class Giocatore {
    private String nome;
    private Vector<Tamagolem> tamagolems;
    private Vector<PietraElementale> pietre;

    public Giocatore(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Vector<PietraElementale> getPietre() {
        return pietre;
    }

    public void setPietre(Vector<PietraElementale> pietre) {
        this.pietre = pietre;
    }
    public void setPietrePerGiocatore(Vector<PietraElementale> pietreTotali, int S) {
        for(int i = 0; i<(S/2); i++){
            Random rnd = new Random();
            PietraElementale pietra = null;
            switch(rnd.nextInt(0, 4)){
                case 0:
                    pietra = new PietraElementale(Elementi.ACQUA.name());
                    break;
                case 1:
                    pietra = new PietraElementale(Elementi.TERRA.name());
                    break;
                case 2:
                    pietra = new PietraElementale(Elementi.FUOCO.name());
                    break;
                case 3:
                    pietra = new PietraElementale(Elementi.ARIA.name());
                    break;
            }
            pietreTotali.add(pietra);
        }
    }

    public Vector<Tamagolem> getTamagolems() {
        return tamagolems;
    }

    public int getNumeroTamagolem(){
        return tamagolems.size();
    }

    public void setTamagolems(Vector<Tamagolem> tamagolems) {
        this.tamagolems = tamagolems;
    }

    public void aggiungiTamagolems(Tamagolem tamagolem){
        this.tamagolems.add(tamagolem);
    }

    public Tamagolem scegliTama(){

    }

    private void ScegliPietre(){

    }
}
