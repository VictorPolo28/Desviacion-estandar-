package com.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner  informacion  =  new Scanner(System.in);
        
        System.out.println("Ingrese las edades los habitantes del pueblo separadas por guiones: ");
        String  edades = informacion.nextLine();
        String[] numeros = edades.split("-");
        int [] datos  = new int[numeros.length];
        
        for (int i = 0 ; i < numeros.length; i++ ){
            try{
                datos[i] = Integer.parseInt(numeros [i]);
            }catch (NumberFormatException e){
                System.out.println("Entrada invalida. Debe ser un numero");
            }
        }
        while (true) {
            System.out.println("\nMenú de opciones:");
            System.out.println("1. Calcualar desviacion estandar");
            System.out.println("2. Salir");
            System.out.println("ingrese una opcion");

            int opcion =  informacion.nextInt();
            switch (opcion) {
                case 1:
                int suma = 0;
                for (int dato : datos ){
                    suma += dato;
                }
                int media = suma / datos.length;
                int sumaCuadrados = 0;
                for (int dato : datos){
                    sumaCuadrados += Math.pow(dato - media,2);
                }
                int  varianza = sumaCuadrados / datos.length;
                double desviacionEstandar = Math.sqrt(varianza);
                System.out.println("la desviacion estandar es: " + desviacionEstandar);
                    
                    break;
                    case 2:
                    System.out.println("Saliendo  del programa...");
                    System.exit(0);
                    break;
            
                default:
                System.out.println("Opcion  invalida. ");
                    break;
            }
            System.out.println("fin");
        }
    }
}