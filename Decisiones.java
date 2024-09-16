public class Decisiones {
    public static void main(String[] args) {

        int fechaDeEstreno = 1999;
        boolean includioEnElPlan = false;
        double calificacion = 8.2;
        String tipoPlan = "premium";

        if (fechaDeEstreno >= 2022) {
            System.out.println("Peliculas mas populares");
        } else {
            System.out.println("Peliculas reto buenasas");
        }

        if (includioEnElPlan || tipoPlan.equals("premium")) {
            System.out.println("Disfrute de su pelicula");
        } else {
            System.out.println("Pelicula no incluida en el plan");
        }
    }
}
