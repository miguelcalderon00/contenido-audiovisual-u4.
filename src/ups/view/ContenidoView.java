package ups.view;

import java.util.Scanner;

import ups.controller.ContenidoController;
import ups.model.Documental;
import ups.model.Pelicula;
import ups.model.Serie;
import ups.model.ContenidoAudiovisual;

public class ContenidoView {

    private ContenidoController controller;
    private Scanner scanner;

    public ContenidoView() {
        controller = new ContenidoController();
        scanner = new Scanner(System.in);
    }

    public void mostrarMenu() {
        int opcion;

        do {
            System.out.println("=====================================");
            System.out.println("   SISTEMA DE CONTENIDO AUDIOVISUAL  ");
            System.out.println("=====================================");
            System.out.println("1. Registrar película");
            System.out.println("2. Registrar serie");
            System.out.println("3. Registrar documental");
            System.out.println("4. Listar todos los contenidos");
            System.out.println("5. Buscar contenido por código");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = leerEntero();

            switch (opcion) {
                case 1:
                    registrarPelicula();
                    break;
                case 2:
                    registrarSerie();
                    break;
                case 3:
                    registrarDocumental();
                    break;
                case 4:
                    controller.mostrarContenidos();
                    break;
                case 5:
                    buscarPorCodigo();
                    break;
                case 0:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }

            System.out.println(); // línea en blanco

        } while (opcion != 0);
    }

    // ------- OPCIONES DEL MENÚ -------

    private void registrarPelicula() {
        System.out.println("--- Registrar Película ---");
        System.out.print("Código: ");
        String codigo = scanner.nextLine();

        System.out.print("Título: ");
        String titulo = scanner.nextLine();

        System.out.print("Año: ");
        int anio = leerEntero();

        Pelicula pelicula = new Pelicula(codigo, titulo, anio);
        controller.agregarContenido(pelicula);

        System.out.println("Película registrada correctamente.");
    }

    private void registrarSerie() {
        System.out.println("--- Registrar Serie ---");
        System.out.print("Código: ");
        String codigo = scanner.nextLine();

        System.out.print("Título: ");
        String titulo = scanner.nextLine();

        System.out.print("Año: ");
        int anio = leerEntero();

        System.out.print("Número de temporadas: ");
        int temporadas = leerEntero();

        Serie serie = new Serie(codigo, titulo, anio, temporadas);
        controller.agregarContenido(serie);

        System.out.println("Serie registrada correctamente.");
    }

    private void registrarDocumental() {
        System.out.println("--- Registrar Documental ---");
        System.out.print("Código: ");
        String codigo = scanner.nextLine();

        System.out.print("Título: ");
        String titulo = scanner.nextLine();

        System.out.print("Año: ");
        int anio = leerEntero();

        System.out.print("Tema: ");
        String tema = scanner.nextLine();

        System.out.print("Investigador principal: ");
        String investigador = scanner.nextLine();

        Documental doc = new Documental(codigo, titulo, anio, tema, investigador);
        controller.agregarContenido(doc);

        System.out.println("Documental registrado correctamente.");
    }

    private void buscarPorCodigo() {
        System.out.println("--- Buscar contenido por código ---");
        System.out.print("Ingrese el código: ");
        String codigo = scanner.nextLine();

        ContenidoAudiovisual contenido = controller.buscarPorCodigo(codigo);

        if (contenido != null) {
            System.out.println("Resultado:");
            System.out.println(contenido.getInfo());
        } else {
            System.out.println("No se encontró contenido con ese código.");
        }
    }

    // ------- MÉTODOS AUXILIARES -------

    private int leerEntero() {
        while (true) {
            try {
                String linea = scanner.nextLine();
                return Integer.parseInt(linea.trim());
            } catch (NumberFormatException e) {
                System.out.print("Número inválido, intente de nuevo: ");
            }
        }
    }

    // ------- PUNTO DE ENTRADA -------

    public static void main(String[] args) {
        ContenidoView vista = new ContenidoView();
        vista.mostrarMenu();
    }
}

