package com.example;

public class Nevera extends Electrodomestico {

    private double capacidadLitros;

    public Nevera(String marca, String modelo, double precio, int consumo, double capacidadLitros) {
        super(marca, modelo, precio, consumo);
        setCapacidadLitros(capacidadLitros);
    }

    public void setCapacidadLitros(double capacidadLitros) {
        if (capacidadLitros <= 0) {
            throw new IllegalArgumentException("La capacidad debe ser mayor a cero.");
        }
        this.capacidadLitros = capacidadLitros;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Capacidad: " + capacidadLitros + " litros";
    }
}