// Recursividad: función que se llama a sí misma.
// Caso base: n ≤ 1 → 1
// Caso recursivo: n * factorial(n-1)
// ¡Cuidado! Usa pila de llamadas: O(n) espacio → posible StackOverflow si n es muy grande.
public class FactorialRec {
    public static long factorial(int n) {
        if (n <= 1) return 1; // caso base: detiene la recursión
        return n * factorial(n - 1); // llamada recursiva
    }

    public static void main(String[] args) {
        System.out.println(factorial(5)); // → 120
        // Pila: factorial(5) → factorial(4) → ... → factorial(0) → retorna 1, luego 1*1, 2*1, etc.
    }
}
