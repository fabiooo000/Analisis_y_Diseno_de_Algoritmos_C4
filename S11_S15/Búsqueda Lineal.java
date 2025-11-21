// Búsqueda lineal: recorre el arreglo secuencialmente.
// Complejidad: O(n). Funciona en arreglos desordenados.
// Útil para datos pequeños, o cuando no se puede/gasta ordenar.
public class LinearSearch {
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) return i; // encontrado
        }
        return -1; // no encontrado
    }

    public static void main(String[] args) {
        int[] A = {64, 34, 25, 12, 22};
        System.out.println(linearSearch(A, 25)); // → 2
        System.out.println(linearSearch(A, 7));  // → -1
    }
}
