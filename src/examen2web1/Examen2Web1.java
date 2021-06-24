/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2web1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author user
 */
public class Examen2Web1 {

    
    
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        // EJERCICIO 1
        
        
        /*
        double a, b, c, d, e, f, x, y;
        
        
        
        System.out.println("Ingrese el coeficiente a: ");
        a = teclado.nextDouble();
        
        System.out.println("Ingrese el coeficiente b: ");
        b = teclado.nextDouble();
        
        System.out.println("Ingrese el coeficiente c: ");
        c = teclado.nextDouble();
        
        System.out.println("Ingrese el coeficiente d: ");
        d = teclado.nextDouble();
        
        System.out.println("Ingrese el coeficiente e: ");
        e = teclado.nextDouble();
        
        System.out.println("Ingrese el coeficiente f: ");
        f = teclado.nextDouble();
        
        x = (((c*e) - (b*f))/((a*e) - (b*d)));
        
        y = (((a*f) - (c*d))/((a*e) - (b*d)));
        
        System.out.println("El valor de x es: " + x);
        System.out.println("El valor de y es: " + y);
        
        */
        
        // SEGUNDO EJERCICIO
        
        
        /*
        
        
        int cantNumeros, cantNegativos = 0, num;
        System.out.println("Ingrese la cantidad de numeros a digitar: ");
        cantNumeros = teclado.nextInt();
        
        for(int i = 0; i < cantNumeros; i++){
            System.out.println("Ingrese el numero: ");
            num = teclado.nextInt();
            if(num < 0){
                cantNegativos++;
            }
        }
        
        System.out.println("La cantidad de numeros negativos es: " + cantNegativos);
        
        
        
        */
        
        
        // TERCER EJERCICIO
        /*
        int n1, n2;
        Random aleatorio = new Random();
        System.out.println("Ingrese el numero de filas que tendrá la matriz: ");
        n1 = teclado.nextInt();
        
        System.out.println("Ingrese el numero de columnas que tendrá la matriz: ");
        n2 = teclado.nextInt();
        
        // CREACION Y RELLENADO DE LA MATRIZ
        
        int [][] matriz = new int[n1][n2];
        
        for(int fila = 0; fila < n1; fila++){
            for(int columnaxd = 0; columnaxd < n2; columnaxd++){
                matriz[fila][columnaxd] = aleatorio.nextInt(20);
            }
        }
        
        // IMPRESION DE LA MATRIZ
        
        for(int fila = 0; fila < n1; fila++){
            for(int columnaxd = 0; columnaxd < n2; columnaxd++){
                System.out.print(matriz[fila][columnaxd]);
                System.out.print(" ");
            }
            System.out.println("");
        }
        
        // CREACION DEL ARREGLO UNIDIMENSIONAL
        
        int[] sumaColumnas = new int[n2];
        
        // BUCLE PARA LA SUMA DE CADA COLUMNA
        
        for(int columnaxd = 0; columnaxd < n2; columnaxd++){
            for(int fila = 0; fila < n1; fila++){
                sumaColumnas[columnaxd] += matriz[fila][columnaxd];
            }
        }
        
        System.out.println(Arrays.toString(sumaColumnas));
        
        */
        
       
        // COMIENZO CUARTO EJERCICIO
        
        
        String [] jugadores = new String[23];
        ArrayList <String> convocatoria = new ArrayList<>();
        int opcionElegida = 0;
        String nombreJugador;
        boolean existe;
        
        do{
            
            System.out.println("BIENVENIDO A LA SELECCION COLOMBIA DE FUTBOL");
            
            
            System.out.println("--------------------------------------------");
            
            
            System.out.println("ELIJA LA OPCION QUE SE ACOMODE A SU PREFERENCIA");
            
            System.out.println("ESCRIBA 1 SI DESEA AÑADIR UN NUEVO NOMBRE A LA NOMINA");
            
            System.out.println("ESCRIBA 2 SI DESEA BUSCAR UN JUGADOR QUE YA ESTÉ NOMINADO");
            
            System.out.println("ESCRIBA 3 SI DESEA EDITAR EL NOMBRE DE UN JUGADOR QUE YA ESTÉ NOMINADO");
            
            System.out.println("ESCRIBA 4 SI DESEA MOSTRAR TODA LA CONVOCATORIA ACTUAL");
            
            System.out.println("ESCRIBA 5 SI DESEA SALIR DEL PROGRAMA");
            
            
            opcionElegida = teclado.nextInt();
            
            // COMPROBACION DE LA OPCION ELEGIDA
            
            if(opcionElegida == 1){
                
                System.out.println("Ingrese el nombre del jugador que desea añadir: ");
                nombreJugador = teclado.next();
                for(int i = 0; i < 23; i++ ){
                    if(jugadores[i] == null){
                        jugadores[i] = nombreJugador;
                        break;
                    }
                }
                
            }else if(opcionElegida == 2){
                existe = false;
                System.out.println("Ingrese el nombre del jugador que desea buscar: ");
                nombreJugador = teclado.next();
                for(int i = 0; i < 23; i++){
                    if(nombreJugador.equals(jugadores[i])){
                        existe = true;
                        System.out.println("El nombre existe actualmente en el registro");
                    }
                }
                
                if(existe == false){
                    System.out.println("El jugador no se encuentra actualmente en la nómina o escribió mal el nombre");
                }
                
            }else if(opcionElegida == 3){
                existe = false;
                System.out.println("Ingrese el nombre del jugador que desea editar: ");
                nombreJugador = teclado.next();
                
                
                for(int i = 0; i < 23; i++){
                    if(nombreJugador.equals(jugadores[i])){
                        existe = true;
                        System.out.println("Ingrese el nuevo nombre: ");
                        jugadores[i] = teclado.next();
                    }
                }
                
                if(existe == false){
                    System.out.println("El jugador no se encuentra actualmente en la nómina o escribió mal el nombre");
                }
                
                
                
            }else if(opcionElegida == 4){
                System.out.println("Los jugadores que estarán en la convocatoria son:  ");
                for(int i = 0; i < 23; i++){
                    if(jugadores[i] != null){
                        System.out.println(jugadores[i]);
                    }
                }
            }
                
                
            System.out.println("--------------------------------------------------------------------------------");
            System.out.println("INGRESE OTRA OPCION");
            System.out.println("--------------------------------------------------------------------------------");
            
            
            
        }while(opcionElegida != 5);
        
        
        
        
        
        
    }
    
}
