package javafunda2dosemestre;
import java.io.*;
import java.util.Scanner;
public class Cap6ejer6_4_Acciones_Usuario_10x10 {
    public static void main(String[]args){
        Scanner seleccion = new Scanner(System.in);
        
        int columna;
        
        int filas;
        int columnas;
        
        float suma_columnas=0;
        float prom_columna =0;
        float diagonal =0; 
        
        int [][]sopa_numerica = new int [10][10];
        
        System.out.println("Filas de la matriz: ");
        filas = seleccion.nextInt();
        System.out.println("Filas,");
       
        System.out.println("Y Columnas: ");
        columnas = seleccion.nextInt();
        System.out.println("Columnas.");
        
        for(int i=0; i<filas; i++){
            for(int j=0; j<columnas; j++){
                sopa_numerica[i][j]= (int)(Math.random()*250);
            }
        }
        System.out.println("Su Matriz: ");
        for (int i=0;i<filas;i++){
            for(int j=0;j<columnas;j++){
                System.out.println("["+sopa_numerica[i][j]+"]");
            }
            System.out.println();
        }
        System.out.println("--------------------------------------------------------------");
        
        System.out.println("Que columna desea promedear");
        columna= seleccion.nextInt();
        
        for(int i=0; i<filas; i++){
            suma_columnas =0;
            for(int j=0; j<columnas; j++){
                suma_columnas += (sopa_numerica[i][j]);
            }
        }
        prom_columna += (suma_columnas / 10);
            
        System.out.println("--------------------------------------------------------------");
        System.out.println("--------------------------------------------------------------");
        System.out.println("El promedio de la columna: "+prom_columna);
       
            for(int i=0, j=0; i<sopa_numerica.length; i++, j++){
            diagonal += sopa_numerica[i][j];
        }
        
        System.out.println("--------------------------------------------------------------");
        System.out.println("La suma de la diagonal Principal es de: "+diagonal);
        System.out.println("La diagonal baja de [i]=[0] y [j]=[0] a [i]=[10] y [j]=[10] ");
    }
}