package poo;

import uni1a.*;

public class PruebaAudioVisual {
    public static void main(String[] args) {
        System.out.println("Hello from Eclipse!");

        // Película: The Notebook
        ContenidoAudiovisual[] contenidos = new ContenidoAudiovisual[5];

        contenidos[0] = new Pelicula(
            "The Notebook", 123, "Drama romantico", "New Line Cinema"
        );

        ((Pelicula) contenidos[0]).actor = new Actor();

        // Serie: El joven Sheldon
        contenidos[1] = new SerieDeTV(
            "El joven Sheldon", 22, "Comedia", 7
        );

        // Documental: Naturaleza y animales
        contenidos[2] = new Documental(
            "Naturaleza y animales", 45, "Naturaleza", "Animales"
        );
        ((Documental) contenidos[2]).setInvestigador(
        	    new Investigador("David Attenborough", "Naturaleza y animales", "BBC")
        	);
        contenidos[3] = new VideoMusical(
        	    "(Everything I Do)", 5, "Balada romántica",
        	    "Bryan Adams", "Everything I DO (I DO IT for You)", "A&M Records"
        	);
     // Cortometraje Cuerdas
        contenidos[4] = new Cortometraje(
            "Cuerdas",
            11,
            "Animación y drama",
            "Pedro Solís García",
            "La amistad, la empatía y la inclusión",
            "Premio Goya 2014"
        );
        // Mostrar los detalles
        for (ContenidoAudiovisual contenido : contenidos) {
            contenido.mostrarDetalles();
        }
    }
}