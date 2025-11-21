// Quick Sort es un clásico Divide y Vencerás.
// Se elige un pivote, se particiona el arreglo (menores ← pivote → mayores), y se ordenan recursivamente.
// Complejidad promedio: O(n log n); peor caso: O(n²) si pivote es extremo (ej: arreglo ya ordenado y se elige primero/último).
public class QuickSort {
    // Partición de Lomuto (simple, pivote = último)
    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high]; // último como pivote
        int i = low - 1; // índice del menor elemento
        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high); // colocar pivote en su lugar
        return i + 1; // posición final del pivote
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high); // posición del pivote
            quickSort(arr, low, pi - 1);  // izquierda
            quickSort(arr, pi + 1, high); // derecha
        }
    }

    public static void main(String[] args) {
        int[] A = {64, 34, 25, 12, 22, 11, 90};
        quickSort(A, 0, A.length - 1);
        for (int x : A) System.out.print(x + " "); // → 11 12 22 25 34 64 90
    }
}
