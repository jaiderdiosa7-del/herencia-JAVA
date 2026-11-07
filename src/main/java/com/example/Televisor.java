package com.example;

public class Televisor extends Electrodomestico {

    private double pulgadas;

    public Televisor(String marca, String modelo, double precio, int consumo, double pulgadas) {
        super(marca, modelo, precio, consumo);
        setPulgadas(pulgadas);
    }

    public void setPulgadas(double pulgadas) {
        if (pulgadas <= 0) {
            throw new IllegalArgumentException("Las pulgadas deben ser mayores a cero.");
        }
        this.pulgadas = pulgadas;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Pulgadas: " + pulgadas;
    }
}