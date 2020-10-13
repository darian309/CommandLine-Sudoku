package Fields;

public class SmallField {
    private int[] SField;
    private boolean[] ifUserInput;

    SmallField(){
        SField = new int[9];
        int[] SField = {0,0,0,0,0,0,0,0,0};
        boolean[] ifUserValue = {false,false,false,false,false,false,false,false,false};
    }
    SmallField(int v){
        SField = new int[9];
        int[] SField = {v,v,v,v,v,v,v,v,v};
    }
    public void Change(int location, int wert){
        SField[location] = wert;
    }
    public void ChangeUserValue(int location, int wert){
        SField[location] = wert;

    }
    public int getValue(int location) {
        return SField[location];
    }
    public boolean getIfUserValue(int wert){return ifUserInput[wert];}
}
