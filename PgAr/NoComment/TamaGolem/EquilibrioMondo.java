package PgAr.NoComment.TamaGolem;

import java.util.*;



public class EquilibrioMondo {
    //aggiungere altri 5 elementi
    String attacco[]={"Terra", "Aria","Acqua","Fuoco"};
    String tipo[]={"Terra", "Aria","Acqua","Fuoco"};

    public static void generaEquilibrio (String attacco[], String tipo[], Integer matrice[][], int livello) {
        int rand1=0, rand2=0, rand3=0, rand4=0, rand5=0, rand6=0, rand7=0, rand8=0;
        Random rand= new Random();
        switch(livello) {
            case 4:

                for (int i=0; i<livello; i++) {
                    do {
                        rand1=rand.nextInt(10)-5;
                        rand2=rand.nextInt(10)-5;
                        rand3=rand.nextInt(10)-5;


                    }while (rand1+rand2+rand3!=0||rand1==0||rand2==0||rand3==0);

                    if (attacco[0] == tipo[i]) {
                        matrice[0][i]=0;
                        matrice[1][i]=rand1;
                        matrice[2][i]=rand2;
                        matrice[3][i]=rand3;
                    }
                    else if (attacco[1]== tipo[i]) {
                        matrice[0][i]=rand1;
                        matrice[1][i]=0;
                        matrice[2][i]=rand2;
                        matrice[3][i]=rand3;
                    }
                    else if (attacco[2]==tipo[i]) {
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

                    if (attacco[0] == tipo[i]) {
                        matrice[0][i]=0;
                        matrice[1][i]=rand1;
                        matrice[2][i]=rand2;
                        matrice[3][i]=rand3;
                        matrice[4][i]=rand4;
                        matrice[5][i]=rand5;
                        matrice[6][i]=rand6;

                    }
                    else if (attacco[1]== tipo[i]) {
                        matrice[0][i]=rand1;
                        matrice[1][i]=0;
                        matrice[2][i]=rand2;
                        matrice[3][i]=rand3;
                        matrice[4][i]=rand4;
                        matrice[5][i]=rand5;
                        matrice[6][i]=rand6;
                    }
                    else if (attacco[2]==tipo[i]) {
                        matrice[0][i]=rand1;
                        matrice[1][i]=rand2;
                        matrice[2][i]=0;
                        matrice[3][i]=rand3;
                        matrice[4][i]=rand4;
                        matrice[5][i]=rand5;
                        matrice[6][i]=rand6;
                    }
                    else if (attacco[3]==tipo[i]){
                        matrice[0][i]=rand1;
                        matrice[1][i]=rand2;
                        matrice[2][i]=rand3;
                        matrice[3][i]=0;
                        matrice[4][i]=rand4;
                        matrice[5][i]=rand5;
                        matrice[6][i]=rand6;
                    }
                    else if (attacco[4]==tipo[i]) {
                        matrice[0][i]=rand1;
                        matrice[1][i]=rand2;
                        matrice[2][i]=rand3;
                        matrice[3][i]=rand4;
                        matrice[4][i]=0;
                        matrice[5][i]=rand5;
                        matrice[6][i]=rand6;
                    }
                    else if (attacco[5]==tipo[i]) {
                        matrice[0][i]=rand1;
                        matrice[1][i]=rand2;
                        matrice[2][i]=rand3;
                        matrice[3][i]=rand4;
                        matrice[4][i]=rand5;
                        matrice[5][i]=0;
                        matrice[6][i]=rand6;
                    }
                    else if (attacco[6]==tipo[i]) {
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

                    if (attacco[0] == tipo[i]) {
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
                    else if (attacco[1]== tipo[i]) {
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
                    else if (attacco[2]==tipo[i]) {
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
                    else if (attacco[3]==tipo[i]){
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
                    else if (attacco[4]==tipo[i]) {
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
                    else if (attacco[5]==tipo[i]) {
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
                    else if (attacco[6]==tipo[i]) {
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
                    else if (attacco[7]==tipo[i]) {
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
                    else if (attacco[8]==tipo[i]) {
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


    public int confrontaElementi (String elemento1, String elemento2, Integer matrice[][], String attacco[], String tipo[]){
        for (int i=0; i< tipo.length; i++)
            for (int j=0; j< attacco.length; j++){
                if (elemento1 == attacco[j] && elemento2== tipo[i])
                    return matrice[j][i];
            }
        //non ritornerà mai zero
        return 0;
    }

    public void stampaEquilibrio(Integer matrice[][], String attacco[], String tipo[]){
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





}
