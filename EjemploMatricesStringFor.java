import java.util.SplittableRandom;

public class EjemploMatricesStringFor {
    public static void main(String[] args) {

        String[][] nombres = new String[3][2];
        nombres[0][0] = "Pepe";
        nombres[0][1] = "Peposky";
        nombres[1][0] = "Holegario";
//        nombres[1][1] = "juanito";
        nombres[2][0] = "panchita";
        nombres[2][1] = "javicho";

        System.out.println("Iterando con for: ");

        for (int i = 0; i < nombres.length; i++) {

            for (int j = 0; j < nombres[i].length; j++) {
                System.out.print(nombres[i][j] + "\t ");
            }
            System.out.println();
        }

        System.out.println("Iterando con foreach: ");

        for(String[] fila: nombres){
            for(String nombre: fila){
                System.out.print(nombre + "\t");
            }
            System.out.println();
        }
    }
}
