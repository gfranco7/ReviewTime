/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package reviewexercices;
import javax.swing.JOptionPane;

// Los ejercicios se ejecutarán de forma consecutiva, al finalizar uno, iniciará automaticamente el sigiuente.
public class ReviewExercices {

    public static void main(String[] args) {
        //Exercice 1
        String input = JOptionPane.showInputDialog("Enter the height:");
        
        
        int cantidadDeLineas = Integer.parseInt(input);

        
        for (int i = 1; i <= cantidadDeLineas; i++) {
            
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            
            System.out.println();
        }
    
        //Exercice 2
        input = JOptionPane.showInputDialog("Ingrese la altura del cuadro:");
        int altura = Integer.parseInt(input);

        if (altura < 2) {
            JOptionPane.showMessageDialog(null, "La altura debe ser al menos 2.");
        }
        
        StringBuilder cuadro = new StringBuilder();

        
        for (int i = 0; i < 8; i++) {
            cuadro.append("*");
        }
        cuadro.append("\n");


        for (int i = 0; i < altura - 2; i++) {
            cuadro.append("*");
            for (int j = 0; j < 8; j++) {
                cuadro.append(" ");
            }
            cuadro.append("*\n");
        }

      
        for (int i = 0; i < 9; i++) {
            cuadro.append("*");
        }

   
        JOptionPane.showMessageDialog(null, cuadro.toString());

        //Exercice 3
        input = JOptionPane.showInputDialog("Enter the number of hours: ");
        
        
        int hours = Integer.parseInt(input);
        float perHour = 20000f;
        float descountS = 0.08f;
        float salary;
        float fullSalary;
        float descount;
        
       fullSalary = perHour * hours;
       
       descount = fullSalary *descountS;
       
       salary = fullSalary - descount;
       
       System.out.println("Net salary: "+salary);
       System.out.println("Total descount: "+descount);
       System.out.println("Full salary: "+ fullSalary);
        
  
        //Exercice 4
        input = JOptionPane.showInputDialog("Ingrese el tiempo en segundos:");

        
        int segundosTotales = Integer.parseInt(input);

        
        int horas = segundosTotales / 3600;
        int minutos = (segundosTotales % 3600) / 60;
        int segundos = segundosTotales % 60;

        String resultado = "Horas: " + horas + "\nMinutos: " + minutos + "\nSegundos: " + segundos;

        
        JOptionPane.showMessageDialog(null, resultado);
  
        //Exercice 5
        input = JOptionPane.showInputDialog("Ingrese la nota (de 0.0 a 5.0):");
        
        
        double notaActual = Double.parseDouble(input);

        
        if (notaActual >= 0.0 && notaActual <= 5.0) {
            
            double nuevaNota = (notaActual / 5.0) * 8.0;

            
            JOptionPane.showMessageDialog(null, "La nueva nota con curva de 8 es: " + nuevaNota);
        } else {
            JOptionPane.showMessageDialog(null, "Por favor ingrese una nota válida entre 0.0 y 5.0.");
        }
    }
}
