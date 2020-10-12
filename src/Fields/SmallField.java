package Fields;

public class SmallField {
    private int[] SField;

    SmallField(){
        SField = new int[9];
        int[] SField = {0,0,0,0,0,0,0,0,0};
    }
    SmallField(int v){
        SField = new int[9];
        int[] SField = {v,v,v,v,v,v,v,v,v};
    }
    public void Change(int location, int wert){
        SField[location] = wert;
    }
    public int getValue(int location) {
        return SField[location];
    }
}
