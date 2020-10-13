package Comp.Solve;

import Fields.SmallField;

public class Solve {
    public static boolean Solve(int[] FormatedField, Fields.SmallField[] Field){
        int Sum = 0;
        int[] count = new int[9];
        int Value;

        //test smallfields
        for(int f=0;f<=8;f++){
            for(int i=0; i<=8;i++){
                Value = Field[f].getValue(i);
                Sum += Value;
                count[Value-1]++;
            }
        }
        for(int c=0;c<=8;c++){
            if(count[c]!=9){return false;}
        }
        if(Sum!=405){return false;}

        //Reset Variables
        for(int i=0;i<=8;i++){count[i] =0;}
        Value = 0;

        int min = 0; int max = 8;

        //Test Rows
        for(int i=0;i<=8;i++){
            for(int f=min;f<=max;f++){
                Value = FormatedField[f];
                count[Value-1]++;
            }
            for(int c=0;c<=8;c++){if(count[c]!=1){return false;}}
            min += 9; max += 9;
        }


        //Reset Variables
        for(int i=0;i<=8;i++){count[i] =0;}
        Value = 0;

        min = 0; max = 72;

        //Test Rows
        for(int i=0;i<=8;i++){
            for(int f=min;f<=max;f++){
                Value = FormatedField[f];
                count[Value-1]++;
            }
            for(int c=0;c<=8;c++){if(count[c]!=1){return false;}}
            min++; max++;
        }

        return true;
    }
}
