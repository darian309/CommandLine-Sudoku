package tools;

import Fields.Field;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
// import Fields.Field;

public class Templates {

    public static final String RESET = "\u001B[0m";
    public static final String BLACK = "\u001B[30m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String BLUE = "\u001B[34m";
    public static final String PURPLE = "\u001B[35m";
    public static final String CYAN = "\u001B[36m";
    public static final String WHITE = "\u001B[37m";


    public static void printBoard(Field Field) {

        String header = "   ┌───┬───┬───┐║┌───┬───┬───┐║┌───┬───┬───┐";
        String intersection = "   ├───┼───┼───┤║├───┼───┼───┤║├───┼───┼───┤";
        String separator = CYAN + "   ═════════════╬═════════════╬═════════════";
        String footer = "   └───┴───┴───┘║└───┴───┴───┘║└───┴───┴───┘" + RESET;
        String numerationHorizontal = CYAN + "     1   2   3     4   5   6     7   8   9";
        String formattedString = CYAN + "│ " + PURPLE + "%s" + CYAN + " │ " + PURPLE + "%s" + CYAN + " │ " + PURPLE + "%s" + CYAN + " │║│ " + PURPLE + "%s" + CYAN + " │ " + PURPLE + "%s" + CYAN + " │ " + PURPLE + "%s" + CYAN + " │║│ " + PURPLE + "%s" + CYAN + " │ " + PURPLE + "%s" + CYAN + " │ " + PURPLE + "%s" + CYAN + " │\n";

        String[] Stringarray = new String[81];

        int selector = 0;

        for (int items : Field.getFormattedField()) {
            if (items == 0) {
                Stringarray[selector] = " ";
            } else {
                Stringarray[selector] = String.valueOf(items);
            }
            selector ++;
        }


        System.out.println(numerationHorizontal);
        System.out.println(header);
        System.out.printf("1  " + formattedString, Stringarray[0], Stringarray[1], Stringarray[2], Stringarray[3], Stringarray[4], Stringarray[5], Stringarray[6], Stringarray[7], Stringarray[8]);
        System.out.println(intersection);
        System.out.printf("2  " + formattedString, Stringarray[9], Stringarray[10], Stringarray[11], Stringarray[12], Stringarray[13], Stringarray[14], Stringarray[15], Stringarray[16], Stringarray[17]);
        System.out.println(intersection);
        System.out.printf("3  " + formattedString, Stringarray[18], Stringarray[19], Stringarray[20], Stringarray[21], Stringarray[22], Stringarray[23], Stringarray[24], Stringarray[25], Stringarray[26]);
        System.out.println(footer);

        System.out.println(separator);

        System.out.println(header);
        System.out.printf("4  " + formattedString, Stringarray[27], Stringarray[28], Stringarray[29], Stringarray[30], Stringarray[31], Stringarray[32], Stringarray[33], Stringarray[34], Stringarray[35]);
        System.out.println(intersection);
        System.out.printf("5  " + formattedString, Stringarray[36], Stringarray[37], Stringarray[38], Stringarray[39], Stringarray[40], Stringarray[41], Stringarray[42], Stringarray[43], Stringarray[44]);
        System.out.println(intersection);
        System.out.printf("6  " + formattedString, Stringarray[45], Stringarray[46], Stringarray[47], Stringarray[48], Stringarray[49], Stringarray[50], Stringarray[51], Stringarray[52], Stringarray[53]);
        System.out.println(footer);

        System.out.println(separator);

        System.out.println(header);
        System.out.printf("7  " + formattedString, Stringarray[54], Stringarray[55], Stringarray[56], Stringarray[57], Stringarray[58], Stringarray[59], Stringarray[69], Stringarray[61], Stringarray[62]);
        System.out.println(intersection);
        System.out.printf("8  " + formattedString, Stringarray[63], Stringarray[64], Stringarray[65], Stringarray[66], Stringarray[67], Stringarray[68], Stringarray[69], Stringarray[70], Stringarray[71]);
        System.out.println(intersection);
        System.out.printf("9  " + formattedString, Stringarray[72], Stringarray[73], Stringarray[74], Stringarray[75], Stringarray[76], Stringarray[77], Stringarray[78], Stringarray[79], Stringarray[80]);
        System.out.println(footer);

    }
}

