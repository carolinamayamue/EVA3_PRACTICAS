
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ana Carolina Amaya Muela 18550324
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int iDendo, iDsor;
        System.out.println("Introduce el dividendo: ");
        iDendo= input.nextInt();
         System.out.println("Introduce el divisor: ");
        iDsor= input.nextInt();
        int iResu = 0;
        iResu = iDendo / iDsor;
        System.out.println("Resultado= " + iResu);
        try{
        iResu = iDendo/iDsor;
        }catch(ArithmeticException e){
            e.printStackTrace();
            System.out.println("División entre cero.");
        
        }finally{//Siempre se ejecuta
            //SE PUEDEN GENERAR EXCEPCIONES
            //CERRAR ARCHIVOS,LIBERAR RECURSOS
            System.out.println("BLOQUE FINALLY");
        
        }
        System.out.println("");
    }
    
}
