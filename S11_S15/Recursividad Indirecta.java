// Recursividad indirecta: A llama a B, y B llama a A.
// Muestra cómo múltiples funciones cooperan recursivamente.
// Útil en gramáticas, validadores, o problemas con estados alternantes.
public class ParImpar {
    static boolean esPar(int n) {
        if (n == 0) return true;
        return esImpar(n - 1); // delega a la otra
    }

    static boolean esImpar(int n) {
        if (n == 0) return false;
        return esPar(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(esPar(4));  // true
        System.out.println(esImpar(5)); // true
        // Pila: esPar(4) → esImpar(3) → esPar(2) → ... → esPar(0)=true
    }
}
