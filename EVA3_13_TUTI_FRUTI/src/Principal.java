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
        Persona[] apTodos = new Persona[10];
        apTodos[0] = new  Alumnos();
        apTodos[1] = new  Alumnos();
        apTodos[2] = new  Alumnos();
        apTodos[3] = new  Alumnos();
        apTodos[4] = new  Alumnos();
        apTodos[5] = new  Alumnos();
        apTodos[0] = new  Empleado();
        apTodos[1] = new  Empleado();
        apTodos[2] = new  Empleado();
        apTodos[3] = new  Empleado();
        apTodos[4] = new  Empleado();
        apTodos[5] = new  Empleado();
        for (int i = 0; i < apTodos.length; i++) {
            //SI ES ALUMNOS LLENARLO CON JUAN PERES Y 001
            // SI ES EMPLEADO LLENARLO CON PEDRO PARAMO Y 1000
            if(apTodos[i] instanceof Alumnos){
                Alumnos aObj = (Alumnos)apTodos[i];
                aObj.nombre = "Juan";
                aObj.apellido = "Perez";
                aObj.noControl = "001";
            }else{
                Empleado aObj2 = (Empleado)apTodos[i];
                aObj2.nombre = "Pedro";
                aObj2.apellido = "Paramo";
                
                
                
            
            }
            
        }
    }
    
}
class Empleado extends Persona{
int claveEmpleado;
}
class Alumnos extends Persona{
    String noControl;
}
class Persona{
String nombre;
String apellido;
}
