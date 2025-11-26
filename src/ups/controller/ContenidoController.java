package ups.controller;

import ups.data.ContenidoRepository;
import ups.model.ContenidoAudiovisual;

public class ContenidoController {

    private ContenidoRepository repository;

    // Constructor
    public ContenidoController() {
        repository = new ContenidoRepository();
    }

    // Agregar contenido (película, serie, documental)
    public void agregarContenido(ContenidoAudiovisual contenido) {
        repository.agregarContenido(contenido);
    }

    // Listar todos los contenidos
    public void mostrarContenidos() {
        for (ContenidoAudiovisual c : repository.getContenidos()) {
            System.out.println(c.getInfo());
        }
    }

    // Buscar contenido por código
    public ContenidoAudiovisual buscarPorCodigo(String codigo) {
        return repository.buscarPorCodigo(codigo);
    }
}
