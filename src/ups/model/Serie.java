package ups.model;

public class Serie extends ContenidoAudiovisual {

    private int temporadas;

    // Constructor que llama al constructor de la superclase
    public Serie(String codigo, String titulo, int anio, int temporadas) {
        super(codigo, titulo, anio);
        this.temporadas = temporadas;
    }

    public int getTemporadas() {
        return temporadas;
    }

    @Override
    public String getInfo() {
        return "Serie: " + getTitulo() + " (" + getAnio() + ") - Temporadas: " 
                + temporadas + " - Código: " + getCodigo();
    }
}


