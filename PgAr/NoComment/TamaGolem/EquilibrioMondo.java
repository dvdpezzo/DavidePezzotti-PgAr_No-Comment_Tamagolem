package PgAr.NoComment.TamaGolem;
import java.util.*;
public class EquilibrioMondo {
    //aggiungere altri 5 elementi
    //Questi due vettori costituiranno le righe e le colonne della matriche che rappresenta l'equilibrio
    private String[] attacco ={"Terra", "Aria","Acqua","Fuoco", "Suono", "Fulmini", "Ombra", "Erba", "Veleno"};
    private String[] tipo ={"Terra", "Aria","Acqua","Fuoco", "Suono", "Fulmini", "Ombra","Erba","Veleno"};
    //private Integer [][]equilibrio = new Integer[][];
    private Integer equilibrio[][]= {{0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0}};
    LinkedList <String> pietreTotali = new LinkedList <String>();
    /*a seconda del livello scelto genererà tot numeri casuali che
     poi andrà casualmente a inserire (con i dovuti controlli)
     */
    public void generaEquilibrio (Integer[][] matrice, int livello) {
        int rand1, rand2, rand3, rand4, rand5, rand6, rand7, rand8;
        Random rand= new Random();
        switch(livello) {
            case 4:

                for (int i=0; i<livello; i++) {
                    do {
                        rand1=rand.nextInt(10)-5;
                        rand2=rand.nextInt(10)-5;
                        rand3=rand.nextInt(10)-5;


                    }while (rand1+rand2+rand3!=0||rand1==0||rand2==0||rand3==0);

                    if (attacco[0].equals(tipo[i])) {
                        matrice[0][i]=0;
                        matrice[1][i]=rand1;
                        matrice[2][i]=rand2;
                        matrice[3][i]=rand3;
                    }
                    else if (attacco[1].equals(tipo[i])) {
                        matrice[0][i]=rand1;
                        matrice[1][i]=0;
                        matrice[2][i]=rand2;
                        matrice[3][i]=rand3;
                    }
                    else if (attacco[2].equals(tipo[i])) {
                        matrice[0][i]=rand1;
                        matrice[1][i]=rand2;
                        matrice[2][i]=0;
                        matrice[3][i]=rand3;
                    }
                    else {
                        matrice[0][i]=rand1;
                        matrice[1][i]=rand2;
                        matrice[2][i]=rand3;
                        matrice[3][i]=0;
                    }
                }
                break;
            case 7:
                for (int i=0; i<livello; i++) {
                    do {
                        rand1=rand.nextInt(10)-5;
                        rand2=rand.nextInt(10)-5;
                        rand3=rand.nextInt(10)-5;
                        rand4=rand.nextInt(10)-5;
                        rand5=rand.nextInt(10)-5;
                        rand6=rand.nextInt(10)-5;


                    }while (rand1+rand2+rand3+rand4+rand5+rand6!=0||rand1==0||rand2==0||rand3==0||rand4==0||rand5==0||rand6==0);

                    if (attacco[0].equals(tipo[i])) {
                        matrice[0][i]=0;
                        matrice[1][i]=rand1;
                        matrice[2][i]=rand2;
                        matrice[3][i]=rand3;
                        matrice[4][i]=rand4;
                        matrice[5][i]=rand5;
                        matrice[6][i]=rand6;

                    }
                    else if (attacco[1].equals(tipo[i])) {
                        matrice[0][i]=rand1;
                        matrice[1][i]=0;
                        matrice[2][i]=rand2;
                        matrice[3][i]=rand3;
                        matrice[4][i]=rand4;
                        matrice[5][i]=rand5;
                        matrice[6][i]=rand6;
                    }
                    else if (attacco[2].equals(tipo[i])) {
                        matrice[0][i]=rand1;
                        matrice[1][i]=rand2;
                        matrice[2][i]=0;
                        matrice[3][i]=rand3;
                        matrice[4][i]=rand4;
                        matrice[5][i]=rand5;
                        matrice[6][i]=rand6;
                    }
                    else if (attacco[3].equals(tipo[i])){
                        matrice[0][i]=rand1;
                        matrice[1][i]=rand2;
                        matrice[2][i]=rand3;
                        matrice[3][i]=0;
                        matrice[4][i]=rand4;
                        matrice[5][i]=rand5;
                        matrice[6][i]=rand6;
                    }
                    else if (attacco[4].equals(tipo[i])) {
                        matrice[0][i]=rand1;
                        matrice[1][i]=rand2;
                        matrice[2][i]=rand3;
                        matrice[3][i]=rand4;
                        matrice[4][i]=0;
                        matrice[5][i]=rand5;
                        matrice[6][i]=rand6;
                    }
                    else if (attacco[5].equals(tipo[i])) {
                        matrice[0][i]=rand1;
                        matrice[1][i]=rand2;
                        matrice[2][i]=rand3;
                        matrice[3][i]=rand4;
                        matrice[4][i]=rand5;
                        matrice[5][i]=0;
                        matrice[6][i]=rand6;
                    }
                    else if (attacco[6].equals(tipo[i])) {
                        matrice[0][i]=rand1;
                        matrice[1][i]=rand2;
                        matrice[2][i]=rand3;
                        matrice[3][i]=rand4;
                        matrice[4][i]=rand5;
                        matrice[5][i]=rand6;
                        matrice[6][i]=0;
                    }
                }
                break;
            case 9:
                for (int i=0; i<livello; i++) {
                    do {
                        rand1=rand.nextInt(10)-5;
                        rand2=rand.nextInt(10)-5;
                        rand3=rand.nextInt(10)-5;
                        rand4=rand.nextInt(10)-5;
                        rand5=rand.nextInt(10)-5;
                        rand6=rand.nextInt(10)-5;
                        rand7=rand.nextInt(10)-5;
                        rand8=rand.nextInt(10)-5;

                    }while (rand1+rand2+rand3+rand4+rand5+rand6+rand7+rand8!=0||rand1==0||rand2==0||rand3==0||rand4==0||rand5==0||rand6==0||rand7==0||rand8==0);

                    if (attacco[0].equals(tipo[i])) {
                        matrice[0][i]=0;
                        matrice[1][i]=rand1;
                        matrice[2][i]=rand2;
                        matrice[3][i]=rand3;
                        matrice[4][i]=rand4;
                        matrice[5][i]=rand5;
                        matrice[6][i]=rand6;
                        matrice[7][i]=rand7;
                        matrice[8][i]=rand8;

                    }
                    else if (attacco[1].equals(tipo[i])) {
                        matrice[0][i]=rand1;
                        matrice[1][i]=0;
                        matrice[2][i]=rand2;
                        matrice[3][i]=rand3;
                        matrice[4][i]=rand4;
                        matrice[5][i]=rand5;
                        matrice[6][i]=rand6;
                        matrice[7][i]=rand7;
                        matrice[8][i]=rand8;
                    }
                    else if (attacco[2].equals(tipo[i])) {
                        matrice[0][i]=rand1;
                        matrice[1][i]=rand2;
                        matrice[2][i]=0;
                        matrice[3][i]=rand3;
                        matrice[4][i]=rand4;
                        matrice[5][i]=rand5;
                        matrice[6][i]=rand6;
                        matrice[7][i]=rand7;
                        matrice[8][i]=rand8;
                    }
                    else if (attacco[3].equals(tipo[i])){
                        matrice[0][i]=rand1;
                        matrice[1][i]=rand2;
                        matrice[2][i]=rand3;
                        matrice[3][i]=0;
                        matrice[4][i]=rand4;
                        matrice[5][i]=rand5;
                        matrice[6][i]=rand6;
                        matrice[7][i]=rand7;
                        matrice[8][i]=rand8;
                    }
                    else if (attacco[4].equals(tipo[i])) {
                        matrice[0][i]=rand1;
                        matrice[1][i]=rand2;
                        matrice[2][i]=rand3;
                        matrice[3][i]=rand4;
                        matrice[4][i]=0;
                        matrice[5][i]=rand5;
                        matrice[6][i]=rand6;
                        matrice[7][i]=rand7;
                        matrice[8][i]=rand8;
                    }
                    else if (attacco[5].equals(tipo[i])) {
                        matrice[0][i]=rand1;
                        matrice[1][i]=rand2;
                        matrice[2][i]=rand3;
                        matrice[3][i]=rand4;
                        matrice[4][i]=rand5;
                        matrice[5][i]=0;
                        matrice[6][i]=rand6;
                        matrice[7][i]=rand7;
                        matrice[8][i]=rand8;
                    }
                    else if (attacco[6].equals(tipo[i])) {
                        matrice[0][i]=rand1;
                        matrice[1][i]=rand2;
                        matrice[2][i]=rand3;
                        matrice[3][i]=rand4;
                        matrice[4][i]=rand5;
                        matrice[5][i]=rand6;
                        matrice[6][i]=0;
                        matrice[7][i]=rand7;
                        matrice[8][i]=rand8;
                    }
                    else if (attacco[7].equals(tipo[i])) {
                        matrice[0][i]=rand1;
                        matrice[1][i]=rand2;
                        matrice[2][i]=rand3;
                        matrice[3][i]=rand4;
                        matrice[4][i]=rand5;
                        matrice[5][i]=rand6;
                        matrice[6][i]=rand7;
                        matrice[7][i]=0;
                        matrice[8][i]=rand8;
                    }
                    else if (attacco[8].equals(tipo[i])) {
                        matrice[0][i]=rand1;
                        matrice[1][i]=rand2;
                        matrice[2][i]=rand3;
                        matrice[3][i]=rand4;
                        matrice[4][i]=rand5;
                        matrice[5][i]=rand6;
                        matrice[6][i]=rand7;
                        matrice[7][i]=rand8;
                        matrice[8][i]=0;
                    }
                }
                break;

        }

    }


    //date S pietre totali, di cui n per tipo me le inserisce tutte in un vettore
    public LinkedList <String> generaPietre (int S, int N){
        for (int j=0; j< N; j++)
            for (int i=0; i<S/N; i++){
                pietreTotali.add(tipo[j]);
            }
        return pietreTotali;
    }


    public void stampaEquilibrio(Integer[][] matrice){
        System.out.print("       ");

        for (int i=0; i< attacco.length; i++)
            System.out.print("" +tipo[i]);
        System.out.println();
        for (int j=0; j<tipo.length; j++) {
            System.out.print(attacco[j]+"   ");
            for (int i=0; i< attacco.length; i++)
                System.out.print(matrice[j][i]+"   ");
            System.out.println();
        }

    }

    public String[] getAttacco() {
        return attacco;
    }

    public void setAttacco(String[] attacco) {
        this.attacco = attacco;
    }

    public String[] getTipo() {
        return tipo;
    }

    public void setTipo(String[] tipo) {
        this.tipo = tipo;
    }

    public LinkedList<String> getPietreTotali() {
        return pietreTotali;
    }

    public String getPietra(int i){
        return pietreTotali.get(i);
    }


    public Integer[][] getEquilibrio() {
        return equilibrio;
    }



}
