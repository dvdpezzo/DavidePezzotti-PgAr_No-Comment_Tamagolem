package PgAr.NoComment.TamaGolem;

import java.util.Vector;

public class Tamagolem {
    private int vita;

    public int getVita() {
        return vita;
    }

    private Vector<PietraElementale> pietreMangiate;

    public Tamagolem(int vita, Vector<PietraElementale> pietreMangiate) {
        this.vita = vita;
        this.pietreMangiate = pietreMangiate;
    }

    public PietraElementale scagliaPietra(int i){
        pietreMangiate.get(i);
    }

    public int togliVita(int danniSubiti){ //(setVita)
        if (vita > danniSubiti) vita -= danniSubiti;
        else vita = 0;
        return vita;
    }

    public void mangiaPietra(PietraElementale pietraElementale){
        pietreMangiate.add(pietraElementale);
    }
}
