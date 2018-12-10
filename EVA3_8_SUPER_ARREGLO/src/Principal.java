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
        int aiMuchos [][][][] = new int[2][3][4][5];
        for (int i = 0; i < aiMuchos.length; i++) {
            for (int j = 0; j < aiMuchos[i].length; j++) {
                for (int k = 0; k < aiMuchos[i][j].length; k++) {
                    for (int l = 0; l < aiMuchos[i][j][k].length; l++) {
                        aiMuchos[i][j][k][l] = (int)(Math.random() * 100);
                    }
                }
             }
            }
        
        for (int i = 0; i < aiMuchos.length; i++) {
            for (int j = 0; j < aiMuchos[i].length; j++) {
                for (int k = 0; k < aiMuchos[i][j].length; k++) {
                    for (int l = 0; l < aiMuchos[i][j][k].length; l++) {
                        
                        System.out.println(aiMuchos[i][j][k][l]);
        
    }
    
}
            }
        }
    }
}
