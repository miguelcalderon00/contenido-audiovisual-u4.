package ups.model;

public abstract class ContenidoAudiovisual {

    private String codigo;
    private String titulo;
    private int anio;

    public ContenidoAudiovisual(String codigo, String titulo, int anio) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.anio = anio;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAnio() {
        return anio;
    }

    public abstract String getInfo();
}


