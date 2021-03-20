package com.company;

import java.util.ArrayList;
import java.util.HashMap;

public class Tienda {

    private String nombre;
    private String direccion;
    private HashMap<String,Prenda> listaPrendas;

    public Tienda(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        listaPrendas = new HashMap();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public HashMap<String,Prenda> getListaPrendas() {
        return listaPrendas;
    }

    public void setListaPrendas(HashMap<String,Prenda> listaPrendas) {
        this.listaPrendas = listaPrendas;
    }
}
