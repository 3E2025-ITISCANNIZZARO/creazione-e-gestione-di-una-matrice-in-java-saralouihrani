// Esercizio: Lavorare con le Matrici in Java
//
// 1. Creare una matrice 3x3 di numeri interi.
// 2. Popolare la matrice con valori casuali compresi tra 1 e 100.
// 3. Implementare un metodo che calcoli la somma di tutti gli elementi della matrice.
// 4. Implementare un metodo che trovi il valore massimo nella matrice.
// 5. Stampare la matrice, la somma degli elementi e il valore massimo trovato.
//
// Suggerimento:
// - Utilizza la classe Random per generare numeri casuali.
// - Per stampare la matrice, usa un ciclo annidato.

public class Main {
    public static void main(String[] args) {
        // Creazione e popolamento della matrice
        int[][] matrix = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = (int)(Math.random() * 10 + 1); // Popola la matrice con numeri casuali tra 1 e 10
            }
        }

        // Stampa della matrice
        System.out.println("Matrice:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // Calcolo della somma degli elementi
        int sum = calculateSum(matrix);
        System.out.println("Somma degli elementi: " + sum);

          // Ricerca del valore massimo
          int[] max = findMax(matrix);
          System.out.println("Valore massimo: " + max[0]);
          System.out.println("Coordinate del massimo: (" + max[1] + ", " + max[2] + ")");
  
          // Ricerca numero di pari e dispari
          int pari = contNump(matrix);
          System.out.println("Nella matrice ci sono: " + pari + " numeri pari");
  
          int dispari = contNumd(matrix);
          System.out.println("Nella matrice ci sono: " + dispari + " numeri dispari");
    }
            // Metodo per calcolare la somma degli elementi della matrice
            public static int calculateSum(int[][] matrix) {
                int sum = 0;
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        sum += matrix[i][j];
                    }
                }
        return sum;
    }

    // Metodo per trovare il valore massimo nella matrice e le sue coordinate
    public static int[] findMax(int[][] matrix) {
        int max = matrix[0][0];
        int posx = 0;
        int posy = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                    posx = i;
                    posy = j;
                }
            }
        }
        return new int[] { max, posx, posy };
    }
       // Metodo per contare i numeri pari nella matrice
       public static int contNump(int[][] matrix) {
        int contp = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matrix[i][j] % 2 == 0) {
                    contp+=1;
                }
            }
        }
        return contp;
    }

    // Metodo per contare i numeri dispari nella matrice
    public static int contNumd(int[][] matrix) {
        int contd = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matrix[i][j] % 2 != 0) {
                    contd+=1;
                }
            }
        }
        return contd;
    }
}