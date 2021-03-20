package com.company;
import java.time.LocalDateTime;

public class Cotizacion {

    private int id;
    private LocalDateTime horaCreacion;
    private int idVendedor;
    private Prenda prenda;
    private int cantPrendas;
    private Double resultado;

    public Cotizacion(int id, LocalDateTime horaCreacion, int idVendedor, Prenda prenda, int cantPrendas) {
        this.id = id;
        this.horaCreacion = horaCreacion;
        this.idVendedor = idVendedor;
        this.prenda = prenda;
        this.cantPrendas = cantPrendas;
        this.resultado = this.cantPrendas * this.getPrenda().calcularPrecio();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDateTime getHoraCreacion() {
        return horaCreacion;
    }

    public void setHoraCreacion(LocalDateTime horaCreacion) {
        this.horaCreacion = horaCreacion;
    }

    public int getIdVendedor() {
        return idVendedor;
    }

    public void setIdVendedor(int idVendedor) {
        this.idVendedor = idVendedor;
    }

    public Prenda getPrenda() {
        return prenda;
    }

    public void setPrenda(Prenda prenda) {
        this.prenda = prenda;
    }

    public int getCantPrendas() {
        return cantPrendas;
    }

    public void setCantPrendas(int cantPrendas) {
        this.cantPrendas = cantPrendas;
    }

    public Double getResultado() {
        return resultado;
    }

    public void setResultado(Double resultado) {
        this.resultado = resultado;
    }

    public void printCotizacion(){
        System.out.println("Número de identificación : " + this.getId());
        System.out.println("Fecha/Hora de creación : " + this.getHoraCreacion());
        System.out.println("Prenda cotizada : " + this.getPrenda().getTipo());
        System.out.println("Cantidad cotizada : " + this.getCantPrendas() + " unidades");
        System.out.println("TOTAL : $" + this.getResultado());

    }
}
