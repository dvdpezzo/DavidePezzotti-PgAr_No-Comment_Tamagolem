package PgAr.NoComment.TamaGolem;

import java.util.Queue;

public class Tamagolem {
    private int vita;

    public int getVita() {
        return vita;
    }

    public void setVita(int vita) {
        this.vita = vita;
    }

    private Queue<PietraElementale> pietreMangiate;

    public Tamagolem(int vita) {
        this.vita = vita;
    }

    public int attacca(){
        return 0;
    }

    public int togliVita(){
        return 0;
    }

    public void mangiaPietra(PietraElementale pietraElementale){
        pietreMangiate.add(pietraElementale);
    }
}
