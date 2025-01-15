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
        Random random = new Random();
        // COMPLETARE IL CODICE

      

        // Stampa della matrice
        System.out.println("Matrice:");
        // COMPLETARE IL CODICE


        // Calcolo della somma degli elementi 
        int sum = calculateSum(matrix);
        System.out.println("Somma degli elementi: " + sum);

        // Ricerca del valore massimo
        int max = findMax(matrix);
        System.out.println("Valore massimo: " + max);
    }

    public static int calculateSum(int[][] matrix) {
        int sum = 0;
   
// COMPLETARE IL CODICE
      
        return sum;
    }

    public static int findMax(int[][] matrix) {
        int max = matrix[0][0];

// COMPLETARE IL CODICE
      
        return max;
    }
}
