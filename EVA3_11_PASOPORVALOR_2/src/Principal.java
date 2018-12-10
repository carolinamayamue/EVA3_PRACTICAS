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
        int iVal = 0;
        llenar(iVal);
        System.out.println(iVal);
    }
    public static void llenar(int i){
        i =(int)(Math.random() * 100) +1;
        System.out.println("Llenar " +i);
        
    }
}
