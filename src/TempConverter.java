import java.util.Scanner;

public class TempConverter {
    public static void main(String[] args) {
        System.out.println("-----------------------------------Welcome-------------------------------");
        System.out.println("--------Convertisseur Celsius-Fahrenheit/Fahrenheit-Celsius--------");
        Scanner sc = new Scanner(System.in);
        boolean a = false;
        int C,F,x;
        do{
            System.out.println("choisissez le mode de conversion :");
            System.out.println("1- Celsius-Fahrenheit");
            System.out.println("2- Fahrenheit-Celsius");
            int val = sc.nextInt();
            while (val>2 ){
                System.out.println("invalid entry please enter 1 (oui) or 2 (non)");
                val= sc.nextInt();
            }
            if (val == 1){
                System.out.println("Veuillez entrer la température à convertir :");
                C = sc.nextInt();
                F = (C*9/5)+32;
                System.out.println("°C -------->"+F+"°F");
                System.out.println("voulez-vous convertir d'autres températures ? ");
                x = sc.nextInt();
                while (x>2 ){
                    System.out.println("invalid entry please enter 1 (oui) or 2 (non)");
                    x = sc.nextInt();
                }
                if (x==1)
                    a = true;
                else{
                    System.out.println("-----------------------------Au revoir, à bientôt -------------------------");
                    a = false;
                }

            } else  {
                System.out.println("Veuillez entrer la température à convertir :");
                F = sc.nextInt();
                C = (F-32)*5/9;
                System.out.println("°F -------->"+C+"°C");
                System.out.println("voulez-vous convertir d'autres températures ? ");
                x = sc.nextInt();
                while (x>2){
                    System.out.println("invalid entry please enter 1 (oui) or 2 (non)");
                    x = sc.nextInt();
                }
                if (x==1)
                    a = true;
                else{
                    System.out.println("-----------------------------Au revoir, à bientôt -------------------------");
                    a = false;
                }
            }

        }while (a == true);
    }
}
