package ups.data;

import java.util.ArrayList;
import java.util.List;
import ups.model.ContenidoAudiovisual;

public class ContenidoRepository {

    // Lista donde se guardan todos los contenidos (películas, series, documentales)
    private List<ContenidoAudiovisual> contenidos;

    // Constructor
    public ContenidoRepository() {
        contenidos = new ArrayList<>();
    }

    // Agregar nuevo contenido
    public void agregarContenido(ContenidoAudiovisual contenido) {
        contenidos.add(contenido);
    }

    // Obtener todos los contenidos
    public List<ContenidoAudiovisual> getContenidos() {
        return contenidos;
    }

    // Buscar por código
    public ContenidoAudiovisual buscarPorCodigo(String codigo) {
        for (ContenidoAudiovisual c : contenidos) {
            if (c.getCodigo().equalsIgnoreCase(codigo)) {
                return c;
            }
        }
        return null; // Si no encuentra nada
    }
}

