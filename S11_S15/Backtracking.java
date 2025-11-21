// Backtracking: construye solución paso a paso y retrocede si falla.
// Problema: encontrar camino en matriz 3x3 (0=libre, 1=muro), de (0,0) a (2,2).
public class MazeSolver {
    static int[][] maze = {
        {0, 1, 0},
        {0, 0, 0},
        {1, 1, 0}
    };
    static int N = 3;

    // Intenta mover desde (x,y) hacia salida (N-1,N-1)
    static boolean solve(int x, int y) {
        // Caso base: llegamos
        if (x == N-1 && y == N-1 && maze[x][y] == 0) return true;

        // ¿Es válido este paso?
        if (x < 0 || y < 0 || x >= N || y >= N || maze[x][y] != 0) return false;

        // Marcar como parte de la solución (evita ciclos)
        maze[x][y] = 2;

        // Probar las 4 direcciones
        if (solve(x+1, y)) return true; // abajo
        if (solve(x, y+1)) return true; // derecha
        if (solve(x-1, y)) return true; // arriba
        if (solve(x, y-1)) return true; // izquierda

        // BACKTRACK: deshacer marca → ninguna dirección funcionó
        maze[x][y] = 0;
        return false;
    }

    public static void main(String[] args) {
        boolean sol = solve(0, 0);
        System.out.println("¿Solución? " + sol); // true
        // Imprime el camino (2 = ruta)
        for (int[] row : maze) {
            for (int c : row) System.out.print(c + " ");
            System.out.println();
        }
    }
}
