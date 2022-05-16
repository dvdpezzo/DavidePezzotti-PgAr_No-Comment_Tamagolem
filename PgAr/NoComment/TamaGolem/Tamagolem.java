package PgAr.NoComment.TamaGolem;

import java.util.Vector;

public class Tamagolem {
    private int vita;
    private Vector<PietraElementale> pietreMangiate;

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
