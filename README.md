# 📺 Proyecto: Gestión de Contenidos Audiovisuales – Unidad 4  
### Ingeniería de Software – UPS

Este proyecto implementa un sistema básico para gestionar contenidos audiovisuales (Películas, Series, Documentales) utilizando **POO, colecciones, herencia y pruebas unitarias**.  
Además, se aplicó un proceso de **refactorización**, creación de **pruebas unitarias** y actualización del **diagrama UML**.

---

## 📌 1. Estructura del Proyecto

```txt
src/
└── ups/
    ├── controller/
    │     └── ContenidoController.java
    ├── data/
    │     └── RepositorioDeContenido.java
    ├── modelo/
    │     ├── ContenidoAudiovisual.java
    │     ├── Pelicula.java
    │     ├── Serie.java
    │     ├── Actor.java
    │     ├── Documental.java
    │     └── Temporada.java
    ├── prueba/
    │     └── PeliculaTest.java
    └── view/
          └── ContenidoView.java

diagrama_contenido_u4_v2.uxf
## 📌 2. Refactorización Realizada

Durante el proceso de mejora se realizaron los siguientes cambios:

### ✔️ Mejoras en el diseño
- Se aplicó **herencia**:  
  `Pelicula`, `Serie` y `Documental` heredan de `ContenidoAudiovisual`.
- Se organizó el proyecto en paquetes siguiendo el patrón **MVC**:
  - modelo  
  - controller  
  - view  
  - data  
  - prueba  

### ✔️ Mejoras de código
- Atributos encapsulados (`private`) con getters.
- Métodos claros y con responsabilidad definida.
- Eliminación de código duplicado.
- Clases mejor organizadas y mantenibles.

### ✔️ Repositorio
`RepositorioDeContenido` administra la lista de contenidos con métodos:

- `agregarContenido()`
- `getContenidos()`
- `buscarPorCodigo()`

### ✔️ Controlador
`ContenidoController` controla la lógica del programa:  
agregar contenido, obtener lista y buscar por código.

---

## 📌 3. Pruebas Unitarias (JUnit)

Las pruebas se encuentran en:

```txt
src/ups/prueba/PeliculaTest.java
Incluyen:

Creación de objetos

Validación de getters

Verificación del método getInfo()

▶️ Para ejecutar pruebas:

Abrir Eclipse

Click derecho → Run As → JUnit Test

📌 4. Diagrama de Clases – Actualizado

El diagrama UML actualizado se encuentra en:
diagrama_contenido_u4_v2.uxf
Este diagrama muestra:

Herencia de ContenidoAudiovisual

Composición entre Serie y Temporada

Asociación ContenidoController → RepositorioDeContenido

Clase Actor

Multiplicidades y relaciones completas

📌 5. Cómo Ejecutar el Proyecto
▶️ Desde Eclipse

Importar o abrir el proyecto en Eclipse

Abrir:
src/ups/view/ContenidoView.java
Run → Run As → Java Application
📌 6. Cómo Clonar Este Repositorio
git clone https://github.com/miguelcalderon00/contenido-audiovisual-u4.git
📌 7. Tecnologías Utilizadas

Java 17+

JUnit 5

Eclipse IDE

UMLet para el diagrama UML

📌 8. Autor

Miguel Abraham Calderón
Universidad Politécnica Salesiana – 2025
