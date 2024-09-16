public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenido a Screen Match");
        System.out.println("Pelicula: Matrix");

        int fechaDeEstreno = 1999;
        boolean includioEnElPlan = true;
        double calificacion = 8.2;

        double media = (8.2 + 9.5 + 8.0) / 3;
        System.out.println("La media de las calificaciones es: " + media);

        String sinopsis = """
                Un pirata informático aprende de la existencia de la Matrix
                y se une a un grupo de rebeldes para luchar contra ella. 
                Fue lanzada en:
                """ + fechaDeEstreno;
        System.out.println(sinopsis);

        int clasificacion = (int) (media / 2);
        System.out.println("La clasificación de la película es: " + clasificacion);

    }
}