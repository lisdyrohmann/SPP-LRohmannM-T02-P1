/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp.lrohmannm.t02.p1;
import java.util.Scanner;
/**
 *
 * @author lisdyrohmann
 */
public class SPPLRohmannMT02P1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    //Lisdy Nadine Rohmann Martínez
    //513659
    //IIS
    
     //Declaración de variables 
    int he, opEntrada;
    double pago, sue;
    int cate; 
    
    Scanner Sc= new Scanner (System.in);
    
    //Menu 
    System.out.println("Selecciona tu categoría");
    System.out.println("1. Categoria 1");
    System.out.println("2. Categoria 2");
    System.out.println("3. Categoria 3");
    System.out.println("4. Categoria 4");
    System.out.println("5. Categoria 5");
    System.out.println("6. Categoria 6");
    System.out.println("7. Categoria 7");
    System.out.println("8. Categoria 8");
    
     
    cate= Sc.nextInt();
    if (cate>=1 && cate<=8){
        
    switch (cate){
        case 1:
            System.out.println("Introduce tu sueldo");
            sue= Sc.nextDouble();
            System.out.println("Introduce el total de horas extras trabajadas");
            he= Sc.nextInt();
            pago=sue+(he*30);
            System.out.println("Tu salario total es $" + pago);
            break;
            
        case 2:
            System.out.println("Introduce tu sueldo");
            sue= Sc.nextDouble();
            System.out.println("Introduce el total de horas extras trabajadas");
            he= Sc.nextInt();
            pago=sue+(he*38);
            System.out.println("Tu salario total es $" + pago);
            break;
            
        case 3:
            System.out.println("Introduce tu sueldo");
            sue= Sc.nextDouble();
            System.out.println("Introduce el total de horas extras trabajadas");
            he= Sc.nextInt();
            pago=sue+(he*50);
            System.out.println("Tu salario total es $" + pago);
            break;
            
        case 4:
            System.out.println("Introduce tu sueldo");
            sue= Sc.nextDouble();
            System.out.println("Introduce el total de horas extras trabajadas");
            he= Sc.nextInt();
            pago=sue+(he*70);
            System.out.println("Tu salario total es $" + pago);
            break;
            
        case 5:
            System.out.println("Introduce tu sueldo");
            sue= Sc.nextDouble();
            System.out.println("Introduce el total de horas extras trabajadas");
            he= Sc.nextInt();
            pago=sue+(he*75);
            System.out.println("Tu salario total es $" + pago);
            break;
            
        case 6:
            System.out.println("Introduce tu sueldo");
            sue= Sc.nextDouble();
            System.out.println("Introduce el total de horas extras trabajadas");
            he= Sc.nextInt();
            pago=sue+(he*80);
            System.out.println("Tu salario total es $" + pago);
            break;
            
        case 7:
            System.out.println("Introduce tu sueldo");
            sue= Sc.nextDouble();
            System.out.println("Introduce el total de horas extras trabajadas");
            he= Sc.nextInt();
            pago=sue+(he*85);
            System.out.println("Tu salario total es $" + pago);
            break;
            
        case 8:
            System.out.println("Introduce tu sueldo");
            sue= Sc.nextDouble();
            System.out.println("Introduce el total de horas extras trabajadas");
            he= Sc.nextInt();
            pago=sue+(he*90);
            System.out.println("Tu salario total es $" + pago);
            break;
                   
            }
                    
            }
    else {
        System.out.println("No contamos con esa categoria");

    }
    }
}
