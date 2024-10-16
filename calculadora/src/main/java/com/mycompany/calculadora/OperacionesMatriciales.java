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
public class OperacionesMatriciales {

    public static Matriz suma(Matriz A, Matriz B) {
        if (A.getFilas() == B.getFilas() && A.getColumnas() == B.getColumnas()) {
            Matriz C = new Matriz(A.getFilas(), A.getColumnas());
            for (int i = 0; i < C.getFilas(); i++) {
                for (int j = 0; j < C.getColumnas(); j++) {
                    C.setElemento(i, j, A.getElemento(i, j) + B.getElemento(i, j));
                }
            }
            return C;
        }
        System.err.println("Las dimensiones de la matrices no coinciden");
        return null;
    }

    public static Matriz multiplicar(Matriz A, double s) {
       Matriz B = new Matriz(A.getFilas(), A.getColumnas());
        for(int i = 0; i < B.getFilas(); i++){
            for(int j = 0; j < B.getColumnas(); j++){
                B.setElemento(i, j, s * A.getElemento(i, j));
            }
        }
        return B;
    }

       public static Matriz transponer(Matriz A){
        Matriz transpuesta = new Matriz(A.getColumnas(), A.getFilas());
        for(int i = 0; i < A.getColumnas(); i++){
            for(int j = 0; j < A.getFilas(); j++){
                transpuesta.setElemento(i, j, A.getElemento(j, i));
            }
        }
        return transpuesta;
    }
       public static Matriz resta(Matriz A, Matriz B) {
        if (A.getFilas() == B.getFilas() && A.getColumnas() == B.getColumnas()) {
            Matriz C = new Matriz(A.getFilas(), A.getColumnas());
            for (int i = 0; i < C.getFilas(); i++) {
                for (int j = 0; j < C.getColumnas(); j++) {
                    C.setElemento(i, j, A.getElemento(i, j) - B.getElemento(i, j));
                }
            }
            return C;
        }
        System.err.println("Las dimensiones de la matrices no coinciden");
        return null;
       }
       
       public static Matriz multiplicarmatriz(Matriz A, Matriz B) {
        if(A.getColumnas() == B.getFilas()){
            Matriz C = new Matriz(A.getFilas(), B.getColumnas());
            for(int i = 0; i < A.getFilas(); i++){
                for(int j = 0; j < B.getColumnas(); j++){
                    double suma = 0.0;
                    for(int k = 0; k < A.getColumnas(); k++){
                        suma += A.getElemento(i, k) + B.getElemento(k, j);
                    }
                    C.setElemento(i, j, suma);
                }
            }
            return C;
        }        
        return null;
    }
}

   

