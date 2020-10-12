package Fields;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FieldTest {
    Field game;
    @Test
    void getFormatedFieldTest() {

        int[] a = new int[2];
        game = new Field();
        /*for(int i=0;i<=8;i++) {
            for(int x=0;x<=8;x++){
                a[0]=i;a[1]=x;
                game.SetField(a,i+1);
            }

        }*/
        int[] values;
        values = game.getFormatedField();
        int[] correctValues =
                {
                        1,1,1,2,2,2,3,3,3,
                        1,1,1,2,2,2,3,3,3,
                        1,1,1,2,2,2,3,3,3,
                        4,4,4,5,5,5,6,6,6,
                        4,4,4,5,5,5,6,6,6,
                        4,4,4,5,5,5,6,6,6,
                        7,7,7,8,8,8,9,9,9
                };

        System.out.println(values.toString());
        System.out.println(correctValues.toString());
    }
}