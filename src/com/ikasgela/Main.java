package com.ikasgela;

public class Main {

    public static void main(String[] args) {
        int[][] matriz_1 =  new int[4][4];
        int[][] matriz_2 =  new int[4][4];
        int[][] matriz_suma =  new int[4][4];
        int[][] matriz_producto =  new int[4][4];
        int[][] matriz_escalar = matriz_1;
        int[][] matriz_transpuesta = new int[4][4];

        generarMatriz(matriz_1);
        generarMatriz(matriz_2);

        //ProductoMatricial(matriz_1, matriz_2, matriz_producto);
        Transpuesta(matriz_2, matriz_transpuesta);

        visualizarMatriz(matriz_1);
        System.out.println();
        visualizarMatriz(matriz_2);
        System.out.println();
        visualizarMatriz(matriz_transpuesta);


    }

    private static void Transpuesta(int[][] matriz_2, int[][] matriz_transpuesta) {
        for (int i = 0; i < matriz_2.length; i++) {
            for (int j = 0; j < matriz_2[i].length; j++) {
                matriz_transpuesta[j][i] = matriz_2[i][j];
            }
        }
    }

    private static void ProductoMatricial(int[][] matriz_1, int[][] matriz_2, int[][] matriz_producto) {
        int suma_producto = 0;
        int lastj = 0;
        for (int i = 0; i < matriz_1.length; i++) {
            for (int j = 0; j < matriz_1[i].length; j++) {
                int num_mat1 = matriz_1[i][j];
                for (int k = 0; k <matriz_2.length ; k++) {
                    int num_mat2 = matriz_2[j][k];
                    matriz_producto[i][k] += num_mat1*num_mat2;
                }
            }
        }
    }

    private static void MultiplicacionEscalar(int[][] matriz_escalar, int escalar) {
        for (int i = 0; i < matriz_escalar.length; i++) {
            for (int j = 0; j < matriz_escalar[i].length; j++) {
                matriz_escalar[i][j] = matriz_escalar[i][j] * escalar;
            }
        }
    }

    private static void SumaMatricial(int[][] matriz_1, int[][] matriz_2, int[][] matriz_suma) {
        for (int i = 0; i < matriz_1.length; i++) {
            for (int j = 0; j < matriz_1[i].length; j++) {
                matriz_suma[i][j] = matriz_1[i][j] + matriz_2[i][j];
            }
        }
    }


    private static void generarMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = (int) (Math.random() * 20 - 10);
            }
        }
    }

    private static void visualizarMatriz(int[][] matriz) {
        for (int[] fila : matriz) {
            for (double columna : fila) {
                System.out.format(" %6.0f", columna);
            }
            System.out.println();
        }
    }
}
