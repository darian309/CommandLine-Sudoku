package Comp.Generate;

public class Sudoku {
    public static Field Sudoku(){
        Field game = new Field();
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
}
