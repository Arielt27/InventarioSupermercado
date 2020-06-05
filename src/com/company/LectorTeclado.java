package com.company;

import java.util.Scanner;

public class LectorTeclado
{
    // VARIABLES

    Scanner m_sc;
    static LectorTeclado instance;


    // METODOS

    public static LectorTeclado getInstance()
    {
        if(instance == null)
        {
            instance = new LectorTeclado();
        }
        return instance;
    }

    public LectorTeclado()
    {
        m_sc = new Scanner(System.in);
    }

    public int leerEntero(String mensaje)
    {
        int opc = 0;

        while (!m_sc.hasNextInt())
        {
            m_sc.next();
            System.out.println(mensaje);
        }

        opc = m_sc.nextInt();
        System.out.println(" ");
        return opc;
    }
}
