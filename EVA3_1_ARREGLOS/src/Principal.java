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
        //Arreglos  es una secuencia continua de variables del mismo tipo 
        //Capturar muchos datos del mismo tipo
        //Capturar edad, imprimir, capturr media 
        //Tec 2 ---> 3 mil estudiantes (4 bytes) = 12 mil bytes --> 12kb
        //Usamos arreglo
        // tipo de dato[] nombre del identificador = new tipo de dato[Tamaño]
        //Son de acceso aleatorio
        //Acceso secuencial: 
        int[] aiEdades = new int[3000];
        //Arreglos en java, C, C++ tienen direcciones para cada posición
        // 0 es la primera--> n-1 es la última
        //Siendo n --> tamaño del arreglo
        System.out.println(aiEdades.length);
        System.out.println("Primer posición = " + aiEdades[0]);
        System.out.println("Última posición = " + aiEdades[2999]);
        //Llenarlo con edades:
        //17 - 40
        for (int i = 0; i < aiEdades.length; i++){
            int iEdad = (int)(Math.random() * 40) + 1;
            aiEdades[i] = iEdad;
        }
        // Imprimir todo el arreglo:
        
     for (int i = 0; i < aiEdades.length; i++){
         System.out.println(aiEdades[i]);
     }
     // FOR EACH 
        for (int i : aiEdades) {
            System.out.println("For each - " + i);
            
        }
  //Sumatoria para calcular la media;
        int iAcum =0;
        for (int i = 0; i < aiEdades.length; i++) {
            iAcum = iAcum + aiEdades[i];
        }
        System.out.println("La media es: " + (double)(iAcum/3000));
}}
