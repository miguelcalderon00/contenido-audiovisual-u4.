package ups.test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import ups.model.Pelicula;

public class PeliculaTest {

    @Test
    void testCrearPelicula() {
        Pelicula p = new Pelicula("P001", "Matrix", 1999);

        assertEquals("Matrix", p.getTitulo());
        assertEquals(1999, p.getAnio());
        assertEquals("P001", p.getCodigo());
    }
}


