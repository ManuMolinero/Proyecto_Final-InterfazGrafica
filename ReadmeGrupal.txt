# 🌱 Simulación de Ecosistema

## Proyecto Final – Interfaz Gráfica

### Alumno:
**Manuel Molinero**

### Proyecto base:
Este proyecto fue desarrollado originalmente durante la cursada de la materia **Interfaz Gráfica** junto a:
- Matías Funes
- Valentín González
- Manuel Molinero
- Sacha Saleski

Para la instancia del examen final se tomó como base dicho proyecto y se realizaron mejoras individuales, incorporando persistencia de datos, nuevas funcionalidades y mejoras en la interfaz gráfica.

# Descripción del proyecto:
El proyecto consiste en una aplicación de escritorio desarrollada en **Java** utilizando **Swing**, cuyo objetivo es simular el comportamiento de un ecosistema donde interactúan plantas, conejos y lobos bajo distintas condiciones climáticas.
Durante la simulación las entidades nacen, se alimentan, se reproducen, envejecen y mueren siguiendo reglas definidas dentro del ecosistema. Además, el usuario puede intervenir modificando el clima o agregando nuevas especies durante determinados turnos.
El proyecto fue desarrollado aplicando los conceptos de **Programación Orientada a Objetos**, arquitectura **MVC**, patrón **DAO** e interfaces gráficas con Swing.

# Arquitectura:
El proyecto está organizado siguiendo la arquitectura **MVC + DAO**, separando correctamente las responsabilidades del sistema.

### Modelo:
Contiene toda la lógica del ecosistema:
- Entidad
- Animal
- Planta
- Conejo
- Lobo
- Ecosistema
- Interfaces Mortal y Reproducible

### Vista:
La interfaz fue desarrollada completamente con **Java Swing** mediante NetBeans.

Entre las pantallas principales se encuentran:
- Configuración inicial de la simulación.
- Simulación del ecosistema.
- Reporte final.
- Historial de simulaciones.

### Controlador:
Se encarga de recibir las acciones del usuario y coordinar la comunicación entre la vista y el modelo.

### DAO:
La capa DAO permite desacoplar completamente la persistencia de la lógica del programa.
Para el examen final se implementó una nueva persistencia utilizando **SQLite**, permitiendo almacenar automáticamente las simulaciones realizadas.

# Desarrollo realizado durante la cursada:
Durante el desarrollo grupal participé en las siguientes tareas:

## Primer parcial:
- Implementación de la clase abstracta **Animal**.
- Desarrollo de la clase **Conejo**.
- Implementación de los métodos de alimentación, reproducción y comportamiento.
- Integración de la lógica con la clase Ecosistema.

La mayor dificultad consistió en comprender la interacción entre las distintas clases y la comunicación con Ecosistema para recorrer las listas de entidades y actualizar correctamente el estado de la simulación.

## Segundo parcial:
Durante la segunda instancia evaluativa participé en el desarrollo de la interfaz gráfica inicial del proyecto.
Implementé la pantalla de configuración del ecosistema permitiendo al usuario definir:
- Cantidad inicial de plantas.
- Cantidad inicial de conejos.
- Cantidad inicial de lobos.
- Clima inicial.
- Cantidad máxima de turnos.

Además colaboré con la integración general de la interfaz con el controlador.

# Desarrollo realizado para el examen final:
Para la instancia final se incorporaron nuevas funcionalidades que agregan valor a la aplicación y cumplen con los requisitos establecidos por la materia.
Las principales mejoras fueron:
- Implementación de persistencia mediante **SQLite**.
- Creación de la conexión a la base de datos mediante **JDBC**.
- Desarrollo de las clases `ConexionDB`, `InicializadorDB`, `ReporteDAO` y `ReporteDAOImpl`.
- Guardado automático del reporte al finalizar cada simulación.
- Desarrollo del historial de simulaciones.
- Implementación de búsqueda por nombre.
- Implementación de filtros por resultado.
- Visualización individual de reportes almacenados.
- Eliminación de simulaciones guardadas.
- Exportación de reportes en formato **CSV** compatible con Microsoft Excel.
- Integración completa de estas funcionalidades con la interfaz gráfica existente sin modificar la arquitectura principal del proyecto.

Estas mejoras permiten conservar la información generada por las simulaciones y consultarla posteriormente, aportando un valor real al usuario y facilitando el análisis de los resultados obtenidos.

# Tecnologías utilizadas:
- Java
- Java Swing
- SQLite
- JDBC
- NetBeans
- Git y GitHub
- Figma

# Inteligencia Artificial utilizada:
Durante el desarrollo del proyecto se utilizaron herramientas de Inteligencia Artificial como apoyo para resolver dudas técnicas, comprender conceptos y mejorar determinadas implementaciones.

## ChatGPT:
- https://chatgpt.com/c/6a668e46-0920-83e9-a787-84717e19c7fe

- https://chatgpt.com/c/69ffa700-3878-83e9-a1a5-21d1641d900f

## Claude:
- https://claude.ai/chat/9477937f-3de1-48e9-a495-9767d8f6cf46

# Mejoras futuras:
Aunque el proyecto cumple con los objetivos planteados, existen funcionalidades que podrían incorporarse en futuras versiones y que ya deje armadas tanto en figma como en NetBeans una vista, por ejemplo:
- Exportación de reportes en PDF.


# Conclusión:
Este proyecto permitió aplicar e integrar los conocimientos adquiridos durante la cursada de Interfaz Gráfica.

Las mejoras desarrolladas para el examen final ampliaron las capacidades de la aplicación, incorporando persistencia mediante SQLite, gestión de reportes, historial de simulaciones, búsqueda, filtrado y exportación de datos, logrando una aplicación más completa, organizada y preparada para futuras ampliaciones.


VIDEO_ 1 Y 2 Instacia Evaluativa:
https://drive.google.com/drive/folders/1A9GxJIoVLE6qyRDYI4ZzXYU1i6QfSff7

_FINAL: https://drive.google.com/file/d/1YywvJRwC02WHDechEv6w9WSRRVO5LShq/view?usp=drive_link

FIGMA: https://www.figma.com/make/u0vbt80AFGKpNg29387FwO/Ecosystem-Simulation-App?t=6W9y5gQsej5SFEiy-1&code-node-id=0-9
