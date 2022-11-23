package jeux;

import java.util.Random;
import java.util.Scanner;

public class FonctionJeux {
    private String mode;
    private int[] array = {1,1,0};
    private String c;
    private Scanner sc = new Scanner(System.in);

    private void shuffleArray(){

        Random rand = new Random();

        for (int i = 0; i < array.length; i++) {
            int randomIndexToSwap = rand.nextInt(array.length);
            int temp = array[randomIndexToSwap];
            array[randomIndexToSwap] = array[i];
            array[i] = temp;
        }
    }
    private void impression(){
        mode = sc.nextLine();
        if (!(mode.equalsIgnoreCase("y")) && !(mode.equalsIgnoreCase("n"))){
            System.out.println("invalid entry, please enter yes or No");
            impression();
        }
    }
    private void choix(){
        c = sc.nextLine();
        if (!(c.equalsIgnoreCase("1")) && !(c.equalsIgnoreCase("2")) && !(c.equalsIgnoreCase("3"))){
            System.out.println("invalid entry, please enter 1, 2 or 3");
            choix();
        }
    }
    public void jouer(){
        System.out.println("devine où est le 0 ?");
        System.out.println("Êtes-vous prêt à jouer? oui/non");
        impression();
        if (mode.equalsIgnoreCase("y")){
            shuffleArray();
            System.out.println("choisissez 1, 2 ou 3 !");
            choix();
            if (array[Integer.parseInt(c)-1]==0)
                System.out.println("bien deviné!");
            else
                System.out.println("Pardon!!! mauvaise conjecture");

            System.out.println("Voulez-vous essayer à nouveau? oui/non");
            impression();
            if (mode.equalsIgnoreCase("y"))
                jouer();
            else
                System.out.println("à la prochaine!");
        }else
            System.out.println("à la prochaine!");

    }
}

