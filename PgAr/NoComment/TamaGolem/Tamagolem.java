package PgAr.NoComment.TamaGolem;

import java.util.Vector;

public class Tamagolem {
    private int vita;
    private Vector<PietraElementale> pietreMangiate;

    public Tamagolem(int vita) {
        this.vita = vita;
    }

    public int attacca(){

    }

    public int togliVita(){

    }

    public void mangiaPietra(PietraElementale pietraElementale){
        this.pietreMangiate.add(pietraElementale);
    }
}
