package tools;

import Fields.Field;

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

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void printError(String msg){

        String error = "[" + Templates.RED + "!" + Templates.RESET + "]" + msg;

    }

    public static void printCell(int numberToShow){

        // Templates for the Colorful output of the field numbers.

        String one =
                BLUE + "┌──────────────────┐\n" +
                "│                  │\n" +
                "│      " + GREEN + "▀▀▀▀▀▀" + BLUE +"      │\n"  +
                "│    " + GREEN + "▀▀    ▀▀" + BLUE + "      │\n" +
                "│          " + GREEN + "▀▀" + BLUE + "      │\n" +
                "│          " + GREEN + "▀▀" + BLUE + "      │\n" +
                "│          " + GREEN + "▀▀" + BLUE + "      │\n" +
                "│     " + GREEN + "▀▀▀▀▀▀▀▀▀" + BLUE + "    │\n" +
                BLUE + "│                  │\n" +
                "└──────────────────┘" + RESET;


        String two =
                BLUE + "┌──────────────────┐\n" +
                "│                  │\n" +
                "│    " + GREEN + "▀▀▀▀▀▀▀▀▀" + BLUE + "     │\n" +
                "│    " + GREEN + "▀▀     ▀▀" + BLUE + "     │\n" +
                "│           " + GREEN + "▀▀" + BLUE + "     │\n" +
                "│        " + GREEN + "▀▀" + BLUE + "        │\n" +
                "│      " + GREEN + "▀▀" + BLUE + "          │\n" +
                "│    " + GREEN + "▀▀▀▀▀▀▀▀▀" + BLUE + "     │\n" +
                "│                  │\n" +
                "└──────────────────┘" + RESET;


        String three =
                BLUE + "┌──────────────────┐\n" +
                "│                  │\n" +
                "│    " + GREEN + "▀▀▀▀▀▀▀▀▀" + BLUE + "     │\n" +
                "│            " + GREEN + "▀▀" + BLUE + "    │\n" +
                "│          " + GREEN + "▀▀▀▀ " + BLUE +  "   │\n" +
                "│          " + GREEN + "▀▀▀▀ " + BLUE +  "   │\n" +
                "│            " + GREEN + "▀▀" + BLUE + "    │\n" +
                "│    " + GREEN + "▀▀▀▀▀▀▀▀▀" + BLUE + "     │\n" +
                "│                  │\n" +
                "└──────────────────┘" + RESET;


        String four =
                BLUE + "┌──────────────────┐\n" +
                "│                  │\n" +
                "│    " + GREEN + "▀▀     ▀▀" + BLUE + "     │\n" +
                "│    " + GREEN + "▀▀     ▀▀" + BLUE + "     │\n" +
                "│    " + GREEN + "▀▀▀▀▀▀▀▀▀" + BLUE + "     │\n" +
                "│           " + GREEN + "▀▀" + BLUE + "     │\n" +
                "│           " + GREEN + "▀▀" + BLUE + "     │\n" +
                "│           " + GREEN + "▀▀" + BLUE + "     │\n" +
                "│                  │\n" +
                "└──────────────────┘" + RESET;


        String five =
                BLUE + "┌──────────────────┐\n" +
                "│                  │\n" +
                "│    " + GREEN + "▀▀▀▀▀▀▀▀" + BLUE + "      │\n" +
                "│    " + GREEN + "▀▀▀" + BLUE + "           │\n" +
                "│    " + GREEN + "▀▀▀▀▀▀▀▀" + BLUE + "      │\n" +
                "│    " + GREEN + "▀▀▀▀▀▀▀▀" + BLUE + "      │\n" +
                "│        " + GREEN + "▀▀▀▀" + BLUE + "      │\n" +
                "│    " + GREEN + "▀▀▀▀▀▀▀▀" + BLUE + "      │\n" +
                "│                  │\n" +
                "└──────────────────┘" + RESET;


        String six =
                BLUE + "┌──────────────────┐\n" +
                "│                  │\n" +
                "│     " + GREEN + "▀▀▀▀▀▀▀▀" + BLUE + "     │\n" +
                "│     " + GREEN + "▀▀" + BLUE + "           │\n" +
                "│     " + GREEN + "▀▀▀▀▀▀▀▀" + BLUE + "     │\n" +
                "│     " + GREEN + "▀▀▀▀▀▀▀▀" + BLUE + "     │\n" +
                "│     " + GREEN + "▀▀    ▀▀" + BLUE + "     │\n" +
                "│     " + GREEN + "▀▀▀▀▀▀▀▀" + BLUE + "     │\n" +
                "│                  │\n" +
                "└──────────────────┘" + RESET;


        String seven =
                BLUE + "┌──────────────────┐\n" +
                "│                  │\n" +
                "│    " + GREEN + "▀▀▀▀▀▀▀▀▀" + BLUE + "     │\n" +
                "│    " + GREEN + "▀▀     ▀▀" + BLUE + "     │\n" +
                "│           " + GREEN + "▀▀" + BLUE + "     │\n" +
                "│           " + GREEN + "▀▀" + BLUE + "     │\n" +
                "│           " + GREEN + "▀▀" + BLUE + "     │\n" +
                "│           " + GREEN + "▀▀" + BLUE + "     │\n" +
                "│                  │\n" +
                "└──────────────────┘" + RESET;


        String eight =
                BLUE + "┌──────────────────┐\n" +
                "│                  │\n" +
                "│     " + GREEN + "▀▀▀▀▀▀▀▀" + BLUE + "     │\n" +
                "│     " + GREEN + "▀▀    ▀▀" + BLUE + "     │\n" +
                "│     " + GREEN + "▀▀▀▀▀▀▀▀" + BLUE + "     │\n" +
                "│     " + GREEN + "▀▀▀▀▀▀▀▀" + BLUE + "     │\n" +
                "│     " + GREEN + "▀▀    ▀▀" + BLUE + "     │\n" +
                "│     " + GREEN + "▀▀▀▀▀▀▀▀" + BLUE + "     │\n" +
                "│                  │\n" +
                "└──────────────────┘" + RESET;


        String nine =
                BLUE + "┌──────────────────┐\n" +
                "│                  │\n" +
                "│     " + GREEN + "▀▀▀▀▀▀▀▀" + BLUE + "     │\n" +
                "│     " + GREEN + "▀▀    ▀▀" + BLUE + "     │\n" +
                "│     " + GREEN + "▀▀▀▀▀▀▀▀" + BLUE + "     │\n" +
                "│           " + GREEN + "▀▀" + BLUE + "     │\n" +
                "│           " + GREEN + "▀▀" + BLUE + "     │\n" +
                "│     " + GREEN + "▀▀▀▀▀▀▀▀" + BLUE + "     │\n" +
                "│                  │\n" +
                "└──────────────────┘" + RESET;

        String zero =
                BLUE + "┌──────────────────┐\n" +
                "│                  │\n" +
                "│                  │\n" +
                "│                  │\n" +
                "│                  │\n" +
                "│                  │\n" +
                "│                  │\n" +
                "│                  │\n" +
                "│                  │\n" +
                "└──────────────────┘" + RESET;

        switch (numberToShow){

            case 1:
                clearScreen();
                System.out.println(one);
                break;

            case 2:
                clearScreen();
                System.out.println(two);
                break;

            case 3:
                clearScreen();
                System.out.println(three);
                break;

            case 4:
                clearScreen();
                System.out.println(four);
                break;

            case 5:
                clearScreen();
                System.out.println(five);
                break;

            case 6:
                clearScreen();
                System.out.println(six);
                break;

            case 7:
                clearScreen();
                System.out.println(seven);
                break;

            case 8:
                clearScreen();
                System.out.println(eight);
                break;

            case 9:
                clearScreen();
                System.out.println(nine);
                break;

            case 0:
                clearScreen();
                System.out.println(zero);
                break;

            default:
                System.out.println("[ERROR] You tried to print a cell number that doesn't exist.");
                break;
        }

    }


    public static void printBoard(Field Field) {

        String header = "   ┌───┬───┬───┐║┌───┬───┬───┐║┌───┬───┬───┐";
        String intersection = "   ├───┼───┼───┤║├───┼───┼───┤║├───┼───┼───┤";
        String separator = CYAN + "   ═════════════╬═════════════╬═════════════";
        String footer = "   └───┴───┴───┘║└───┴───┴───┘║└───┴───┴───┘" + RESET;
        String numerationHorizontal = CYAN + "     1   2   3     4   5   6     7   8   9";
        String fieldColors = "";


        String formattedString = CYAN + "│ " + fieldColors + "%s" + CYAN + " │ " + fieldColors + "%s" + CYAN + " │ " + fieldColors + "%s" + CYAN + " │║│ " + fieldColors + "%s" + CYAN + " │ " + fieldColors + "%s" + CYAN + " │ " + fieldColors + "%s" + CYAN + " │║│ " + fieldColors + "%s" + CYAN + " │ " + fieldColors + "%s" + CYAN + " │ " + fieldColors + "%s" + CYAN + " │\n";

        String[] Stringarray = new String[81];

        int selector = 0;
        int[] IntArray= Field.getFormattedField();
        for (int items : IntArray) {
            if (items == 0) {
                Stringarray[selector] = " ";
            } else {
                Stringarray[selector] = UserColorShow(Field, selector,String.valueOf(items));

            }
            selector++;
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
        System.out.println(Stringarray);
        System.out.println(IntArray.toString());

    }

    public static String UserColorShow(Field Field, int indexToCheck, String Value){
        String fieldColor;
        boolean user = Field.getUserValue(Fields.Field.ArrayToUserLocation(indexToCheck));

        if(user){

            fieldColor = GREEN + Value + CYAN;

        }else{

            fieldColor = PURPLE + Value + CYAN;

        }

        return fieldColor;

    }
    public static void printBoardD(Field Field) {

        String header = "   ┌───┬───┬───┐║┌───┬───┬───┐║┌───┬───┬───┐";
        String intersection = "   ├───┼───┼───┤║├───┼───┼───┤║├───┼───┼───┤";
        String separator = CYAN + "   ═════════════╬═════════════╬═════════════";
        String footer = "   └───┴───┴───┘║└───┴───┴───┘║└───┴───┴───┘" + RESET;
        String numerationHorizontal = CYAN + "     1   2   3     4   5   6     7   8   9";
        String fieldColors = "";


        String formattedString = CYAN + "│ " + fieldColors + "%s" + CYAN + " │ " + fieldColors + "%s" + CYAN + " │ " + fieldColors + "%s" + CYAN + " │║│ " + fieldColors + "%s" + CYAN + " │ " + fieldColors + "%s" + CYAN + " │ " + fieldColors + "%s" + CYAN + " │║│ " + fieldColors + "%s" + CYAN + " │ " + fieldColors + "%s" + CYAN + " │ " + fieldColors + "%s" + CYAN + " │\n";

        String[] Stringarray = new String[81];

        int selector = 0;

        for (int items : Field.getFormattedField()) {
            if (items == 0) {
                Stringarray[selector] = " ";
            } else {
                Stringarray[selector] = UserColorShow(Field, selector,String.valueOf(items));

            }
            selector++;
        }


        System.out.println(numerationHorizontal);
        System.out.println(header);
        System.out.println("1  " + CYAN + " │ " + Stringarray[0]+ CYAN + " │ " + Stringarray[1]+ CYAN + " │ " + Stringarray[2]+ CYAN + " │ " + Stringarray[3]+ CYAN + " │ " + Stringarray[4]+ CYAN + " │ " + Stringarray[5]+ CYAN + " │ " + Stringarray[6]+ CYAN + " │ " + Stringarray[7]+ CYAN + " │ " + Stringarray[8]);
        System.out.println(intersection);
        System.out.println("2  " + CYAN + " │ " + Stringarray[9]+ CYAN + " │ " + Stringarray[10]+ CYAN + " │ " + Stringarray[11]+ CYAN + " │ " + Stringarray[12]+ CYAN + " │ " + Stringarray[13]+ CYAN + " │ " + Stringarray[14]+ CYAN + " │ " + Stringarray[15]+ CYAN + " │ " + Stringarray[16]+ CYAN + " │ " + Stringarray[17]);
        System.out.println(intersection);
        System.out.println("3  " + CYAN + " │ " + Stringarray[18]+ CYAN + " │ " + Stringarray[19]+ CYAN + " │ " + Stringarray[20]+ CYAN + " │ " + Stringarray[21]+ CYAN + " │ " + Stringarray[22]+ CYAN + " │ " + Stringarray[23]+ CYAN + " │ " + Stringarray[24]+ CYAN + " │ " + Stringarray[25]+ CYAN + " │ " + Stringarray[26]);
        System.out.println(footer);

        System.out.println(separator);

        System.out.println(header);
        System.out.println("4  " + CYAN + " │ " +  Stringarray[27]+ CYAN + " │ " + Stringarray[28]+ CYAN + " │ " + Stringarray[29]+ CYAN + " │ " + Stringarray[30]+ CYAN + " │ " + Stringarray[31]+ CYAN + " │ " + Stringarray[32]+ CYAN + " │ " + Stringarray[33]+ CYAN + " │ " + Stringarray[34]+ CYAN + " │ " + Stringarray[35]);
        System.out.println(intersection);
        System.out.println("5  " + CYAN + " │ " + Stringarray[36]+ CYAN + " │ " + Stringarray[37]+ CYAN + " │ " + Stringarray[38]+ CYAN + " │ " + Stringarray[39]+ CYAN + " │ " + Stringarray[40]+ CYAN + " │ " + Stringarray[41]+ CYAN + " │ " + Stringarray[42]+ CYAN + " │ " + Stringarray[43]+ CYAN + " │ " + Stringarray[44]);
        System.out.println(intersection);
        System.out.println("6  " + CYAN + " │ " + Stringarray[45]+ CYAN + " │ " + Stringarray[46]+ CYAN + " │ " + Stringarray[47]+ CYAN + " │ " + Stringarray[48]+ CYAN + " │ " + Stringarray[49]+ CYAN + " │ " + Stringarray[50]+ CYAN + " │ " + Stringarray[51]+ CYAN + " │ " + Stringarray[52]+ CYAN + " │ " + Stringarray[53]);
        System.out.println(footer);

        System.out.println(separator);

        System.out.println(header);
        System.out.println("7  " + CYAN + " │ " + Stringarray[54]+ CYAN + " │ " + Stringarray[55]+ CYAN + " │ " + Stringarray[56]+ CYAN + " │ " + Stringarray[57]+ CYAN + " │ " + Stringarray[58]+ CYAN + " │ " + Stringarray[59]+ CYAN + " │ " + Stringarray[69]+ CYAN + " │ " + Stringarray[61]+ CYAN + " │ " + Stringarray[62]);
        System.out.println(intersection);
        System.out.println("8  " + CYAN + " │ " + Stringarray[63]+ CYAN + " │ " + Stringarray[64]+ CYAN + " │ " + Stringarray[65]+ CYAN + " │ " + Stringarray[66]+ CYAN + " │ " + Stringarray[67]+ CYAN + " │ " + Stringarray[68]+ CYAN + " │ " + Stringarray[69]+ CYAN + " │ " + Stringarray[70]+ CYAN + " │ " + Stringarray[71]);
        System.out.println(intersection);
        System.out.println("9  " + CYAN + " │ " + Stringarray[72] + CYAN + " │ " + Stringarray[73] + CYAN + " │ " + Stringarray[74]+ CYAN + " │ " + Stringarray[75]+ CYAN + " │ " + Stringarray[76]+ CYAN + " │ " + Stringarray[77]+ CYAN + " │ " + Stringarray[78] + CYAN + " │ " + Stringarray[79]+ CYAN + " │ " + Stringarray[80]);
        System.out.println(footer);
    }

}

