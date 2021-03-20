package com.company;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Scanner;

public class Vendedor {

    private int id;
    private String nombre;
    private String apellido;
    private Historial historial = new Historial();
    private Tienda trabajaEn;

    public Vendedor(int id, String nombre, String apellido) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Historial getHistorial() {
        return historial;
    }

    public void setHistorial(Historial historial) {
        this.historial = historial;
    }

    public Tienda getTrabajaEn() {
        return trabajaEn;
    }

    public void setTrabajaEn(Tienda trabajaEn) {
        this.trabajaEn = trabajaEn;
    }

    public void cotizar(Scanner scanner){

        Prenda prendaElegida = elegirPrenda(scanner);
        int cantidad = elegirCantidad(prendaElegida, scanner);

        int idCotizacion = contadorCotizaciones();

        Cotizacion cotizacion = new Cotizacion(idCotizacion, LocalDateTime.now(),id,prendaElegida,cantidad);
        this.getHistorial().getCotizaciones().add(cotizacion);

        System.out.println("------------------------------");
        cotizacion.printCotizacion();
        System.out.println("------------------------------");

    }

    public int contadorCotizaciones(){
        int id = 1;
        for (Cotizacion cotizacion:this.getHistorial().getCotizaciones()
             )
            id = id + 1;

        return id;
    }

    public int elegirCantidad(Prenda prendaElegida, Scanner scanner){

        int cantidad = 0;
        boolean isValid = false;

        while (!isValid) {
            System.out.println("Ingrese la cantidad de prendas a cotizar : ");
            if (scanner.hasNextInt()) {
                cantidad = scanner.nextInt();
                isValid = true;
            } else {
                System.out.println("Debe ingresar una opción. " + "Ingrese la cantidad de prendas a cotizar");
            }

            if (isValid && cantidad >= prendaElegida.getStock()) {
                System.out.println("No hay en stock esa cantidad de prendas." + "Ingrese una cantidad válida de prendas a cotizar");
                isValid = false;
            }
        }
        //sc.nextLine();  // discard any other data entered on the line
        return cantidad;

    }

    public Prenda elegirPrenda(Scanner scanner) {

        String prenda;

        prenda = elegir("p", "c", scanner, "Ingrese el tipo de Prenda PANTALON o CAMISA");
        if ("p".equals(prenda)) {
            prenda = prenda + elegir("c", "r", scanner, "Ingrese el tipo de pantalon CHUPIN o RECTO");
            prenda = prenda + elegir("s", "p", scanner, "Ingrese la calidad de la prenda STANDARD o PREMIUM");
        }
        if ("c".equals(prenda)) {
            prenda = prenda + elegir("c", "l", scanner, "Ingrese el tipo de camisa MANGA CORTA o MANGA LARGA");
            prenda = prenda + elegir("c", "m", scanner, "Ingrese el tipo de cuello COMUN o MAO");
            prenda = prenda + elegir("s", "p", scanner, "Ingrese la calidad de la prenda STANDARD o PREMIUM");
        }

        prenda = prenda.toUpperCase();

        Prenda prendaElegida = (this.getTrabajaEn().getListaPrendas().get(prenda));
        System.out.println("Ustd ha elegido " + prendaElegida.getTipo());
        System.out.println("Stock disponible de la prenda elegida : " + prendaElegida.getStock());
        establecerPrecio(prendaElegida, scanner);
        return prendaElegida;

    }

    public void establecerPrecio(Prenda prendaElegida,Scanner scanner){
        double precio = 0;
        boolean isValid = false;
        while (!isValid) {
            System.out.println("Establezca el precio de la prenda");
            if (scanner.hasNextDouble()) {
                precio = scanner.nextDouble();
                isValid = true;
            } else {
                System.out.println("Debe ingresar una opción válida. ");
            }

        }
        prendaElegida.setPrecio(precio);
    }

    public static String elegir(String opcionA, String opcionB, Scanner scanner, String pregunta) {
        String eleccion = "";
        boolean isValid = false;
        while (!isValid) {
            System.out.print(pregunta + " (" + opcionA + " / " + opcionB + ") : ");
            if (scanner.hasNext()) {
                eleccion = scanner.next();
                isValid = true;
            } else {
                System.out.println("Debe ingresar una opción. ");
            }

            if (isValid && !eleccion.equals(opcionA) && !eleccion.equals(opcionB)) {
                System.out.println("Debe ingresar una letra válida. ");
                isValid = false;
            }
        }
        //sc.nextLine();  // discard any other data entered on the line
        return eleccion;
    }
}

