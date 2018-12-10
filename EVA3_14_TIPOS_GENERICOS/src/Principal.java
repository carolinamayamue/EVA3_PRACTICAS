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
        Persona <String, Double>pObj = new Persona();
        pObj.setNombre("Carolina");
        pObj.setApellido("Muela");
        pObj.setClave("18550324");
       pObj.setOtroDato(.5);
        Persona <Integer, Boolean>pObjEntero = new Persona();
        pObjEntero.setNombre("Caro");
        pObjEntero.setApellido("Muela");
        pObjEntero.setClave(100);
        pObjEntero.setOtroDato(true);
        
        
      
        
    }
    
}
class Persona<T,S>{
    private String nombre;
    private String apellido;
    private T clave;
    private S otroDato;

    public S getOtroDato() {
        return otroDato;
    }

    public void setOtroDato(S otroDato) {
        this.otroDato = otroDato;
    }

    public T getClave() {
        return clave;
    }

    public void setClave(T clave) {
        this.clave = clave;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
}
