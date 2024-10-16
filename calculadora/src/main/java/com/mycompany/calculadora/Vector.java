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
public class Vector {
    private int dimension;
    private double v[];
    
    public Vector(double v[]){
        this.v = v;
        this.dimension = v.length;
    }

    public Vector(int dimension) {
        this.dimension = dimension;
        v = new double[dimension];
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < dimension; i++) {
            System.out.println("Ingresa el valor de v[" + (i + 1) + "]: ");
            v[i] = scan.nextDouble();
        }
    }

    public double Lp_norm(double p) {
        double resultado = 0.0;
        for (int i = 0; i < dimension; i++) {
            resultado += Math.pow(Math.abs(v[i]), p);            
        }
        resultado = Math.pow(resultado, 1.0 / p);
        return resultado;
    }
    
    
    public void setComponentes(){
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < dimension; i++) {
            System.out.println("Ingresa el valor de v[" + (i + 1) + "]: ");
            v[i] = scan.nextDouble();
        }
    }
    
    public double [] getComponentes(){
        return this.v;
    }
    
    @Override
    public String toString(){
        String cadena = "(";
        for(int i = 0; i < dimension; i++){
            cadena = cadena.concat(Double.toString(v[i]));
            if(i < dimension - 1){
                cadena = cadena.concat(", ");
            }else{
                cadena = cadena.concat(")");
            }            
        }
        return cadena;
    } 

    public int getDimension() {
        return dimension;
    }
    
    public double getComponente(int i){
        return v[i];
    }

}
