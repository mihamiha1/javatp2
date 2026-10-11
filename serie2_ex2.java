import java.util.Scanner;
public class serie2_ex2 {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        q1(args);
        q2(args);
        q3(args);
        q4(args);
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
        for (int i=0; i < taille / 2; i++) {
            int temp = tab[i];
            tab[i] = tab[taille - 1 - i];
            tab[taille - 1 - i] = temp;
        }
        for (int i=0; i < taille; i++) {
            System.out.print(tab[i] + " ");
        }
    }
    public static void q2(String[] args) {
        System.out.println("Question 2:\n");
        System.out.print("Entrer la taille du tableau: \n");
        int taille = scanner.nextInt();
        int[] tab = new int[taille];
        System.out.print("\nEntrer les éléments du tableau: ");
        for (int i=0; i < taille; i++) {
            tab[i] = scanner.nextInt();
        }
        System.out.print("\nEntrer l'élément à chercher: ");
        int x = scanner.nextInt();
        int occ = 0;
        for (int i=0; i < taille; i++) {
            if (tab[i] == x) {
                occ ++;
                System.out.println("L'élément " + x + " est trouvé à l'indice " + i);
                return;
            }
        }
        if (occ == 0) {
            System.out.println("L'élément " + x + " n'est pas trouvé\n");
        }
    }
    public static void q3(String[] args) {
        System.out.println("Question 3:\n");
        System.out.print("Entrer la taille du tableau: \n");
        int taille = scanner.nextInt();
        int[] tab = new int[taille];
        System.out.print("\nEntrer les éléments du tableau1: ");
        for (int i=0; i < taille; i++) {
            tab[i] = scanner.nextInt();
        }
        int[] tab2 = new int[taille];
        System.out.print("\nEntrer les éléments du tableau2: ");
        for (int i=0; i < taille; i++) {
            tab2[i] = scanner.nextInt();
        }
        int[] tab3 = new int[taille];
        for (int i=0; i < taille; i++) {
            tab3[i] = tab[i] + tab2[i];
        }
        for (int i=0; i < taille; i++) {
            System.out.print(tab3[i] + " ");
        }
    }
    public static void q4(String[] args) {
        System.out.println("Question 4:\n");
        System.out.print("Entrer la taille du tableau: \n");
        int taille = scanner.nextInt();
        int[] tab = new int[taille];
        System.out.print("\nEntrer les éléments du tableau: ");
        for (int i=0; i < taille; i++) {
            tab[i] = scanner.nextInt();
        }
        System.out.print("\nEntrer l'élément à supprimer: ");
        int x = scanner.nextInt();
        for (int i=0; i < taille; i++) {
            if (tab[i] == x) {
                for (int j=i; j < taille - 1; j++) {
                    tab[j] = tab[j+1];
                }
                tab[taille - 1] = 0;
                break;
            }
        }
        for (int i=0; i < taille; i++) {
            System.out.print(tab[i] + " ");
        }
    }
    
}
