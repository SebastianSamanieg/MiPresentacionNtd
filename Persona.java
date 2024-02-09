public class Persona {
    private String nombre;
    private String codigo;
    private double estatura;
    private int cantPersonajesFavoritos;
    private String[] hobbies;
    private String temaFavoritoCarrera;
    private String fraseIdentifica;
    private String asignaturaFavorita;
    private boolean tieneMascota;

    public Persona(String nombre, String codigo, double estatura, int cantPersonajesFavoritos, String[] hobbies, String temaFavoritoCarrera, String fraseIdentifica, String asignaturaFavorita, boolean tieneMascota) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.estatura = estatura;
        this.cantPersonajesFavoritos = cantPersonajesFavoritos;
        this.hobbies = hobbies;
        this.temaFavoritoCarrera = temaFavoritoCarrera;
        this.fraseIdentifica = fraseIdentifica;
        this.asignaturaFavorita = asignaturaFavorita;
        this.tieneMascota = tieneMascota;
    }

    // Métodos para acceder y modificar los atributos
    public String getNombre() {
        return nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public double getEstatura() {
        return estatura;
    }

    public int getCantPersonajesFavoritos() {
        return cantPersonajesFavoritos;
    }

    public String[] getHobbies() {
        return hobbies;
    }

    public String getTemaFavoritoCarrera() {
        return temaFavoritoCarrera;
    }

    public String getFraseIdentifica() {
        return fraseIdentifica;
    }

    public String getAsignaturaFavorita() {
        return asignaturaFavorita;
    }

    public boolean isTieneMascota() {
        return tieneMascota;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public void setCantPersonajesFavoritos(int cantPersonajesFavoritos) {
        this.cantPersonajesFavoritos = cantPersonajesFavoritos;
    }

    public void setHobbies(String[] hobbies) {
        this.hobbies = hobbies;
    }

    public void setTemaFavoritoCarrera(String temaFavoritoCarrera) {
        this.temaFavoritoCarrera = temaFavoritoCarrera;
    }

    public void setFraseIdentifica(String fraseIdentifica) {
        this.fraseIdentifica = fraseIdentifica;
    }

    public void setAsignaturaFavorita(String asignaturaFavorita) {
        this.asignaturaFavorita = asignaturaFavorita;
    }

    public void setTieneMascota(boolean tieneMascota) {
        this.tieneMascota = tieneMascota;
    }
}
