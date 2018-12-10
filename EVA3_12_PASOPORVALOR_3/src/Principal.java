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
        Valor vOb1 = new Valor();
        vOb1.iX = 100;
        Valor vOb2 = new Valor();
        vOb2.iX = 500;
        intercambiar(vOb1, vOb2);
        System.out.println("Obj 1 = " + vOb1.iX);
        System.out.println("Obj 2 = " + vOb2.iX);
        Valor vTemp = vOb1;
        vOb1 = vOb2;
        vOb2 = vTemp;
        
        
    }
    public static void intercambiar(Valor v1, Valor v2){
        v1.iX = 200;
        Valor vTemp = v1;
        v1 = v2;
        v2 = vTemp;
    }
    
}

class Valor{
    int iX;
}
