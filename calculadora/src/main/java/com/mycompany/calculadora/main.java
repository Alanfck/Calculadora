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
public class main {

    public static void main(String args[]) {

        Scanner scan = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("***************************************************************");
            System.out.println("***                                                         ***");
            System.out.println("***ELIGE LA OPERACION QUE QUIERAS HACER                     ***");
            System.out.println("***TECLEA LA OPCION QUE DESEES:                             ***");
            System.out.println("***1.OPERACIONES NUMERICAS                                  ***");
            System.out.println("***2.OPERACIONES MATRICIALES                                ***");
            System.out.println("***3.OPERACIONES VECTORIALES                                ***");
            System.out.println("***4.TRANSFORMACION DE COORDENADAS                          ***");
            System.out.println("***5.Salir del menú                                         ***");
            System.out.println("***                                                         ***");
            System.out.println("***************************************************************");

            opcion = scan.nextInt();

            if (opcion > 5) {
                System.out.println("");
            }
            switch (opcion) {
                case 1:
                    operacionesReales opr = new operacionesReales();
                    System.out.println(opr.toString());
                    System.out.println(" ");
                    break;

                case 2:
                    Matriz A = new Matriz(2, 2);
                    A.rellenaMatriz();
                    Matriz B = new Matriz(2, 2);
                    B.rellenaMatriz();

                    Matriz suma = OperacionesMatriciales.suma(A, B);
                    System.out.println(suma.toString());

                    Matriz multiplicar = OperacionesMatriciales.multiplicar(A, 2.0);
                    System.out.println(multiplicar.toString());

                    Matriz transpuesta = OperacionesMatriciales.transponer(A);
                    System.out.println(transpuesta.toString());

                    Matriz resta = OperacionesMatriciales.resta(A, B);
                    System.out.println(resta.toString());

                    Matriz multma = OperacionesMatriciales.multiplicarmatriz(A, B);
                    System.out.println(multma.toString());

                    System.out.println(A.toString());
                    System.out.println(B.toString());
                    System.out.println("");
                    break;

                case 3:
                    Vector x = new Vector(2);
                    System.out.println(x.toString());
                    //System.out.println("La norma de x es " + x.Lp_norm(2));

                    Vector y = new Vector(2);
                    System.out.println(y.toString());

                    double norma = OperacionesVectoriales.Lp_distance(x, y, 2);
                    double productoPunto = OperacionesVectoriales.productoPunto(x, y);
                    double angulo = OperacionesVectoriales.calcularAngulo(x, y);
                    Vector sum = OperacionesVectoriales.sumaVectorial(x, y);
                    Vector z = OperacionesVectoriales.multiplicacionEscalar(5, x);

                    System.out.println("La distancia es " + norma);
                    System.out.println("El producto punto es " + productoPunto);
                    System.out.println(sum.toString());
                    System.out.println("El angulo es " + angulo);
                    System.out.println(z.toString());
                    System.out.println("");
                    break;
                case 4:
                    System.out.println("Las coordenadas de entrada son:");
                    CoordenadasRectangulares rect = new CoordenadasRectangulares(5, 5);
                    CoordenadasPolares pol = new CoordenadasPolares(2, Math.PI / 4.0);

                    System.out.println(rect.toString());
                    System.out.println(pol.toString());

                    CoordenadasPolares resultPol;
                    CoordenadasRectangulares resultRect;

                    resultRect = TransformacionCoordenadas.convertirPolares_a_Rectangulares(pol);
                    resultPol = TransformacionCoordenadas.convertirRectangulares_a_Polares(rect);
                    System.out.println("Las conversiones son:");
                    System.out.println(resultRect.toString());
                    System.out.println(resultPol.toString());

                    System.out.println("");
                    break;

            }
        } while (opcion != 5);

    }
}
