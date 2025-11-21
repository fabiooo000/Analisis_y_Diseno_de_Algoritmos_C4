// Shell Sort mejora Insertion Sort permitiendo intercambios entre elementos distantes.
// Usa una secuencia de "huecos" (gaps), como la de Knuth: 1, 4, 13, 40...
// Complejidad promedio: O(n^(3/2)) con gaps eficientes; peor caso: O(n²) con mala secuencia.
public class ShellSort {
    public static void shellSort(int[] arr) {
        int n = arr.length;

        // 1. Generar secuencia de gaps (Knuth: h = 3*h + 1)
        int h = 1;
        while (h < n / 3) h = 3 * h + 1; // → 1, 4, 13, 40...

        // 2. Reducir gap y aplicar inserción en sublistas
        while (h >= 1) {
            for (int i = h; i < n; i++) { // cada sublista empieza en 'h'
                int key = arr[i];
                int j = i;
                // Insertar arr[i] en su sublista ordenada (distancia h)
                while (j >= h && arr[j - h] > key) {
                    arr[j] = arr[j - h]; // desplazar
                    j -= h;
                }
                arr[j] = key;
            }
            h /= 3; // siguiente gap
        }
    }

    public static void main(String[] args) {
        int[] A = {64, 34, 25, 12, 22, 11, 90};
        shellSort(A);
        for (int x : A) System.out.print(x + " "); // → 11 12 22 25 34 64 90
    }
}
