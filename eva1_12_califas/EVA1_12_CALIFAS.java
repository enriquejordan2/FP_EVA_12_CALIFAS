/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_12_califas;

import java.util.Scanner;

/**
 *
 * @author Jose Enrique
 */
public class EVA1_12_CALIFAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Declarar Variables para la calificacion
        //Evaluar si acerditas (Mayor o igual a 70)
        //O no acreditas (NA --> Menor 70)
        int Calificacion;
        Scanner captu = new Scanner(System.in);
        System.out.println("Captura tu calificacion");
        Calificacion = captu.nextInt();
        if (Calificacion<70){ //If (calificacion >=70) e invertir los println
            System.out.println("Na");}
        else{ 
            System.out.println("Acreditas");
        }
        
        
        
        
    }
    
}
