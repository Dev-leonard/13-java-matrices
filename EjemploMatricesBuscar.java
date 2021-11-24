public class EjemploMatricesBuscar {
    public static void main(String[] args) {

        int[][] matrizDeEnteros = {
                {35, 20, 50, 524},
                {4, 45, 8, 75, 1},
                {856, 452, 892, 4567}
        };

        int elementoBuscar = 75;
        boolean encontrado = false;
        int i;
        int j = 0;
        buscar:
        for (i = 0; i < matrizDeEnteros.length; i++) {
            for (j = 0; j < matrizDeEnteros[i].length; j++) {
                if (matrizDeEnteros[i][j] == elementoBuscar) {
                    encontrado = true;
                    break buscar;
                }
            }
        }
        if (encontrado) {
            System.out.println("Encontrado " + elementoBuscar + " en las coordenadas " + i + " , " + j);
        } else {
            System.out.println(elementoBuscar + " no se encontro en la matriz!");
        }
    }
}
