package com.company;

import java.util.ArrayList;

public class Historial {

    private ArrayList<Cotizacion> cotizaciones = new ArrayList<>();

    public void verHistorial(){
        for (Cotizacion cotizacion:cotizaciones){
            if (cotizaciones.isEmpty()){
                System.out.println("El vendedor aún no ha realizado cotizaciones");
            }
            System.out.println("******************************");
            System.out.println("Cotizacion N° " + cotizacion.getId());
            cotizacion.printCotizacion();
            System.out.println("------------------------------");

        }
        System.out.println("******************************");
    }


    public ArrayList<Cotizacion> getCotizaciones() {
        return cotizaciones;
    }

    public void setCotizaciones(ArrayList<Cotizacion> cotizaciones) {
        this.cotizaciones = cotizaciones;
    }
}
