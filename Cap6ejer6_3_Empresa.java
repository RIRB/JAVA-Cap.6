package javafunda2dosemestre;
import java.io.*;
import java.util.Scanner;
public class Cap6ejer6_3_Empresa {
    public static void main(String[]args){
        Scanner jefe = new Scanner(System.in);
        
        int jornadas = 4;
        int dias = 7;
        
        int[][] reclamo = new int [jornadas][dias];
        int suma_reclamo = 0;
        int mayor_reclamo = 0;
        int diarias = 0;
        int i,j;
        
        for (i=0; i< dias; i++){
            System.out.println("Ingrese los reclamos registrados en el dia "+(i+1));
            System.out.println("---------------------------------------------------");
            for (j=1; j<jornadas; j++){
                System.out.println("Ingrese los reclamos de la jornada completa "+j);
                reclamo[j][i] = jefe.nextInt();
            }
        }
        suma_reclamo = 0;
        for(i=0; i<dias; i++){
            suma_reclamo += reclamo[2][i];
        }
        float prom_reclamo = 0;
        prom_reclamo += (suma_reclamo / dias);
        System.out.println("------------------------------------------------");
        System.out.println("------------------------------------------------");
        System.out.println("El promedio de reclamos acumulados dentro de toda la jornada entre las 15 a 20 hrs");
        System.out.println("fue de: "+prom_reclamo);
        
        for(j=1; j<dias; j++){
            suma_reclamo = 0;
            for(i=0; i<jornadas; i++){
                suma_reclamo += reclamo[i][j];
            }
            if(mayor_reclamo < suma_reclamo){
                mayor_reclamo = suma_reclamo;
                diarias = j;
            }
        }
        System.out.println("El dia de mayor intensidad de reclamos en la jornada semanal fue de: "+diarias);
    }
}