package com.company;

import java.util.ArrayList;

public class Main
{

    public static void main(String[] args)
    {
        // VARIABLES

        int opc;


        //OBJETOS

        Menu mP = new Menu();
        Producto nuevoP = new Producto();
        LectorTeclado entrada = new LectorTeclado();


        // PROGRAMA PRINCIPAL
        System.out.println("****PROGRAMA DE INVENTARIOS SUPERMERCADO****");

        mP.menuPrograma();
        opc = entrada.leerEntero("Ingrese una opcion valida");
        System.out.println(" ");

        while(opc != 3)
        {

            switch(opc)
            {
                case 1: // AÑADIR PRODUCTO

                    System.out.println("****AÑADIR PRODUCTOS****");

                    nuevoP.datosProducto();

                    mP.menuPrograma();
                    System.out.println(" ");

                    opc = entrada.leerEntero("Ingrese una opcion valida");
                    System.out.println(" ");

                    break;

                case 2: // VER REPORTES

                    System.out.println("********REPORTES********");

                    mP.menuPrograma();
                    opc = entrada.leerEntero("Ingrese una opcion valida");
                    System.out.println(" ");

                    break;
            }
        }
        System.out.println("Programa Finalizado");
    }
}
