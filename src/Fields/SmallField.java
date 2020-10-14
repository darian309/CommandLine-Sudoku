package Fields;

import java.util.Arrays;

public class SmallField {
    private int[] SField = {0,0,0,0,0,0,0,0,0};
    private boolean[] ifUserValue = {false,false,false,false,false,false,false,false,false};

    SmallField(){

    }
    SmallField(int v){
        Arrays.fill(SField, v);
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
    public boolean getUserValue(int wert){return ifUserValue[wert];}
}
