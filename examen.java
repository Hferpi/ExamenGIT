/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenGitHub;

import java.util.Scanner;

/**
 *
 * @author hecferpiq
 */
public class examen {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        boolean salir = false;

        while (!salir) {
            // Mostrar el menú
            System.out.println("\nMenú:");
            System.out.println("1. Concatenar dos palabras");
            System.out.println("2. Visualizar el número de palabras de una frase");
            System.out.println("3. Contar cuántas veces aparece una letra en una frase");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea pendiente

            switch (opcion) {
                case 1:
                      System.out.print("Ingrese la primera palabra: ");
                    String palabra1 = scanner.nextLine();
                    System.out.print("Ingrese la segunda palabra: ");
                    String palabra2 = scanner.nextLine();
                    
                     System.out.println("Palabras concatenadas: " + palabra1 + palabra2);
                    break;

                case 2:
                   System.out.print("Ingrese una frase: ");
                    String frase = scanner.nextLine();
                    String[] palabras = frase.trim().split("\\s+");
                    
                    System.out.println("La frase contiene " + palabras.length + " palabras.");
                    break;

                case 3:
                  System.out.print("Ingrese una frase: ");
                    String fraseParaContar = scanner.nextLine();
                    System.out.print("Ingrese una letra: ");
                    char letra = scanner.nextLine().charAt(0);
                    int contador = 0;
                    for (char c : fraseParaContar.toCharArray()) {
                        if (c == letra) {
                            contador++;
                        }
                    }
                    
                    System.out.println("La letra '" + letra + "' aparece " + contador + " veces en la frase.");

                    break;

                case 4:
                  System.out.print("¿Está seguro que desea salir? (s/n): ");
                    char confirmacion = scanner.nextLine().charAt(0);
                    if (confirmacion == 's' || confirmacion == 'S') {
                        salir = true;
                          System.out.println("Saliendo del programa...");
                    } else {
                        System.out.println("Volviendo al menú...");
                    }
                    break;

                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción del 1 al 4.");
            }
        }

        scanner.close();
    }
}



