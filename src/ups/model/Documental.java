package ups.model;

public class Documental extends ContenidoAudiovisual {

    private String tema;
    private String investigadorPrincipal;

    public Documental(String codigo, String titulo, int anio, String tema, String investigadorPrincipal) {
        super(codigo, titulo, anio);
        this.tema = tema;
        this.investigadorPrincipal = investigadorPrincipal;
    }

    public String getTema() {
        return tema;
    }

    public String getInvestigadorPrincipal() {
        return investigadorPrincipal;
    }

    @Override
    public String getInfo() {
        return "Documental: " + getTitulo() + " (" + getAnio() + ") - Tema: " + tema
                + " - Investigador: " + investigadorPrincipal + " - Codigo: " + getCodigo();
    }
}




