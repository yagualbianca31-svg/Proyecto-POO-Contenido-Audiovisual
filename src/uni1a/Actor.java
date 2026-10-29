package uni1a;

public class Actor {
    public String nombre = "Ryan Gosling";
    public String personaje = "Noah Calhoun";
    public String nacionalidad = "Canadiense";
    public int anioNacimiento = 1980;

    public void mostrarDetalles() {
        System.out.println("Actor: " + nombre);
        System.out.println("Personaje: " + personaje);
        System.out.println("Nacionalidad: " + nacionalidad);
        System.out.println("Año de nacimiento: " + anioNacimiento);
    }
}
