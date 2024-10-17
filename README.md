# Conversor de Monedas

Este es un proyecto básico en Java que permite convertir diferentes monedas utilizando una API externa de tasas de cambio. El proyecto interactúa con el usuario a través de un menú para seleccionar la moneda de origen, la cantidad a convertir y la moneda de destino.

## Funcionalidades

- **Selección de monedas**: El usuario puede elegir entre varias monedas latinoamericanas y el dólar estadounidense para realizar conversiones.
- **API de tasas de cambio**: Se realiza una conexión a la API de ExchangeRate para obtener las tasas de cambio actuales.
- **Conversión**: Calcula la cantidad convertida entre la moneda de origen y la moneda de destino.

## Tecnologías Utilizadas

- **Java 17**
- **Google Gson**: Para convertir la respuesta JSON de la API en un objeto Java.
- **API de ExchangeRate**: Para obtener las tasas de cambio actuales.
- **HTTP Client**: Utilizado para realizar solicitudes HTTP a la API.

## Requisitos Previos

Antes de ejecutar el proyecto, asegúrate de tener instalados los siguientes componentes:

- **Java 17 o superior**: [Descargar Java](https://www.oracle.com/java/technologies/javase-jdk17-downloads.html)
- **Maven**: Este proyecto utiliza Maven para la gestión de dependencias.
- **Gson**: Dependencia para deserializar JSON. Asegúrate de agregar la dependencia de Gson en tu archivo `pom.xml`.

```xml
<dependency>
    <groupId>com.google.code.gson</groupId>
    <artifactId>gson</artifactId>
    <version>2.8.9</version>
</dependency>
