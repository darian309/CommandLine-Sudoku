package Fields;

import Comp.Solve.Solve;

public class Field {
    private SmallField[] Field;

    public Field(){
        Field = new SmallField[9];
        for(int i=0;i<=8;i++){
            Field[i] = new SmallField();
        }
    }


    public void SetUserField(int[] Location, int Wert){
        Field[Location[0]].Change(Location[1],Wert);
        Field[Location[0]].ChangeUserValue(Location[1],Wert);
    }
    public void SetUserField(String FieldLocation, int Wert){
        int[] Location = LocateField(FieldLocation);
        SetUserField(Location, Wert);
    }


    public void SetField(int[] Location, int Wert){
        Field[Location[0]].Change(Location[1],Wert);
    }

    public void SetField(String FieldLocation, int Wert){
        int[] Location = LocateField(FieldLocation);
        SetField(Location, Wert);
    }

    /*public boolean getUserValue(int FieldLocation){
        int[] Location = LocateField(String.valueOf(FieldLocation));
        return getUserValue(Location);
    }*/
    public boolean getUserValue(int[] Location){
        return Field[Location[0]].getUserValue(Location[1]);
    }



    public int getValue(int[] Location){
        return Field[Location[0]].getValue(Location[1]);
    }
    public int getValue(String FieldLocation){
        String SLocation = ArrayToUserLocation(Integer.getInteger(FieldLocation));
        int[] Location = LocateField(SLocation);
        return getValue(Location);
    }

    private int[] LocateField(String Location) {
        char Y = Location.charAt(0);
        char X = Location.charAt(1);
        int x = (int) Character.getNumericValue(X);
        int y = (int) Character.getNumericValue(Y);
        int[] result = new int[2];


        //Return Quadrant
        result[0] = x/3;
        if(y>3||y<7){result[0] = result[0]*2;};
        if(y>6||y<9){result[0] = result[0]*3;};

        //return field
        result[1] = (x/3)+((y/3)-1);
        return result;
    }

    public static String ArrayToUserLocation(int x){

        String xyCoords;

        switch (x){

            case 0:
                xyCoords = "00";
                break;

            case 1:
                xyCoords = "01";
                break;

            case 2:
                xyCoords = "02";
                break;

            case 3:
                xyCoords = "03";
                break;
            case 4:
                xyCoords = "04";
                break;

            case 5:
                xyCoords = "05";
                break;
            case 6:
                xyCoords = "06";
                break;

            case 7:
                xyCoords = "07";
                break;

            case 8:
                xyCoords = "08";
                break;
            case 9:
                xyCoords = "10";
                break;

            case 10:
                xyCoords = "11";
                break;
            case 11:
                xyCoords = "12";
                break;

            case 12:
                xyCoords = "13";
                break;
            case 13:
                xyCoords = "14";
                break;

            case 14:
                xyCoords = "15";
                break;
            case 15:
                xyCoords = "16";
                break;

            case 16:
                xyCoords = "17";
                break;
            case 17:
                xyCoords = "18";
                break;

            case 18:
                xyCoords = "20";
                break;
            case 19:
                xyCoords = "21";
                break;

            case 20:
                xyCoords = "22";
                break;
            case 21:
                xyCoords = "23";
                break;

            case 22:
                xyCoords = "24";
                break;
            case 23:
                xyCoords = "25";
                break;

            case 24:
                xyCoords = "26";
                break;
            case 25:
                xyCoords = "27";
                break;

            case 26:
                xyCoords = "28";
                break;
            case 27:
                xyCoords = "30";
                break;

            case 28:
                xyCoords = "31";
                break;
            case 29:
                xyCoords = "32";
                break;

            case 30:
                xyCoords = "33";
                break;
            case 31:
                xyCoords = "34";
                break;

            case 32:
                xyCoords = "35";
                break;
            case 33:
                xyCoords = "36";
                break;

            case 34:
                xyCoords = "37";
                break;
            case 35:
                xyCoords = "38";
                break;

            case 36:
                xyCoords = "40";
                break;
            case 37:
                xyCoords = "41";
                break;

            case 38:
                xyCoords = "42";
                break;
            case 39:
                xyCoords = "43";
                break;

            case 40:
                xyCoords = "44";
                break;
            case 41:
                xyCoords = "45";
                break;

            case 42:
                xyCoords = "46";
                break;
            case 43:
                xyCoords = "47";
                break;

            case 44:
                xyCoords = "48";
                break;
            case 45:
                xyCoords = "50";
                break;

            case 46:
                xyCoords = "51";
                break;
            case 47:
                xyCoords = "52";
                break;

            case 48:
                xyCoords = "53";
                break;
            case 49:
                xyCoords = "54";
                break;

            case 50:
                xyCoords = "55";
                break;

            case 51:
                xyCoords = "56";
                break;
            case 52:
                xyCoords = "57";
                break;

            case 53:
                xyCoords = "58";
                break;
            case 54:
                xyCoords = "60";
                break;

            case 55:
                xyCoords = "61";
                break;
            case 56:
                xyCoords = "62";
                break;

            case 57:
                xyCoords = "63";
                break;
            case 58:
                xyCoords = "64";
                break;

            case 59:
                xyCoords = "65";
                break;

            case 60:
                xyCoords = "66";
                break;

            case 61:
                xyCoords = "67";
                break;

            case 62:
                xyCoords = "68";
                break;
            case 63:
                xyCoords = "70";
                break;

            case 64:
                xyCoords = "71";
                break;
            case 65:
                xyCoords = "72";
                break;

            case 66:
                xyCoords = "73";
                break;
            case 67:
                xyCoords = "74";
                break;

            case 68:
                xyCoords = "75";
                break;
            case 69:
                xyCoords = "76";
                break;

            case 70:
                xyCoords = "77";
                break;

            case 71:
                xyCoords = "78";
                break;
            case 72:
                xyCoords = "80";
                break;

            case 73:
                xyCoords = "81";
                break;
            case 74:
                xyCoords = "82";
                break;

            case 75:
                xyCoords = "83";
                break;
            case 76:
                xyCoords = "84";
                break;

            case 77:
                xyCoords = "85";
                break;

            case 78:
                xyCoords = "86";
                break;

            case 79:
                xyCoords = "87";
                break;

            case 80:
                xyCoords = "88";
                break;

            default:
                xyCoords = "NOT FOUND";

        }

        return xyCoords;
    }

    public int[] getFormattedField(){

        int[] values = new int[81];
        int i;
        // put values of Fields in a Ro for Row order
        for(i= 0;i<= 2;i++){values[i] = Field[0].getValue(/*      */i);}//
        for(i= 3;i<= 5;i++){values[i] = Field[1].getValue(i- 3);}
        for(i= 6;i<= 8;i++){values[i] = Field[2].getValue(i- 6);}
        for(i= 9;i<=11;i++){values[i] = Field[0].getValue(i- 6);}
        for(i=12;i<=14;i++){values[i] = Field[1].getValue(i- 9);}
        for(i=15;i<=17;i++){values[i] = Field[2].getValue(i-12);}
        for(i=18;i<=20;i++){values[i] = Field[0].getValue(i-12);}
        for(i=21;i<=23;i++){values[i] = Field[1].getValue(i-15);}
        for(i=24;i<=26;i++){values[i] = Field[2].getValue(i-18);}
        for(i=27;i<=29;i++){values[i] = Field[3].getValue(i-27);}//
        for(i=30;i<=32;i++){values[i] = Field[4].getValue(i-30);}
        for(i=33;i<=35;i++){values[i] = Field[5].getValue(i-33);}
        for(i=36;i<=38;i++){values[i] = Field[3].getValue(i-33);}
        for(i=39;i<=41;i++){values[i] = Field[4].getValue(i-36);}
        for(i=42;i<=44;i++){values[i] = Field[5].getValue(i-39);}
        for(i=45;i<=47;i++){values[i] = Field[3].getValue(i-39);}
        for(i=48;i<=50;i++){values[i] = Field[4].getValue(i-42);}
        for(i=51;i<=53;i++){values[i] = Field[5].getValue(i-45);}
        for(i=54;i<=56;i++){values[i] = Field[6].getValue(i-51);}//
        for(i=57;i<=59;i++){values[i] = Field[7].getValue(i-57);}
        for(i=60;i<=62;i++){values[i] = Field[8].getValue(i-60);}
        for(i=63;i<=65;i++){values[i] = Field[6].getValue(i-60);}
        for(i=66;i<=68;i++){values[i] = Field[7].getValue(i-63);}
        for(i=69;i<=71;i++){values[i] = Field[8].getValue(i-66);}
        for(i=72;i<=74;i++){values[i] = Field[6].getValue(i-66);}
        for(i=75;i<=77;i++){values[i] = Field[7].getValue(i-69);}
        for(i=78;i<=80;i++){values[i] = Field[8].getValue(i-72);} //
        return values;
    }


    public SmallField[] getField(){
        return Field;
    }

    public boolean SolveSudoku() {
        int[] FField = getFormattedField();
        return Solve.Solve(FField, Field);
    }

    public boolean getUserValue(int FieldLocation) {
        String SLocation = ArrayToUserLocation(FieldLocation);
        int[] Location = LocateField(SLocation);
        return getUserValue(Location);
    }
}
