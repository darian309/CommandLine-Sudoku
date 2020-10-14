package IO;

import Comp.Generate.Sudoku;
import Fields.Field;
import tools.Templates;

import java.util.Scanner;

public class userInteraction {
    Field Game;
    public static void main(String[] args){

        Templates.clearScreen();

        String Input;
        Field Game = Sudoku.TestSudoku();
        LoadingScreen();
        Game.SetUserField("83",4);

        while (true){
            Templates.printBoardD(Game);
            Input = selectField();
            if(Input.contains("exit")){
                System.exit(0);
            }else if(Input.contains("exit")){
                if(Game.SolveSudoku()){
                    System.out.println("All Values are Correct!");
                    if(ContinueButton()){
                        CallMain();
                    }else{
                        System.out.println("bye");
                        System.exit(0);
                    }
                }else{
                    System.out.println("Some Values are not Correct! :(");
                    if(ContinueButton()){}else{System.out.println("bye");System.exit(0);}
                }
            }
            String coordinate = String.valueOf(Input.charAt(0)) + String.valueOf(Input.charAt(2)) ;
            if(coordinate.charAt(0) <= 48 || coordinate.charAt(0) >= 57){System.out.println("Your value is not correct!");return;}
            if(coordinate.charAt(1) <= 48 || coordinate.charAt(1) >= 57){System.out.println("Your value is not correct!");return;}
            Scanner sc = new Scanner(System.in);
            //Templates.printCell();
            System.out.println(Templates.YELLOW + "\nPlease input new value for this cell!" + Templates.RESET);
            System.out.print("$");
            int Value = sc.nextInt();
            if(Value<=1 || Value >= 9){
                System.out.println(Templates.RED + "New value can't be accepted!" + Templates.RESET);
                return;
            }else{
                if(!Game.getUserValue(Input)) {
                    System.out.println(Templates.RED + "Value cant be changed" + Templates.RESET);
                }else{
                    Game.SetUserField(Input,Value);
                }
            }
        }
    }
    private static void CallMain(){
        String[] s = new String[1];
        main(s);
    }
    private static boolean ContinueButton(){
        Scanner sc = new Scanner(System.in);
        System.out.println(Templates.YELLOW + "Do you want to continue?[y/n]" + Templates.RESET);
        System.out.print("$");
        if(sc.nextLine().contains("exit")){
            return true;
        }else if(sc.nextLine().contains("exit")){
            return true;
        }else{
            return false;
        }
    }

    public static String selectField(){
        Scanner sc = new Scanner(System.in);
        System.out.println(Templates.YELLOW + "Please Type:");
        System.out.println(" - 'y-axis':'x-axis' to select a Field");
        System.out.println(" - 'finish' to let the computer validate the field");
        System.out.println(" - 'exit' to exit the game\n" + Templates.RESET);
        System.out.print("$ ");
        return sc.nextLine();
    }

    private static void LoadingScreen(){

        try {
            System.out.print(Templates.GREEN + "Loading.");
            Thread.sleep(500);
            System.out.print(" .");
            Thread.sleep(500);
            System.out.print(" .");
            Thread.sleep(500);
            System.out.println(" .\n" + Templates.RESET);
            Templates.clearScreen();
        }catch (InterruptedException e){}


    }

}
