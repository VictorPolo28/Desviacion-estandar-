package com.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        //Le pedimos a el usuario que ingrese el numero de estdiantes para tenernelos en cuenta usando el termino list para representar la coleccion ordenadas de elementos y en si incluir el arraylist a el codigo

        System.out.println("Ingrese el numero de estudiantes: ");
        int numEstudiantes = input.nextInt();
        List<List<Double>> notasEstudiantes = new ArrayList<>();

        // Usamos el bucle el cual ejecutara una vez por cada estudiante que el usuario haya ingresado "i" es el indice el cual comienza en 0 y se incrementa 1 hasta que alcance el "numEstudiantes", Se le pide al usuario igual ingresar la cantidad de notas que se le quiere ingresar a el estudiante actual creando asi una nueva lista vacia de tipo Double para almacenarlos
        
        for (int i = 0; i < numEstudiantes; i++) {
            System.out.println("Ingrese el numero notas para el estudiantes " + (i + 1) + ": ");
            int numNotas = input.nextInt();
            List<Double> notas = new ArrayList<>();

        // Se ejecuta el bucle for al "numNotas" lo que permite a el usuario ingresar una cantidad especificada de notas para el estudiante actual, el Do-While se usa para asegurarse de que la nota ingresada este en el rango de 0 a 10, Despues de que se ingresa la nota valida se agrega a la lista notas que pertenece al estudiante actual usando "notas.add(notaEstudiante)"
            
        for (int x = 0; x < numNotas; x++) {
                double notaEstudiante;
                do {
                    System.out.println("Ingrese la nota " + (x + 1) + ": ");
                    notaEstudiante = input.nextDouble();
                    if (notaEstudiante < 0 || notaEstudiante > 10) {
                        System.out.println("La nota debe estar entre 0 y 10. Intenta nuevamente");
                    }
                } while (notaEstudiante < 0 || notaEstudiante > 10);

                notas.add(notaEstudiante);
            }

            notasEstudiantes.add(notas);
        }

        // Al final se imprime la notas de todos los estudiantes, se usa 2 for estos bucles sirven el primero para recorrer a los estudiantes usando "notasEstudiantes.Size" devolviendo el total de listas y el segundo para imprimir las notas del estudiantes donde el "notasEstudiantes.get" obtiene la lista de notas correspondiente al estudiante actual al final se imprime cada nota del estudiantes separada por un espacio
        
        System.out.println("Notas de los estudiantes: ");
        for (int i = 0; i < notasEstudiantes.size(); i++) {
            System.out.println("Estudiante " + (i + 1) + ": ");
            for (Double nota : notasEstudiantes.get(i)) {
                System.out.println(nota + " "); 
            }
System.out.println("Fin");
        }
        input.close();
    }
}
