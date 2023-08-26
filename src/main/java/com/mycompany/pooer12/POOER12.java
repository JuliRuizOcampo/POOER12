package com.mycompany.pooer12;
import java.util.Scanner;
/**
 *
 * @author JuliRuizOcampo
 */
public class POOER12 {

    public static void main(String[] args) {
        String nom; //nom: Nombre del trabajador
        int nht, het, hee8;
        double vhn, salario; 
        
        /* 
        nht: Número de horas trabajadas, het: Horas extras trabajadas, hee8: Horas extras que exceden de 8
        vhn: Valor hora normal trabajada, salario: Pago total que recibe el trabajador
        */
        
        Scanner lector = new Scanner(System.in);
        Scanner lector2 = new Scanner(System.in);
        
        System.out.println("Ingrese el nombre del trabajador: ");
        nom = lector.nextLine();
        System.out.println("Ingrese el número de horas trabajadas: ");
        nht = lector2.nextInt();
        System.out.println("Ingrese el valor de una hora normal trabajada: ");
        vhn = lector2.nextDouble();
        
        //Condicionales para calcular el salario del trabajador
        if (nht > 40) { 
            het = nht - 40;
            if (het > 8) {
                hee8 = het - 8;
                salario = (vhn * 40) + (vhn * 2 * 8) + (vhn * 3 * hee8);
            } 
            else {
                salario = (vhn * 40) + (vhn * 2 * het);
            }
        }
        else {
            salario = nht * vhn;
        }
        
        System.out.println("El trabajador " +  nom + " devengó: $" + salario);  
    }
}