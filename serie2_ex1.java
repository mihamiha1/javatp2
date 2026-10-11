import java.util.Scanner;
public class serie2_ex1 {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        q1(args);
        q2(args);
        q3(args);
        q4(args);
    }
    public static void q1(String[] args) {
        System.out.println("Question 1:\n");
        int[] tab = {1, 2 , 3, 4, 5};
        System.out.println("Les elements du tableau sont:");
        for (int i=0; i < tab.length; i++) {
            System.out.print(tab[i] + " ");
        }
    }
    public static void q2(String[] args) {
        System.out.println("Question 2:\n");
        int[] tab = new int[10];
        for (int i=0; i < 10; i++) {
            tab[i] = scanner.nextInt();
        }
        int S = 0;
        for (int i=0; i < 10; i++) {
            S += tab[i];
        }
        double M = (double) S / tab.length;
        System.out.println("\nLa somme est: " + S);
        System.out.println("\nLa moyenne est: " + M);
    }
    public static void q3(String[] args) {
       System.out.println("Question 3:\n");
       int[] tab = new int[10];
       for (int i=0; i < 10; i++) {
           tab[i] = 
           scanner.nextInt();
       }
       int max = tab[0];
       int min = tab[0];
       for (int i=0; i < 10; i++) {
           if (tab[i] > max) {
               max = tab[i];
           }
        }
        for (int j= 0; j < 10; j++) {
            if (tab[j] < min) {
                min = tab[j];
            }
        }
        System.out.println("\nLe maximum est: " + max);
        System.out.println("\nLe minimum est: " + min);
    }
    public static void q4(String[] args) {
        System.out.println("Question 4:\n");
        int[] tab = new int[10];
        int pair = 0;
        int impair = 0;
        for (int i=0; i < 10; i++) {
            tab[i] = scanner.nextInt();
        }
        for (int i=0; i < 10; i++) {
            if (tab[i] % 2 == 0) {
                pair++;
            } else {
                impair++;
            }
        }
        System.out.println("\nle nombre d'lements pairs est:" + pair);
        System.out.println("\nle nombre d'lements impairs est:" + impair);
    }
} 
