/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.calculadora;

/**
 *
 * @author user
 */
public class OperacionesVectoriales {
    public static double Lp_distance(Vector x, Vector y, double p) {
        double resultado = 0.0;
        for (int i = 0; i < x.getDimension(); i++) {
            resultado += Math.pow(Math.abs(x.getComponente(i) - y.getComponente(i)), p);
        }
        resultado = Math.pow(resultado, 1.0 / p);
        return resultado;
    }
    
    public static double productoPunto(Vector x, Vector y){
        double resultado = 0.0;
        for(int i = 0; i < x.getDimension(); i++){
            resultado += x.getComponente(i) * y.getComponente(i);
        }
        return resultado;
    }
    
    public static Vector sumaVectorial(Vector x, Vector y){
        double suma[] = new double[x.getDimension()];
        for(int i = 0; i < x.getDimension(); i++){
            suma[i] = x.getComponente(i) + y.getComponente(i);
        }        
        //Vector z = new Vector(suma);
        //return z;
        
        return new Vector(suma);
    }
    
    public static double calcularAngulo(Vector x, Vector y){
        double angulo;        
        double dotProduct = productoPunto(x, y);        
        angulo = dotProduct / (x.Lp_norm(2) *  y.Lp_norm(2));
        angulo = Math.acos(angulo);
        return angulo;
    }
    
    public static Vector multiplicacionEscalar(double a, Vector x){
        double nuevoVector [] = new double[x.getDimension()];
        for(int i = 0; i < x.getDimension(); i++){
            nuevoVector[i] = a * x.getComponente(i);
        }
        
        Vector z = new Vector(nuevoVector);
        return z;
    }
}

