package ups.model;

public class Pelicula extends ContenidoAudiovisual {

    // Constructor que llama al constructor de la superclase
    public Pelicula(String codigo, String titulo, int anio) {
        super(codigo, titulo, anio);
    }

    @Override
    public String getInfo() {
        return "Pelicula: " + getTitulo() + " (" + getAnio() + ") - Codigo: " + getCodigo();
    }
}



