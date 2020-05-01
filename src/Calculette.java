import java.util.Scanner;

public class Calculette {
    public static void main(String[] args) {
        int a, b;
        char operateur;
        double calcul;
        if (args.length > 0) {
            a = Integer.parseInt(args[0]);
            operateur = args[1].charAt(0);
            b = Integer.parseInt(args[2]);
        }
        else {
            Scanner lectureClavier = new Scanner(System.in);
            operateur = menu();
            System.out.println("Entrer la première valeur ");
            a = lectureClavier.nextInt();
            System.out.println("Entrer la seconde valeur ");
            b = lectureClavier.nextInt();
        }
        calcul = calculer(a, b, operateur );
        afficher(a, b, operateur, calcul);
    }
    public static double calculer (int x, int y, char o) {
        double résultat =0;
        switch (o) {
            case '+' : résultat = x + y;
                break;
            case '-' : résultat = x - y;
                break;
            case '/' : résultat = x / y;
                break;
            case '*' : résultat = x * y ;
                break;
        }
        return résultat;
    }
    public static void afficher(int x, int y, char o, double r) {
        System.out.println(x + "  " +o+ " "+ y + " =  " + r);
    }
    public static char menu() {
        char opération ;
        Scanner lectureClavier = new Scanner(System.in);
        System.out.println("Entrer en premier l'opération choisie : ");
        System.out.print(" (+, -, *, /)  ? : ");
        opération = lectureClavier.next().charAt(0);
        return opération ;
    }
}
