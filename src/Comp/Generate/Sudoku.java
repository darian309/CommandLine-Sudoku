package Comp.Generate;

import Fields.Field;
import IO.userInteraction;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Random;

public class Sudoku {
    private Random generator = new Random();

    public static void main(){
        String[] s = new String[1];
        userInteraction.main(s);

    }
    public static Field Sudoku(){
        int[][] rowAndColomn = new int[9][9];
        for(int i=0;i<=8;i++){Arrays.fill(rowAndColomn[i], 0);}
        int[] smallField = new int[9];
        Arrays.fill(smallField, 0);
        int[] smallfieldLocation = {0,0};
        int[] rowAndColomnLocation;

        int number;
        int counter = 0;


        Field game = new Field();

        for(int f=0;f<=8;f++) {
            for(int i=0;i<=8;i++){
                counter++;
                System.out.println("");
                rowAndColomnLocation = RowAndColumnLocation(counter, game);
                smallfieldLocation[0]=f; smallfieldLocation[1]=i;



                if(randomGenerator() <=3){
                    do {
                        number = (int) randomGenerator();
                        rowAndColomn[rowAndColomnLocation[0]][rowAndColomnLocation[1]] = number;
                    } while (exists(rowAndColomn,smallField, number, f));
                    game.SetField(smallfieldLocation,number);
                }
            }
            Arrays.fill(smallField, 0);
        }
        System.out.println("");
        return  game;
    }



    public  static Field TestSudoku(){
        Field game = new Field();
        int[] a = new int[2];
        for(int i=0;i<=8;i++) {
            for(int x=0;x<=8;x++){
                a[0]=i;a[1]=x;
                game.SetField(a,i+1);
            }

        }
        return game;
    }
    private static boolean exists(int[][] rowAndColomn,int[]SmallField, int Wert,int field){
        if(Wert==0){return false;}
        for(int i=0;i<=8;i++){
            if(rowAndColomn[field][i] == Wert){
                return true;}}//Correct Row
        for(int i=0;i<=8;i++){
            if(rowAndColomn[i][field] == Wert){
                return true;}}// Correct Colomn
        for(int i=0;i<=8;i++){
            if(SmallField[i] == Wert){
                return true;}}

        return false;
    }

    private static int[] RowAndColumnLocation(int i, Field game){
        int[] array = game.getFormattedField();
        String s = Field.ArrayToUserLocation(array[i]);
         // Down here is how to convert a String in a inr array. index 0 = first string Number, second Index Second Number.
        return new int[]{Integer.valueOf(String.valueOf(s.charAt(0))), Integer.valueOf(String.valueOf(s.charAt(1)))};

    }
    public static int randomGenerator() {
        long unixTime = System.currentTimeMillis() / 1000L;
        Random generator = new Random(unixTime);
        return generator.nextInt(9);
    }
}
