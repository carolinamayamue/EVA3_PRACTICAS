
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

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
        FileInputStream LeerArchivo = null;
        FileOutputStream EscribirArchivo = null;
        try {
            LeerArchivo = new FileInputStream("c:/archivos/Documento.txt");
            EscribirArchivo = new FileOutputStream("c:/archivos/Copia.txt");
            int Valor=LeerArchivo.read();
            while(Valor !=-1){
                EscribirArchivo.write(Valor);
                Valor = LeerArchivo.read();
                
            }
            EscribirArchivo.flush();
        } catch (IOException ex) {
            System.out.println("El archivo no pudo leer");
            ex.printStackTrace();
            
        }finally{
            if(LeerArchivo != null){
                
            }
            if(EscribirArchivo !=null){
                try {
                    EscribirArchivo.close();
                } catch (IOException ex) {
                    
                }
            }
        }
    }
    
}
