package com.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MenuConversor menu = new MenuConversor();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            menu.iniciarMenu();
            int moneda1 = scanner.nextInt();
            menu.menuSelector(moneda1);
            var origen = menu.obtenerCodigoMoneda(moneda1);

            menu.iniciarMenu();
            int moneda2 = scanner.nextInt();
            menu.menuSelector(moneda2);
            var destino = menu.obtenerCodigoMoneda(moneda2);

            System.out.println("Ingrese la cantidad a convertir: ");
            int cantidad = scanner.nextInt();
            menu.realizarConversion(origen, destino, cantidad);
        }
    }

}