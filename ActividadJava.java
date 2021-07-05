/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadjava;

import java.util.Scanner;

/**
 *
 * @author Tobias
 */
public class ActividadJava {
    
      

    
    public static void main(String[] args) {
        
         Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
    String nombre;
    String apellido;
    int edad;
    String hobbie; 
    String editor_codigo;
    String sistema_operativo;
        
    
        
        
        
     
       
        System.out.println("------------------------------------------");
        System.out.println("INGRESE EL NOMBRE");
        nombre= (leer.next());
        System.out.println("INGRESE EL APELLIDO");
        apellido=(leer.next());
        System.out.println("INGRESE SU EDAD");
        edad=(leer.nextInt());
        System.out.println("INGRESE SU HOBBIE");
        hobbie=(leer.next());
        System.out.println("INGRESE SU EDITOR DE CODIGO FAVORITO");
        editor_codigo=(leer.next());
        System.out.println("INGRESE EL SISTEMA OPERATIVO QUE UTILIZA");
        sistema_operativo=(leer.next());
        
        
   
        
       System.out.println("------------------------------------------");
       
       System.out.println("LOS DATOS INGRESADOS SON");
       
       System.out.println("El nombre es " +nombre);
       System.out.println("El apelido es " +apellido);
       System.out.println("La edad es " +edad);
       System.out.println("Su hobbie favorito es " +hobbie);
       System.out.println("Su editor de codigo preferido es " +editor_codigo);
       System.out.println("Su sistema operativo es " +sistema_operativo);
    }
    
}
