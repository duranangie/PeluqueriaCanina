# Peluqueria canina 

# Peluquería Canina App

Esta es una aplicación de gestión para una peluquería canina, desarrollada en Java con interfaz gráfica de usuario (IGU) utilizando Java Swing. La aplicación implementa un CRUD (Crear, Leer, Actualizar, Eliminar) conectado a una base de datos relacional para gestionar los datos de los dueños y sus mascotas.

## Características

- **CRUD completo:** La aplicación permite realizar operaciones de Crear, Leer, Actualizar y Eliminar datos de dueños y mascotas.
- **Interfaz Gráfica de Usuario (IGU):** Utiliza Java Swing para proporcionar una interfaz fácil de usar e intuitiva.
- **Capas de lógica separadas:** La aplicación sigue una arquitectura de tres capas, separando la lógica de negocio, la interfaz gráfica y la persistencia de datos.
- **Relación uno a uno:** La relación entre dueños y mascotas es uno a uno, lo que significa que cada dueño puede tener como máximo una mascota.

## Requisitos

- Java Development Kit (JDK) 8 o superior.
- MySQL Server para la base de datos.

## Instalación

1. Clona este repositorio en tu máquina local.
2. Importa el proyecto en tu IDE de Java preferido.
3. Asegúrate de tener configurada una base de datos MySQL con el esquema adecuado. Puedes encontrar el script SQL en `database/schema.sql`.
4. Actualiza la configuración de conexión a la base de datos en `src/persistence/DatabaseConfig.java` según la configuración de tu servidor MySQL.
5. Ejecuta la aplicación desde tu IDE.

## Uso

- Al abrir la aplicación, se mostrará una lista de los dueños y sus mascotas.
- Utiliza los botones de la interfaz gráfica para realizar operaciones CRUD sobre los datos.
- Asegúrate de guardar los cambios después de cada operación para actualizar la base de datos.

## Contribuir

Si quieres contribuir a este proyecto, siéntete libre de hacer un fork y enviar un pull request con tus mejoras.

