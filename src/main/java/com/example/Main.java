package com.example;

public class Main {

    public static void main(String[] args) {

        Televisor televisor = new Televisor(
                "Samsung", "Smart TV", 2500000, 150, 55
        );

        Nevera nevera = new Nevera(
                "LG", "Inverter", 3200000, 200, 400
        );

        Lavadora lavadora = new Lavadora(
                "Whirlpool", "Carga frontal", 1800000, 500, 18
        );

        System.out.println("===== TELEVISOR =====");
        System.out.println(televisor);
        System.out.println("Consumo mensual: " + televisor.calcularConsumo(5) + " kWh");

        System.out.println("\n===== NEVERA =====");
        System.out.println(nevera);
        System.out.println("Consumo mensual: " + nevera.calcularConsumo(24) + " kWh");

        System.out.println("\n===== LAVADORA =====");
        System.out.println(lavadora);
        System.out.println("Consumo mensual: " + lavadora.calcularConsumo(2) + " kWh");
    }
}