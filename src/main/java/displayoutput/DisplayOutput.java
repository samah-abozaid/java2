package displayoutput;

import java.util.Scanner;
import java.util.InputMismatchException;

public class DisplayOutput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1;
        int num2;
        int num3;
        int num4;
        try {


            System.out.println("enter num1");
            num1 = input.nextInt();
            System.out.println("enter num2");
            num2 = input.nextInt();

            num3 = num1 + num2;
            System.out.println(num3);
            num4 = num1 / num2;
            System.out.println(num4);
        }
        catch (InputMismatchException e) {
            System.out.println("Attention ! Tu es sencé mettre un nombre entier");
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }










    }
}