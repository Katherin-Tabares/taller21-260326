
import java.util.Scanner;

public class Taller21260326 {

    public static void main(String[] args) {
        
        ListaEnlazada lis = new ListaEnlazada();
        
        Scanner scn = new Scanner (System.in);
        int n, m;
        System.out.println("Ingrese un numero entero mayor de 2");
        n=scn.nextInt();
        if (2<= n){
            System.out.println("Ingresa los numeros de la lista");
            for (int i=0; i<n-1; i++){
                m=scn.nextInt();
                
                for(int j=1; j<=i; j++){
                    if(!lis.numFaltante(j)){
                        if (m<=n){
                            lis.agregar(m);
                        }else{
                            i--;
                        }
                    }
                }   
                
            }
            System.out.println(lis); //muetra la lista
            
            //mostrar el faltante
            for(int i=1; i<=n; i++){
                if(!lis.numFaltante(i)){
                System.out.println(i);
                }
            }
        }
    }
}
