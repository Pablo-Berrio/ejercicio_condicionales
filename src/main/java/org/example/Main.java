package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //DADO UN NUMERO ENTERO INGRESADO POR EL USUARIO, DETERMINAR SI ES NEGATIVO, POSITIVO O CERO
        int numero;
        Scanner entradaTeclado=new Scanner(System.in);
        System.out.print("digite su numero para saber si es negativo, positivo o cero: ");
        numero=entradaTeclado.nextInt();

        if (numero<0){
            System.out.print("su numero es negativo");
        } else if (numero>0) {
            System.out.print("su numero es positivo");
        }else {
            System.out.print("su numero es cero");
        }


    }
}