package com.example;

public class Lavadora extends Electrodomestico {

    private double capacidadKg;

    public Lavadora(String marca, String modelo, double precio, int consumo, double capacidadKg) {
        super(marca, modelo, precio, consumo);
        setCapacidadKg(capacidadKg);
    }

    public void setCapacidadKg(double capacidadKg) {
        if (capacidadKg <= 0) {
            throw new IllegalArgumentException("La capacidad debe ser mayor a cero.");
        }
        this.capacidadKg = capacidadKg;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Capacidad: " + capacidadKg + " kg";
    }
}