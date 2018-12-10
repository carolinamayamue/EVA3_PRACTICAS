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
        int aiArreglos [] = new int[5];
        llenar(aiArreglos);
        for (int i = 0; i < aiArreglos.length; i++) {
            System.out.println("[" + aiArreglos[i] + "]");
            
        }
        
        
    }
    public static void llenar(int aiArre[]){
        for (int i = 0; i < aiArre.length; i++) {
            aiArre[i] = (int)(Math.random() *100 ) +1;
            
            
        }
    }
}
