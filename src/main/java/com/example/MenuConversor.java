package com.example;

import java.util.Map;

public class MenuConversor {
    ConexionApiDinero dineroApi = new ConexionApiDinero();
    DineroRecord dineroRecord;

    public void menuSelector(int seccion) {
        try {
            switch (seccion) {
                case 1:
                    dineroApi.dineroService("ARS");
                    break;
                case 2:
                    dineroApi.dineroService("BOB");
                    break;
                case 3:
                    dineroApi.dineroService("BRL");
                    break;
                case 4:
                    dineroApi.dineroService("CLP");
                    break;
                case 5:
                    dineroApi.dineroService("COP");
                    break;
                case 6:
                    dineroApi.dineroService("USD");
                    break;
                case 7:
                    System.exit(0);
                default:
                    System.out.println("Opción no válida");
            }
        } catch (NumberFormatException e) {
            System.out.println("Lo sentimos ocurrio un error: " + e.getMessage());
        }
    }

    public void iniciarMenu() {
        System.out.println("Seleccione una opción:");
        System.out.println("1. Peso argentino ARS");
        System.out.println("2. Peso boliviano BOB");
        System.out.println("3. Real Brasileño BRL");
        System.out.println("4. Peso chileno CLP");
        System.out.println("5. Peso colombiano COP");
        System.out.println("6. Dolar estadounidense USD");
        System.out.println("7. Salir");
    }

    public void realizarConversion(String monedaOrigen, String monedaDestino, double cantidad) {
        dineroRecord = dineroApi.dineroService(monedaOrigen);
        if (dineroRecord == null)
            throw new RuntimeException("Error en la divisa");
        Map<String, String> tasaCambio = dineroRecord.conversion_rates();
        double tasaDestino = Double.parseDouble(tasaCambio.get(monedaDestino));
        double resultado = cantidad * tasaDestino;
        System.out.println(
                "La cantidad de " + cantidad + " " + monedaOrigen + " es igual a " + resultado + " " + monedaDestino);
    }

    public String obtenerCodigoMoneda(int opcion) {
        return switch (opcion) {
            case 1 -> "ARS";
            case 2 -> "BOB";
            case 3 -> "BRL";
            case 4 -> "CLP";
            case 5 -> "COP";
            case 6 -> "USD";
            default -> null;
        };
    }
}
