package com.company;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Tienda tienda1 = new Tienda("Modamax", "Emilio Civit 444");
        Vendedor vendedor1 = new Vendedor(1, "Nicolás", "Martini");
        vendedor1.setTrabajaEn(tienda1);

        HashMap<String, Prenda> prendasTienda1 = new HashMap();

        Camisa camisaCortaMaoStandard1 = new Camisa(false, 100, true, true);
        prendasTienda1.put("CCMS", camisaCortaMaoStandard1);
        Camisa camisaCortaMaoPremium1 = new Camisa(true, 100, true, true);
        prendasTienda1.put("CCMP", camisaCortaMaoPremium1);
        Camisa camisaCortaComunStandard1 = new Camisa(false, 150, true, false);
        prendasTienda1.put("CCCS", camisaCortaComunStandard1);
        Camisa camisaCortaComunPremium1 = new Camisa(true, 150, true, false);
        prendasTienda1.put("CCCP", camisaCortaComunPremium1);
        Camisa camisaLargaMaoStandard1 = new Camisa(false, 75, false, true);
        prendasTienda1.put("CLMS", camisaLargaMaoStandard1);
        Camisa camisaLargaMaoPremium1 = new Camisa(true, 75, false, true);
        prendasTienda1.put("CLMP", camisaLargaMaoPremium1);
        Camisa camisaLargaComunStandard1 = new Camisa(false, 175, false, false);
        prendasTienda1.put("CLCS", camisaLargaComunStandard1);
        Camisa camisaLargaComunPremium1 = new Camisa(true, 175, false, false);
        prendasTienda1.put("CLCP", camisaLargaComunPremium1);
        Pantalon pantalonChupinStandard1 = new Pantalon(750, true, false);
        prendasTienda1.put("PCS", pantalonChupinStandard1);
        Pantalon pantalonChupinPremium1 = new Pantalon( 750, true, true);
        prendasTienda1.put("PCP", pantalonChupinPremium1);
        Pantalon pantalonRectoStandard1 = new Pantalon( 250, true, false);
        prendasTienda1.put("PRS", pantalonRectoStandard1);
        Pantalon pantalonRectoPremium1 = new Pantalon( 250, true, true);
        prendasTienda1.put("PRP", pantalonRectoPremium1);

        tienda1.setListaPrendas(prendasTienda1);

        System.out.println("VENDEDOR : " + vendedor1.getNombre() + " " + vendedor1.getApellido());
        System.out.println("TIENDA : " + vendedor1.getTrabajaEn().getNombre());
        System.out.println("DIRECCIÓN : " + vendedor1.getTrabajaEn().getDireccion());


        Scanner scanner = new Scanner(System.in);
        String eleccion = "";

        do {
            System.out.println("Que desea realizar? COTIZAR PRENDAS o VER HISTORIAL DE COTIZACIONES (c / h)");
            System.out.println("Para SALIR escriba :\"salir\"");
            eleccion = scanner.next();
            switch (eleccion) {
                case "c":
                    vendedor1.cotizar(scanner);
                    break;
                case "h":
                    vendedor1.getHistorial().verHistorial();
                    break;
                case "salir":
                    break;
                default:
                    System.out.println("Ingrese una opción válida");
            }
        } while (!eleccion.equals("salir"));


    }
}
