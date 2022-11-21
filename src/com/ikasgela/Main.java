package com.ikasgela;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[][] matriz_1 = new int[4][4];
        int[][] matriz_2 = new int[4][4];
        generarMatriz(matriz_1);
        generarMatriz(matriz_2);

        System.out.println("La matriz numero 1 es:\n");
        visualizarMatriz(matriz_1);

        System.out.println("\nLa matriz numero 2 es:\n");
        visualizarMatriz(matriz_2);

        System.out.println("\nLa suma de estas matrices es:\n");
        visualizarMatriz(SumaMatricial(matriz_1, matriz_2));

        System.out.print("\nIngrese un escalar (entero): ");
        int escalar = Integer.parseInt(br.readLine());
        System.out.println("El producto de la primera matriz con el escalar " + escalar + " es:\n");
        visualizarMatriz(MultiplicacionEscalar(matriz_1, escalar));

        System.out.println("\nEl producto de las dos matrices es:\n");
        visualizarMatriz(ProductoMatricial(matriz_1, matriz_2));

        System.out.println("\nLa matriz transpuesta de la segunda matriz es:\n");
        visualizarMatriz(Transpuesta(matriz_2));
    }


    /**
     * Establece la matriz transpuesta de una matriz 4x4 pasada como parametro.
     *
     * @param matriz_2 - Matriz de 4x4
     * @return Devuelve una nueva matriz que representa la transpuesta de la dada como parametro.
     */
    private static int[][] Transpuesta(int[][] matriz_2) {
        int[][] matriz_transpuesta = new int[4][4];
        for (int i = 0; i < matriz_2.length; i++) {
            for (int j = 0; j < matriz_2[i].length; j++) {
                matriz_transpuesta[j][i] = matriz_2[i][j];
            }
        }

        return matriz_transpuesta;
    }


    /**
     * Establece la matriz resultante del producto de dos matrices 4x4 dadas.
     *
     * @param matriz_1 - Matriz de 4x4
     * @param matriz_2 - Matriz de 4x4
     * @return Devuelve una nueva matriz que representa el producto de las matrices dadas como parametro.
     */
    private static int[][] ProductoMatricial(int[][] matriz_1, int[][] matriz_2) {
        int[][] matriz_producto = new int[4][4];
        for (int i = 0; i < matriz_1.length; i++) {
            for (int j = 0; j < matriz_1[i].length; j++) {
                int num_mat1 = matriz_1[i][j];
                for (int k = 0; k < matriz_2.length; k++) {
                    int num_mat2 = matriz_2[j][k];
                    matriz_producto[i][k] += num_mat1 * num_mat2;
                }
            }
        }

        return matriz_producto;
    }


    /**
     * Establece la matriz resultante del producto de una matriz 4x4 con un escalar dado.
     *
     * @param matriz_1 - Matriz de 4x4
     * @param escalar  - Escalar de tipo entero.
     * @return Devuelve una nueva matriz que representa el producto entre la matriz y el escalar dados como parametro.
     */
    private static int[][] MultiplicacionEscalar(int[][] matriz_1, int escalar) {
        int[][] matriz_escalar = new int[4][4];
        for (int i = 0; i < matriz_escalar.length; i++) {
            for (int j = 0; j < matriz_escalar[i].length; j++) {
                matriz_escalar[i][j] = matriz_1[i][j] * escalar;
            }
        }

        return matriz_escalar;
    }


    /**
     * Establece la matriz resultante de la suma de dos matrices 4x4 dadas.
     *
     * @param matriz_1 - Matriz de 4x4
     * @param matriz_2 - Matriz de 4x4
     * @return Devuelve una nueva matriz que representa la suma de las matrices dadas como parametro.
     */
    private static int[][] SumaMatricial(int[][] matriz_1, int[][] matriz_2) {
        int[][] matriz_suma = new int[4][4];
        for (int i = 0; i < matriz_1.length; i++) {
            for (int j = 0; j < matriz_1[i].length; j++) {
                matriz_suma[i][j] = matriz_1[i][j] + matriz_2[i][j];
            }
        }

        return matriz_suma;
    }

    /**
     * Usando el metodo random de la clase Math, genera una nueva matriz de enteros de rango (-10,10)
     *
     * @param matriz - Matriz mxn de enteros.
     */
    private static void generarMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = (int) (Math.random() * 20 - 10);
            }
        }
    }


    /**
     * Muestra en consola una matriz mxn dada como parametro.
     *
     * @param matriz - Matriz mxn de enteros.
     */
    private static void visualizarMatriz(int[][] matriz) {
        for (int[] fila : matriz) {
            for (double columna : fila) {
                System.out.format(" %6.0f", columna);
            }
            System.out.println();
        }
    }
}
