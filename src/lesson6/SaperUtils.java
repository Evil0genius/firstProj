package lesson6;

import java.util.concurrent.ThreadLocalRandom;

public class SaperUtils {
    public static void fillMines(int[][] field) {
        for (int mine = 0; mine < 10; mine++) {
            int row = ThreadLocalRandom.current().nextInt(0, 9);
            int col = ThreadLocalRandom.current().nextInt(0, 9);
            if (field[row][col] == -1) {
                mine--;
            } else {
                field[row][col] = -1;
            }
        }
    }

    public static void insertNumAroundMines(int[][] field) {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                if (field[i][j] == -1) {
                    if (i == 0 && j == 0) {   //left up
                        if (field[i][j + 1] != -1) {
                            field[i][j + 1] += 1;}
                        if (field[i + 1][j + 1] != -1) {
                            field[i + 1][j + 1] += 1;}
                        if (field[i + 1][j] != -1) {
                            field[i + 1][j] += 1;}

                    }
                    int lastJ = field[i].length - 1;
                    int lastI = field.length - 1;

                    if (i == 0 && j == lastJ) {    //right up
                        if (field[i][j - 1] != -1) {
                            field[i][j - 1] += 1;}
                        if (field[i + 1][j - 1] != -1) {
                            field[i + 1][j - 1] += 1;}
                        if (field[i + 1][j] != -1) {
                            field[i + 1][j] += 1;}
                    }

                    if (i == lastI && j == 0) {    // left down
                        if (field[i - 1][j] != -1)
                            field[i - 1][j] += 1;
                        if (field[i - 1][j + 1] != -1)
                            field[i - 1][j + 1] += 1;
                        if (field[i][j + 1] != -1)
                            field[i][j + 1] += 1;
                    }

                    if (i == lastI && j == lastJ) {    //right down
                        if (field[i - 1][j - 1] != -1)
                            field[i - 1][j - 1] += 1;
                        if (field[i - 1][j] != -1)
                            field[i - 1][j] += 1;
                        if (field[i][j - 1] != -1)
                            field[i][j - 1] += 1;
                    }

                    if (i != 0 && i != lastI && j == 0) {    //left corner center
                        if (field[i - 1][j] != -1)
                            field[i - 1][j] += 1;
                        if (field[i - 1][j + 1] != -1)
                            field[i - 1][j + 1] += 1;
                        if (field[i][j + 1] != -1)
                            field[i][j + 1] += 1;
                        if (field[i+1][j] != -1)
                            field[i+1][j] += 1;
                        if (field[i + 1][j + 1] != -1)
                            field[i + 1][j + 1] += 1;
                    }

                    if (i != 0 && i != lastI && j == lastJ) {    //right corner center
                        if (field[i - 1][j - 1] != -1)
                            field[i - 1][j - 1] += 1;
                        if (field[i + 1][j - 1] != -1)
                            field[i + 1][j - 1] += 1;
                        if (field[i][j - 1] != -1)
                            field[i][j - 1] += 1;
                        if (field[i - 1][j] != -1)
                            field[i - 1][j] += 1;
                        if (field[i + 1][j] != -1)
                            field[i + 1][j] += 1;
                    }

                    if (i == 0 && j != 0 && j != lastJ) {    //up corner center
                        if (field[i][j + 1] != -1)
                            field[i][j + 1] += 1;
                        if (field[i + 1][j + 1] != -1)
                            field[i + 1][j + 1] += 1;
                        if (field[i][j - 1] != -1)
                            field[i][j - 1] += 1;
                        if (field[i+1][j] != -1)
                            field[i+1][j] += 1;
                        if (field[i + 1][j - 1] != -1)
                            field[i + 1][j - 1] += 1;
                    }

                    if (i == lastI && j != 0 && j != lastJ) {    //down corner center
                        if (field[i][j + 1] != -1)
                            field[i][j + 1] += 1;
                        if (field[i - 1][j - 1] != -1)
                            field[i - 1][j - 1] += 1;
                        if (field[i][j - 1] != -1)
                            field[i][j - 1] += 1;
                        if (field[i - 1][j] != -1)
                            field[i - 1][j] += 1;
                        if (field[i - 1][j + 1] != -1)
                            field[i - 1][j + 1] += 1;
                    }

                    //расстановка цифр в центральные поля
                    if(i != 0 && j != 0 && j != lastJ && i != lastI){
                        if (field[i - 1][j - 1] != -1)
                            field[i - 1][j - 1] += 1;
                        if (field[i - 1][j] != -1)
                            field[i - 1][j] += 1;
                        if (field[i - 1][j + 1] != -1)
                            field[i - 1][j + 1] += 1;
                        if (field[i][j - 1] != -1)
                            field[i][j - 1] += 1;
                        if (field[i][j + 1] != -1)
                            field[i][j + 1] += 1;
                        if (field[i + 1][j - 1] != -1)
                            field[i + 1][j - 1] += 1;
                        if (field[i + 1][j] != -1)
                            field[i + 1][j] += 1;
                        if (field[i + 1][j + 1] != -1)
                            field[i + 1][j + 1] += 1;
                    }
                }
            }
        }
    }
    public static void printField(int[][] field, boolean[][] mask){
        for(int i = 0; i < field.length; i++){
            for(int j = 0; j < field[i].length; j++){
                if(mask[i][j]){ //if true
                    System.out.print(field[i][j] + " ");
                } else { //false
                    System.out.print("X" + " ");
                }
            }
            System.out.println();
        }
    }



}
