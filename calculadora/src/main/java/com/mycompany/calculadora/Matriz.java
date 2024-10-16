/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.calculadora;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Matriz {
 private final int filas;
    private final int columnas;
    private double datos[][];


    public Matriz(int filas, int columnas) {
        this.filas = filas;
        this.columnas = columnas;
        datos = new double[filas][columnas];
    }

    public void rellenaMatriz() {
        System.out.println("Introduce los valores de la matriz");
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.printf("Matriz[%d][%d] = \n", (i + 1), (j + 1));
                datos[i][j] = scan.nextDouble();
            }
        }
    }

    public double getElemento(int fila, int columna) {
        if ((fila >= 0 && fila < filas) && (columna >= 0 && columna < columnas)) {
            return datos[fila][columna];
        }
        System.err.println("Indices fuera de rango");
        return Double.MAX_VALUE;
    }

    public void setElemento(int fila, int columna, double valor) {
        if ((fila >= 0 && fila < filas) && (columna >= 0 && columna < columnas)) {
            datos[fila][columna] = valor;
        } else {
            System.err.println("Indices fuera de rango");
        }
    }

    public int getFilas() {
        return filas;
    }

    public int getColumnas() {
        return columnas;
    }

    @Override
    public String toString() {
        String cadena = "";
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                cadena = cadena.concat(Double.toString(datos[i][j]) + "\t");
            }
            cadena = cadena.concat("\n");
        }
        return cadena;
    }
}
