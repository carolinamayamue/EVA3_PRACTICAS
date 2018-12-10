
import java.util.ArrayList;
import java.util.List;

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
        List <Integer>IsMiLista = new ArrayList();
        IsMiLista.add(100);
        IsMiLista.add(500);
        IsMiLista.add(600);
        IsMiLista.add(700);
        IsMiLista.add(90);
        System.out.println(IsMiLista);
        for (int i = 0; i < IsMiLista.size(); i++) {
            System.out.println(IsMiLista.get(i));
            
        }
    }
    
}
