package uni1a;

public class VideoMusical extends ContenidoAudiovisual {
    private String artista;
    private String cancion;
    private String productora;

    public VideoMusical(String titulo, int duracionEnMinutos, String genero,
                        String artista, String cancion, String productora) {
        super(titulo, duracionEnMinutos, genero);
        this.artista = artista;
        this.cancion = cancion;
        this.productora = productora;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Detalles del video musical:");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración en minutos: " + getDuracionEnMinutos());
        System.out.println("Género: " + getGenero());
        System.out.println("Artista: " + artista);
        System.out.println("Canción: " + cancion);
        System.out.println("Productora: " + productora);
        System.out.println();
    }
}