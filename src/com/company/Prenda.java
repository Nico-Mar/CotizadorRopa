package com.company;

import java.math.BigDecimal;

public abstract class Prenda {

    private double precio;
    private int stock;
    private boolean calidadPremium;

    public Prenda( int stock,boolean calidadPremium) {
        this.stock = stock;
        this.calidadPremium = calidadPremium;
    }

    public boolean isCalidadPremium() {
        return calidadPremium;
    }

    public void setCalidadPremium(boolean calidadPremium) {
        this.calidadPremium = calidadPremium;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public abstract String getTipo();

    public abstract double calcularPrecio();
}

