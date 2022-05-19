package PgAr.NoComment.TamaGolem;

import it.unibs.fp.mylib.InputDati;

import java.util.Random;
import java.util.*;

public class Giocatore {
    private String nome;
    private Vector<Tamagolem> tamagolemDelGiocatore;
    private Vector<String> pietre;


    //costruttore Giocatore
    public Giocatore(String nome, Vector<Tamagolem> tamagolemDelGiocatore, Vector<String> pietre) {
        this.nome = nome;
        this.tamagolemDelGiocatore = tamagolemDelGiocatore;
        this.pietre = pietre;
    }

    //Permette di far scegliere al giocatore le pietre per il suo tamagolem
    public void setPietrePerGiocatore(int P, int S, Vector <String> pietre, LinkedList <String> pietreTotali, Tamagolem tama) {
        for(int i = 0; i<S; i++){
            System.out.print(i+1);
            System.out.println(". "+ pietreTotali.get(i));
        }
        int scelta;
        System.out.println("Scegli " +P+ " pietre da usare");
        for (int i=0; i<P; i++){
            scelta = InputDati.leggiIntero("");
            tama.mangiaPietra(pietreTotali.get(scelta-1));
            pietreTotali.remove(scelta-1);


        }

    }


    public Tamagolem scegliTamaPerScontro(int i){
        return tamagolemDelGiocatore.elementAt(i);
    }
    //crea un nuovo Tama (se c'è ne sono ancora a disposizione) e gli da una vita
    public void schieraTamagolem(int vita, int numeroTama) {
        Vector<String> pietreMangiate = new Vector<>();
        Tamagolem tamagolem = new Tamagolem(vita, pietreMangiate); //creo un tama di vita v e di pietreMangiate inizialmente vuoto
        if (0<= numeroTama){
            aggiungiTamagolems(tamagolem); //lo aggiungo ai tama del giocatore
            System.out.println("Hai creato un tamagolem");

        } else {
            System.out.println("Non puoi più schierare tamagolem!");
        }
    }
    public int getNumeroTamagolem(){
        return tamagolemDelGiocatore.size();
    }

    public void aggiungiTamagolems(Tamagolem tamagolem){
        tamagolemDelGiocatore.add(tamagolem);
    }

    public void visualizzaPietre(LinkedList <String> pietre) {
        for (int i=0; i<pietre.size(); i++){
            System.out.println(i + ".\t" + pietre.get(i).toString());
        }
    }





    public String getNome() {
        return nome;
    }




}
