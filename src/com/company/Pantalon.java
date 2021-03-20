package com.company;

public class Pantalon extends Prenda{

    private boolean chupin;

    public Pantalon(int stock, boolean chupin, boolean calidadPremium) {
        super(stock, calidadPremium);
        this.chupin = chupin;
    }

    public boolean isChupin() {
        return chupin;
    }

    public void setChupin(boolean chupin) {
        this.chupin = chupin;
    }

    @Override
    public double calcularPrecio(){
        double resultado = this.getPrecio();
        if (this.isChupin()) resultado = this.getPrecio() * 0.7;
        if (this.isCalidadPremium()) resultado = resultado * 1.3;

        return resultado;
    };

    @Override
    public String getTipo() {
        String tipo = "pantalón";
        if (isChupin()) tipo = tipo + " chupín";
        else if (isChupin() == false) tipo = tipo + " recto";
        if (isCalidadPremium()) tipo = tipo + " calidad premium";
        else if (isCalidadPremium() == false) tipo = tipo + " calidad standard";
        return tipo;
    }
}
