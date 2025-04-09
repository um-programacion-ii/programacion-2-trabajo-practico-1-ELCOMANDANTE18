[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/-JQrLgaz)
# 🧠 Trabajo Práctico: Sistema de Gestión de Vehículos (Java + SOLID + GitHub)

## 📌 Objetivo General

Desarrollar una aplicación en Java para gestionar vehículos de una empresa, aplicando los principios de programación orientada a objetos y los **primeros tres principios SOLID**:  
**SRP (Single Responsibility), OCP (Open/Closed) y LSP (Liskov Substitution)**.

A lo largo del trabajo se utilizará también la estructura `ArrayList` para manejar listas dinámicas de vehículos.

Además, deberán aplicar buenas prácticas de **gestión de proyectos usando GitHub**: `Issues`, `Milestones`, `Projects` y `Pull Requests`.

---

## 🧩 Tecnologías y Herramientas

- Java SE (cualquier versión compatible con JDK 8+)
- Git y GitHub
- GitHub Projects
- GitHub Issues
- GitHub Pull Requests

---

## 📘 Etapas del Trabajo

El trabajo está dividido en etapas. Cada etapa deberá registrarse como un **Milestone** en GitHub.

### Etapa 1: Clases Básicas
- Crear la clase `Vehiculo` con atributos: `patente`, `marca`, `año`, `capacidadCargaKg`.
- Agregar constructor, getters/setters y método `mostrarInformacion()`.
- Crear la clase `Main` que cree e imprima al menos 3 vehículos.

### Etapa 2: Aplicar SRP
- Extraer la responsabilidad de impresión a una nueva clase `VehiculoPrinter`.
- Eliminar el método `mostrarInformacion()` de `Vehiculo`.

### Etapa 3: Aplicar OCP
- Crear subclase `Camion` con atributo `tieneAcoplado`.
- Modificar `VehiculoPrinter` para imprimir camiones sin modificar el código existente (usar polimorfismo).

### Etapa 4: Aplicar LSP
- Crear subclase `Auto` con atributo `cantidadPasajeros`.
- Validar que se puedan tratar todos los vehículos desde una misma interfaz (`Vehiculo`).

### Etapa 5: Uso de ArrayList
- Usar `ArrayList<Vehiculo>` para gestionar todos los vehículos.
- Recorrer e imprimir usando `VehiculoPrinter`.
- (Opcional) Buscar por patente dentro de la lista.

---

## ✅ Entrega y Flujo de Trabajo con GitHub

Cada grupo debe:

1. Usar la asignación del repositorio compartido por Slack

2. **Proteger la rama main**:
   - Ir a Settings > Branches > Branch protection rules
   - Agregar regla para la rama `main`
   - Requerir que los tests pasen antes de mergear
   - No permitir push directo a main

3. Crear un **Project** nuevo tipo _Kanban_ con columnas:
   - `To Do`, `In Progress`, `In Review`, `Done`

4. Crear un **Milestone por etapa**:
   - `Etapa 1 - Clases básicas`
   - `Etapa 2 - SRP`
   - `Etapa 3 - OCP`
   - `Etapa 4 - LSP`
   - `Etapa 5 - ArrayList`

5. Crear **Issues** por cada tarea concreta, por ejemplo:
   - "Crear clase Vehiculo"
   - "Crear clase VehiculoPrinter"
   - "Crear subclase Camion"

   Cada Issue debe:
   - Tener un título claro y descripción breve
   - Estar asociado a un `Milestone` y al `Project`
   - Tener asignado al menos un miembro del equipo
   - Incluir labels apropiados (ej: `enhancement`, `bug`, `documentation`)
   - Ser implementado en una nueva rama (branch) creada desde `main`
   - La rama debe seguir el formato: `feature/descripcion-corta` o `fix/descripcion-corta`
   - Ser cerrado mediante un Pull Request (PR) que mergee la rama a `main`
   - Actualizar su estado en el Kanban board según corresponda

6. Hacer **Pull Requests** por cada Issue.
   - Cada PR debe mencionar el Issue que cierra (ej: `Closes #2`)
   - Debe incluir los mismos labels que el Issue asociado
   - Debe estar asociado al mismo Milestone que el Issue
   - Debe estar asociado al mismo Project que el Issue
   - El código debe estar revisado antes de ser fusionado a `main`
   - Al mergear, actualizar el estado del Issue en el Kanban board a `Done`

---

## ✅ Ejemplo de Issue

### Título
Crear clase Vehiculo

### Descripción
Implementar la clase base `Vehiculo` que servirá como punto de partida para la jerarquía de vehículos.

#### Requisitos
- Crear la clase con los siguientes atributos privados:
  ```java
  private String patente;
  private String marca;
  private int anio;
  private double capacidadCargaKg;
  ```
- Implementar:
  - Constructor con todos los atributos
  - Getters y setters para cada atributo
  - Método `mostrarInformacion()` que imprima todos los datos del vehículo

#### Validaciones
- La patente no puede ser null ni vacía
- El año debe ser mayor a 1900 y menor o igual al año actual
- La capacidad de carga debe ser positiva

#### Criterios de Aceptación
- [ ] La clase compila sin errores
- [ ] Se incluyen todos los atributos requeridos
- [ ] Se implementan todos los métodos necesarios
- [ ] Se incluyen las validaciones especificadas
- [ ] Se agrega documentación JavaDoc básica

#### Notas Adicionales
- Considerar agregar constantes para los valores mínimos/máximos
- Incluir mensajes de error descriptivos en las validaciones

### Labels
- `enhancement`
- `good first issue`

### Asignación
- Milestone: `Etapa 1 - Clases básicas`
- Project: `Sistema de Gestión de Vehículos`
- Estado: `To Do`

## ✅ Requisitos para la entrega final

- ✅ Todos los Issues cerrados
- ✅ Todos los Milestones completos
- ✅ Todos los PRs revisados y mergeados
- ✅ Project con todas las tareas en `Done`
- ✅ Este archivo `README.md` completo con:
  - Nombre y apellido del alumno
  - Instrucciones detalladas de cómo ejecutar el proyecto
  - Requisitos previos (JDK, IDE, etc.)
  - Pasos para compilar y ejecutar
  - Ejemplos de uso

> ⏰ **Fecha de vencimiento**: 09/04/2025 a las 13:00 hs

---

## 📝 Licencia

Este trabajo es parte del curso de Programación 2 de Ingeniería en Informática. Uso educativo únicamente.

-----------------------------------------

# 🚗 Proyecto de Gestión de Vehículos 🚌

**Alumno:** Victor Benjamin Gimenez

Este proyecto implementa una jerarquía de clases para representar diferentes tipos de vehículos (Vehículo 🚗, Camión 🚚, Auto 🚓) y utiliza el Principio de Abierto/Cerrado (OCP) para permitir la impresión 🖨️ de información de nuevos tipos de vehículos sin modificar la clase `VehiculoPrinter`.

## 🚀 Instrucciones de Ejecución

Sigue estos pasos para ejecutar el proyecto en tu entorno local, **incluyendo usuarios de WSL (Subsistema de Windows para Linux)**.

### ⚙️ Requisitos Previos

Antes de comenzar, asegúrate de tener instalado lo siguiente:

1.  **Java Development Kit (JDK):** Se requiere una versión compatible de JDK (por ejemplo, JDK 8 o superior). Puedes descargar la última versión recomendada desde [Descargar JDK](https://www.oracle.com/ar/java/technologies/downloads/#java21).

    * **Verificar la instalación (WSL y Windows):**
        * **WSL:** Abre tu terminal de Linux dentro de WSL y ejecuta:
          ```bash
          java -version
          javac -version
          ```
        * **Windows (si no usas el JDK de WSL para IntelliJ):** Abre el Símbolo del sistema o PowerShell y ejecuta:
          ```bash
          java -version
          javac -version
          ```
        Deberías ver información sobre la versión instalada de Java y el compilador.

2.  **Entorno de Desarrollo Integrado (IDE) (Recomendado):** Un IDE facilita la compilación y ejecución del proyecto. Se recomienda **IntelliJ IDEA**, que puedes descargar para Windows desde [Descargar IntelliJ IDEA](https://www.jetbrains.com/es-es/idea/download/?section=windows). IntelliJ IDEA puede acceder a los archivos del proyecto dentro de tu sistema de archivos de WSL.

3.  **Git (Opcional para obtener el código):** Si el código está en un repositorio Git, necesitarás Git. Generalmente, WSL incluye Git, pero también puedes tenerlo instalado en Windows. Puedes descargar Git para Windows desde [Descargar Git]([enlace de descarga de Git]).

### ⬇️ Pasos para Obtener el Código (WSL y Windows)

Si el código está en un repositorio Git (como GitHub, GitLab o Bitbucket):

1.  Abre tu terminal de Linux dentro de WSL **o** el Símbolo del sistema/PowerShell en Windows.
2.  Navega al directorio donde deseas clonar el proyecto dentro de tu sistema de archivos (puedes elegir el sistema de archivos de WSL o el de Windows).
3.  Ejecuta el siguiente comando, reemplazando `[URL_DEL_REPOSITORIO]` con la URL de tu repositorio:
    ```bash
    git clone [https://github.com/um-programacion-ii/programacion-2-trabajo-practico-1-ELCOMANDANTE18](https://github.com/um-programacion-ii/programacion-2-trabajo-practico-1-ELCOMANDANTE18)
    ```
4.  Navega al directorio del proyecto que se acaba de clonar:
    ```bash
    cd programacion-2-trabajo-practico-1-ELCOMANDANTE18
    ```

Si has descargado el código como un archivo ZIP, descomprímelo en la ubicación deseada dentro de tu sistema de archivos (WSL o Windows).

### 🛠️ Pasos para Ejecutar (IntelliJ IDEA usando WSL)

1.  Abre **IntelliJ IDEA** 💡 en Windows.
2.  Selecciona "Open" y navega al directorio donde clonaste o descomprimiste el proyecto **dentro de tu sistema de archivos de WSL** (generalmente accesible a través de `\\wsl$\<nombre_de_distribucion>\home\<tu_usuario>\<ruta_del_proyecto>`).
3.  Una vez que el proyecto se haya cargado, IntelliJ IDEA debería detectar automáticamente la configuración de Java de tu WSL si está configurado correctamente.
4.  Localiza el archivo `Main.java` en la ventana del proyecto.
5.  Haz clic derecho en `Main.java` y selecciona la opción "Run 'Main.main()'" ▶️. IntelliJ IDEA se encargará de compilar y ejecutar el programa, mostrando la salida en la ventana de la consola "Run".

### 🚦 Ejemplos de Uso

Al ejecutar la aplicación `Main`, deberías ver una salida similar a la siguiente (los detalles exactos pueden variar según la implementación):
Información de todos los vehículos:  
Patente: ABC123 Marca: Toyota Año: 2020 Capacidad de carga: 500.0 kg
Patente: DEF456 Marca: Volvo Año: 2023 Capacidad de carga: 15000.0 kg ¿Tiene acoplado? Sí
Patente: GHI789 Marca: Ford Año: 2022 Capacidad de carga: 0.0 kg Cantidad de pasajeros: 5

Este ejemplo ilustra cómo el programa gestiona e imprime la información de distintos tipos de vehículos: un `Vehiculo` genérico 🚗, un `Camion` 🚚 (indicando si tiene acoplado), y un `Auto` 🚓 (mostrando la cantidad de pasajeros). La clase `VehiculoPrinter` utiliza el polimorfismo para imprimir la información específica de cada tipo sin necesidad de modificaciones al agregar nuevas clases de vehículos, demostrando la aplicación del Principio de Abierto/Cerrado (OCP).