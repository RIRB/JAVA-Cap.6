package javafunda2dosemestre;
import java.io.*;
import java.util.Scanner;
public class Cap5ejer6_2_Ahorro_Bancario {
    public static void main(String[]args){
        Scanner banco = new Scanner(System.in);

        int meses = 12;
        int[]ahorros = new int[meses];
        
        float promedio = 0;
        float varianza = 0;
        float suma_ahorros = 0;
        
        int ahorro_max, ahorro_mes;
        
        for (int i=0; i<meses; i++){
            System.out.println("Ingrese ahorros para el mes "+(i+1));
            ahorros[i] = banco.nextInt();
        }
        ahorro_max = ahorros[0];
        ahorro_mes=0;
        
        for (int i=1; i<meses; i++){
            if(ahorros[i] > ahorro_max){
                ahorro_max = ahorros[i];
                meses = ahorros[i];
            }             
        }
        System.out.println("--->El mayor ingreso de ahoroos fue de: "+ahorro_mes);
        System.out.println("-------------------------------------------------");
        

        for (int i=1; i<meses; i++){
            suma_ahorros += ahorros[i];
            promedio += (suma_ahorros / meses);
        }
        int prom=0;
        prom += promedio;
        
        System.out.println("-->El Promedio de ahorros ingresados por el usuario es de: "+prom);
        System.out.println("-------------------------------------------------");
        
        for(int i=0 ; i<meses ;i++){
            suma_ahorros += (((ahorros[i] - ((prom)*(ahorros[i])) - (prom))));
            varianza += (float)((suma_ahorros )/ (meses - 1));       
        }
        int varia = 0;
        varia += varianza;
        
        System.out.println("->La variacion dentro de su Cuenta es de : "+varia);
        
        System.out.println("-------------------------------------------------");
        System.out.println("-------------------------------------------------");
        System.out.println("--Este acabo de ser su registro general de su cuenta Bancaria--");
        System.out.println("--Gracias por preferir la linea de Bancos C.O.D.E.S--");
    }
}