package PgAr.NoComment.TamaGolem;

import it.unibs.fp.mylib.InputDati;

import java.util.Random;
import java.util.Vector;

public class Giocatore {

    private String nome;
    private Vector<Tamagolem> tamagolemDelGiocatore;
    private Vector<PietraElementale> pietre;

    //costruttore Giocatore

    public Giocatore(String nome, Vector<Tamagolem> tamagolemDelGiocatore, Vector<PietraElementale> pietre) {
        this.nome = nome;
        this.tamagolemDelGiocatore = tamagolemDelGiocatore;
        this.pietre = pietre;
    }

    //questo metodo crea P pietre elementali e le aggiunge al vettore del giocatore(pietre)
    public void setPietrePerGiocatore(int P) {
        for(int i = 0; i<(P); i++){
            Random rnd = new Random();
            PietraElementale pietra = switch (rnd.nextInt(0, 4)) {
                /*case 0 -> new PietraElementale(Elementi.ACQUA.name());
                case 1 -> new PietraElementale(Elementi.TERRA.name());
                case 2 -> new PietraElementale(Elementi.FUOCO.name());
                case 3 -> new PietraElementale(Elementi.ARIA.name());*/
                default -> throw new IllegalStateException("Unexpected value: " + rnd.nextInt(0, 4));
            };
            aggiungiPietra(pietra);
        }
    }

    private void aggiungiPietra(PietraElementale pietra) {
        pietre.add(pietra);
    }
    public Tamagolem scegliTamaPerScontro(int i){
        return tamagolemDelGiocatore.elementAt(i);
    }
    // metodi per schierare tama:
    public void schieraTamagolem(int vita, int numeroTama, int pietrePerTama) {
        Vector<PietraElementale> pietreMangiate = new Vector<>();
        Tamagolem tamagolem = new Tamagolem(vita, pietreMangiate); //creo un tama di vita v e di pietreMangiate inizialmente vuoto
        if (getNumeroTamagolem() <= numeroTama){
            aggiungiTamagolems(tamagolem); //lo aggiungo ai tama del giocatore
            System.out.println("Hai creato un tamagolem");
            System.out.println("Quali pietre vuoi far mangiare a questo Tamagolem?\nScegline " + pietrePerTama);
            visualizzaPietre();
            for(int i = 0; i < pietrePerTama; i++){
                int scelta = InputDati.leggiIntero("Inserisci il numero della pietra che vuoi aggiungere", 1, pietrePerTama);
                daiPietraAlTamagolem(tamagolem, scelta); //metodo che fa mangiare al tamagolem la pietra scelta
            }
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

    public void visualizzaPietre() {
        for (int i=0; i<pietre.size(); i++){
            System.out.println(i + ".\t" + pietre.elementAt(i).toString());
        }
    }

    private void daiPietraAlTamagolem(Tamagolem tamagolem, int scelta) {
        tamagolem.mangiaPietra(getPietra(scelta));
        System.out.println("La pietra " + getPietra(scelta).toString() + "è stata mangiata dal Tamagolem, YUM!");
        rimuoviPietra(scelta);
    }

    public PietraElementale getPietra(int i){
        return pietre.elementAt(i);
    }

    public void rimuoviPietra(int i) {
        pietre.remove(i);
    }
}
