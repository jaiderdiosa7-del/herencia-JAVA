package com.example;

public class Electrodomestico {

    protected String marca;
    protected String modelo;
    protected double precio;
    protected int consumo;

    public Electrodomestico(String marca, String modelo, double precio, int consumo) {
        this.marca = marca;
        this.modelo = modelo;
        setPrecio(precio);
        setConsumo(consumo);
    }

    public void setPrecio(double precio) {
        if (precio <= 0) {
            throw new IllegalArgumentException("El precio debe ser mayor a cero.");
        }
        this.precio = precio;
    }

    public void setConsumo(int consumo) {
        if (consumo <= 0) {
            throw new IllegalArgumentException("El consumo no puede ser menor o igual a cero.");
        }
        this.consumo = consumo;
    }

    public double calcularConsumo(double horasDiarias) {
        if (horasDiarias <= 0 || horasDiarias > 24) {
            throw new IllegalArgumentException("Las horas deben estar entre 0 y 24.");
        }

        double resultado = consumo * horasDiarias * 30 / 1000;

        return resultado;
    }

    @Override
    public String toString() {
        return "Marca: " + marca +
                ", Modelo: " + modelo +
                ", Precio: " + precio +
                ", Consumo: " + consumo;
    }
}