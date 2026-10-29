package uni1a;

public class SerieDeTV extends ContenidoAudiovisual {
    private int temporadas;
    private Temporada temporada;

    public SerieDeTV(String titulo, int duracionEnMinutos, String genero, int temporadas) {
        super(titulo, duracionEnMinutos, genero);
        this.temporadas = temporadas;
        this.temporada = new Temporada(temporadas, 0);
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
        this.temporada = new Temporada(temporadas, 0);
    }

    public Temporada getTemporada() {
        return temporada;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Detalles de la serie:");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración en minutos: " + getDuracionEnMinutos());
        System.out.println("Género: " + getGenero());
        System.out.println("Temporadas: " + temporadas);

        if (temporada != null) {
            temporada.mostrarDetalles();
        }

        System.out.println();
    }
}