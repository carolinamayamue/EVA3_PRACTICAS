
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author invitado
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner Captu = new Scanner(System.in);
        
        String[] Nombre= new String[11];
        int[] Edad = new int[11];
        for (int i = 0; i < Nombre.length; i++) {
          System.out.println("Escribe un nombre y tu edad");
        Nombre[i]=Captu.nextLine();
        Edad[i]=Captu.nextInt();
        Captu.nextLine();
        }
        int Suma =0;
        for (int i = 0; i < Edad.length; i++) {
        Suma =Suma +Edad[i];
            System.out.println("Nombre" +Nombre[i] + "" +
                    "Edad" + Edad[i]);
        }
          
      
    }
    
}
