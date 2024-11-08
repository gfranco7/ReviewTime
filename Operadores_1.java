/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operadores_1;
import java.util.Scanner;

/**
 *
 * @author leitt
 */
public class PreQuiz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter a, b, c: ");
        int a = myObj.nextInt();
        int b = myObj.nextInt();
        int c = myObj.nextInt();
        double x1 = 1f;
        double x2 = 1f;
        double potencia =Math.pow(b, 2);
        double raiz = Math.sqrt(potencia-4*a*c);
        double discriminante = potencia-4*a*c;
        
        if(discriminante>=0.0){
            x1 = (-(b)+raiz)/2*a;
            x2 = (-(b)-raiz)/2*a;
            System.out.println("x1 = "+x1);
            System.out.println("x2 = "+x2);
       
       }else{
            System.out.println("El discriminante es negativo");
        } 
      
    }
    
}
