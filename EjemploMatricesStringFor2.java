
public class EjemploMatricesStringFor2 {
    public static void main(String[] args) {


        String[][] nombres = {{"Pepe", "Peposky"}, {" Holegario", " juanito"}, {" panchita", " javicho"}};

        for (String[] fila : nombres) {
            for (String nombre : fila) {
                System.out.print(nombre + "\t");
            }
            System.out.println();
        }
    }
}