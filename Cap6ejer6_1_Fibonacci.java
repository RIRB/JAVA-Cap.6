package javafunda2dosemestre;
import java.io.*;
public class Cap5ejer6_1_Fibonacci {
    public static void main(String[]args){
    //Entrada
        //definir variables
            int fibonacci []= new int[22];
            fibonacci[0]= 1;
            fibonacci[1]= 1;
    //Desarrollo
        //calculo de la serie fibonacci
            for(int i=2; i<22; i++){
                fibonacci[i] = fibonacci[i-2]+fibonacci[i-1];
            }
            for (int i=2; i<22; i++){
    //Salida
        //serie Fibonacci de 20 numero
                System.out.println(" Fibonacci "+i+" es "+fibonacci[i]);
            }
    }   
}