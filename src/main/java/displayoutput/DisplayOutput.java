package displayoutput;

import java.util.Scanner;
import java.util.InputMismatchException;

public class DisplayOutput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int nbOne;
        int nbTwo;
        int nbThree;

        try {
            System.out.print("Entrez le premier nombre : ");
            nbOne = Scanner.nextInt();

            System.out.print("Entrez le deuxieme nombre : ");
            nbTwo = Scanner.nextInt();
            Scanner.close();

            nbThree = nbOne * nbTwo;
            String resultToFormat = "Résultat : %d * %d = %d";
            String result = String.format(resultToFormat, nbOne, nbTwo, nbThree);

            System.out.println(result);
        } catch (InputMismatchException e) {
            System.out.println("Attention ! Tu es sencé mettre un nombre entier");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }










