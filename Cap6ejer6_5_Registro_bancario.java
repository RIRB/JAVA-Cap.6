package javafunda2dosemestre;
import java.util.Scanner;
public class Cap6ejer6_5_Registro_bancario {
    public static void main(String[]args){
        Scanner banco = new Scanner(System.in);
 
        int montos[] = new int[12];
        
        int monto_max = montos[0]; 
        int negativo_monto = montos[0];
        
        int suma_montos = 0;
        float promedio = 0;
        
        for (int i=0; i < 12; i++){
            System.out.println("Ingrese el saldo del mes "+(i+1)+" : ");
            montos[i]= banco.nextInt();
            
            if(monto_max < montos[i]){
                monto_max = montos[i];
            }                     
        }      
        for(int i=0; i<12; i++){
            if(montos[i] < 0){ 
                negativo_monto++;
            }
        }
        
        System.out.println("---------------");
        System.out.println("El Arreglo");
        System.out.println("---------------");
        
        for(int i=0; i<montos.length; i++){
            System.out.println("["+montos[i]+"]");
        }    
                  
        for(int i=0; i<montos.length; i++){   
            suma_montos += montos[i];            
        }
        promedio += (suma_montos)/montos.length;
        
        System.out.println("--------------------------------------");     
        System.out.println("Los Saldos Negativos son: "+negativo_monto);
        System.out.println("El Saldo Mayor Registrado es: "+monto_max);
        System.out.println("El Promedio de los Montos Registrados es: "+promedio);
    }
}