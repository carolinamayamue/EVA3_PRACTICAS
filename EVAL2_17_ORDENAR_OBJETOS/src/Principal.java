
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author temporal2
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LinkedList <Persona> llListaPer = new  LinkedList();
        llListaPer.add(new Persona("RUBEN" , "HERNANDEZ", 35, 0, true));
        llListaPer.add(new Persona("ALONSO" , "CHAVEZ", 15, 1000, true));
        llListaPer.add(new Persona("PEDRO" , "ZANOBINO",90 ,3500, true));
        llListaPer.add(new Persona("JUANELO" , "ANTIPODAZ", 23, 8000, true));
        llListaPer.add(new Persona("ZULEMA" , "NEVAREZ",10 , 150540, false));
        for (Persona llListaPer1 : llListaPer) {
            System.out.println(" Nombre: " +llListaPer1.getsNom() + "\n"+
                    " Apellido: " +llListaPer1.getsApe() + "\n"+
                    " Edad: " +llListaPer1.getiEdad() + "\n"+
                    " Salario: " +llListaPer1.getdSal() + "\n"+
                    " Sexo: " +llListaPer1.isbSexo()+ "\n");
            
        }
        //Ordenar nuestra lista por edad
        Comparator cMiOrdenPer = new Comparator(){

            @Override
            public int compare(Object t, Object t1) {
                Persona p1,p2;
                p1=(Persona)t;
                p2=(Persona)t1;
                //prdenar por edades
                int iEd1, iEd2;
                iEd1=p1.getiEdad();
                iEd2=p2.getiEdad();
                return iEd1-iEd2;
            }
            
        };
        Collections.sort(llListaPer, cMiOrdenPer);
        for (Persona llListaPer1 : llListaPer) {
            System.out.println(" Nombre: " +llListaPer1.getsNom() + "\n"+
                    " Apellido: " +llListaPer1.getsApe() + "\n"+
                    " Edad: " +llListaPer1.getiEdad() + "\n"+
                    " Salario: " +llListaPer1.getdSal() + "\n"+
                    " Sexo: " +llListaPer1.isbSexo()+ "\n");
            
        }
        //ordenar lista por salario
        Comparator cMiOrder2 = new Comparator (){

            @Override
            public int compare(Object t, Object t1) {
                Persona p1,p2;
                p1=(Persona)t;
                p2=(Persona)t1;
                //ordenar por salario
                double iSa1,iSa2;
                 iSa1=p1.getdSal();
                iSa2=p2.getdSal();
                return  (int) (iSa2-iSa1);
                
            }

            
            
        };
        Collections.sort(llListaPer, cMiOrder2);
        for (Persona llListaPer1 : llListaPer) {
            System.out.println(" Nombre: " +llListaPer1.getsNom() + "\n"+
                    " Apellido: " +llListaPer1.getsApe() + "\n"+
                    " Edad: " +llListaPer1.getiEdad() + "\n"+
                    " Salario: " +llListaPer1.getdSal() + "\n"+
                    " Sexo: " +llListaPer1.isbSexo()+ "\n");
            
        }
    }
    }
    class Persona {
        private String sNom;
        private String sApe;
         private int iEdad;
         private double dSal;
         private boolean bSexo;
    public Persona (){
        sNom= " ";
        sApe=" ";
        iEdad=0;
        dSal=0;
        bSexo=false;
                    
                }
    public Persona (String sNombre, String sApellido, int iEdadPer, double dSalario, boolean bSexoPer){
           sNom=sNombre;
           sApe=sApellido;
           iEdad=iEdadPer;
           dSal=dSalario;
           bSexo=bSexoPer;
                    
                }

    public String getsNom() {
        return sNom;
    }

    public void setsNom(String sNom) {
        this.sNom = sNom;
    }

    public String getsApe() {
        return sApe;
    }

    public void setsApe(String sApe) {
        this.sApe = sApe;
    }

    public int getiEdad() {
        return iEdad;
    }

    public void setiEdad(int iEdad) {
        this.iEdad = iEdad;
    }

    public double getdSal() {
        return dSal;
    }

    public void setdSal(double dSal) {
        this.dSal = dSal;
    }

    public boolean isbSexo() {
        return bSexo;
    }

    public void setbSexo(boolean bSexo) {
        this.bSexo = bSexo;
    }
    
    }
    

