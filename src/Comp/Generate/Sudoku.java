package Comp.Generate;

import Fields.Field;

public class Sudoku {
    public static Field Sudoku(){
        int[] row = new int[9];
        int[][] Colomn = new int[9][9];
        int[] SmallField = new int[9];
        int[] Location = {0,0};
        int number;
        Field game = new Field();
        for(int f=0;f<=8;f++) {
            for(int i=0;i<=8;i++){
                Location[0]=f; Location[1]=i;
                if(Math.random() <= 0.35){
                    number = (int) Math.random()*8+1;
                    if(!exists(row,SmallField,Colomn[i], number)){
                        game.SetField(Location,number);
                    }
                }
            }
        }
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
    private static boolean exists(int[] row,int[]SmallField,int[] Colomn, int Wert){
        if(Wert==0){return false;}
        for(int i=0;i<=8;i++){if(row[i] == Wert){return true;}}
        for(int i=0;i<=8;i++){if(Colomn[i] == Wert){return true;}}
        for(int i=0;i<=8;i++){if(SmallField[i] == Wert){return true;}}
        return false;//exists(row,SmallField,Colomn[i], 0);
    }
}
