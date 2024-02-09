public class main {
    public static void mainMethod(String[] args) {
        
        // Creación de una instancia de la clase Persona
        Persona persona1 = new Persona("Sebastian Samaniego", "506231082", 1.76, 5, new String[]{"Videojuegos", "Pingpong","Futbol"}, "Desarollo de Software", "Vamoossss!!!", "Nuevas tecnologia de desarrollo", true);
        
        // Acceso a los atributos de la instancia persona
        System.out.println("---------------------------------------------");
        System.out.println("Mi presentacion:");
        System.out.println("---------------------------------------------");
        System.out.println("Nombre: " + persona1.getNombre());
        System.out.println("Codigo: " + persona1.getCodigo());
        System.out.println("Estatura: " + persona1.getEstatura());
        System.out.println("Cantidad de personajes favoritos: " + persona1.getCantPersonajesFavoritos());
        System.out.println("Hobbies: ");
        for (String hobby : persona1.getHobbies()) {
            System.out.println("- " + hobby);
        }
        System.out.println("Tema favorito de la carrera: " + persona1.getTemaFavoritoCarrera());
        System.out.println("Frase que le identifica: " + persona1.getFraseIdentifica());
        System.out.println("Asignatura favorita: " + persona1.getAsignaturaFavorita());
        System.out.println("Tiene mascota? " + (persona1.isTieneMascota() ? "Si" : "No"));
        
        System.out.println("---------------------------------------------");
    }
}