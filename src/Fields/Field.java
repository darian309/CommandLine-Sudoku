package Fields;

import Comp.Solve.Solve;

public class Field {
    private SmallField[] Field;

    Field(){
        Field = new SmallField[9];
        for(int i=0;i<=8;i++){
            Field[i] = new SmallField();
        }
    }



    public void SetField(int[] Location, int Wert){
        Field[Location[0]].Change(Location[1],Wert);
    }
    public void SetField(String FieldLocation, int Wert){
        int[] Location = LocateField(FieldLocation);
        Field[Location[0]].Change(Location[1],Wert);
    }
    private int[] LocateField(String Location) {
        //TODO: Error Handling
        int y = (int) Location.charAt(0);
        int x = (int) Location.charAt(1);
        int[] result = new int[2];

        //Return Quadrant
        result[0] = x/3;
        if(y>3||y<7){result[0] = result[0]*2;};
        if(y>6||y<9){result[0] = result[0]*3;};

        //return field
        result[1] = (x/3)+((y/3)-1);
        return result;
    }


    public SmallField[] FieldForDiego() {
        return Field; // Field[int].getValue(int);
    }

    public int[] getFormatedField(){
        int[] values = new int[81];
        int i;
        // put values of Fields in a Ro for Row order
        for(i= 0;i<= 2;i++){values[i] = Field[0].getValue(i);}//
        for(i= 3;i<= 5;i++){values[i] = Field[1].getValue(i-3);}
        for(i= 6;i<= 8;i++){values[i] = Field[2].getValue(i-6);}
        for(i= 9;i<=11;i++){values[i] = Field[0].getValue(i-9);}
        for(i=12;i<=14;i++){values[i] = Field[1].getValue(i-12);}
        for(i=15;i<=17;i++){values[i] = Field[2].getValue(i-15);}
        for(i=18;i<=20;i++){values[i] = Field[0].getValue(i-18);}
        for(i=21;i<=23;i++){values[i] = Field[1].getValue(i-21);}
        for(i=24;i<=26;i++){values[i] = Field[2].getValue(i-24);} //
        for(i=27;i<=29;i++){values[i] = Field[3].getValue(i-27);}
        for(i=30;i<=32;i++){values[i] = Field[4].getValue(i-30);}
        for(i=33;i<=35;i++){values[i] = Field[5].getValue(i-33);}
        for(i=36;i<=38;i++){values[i] = Field[3].getValue(i-36);}
        for(i=39;i<=41;i++){values[i] = Field[4].getValue(i-39);}
        for(i=42;i<=44;i++){values[i] = Field[5].getValue(i-42);}
        for(i=45;i<=47;i++){values[i] = Field[3].getValue(i-45);}
        for(i=48;i<=50;i++){values[i] = Field[4].getValue(i-48);}
        for(i=51;i<=53;i++){values[i] = Field[5].getValue(i-51);} //
        for(i=54;i<=56;i++){values[i] = Field[6].getValue(i-54);}
        for(i=57;i<=59;i++){values[i] = Field[7].getValue(i-57);}
        for(i=60;i<=62;i++){values[i] = Field[8].getValue(i-60);}
        for(i=63;i<=65;i++){values[i] = Field[6].getValue(i-63);}
        for(i=66;i<=68;i++){values[i] = Field[7].getValue(i-66);}
        for(i=69;i<=71;i++){values[i] = Field[8].getValue(i-69);}
        for(i=72;i<=74;i++){values[i] = Field[6].getValue(i-72);}
        for(i=75;i<=77;i++){values[i] = Field[7].getValue(i-75);}
        for(i=78;i<=80;i++){values[i] = Field[8].getValue(i-78);} //
        return values;
    }
    public SmallField[] getField(){
        return Field;
    }

    public boolean SolveSudoku() {
        int[] FField = getFormatedField();
        return Solve.Solve(FField, Field);
    }
}
