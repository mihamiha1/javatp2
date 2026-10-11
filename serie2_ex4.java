import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;
public class serie2_ex4 {
    public static Scanner scanner = new Scanner(System.in);
    public static Random random = new Random();
    public static void main(String[] args) {
        q1(args);
        q2(args);
        q3(args);
    }
    public static void q1(String[] args) {
        System.out.println("Question 1:\n");
        System.out.print("Entrer la taille du tableau: ");
        int taille = scanner.nextInt();
        int[] tab = new int[taille];
        System.out.print("\nEntrer les éléments du tableau: ");
        for (int i=0; i < taille; i++) {
            tab[i] = scanner.nextInt();
        }
        int max = tab[0];
        for (int i=0; i < taille; i++) {
            if (tab[i] > max) {
                max = tab[i];
            }
        }
        System.out.println("\nla meilleure note est: " + max);
        int count = 0;
        for (int i=0; i < taille; i++) {
            if (tab[i] >= 10) {
                count++;
            }
        }
        System.out.println("\nle nombre d'élèves reussis est : " + count);
        double moyenne = 0;
        for (int i=0; i < taille; i++) {
            moyenne += tab[i];
        }
        moyenne /= taille;
        System.out.println("\nla moyenne des notes est: " + moyenne);
    }
    public static void q2(String[] args) {
        System.out.println("\nQuestion 2:");
        int[] tab = new int[10];
        System.out.print("\nles éléments du tableau: ");
        for (int i=0; i < 10; i++) {
            tab[i] = random.nextInt(100) +1;
            System.out.print(tab[i] + " ");
        }
        System.out.println();
        Arrays.sort(tab);
        System.out.println("\nLe tableau trié est: ");
        for (int i=0; i < 10; i++) {
            System.out.print(tab[i] + " ");
        }
        System.out.println();
    }    
    public static void q3(String[] args) {
        System.out.print("\nQuestion 3:");
        int[] joueur1 = new int[5];
        int[] joueur2 = new int[5];
        System.out.print("\nElements du joueur1:");
        for (int i=0; i < 5; i++) {
            joueur1[i] = random.nextInt(1000);
            System.out.print(joueur1[i] + " ");
        }
        System.out.print("\nElements du joueur2:");
        for (int i=0; i < 5; i++) {
            joueur2[i] = random.nextInt(1000);
            System.out.print(joueur2[i] + " ");
        }
        int somme1 = 0;
        int somme2 = 0;
        for (int j=0; j < 5; j++) {
            somme1 += joueur1[j];
            somme2 += joueur2[j];
        }
        if (somme1 > somme2) {
            System.out.print("\nJoueur 1 gagnant");
        }
        else if (somme2 > somme1) {
            System.out.print("\njoueur 2 gagnant");
        }
        else {
            System.out.print("Draw");
        }
        System.out.println();
    }
}
