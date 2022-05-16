package PgAr.NoComment.TamaGolem;

import it.unibs.fp.mylib.InputDati;

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

    //questo metodo crea S pietre elementali e le aggiunge al vettore del giocatore(pietre)
    public void setPietrePerGiocatore(int S) {
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
            pietre.add(pietra);
        }
    }
    public void visualizzaPietre() {
        for (int i=0; i<pietre.size(); i++){
            System.out.println(i + ".\t" + pietre.elementAt(i).toString());
        }
    }
    public PietraElementale getPietra(int i){
        return pietre.elementAt(i);
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
        return null;
    }

    private void ScegliPietre(){

    }

    public void rimuoviPietra(int i) {
        pietre.remove(i);
    }
    public void schieraTamagolem(int vita, int numeroTama, int pietrePerTama) {
        Tamagolem tamagolem = new Tamagolem(vita); //creo un tama di vita v
        if (tamagolems.size() <= numeroTama){
            tamagolems.add(tamagolem); //lo aggiungo ai tama del giocatore
            System.out.println("Hai creato un tamagolem");
            System.out.println("Quali pietre vuoi far mangiare a questo Tamagolem?\nScegline " + pietrePerTama);
            for(int i = 0; i < pietrePerTama; i++){
                visualizzaPietre();
                int scelta = daiPietraAlTamagolem(tamagolem, pietrePerTama);
                rimuoviPietra(scelta);
            }
        } else {
            System.out.println("Non puoi più schierare tamagolem!");
        }

    }
    private int daiPietraAlTamagolem(Tamagolem tamagolem, int pietrePerTama) {
        int scelta = InputDati.leggiIntero("Inserisci il numero della pietra che vuoi aggiungere", 1, pietrePerTama);
        tamagolem.mangiaPietra(getPietra(scelta));
        System.out.println("La pietra " + getPietra(scelta).toString() + "è stata mangiata dal Tamagolem, YUM!");
        return scelta;
    }
}
