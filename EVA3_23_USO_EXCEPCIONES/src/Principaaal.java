/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @autor Ana Carolina Amaya Muela 18550324
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Empleado eEmp = new Empleado();
        eEmp.setNombre("Caro");
        eEmp.setApellido("Muela");
        try{
        eEmp.setSalario(-1000.0);
        }catch(Exception ex){
            ex.printStackTrace();
        }
        System.out.println("Nombre = " + eEmp.getNombre());
        System.out.println("Apellido = " + eEmp.getApellido());
        System.out.println("Salario = " + eEmp.getSalario());
    }
    
}
class Empleado{
    private String nombre;
    private String apellido;
    private Double salario;

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

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) throws Exception {
        if(salario < 0) //SALARIOS NEGATIVOS
            throw new Exception ("No hay salarios negativos");
        this.salario = salario;
    }
}