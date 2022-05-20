package PgAr.NoComment.TamaGolem;

import java.util.Vector;

public class Tamagolem {
    private int vita;

    public int getVita() {
        return vita;
    }

    private Vector<String> pietreMangiate;
    //costruttore
    public Tamagolem(int vita, Vector<String> pietreMangiate) {
        this.vita = vita;
        this.pietreMangiate = pietreMangiate;
    }

    public String scagliaPietra(int i){
        return pietreMangiate.get(i);
    }

    public int togliVita(int danniSubiti){ //(setVita)
        if (vita > danniSubiti) setVita(getVita()-danniSubiti);
        else vita = 0;
        return vita;
    }

    public void mangiaPietra(String pietraElementale){
        pietreMangiate.add(pietraElementale);
    }

    public void setVita(int vita) {
        this.vita = vita;
    }



}
