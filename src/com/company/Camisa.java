package com.company;

public class Camisa extends Prenda{

    private boolean mangaCorta;
    private boolean cuelloMao;

    public Camisa(boolean calidadPremium, int stock, boolean mangaCorta, boolean cuelloMao) {
        super(stock, calidadPremium);
        this.mangaCorta = mangaCorta;
        this.cuelloMao = cuelloMao;
    }

    public boolean isMangaCorta() {
        return mangaCorta;
    }

    public void setMangaCorta(boolean mangaCorta) {
        this.mangaCorta = mangaCorta;
    }

    public boolean isCuelloMao() {
        return cuelloMao;
    }

    public void setCuelloMao(boolean cuelloMao) {
        this.cuelloMao = cuelloMao;
    }


    @Override
    public double calcularPrecio(){
        double resultado = this.getPrecio();
        if (this.isMangaCorta()) resultado = this.getPrecio() * 0.9;
        if (this.isCuelloMao()) resultado = resultado * 1.03;
        if (this.isCalidadPremium()) resultado = resultado * 1.3;

        return resultado;
    };

    @Override
    public String getTipo() {
        String tipo = "camisa";
        if (isMangaCorta()) tipo = tipo + " manga corta";
        else if (isMangaCorta() == false) tipo = tipo + " manga larga";
        if (isCuelloMao()) tipo = tipo + " cuello mao";
        else if (isCuelloMao() == false) tipo = tipo + " cuello comun";
        if (isCalidadPremium()) tipo = tipo + " calidad premium";
        else if (isCalidadPremium() == false) tipo = tipo + " calidad standard";
        return tipo;
    }
}
