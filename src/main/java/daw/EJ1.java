/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package daw;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author oscar
 */
public class EJ1 {

    public static void main(String[] args) {
        /*ctes*/
        final int tamanoArray = 15;
        /*Creo mi array*/
        double[] arrayDoubles = new double[tamanoArray];
        /*relleno todas las posiciones con el mismo valor*/
        for (int i = 0; i < arrayDoubles.length; i++) {
            arrayDoubles[i] = 7.5;
        }
        /*relizo una copia de mi array*/
        double[] copiaArrayDoubles = arrayDoubles.clone();
        /*muestro ambos por consola*/
        System.out.println(Arrays.toString(arrayDoubles));
        System.out.println("--------------------------------------");
        System.out.println(Arrays.toString(copiaArrayDoubles));
        System.out.println("--------------------------------------");
        /*Comparo los arrays y devuelvo si son iguales*/
        boolean arraysIguales = Arrays.equals(arrayDoubles, copiaArrayDoubles);
        System.out.println(arraysIguales);
        /*cambio el valor en una posicion aleatoria de mi array*/
        Random random = new Random();
        int arrayElegido = random.nextInt(1, 3);
        if (arrayElegido == 1) {
            int posAleatoria = random.nextInt(0, arrayDoubles.length);
            arrayDoubles[posAleatoria]=6.3;
        } else {
            int posAleatoria = random.nextInt(0, copiaArrayDoubles.length);
            copiaArrayDoubles[posAleatoria] = 6.3;
        }
        /*muestro ambos por consola*/
        System.out.println(Arrays.toString(arrayDoubles));
        System.out.println("---------------------------------------");
        System.out.println(Arrays.toString(copiaArrayDoubles));
        System.out.println("----------------------------------------");
        /*Comparo los arrays y devuelvo si son iguales*/
        arraysIguales = Arrays.equals(arrayDoubles, copiaArrayDoubles);
        System.out.println(arraysIguales);
    }
    public static int[] rellenaArray(int[] array){
        Random random = new Random();
        for(int i : array){
            array[i]=random.nextInt(10, 101);
        }
    }
}
