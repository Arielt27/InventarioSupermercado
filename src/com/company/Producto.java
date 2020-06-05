package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Producto
{
    // ATRIBUTOS

    private String nombre;
    private String marca;
    private int serie;
    private boolean existencia;
    private int reorden;
    private double unidad;
    private int tamaño = 1;
    private ArrayList<String> Nombres;
    private ArrayList<String> Marcas;
    private ArrayList<Integer> Series;
    private ArrayList<Boolean> Existencia;
    private ArrayList<Integer> Reorden;
    private ArrayList<Double> Unidad;

    // OBJETOS
    Scanner lt = new Scanner(System.in);
    LectorTeclado entradaP = new LectorTeclado();


    // METODOS

    public void datosProducto()
    {
        int n = 0;
        String N = "n";
        String pregunta;
        boolean ciclo1 = false;


        while(!ciclo1)
        {
            System.out.print("Ingrese el producto: ");
            nombre = lt.nextLine();

            System.out.print("Ingrese la marca: ");
            marca = lt.nextLine();

            System.out.print("Ingrese el numero de serie: ");
            serie = entradaP.leerEntero("El numero de serie deben ser digitos enteros");

            System.out.print("¿Hay producto en existencia?: ");
            existencia = Boolean.parseBoolean(lt.nextLine());

            System.out.print("Ingrese el punto de re-orden: ");
            reorden = entradaP.leerEntero("El punto de reorden deben ser digitos enteros");

            System.out.print("Ingrese el precio por unidad: ");
            unidad = entradaP.leerDecimal("Ingrese el precio por unidad");

            ArrayList<String> Nombres = new ArrayList<>(tamaño);
            ArrayList<String> Marcas = new ArrayList<>(tamaño);
            ArrayList<Integer> Series = new ArrayList<Integer>(tamaño);
            ArrayList<Boolean> Existencia = new ArrayList<Boolean>(tamaño);
            ArrayList<Integer> Reorden = new ArrayList<Integer>(tamaño);
            ArrayList<Double> Unidad = new ArrayList<Double>(tamaño);

            Nombres.add(n, nombre);
            Marcas.add(n, marca);
            Series.add(n, serie);
            Existencia.add(n, existencia);
            Reorden.add(n, reorden);
            Unidad.add(n, unidad);

            n = n + 1;
            tamaño = tamaño + 1;


            System.out.print("¿Desea añadir otro producto? y/n ");
            pregunta = lt.next();
            System.out.println(" ");

            if(pregunta.equals(N))
            {
                ciclo1 = true;
            }
        }
    }
}