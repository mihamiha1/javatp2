import java.util.Scanner;
public class serie2_ex3 {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        q1(args);
        q2(args);
        q3(args);
    }
    public static void q1(String[] args) {
        System.out.println("Question 1:\n");
        int[][] tab = new int[3][3];
        System.out.print("Entrer les éléments du tableau 3x3: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tab[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < 3; i++) {
            int L = 0;
            for (int j = 0; j < 3; j++) {
                L += tab[i][j];
            }
            System.out.println("\nLa somme de la ligne " + i + " est: " + L);
        }
        for (int j = 0; j < 3; j++) {
            int C = 0;
            for (int i = 0; i < 3; i++) {
                C += tab[i][j];
            }
            System.out.println("\nLa somme de la colonne " + j + " est: " + C);
        }
    }
    public static void q2(String[] args) {
        System.out.println("\nQuestion 2:\n");
        int[][] tab = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (i == j) {
                    tab[i][j] = 1;
                } else {
                    tab[i][j] = 0;
                }
            }
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(tab[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void q3(String[] args) {
        System.out.println("\nQuestion 3:\n");
        System .out.print("Entrer le nombre des lignes: ");
        int L = scanner.nextInt();
        System.out.print("Entrer le nombre des colonnes: ");
        int C = scanner.nextInt();
        int[][] tab = new int[L][C];
        System.out.print("Entrer les éléments du tableau " + L + "x" + C + ": ");
        for (int i = 0; i < L; i++) {
            for (int j = 0; j < C; j++) {
                tab[i][j] = scanner.nextInt();
            }
        }
        int[][] tab2 = new int[C][L];
        for (int i = 0; i < L; i++) {
            for (int j = 0; j < C; j++) {
                tab2[j][i] = tab[i][j];
            }
        }
        System.out.println("\nLa matrice transposée est: ");
        for (int i = 0; i < C; i++) {
            for (int j = 0; j < L; j++) {
                System.out.print(tab2[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("\nLa matrice originale est: ");
        for (int i = 0; i < L; i++) {
            for (int j = 0; j < C; j++) {
                System.out.print(tab[i][j] + " ");
            }
            System.out.println();
        }
    }    
}