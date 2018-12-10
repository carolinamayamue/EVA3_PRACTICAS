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
        muchosDatos[] aArregloLista = new muchosDatos[10];
        aArregloLista[0] = new <Integer>muchosDatos();
        aArregloLista[1] = new <Integer>muchosDatos();
        aArregloLista[2] = new <Integer>muchosDatos();
        aArregloLista[3] = new <Integer>muchosDatos();
        aArregloLista[4] = new <Integer>muchosDatos();
        aArregloLista[5] = new <Integer>muchosDatos();
        aArregloLista[6] = new <Integer>muchosDatos();
        aArregloLista[7] = new <Integer>muchosDatos();
        aArregloLista[8] = new <Integer>muchosDatos();
        aArregloLista[9] = new <Integer>muchosDatos();
        aArregloLista[0].setDato(100);
        System.out.println(aArregloLista[0].getDato()
                
        );
    }
    
}
class muchosDatos<C>{
private C dato;

    public C getDato() {
        return dato;
    }

    public void setDato(C dato) {
        this.dato = dato;
    }



}
    
    

