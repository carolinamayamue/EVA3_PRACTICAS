
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

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
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
         Scanner input = new Scanner(System.in);
        int iDendo, iDsor;
        System.out.println("Introduce el dividendo: ");
        iDendo= input.nextInt();
         System.out.println("Introduce el divisor: ");
        iDsor= input.nextInt();
        if(iDsor == 0){
            //LANZAMOS NUESTRA PROPIA EXCEPCIÓN
            throw new Exception("Hola mundo cruel!!");
             
        }
    }
    
}
