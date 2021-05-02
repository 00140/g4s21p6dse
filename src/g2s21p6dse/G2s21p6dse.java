/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g2s21p6dse;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Ideapad 330
 */
public class G2s21p6dse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<String>Lista = new ArrayList<String>(Arrays.asList("A","b","C","D"));
        System.out.println("Despliegando contenido por medio de foreaxh...\n");
        Lista.forEach(contenido ->{
        System.out.println("Contenido del arreglo "+contenido);
                });
        Lista.add("F");
        Lista.add("Erick");
        Lista.add("Este es un texto");
        System.out.println("\n desplegando contenido por for \n");
        for (String contenido1 : Lista){
            System.out.println("El contenido del arreglo "+contenido1);
        }
        Lista.add("G");
        Lista.add("H");
        Lista.add("I");
        System.out.println("\n desplegando contenido por stream \n");
        Lista.stream().forEach(contenido2 ->{
            System.out.println("El contenido del arreglo "+contenido2);
        });
        String cadena1 = "variable1";
        String cadena2 = "variable2";
        String cadena3 = "variable3";
        
        Lista.add(cadena1);
        Lista.add(cadena2);
        Lista.add(cadena3);
        //Lista.add(4); tipo de dato no valido
        Lista.add(String.valueOf(512));//Se convierte a cadena
        System.out.println("\n desplegando contenido por que se agrego con variables \n");
        for (String contenido3 : Lista){
            System.out.println("El contedo de arreglo es " +contenido3);
        }
        System.out.println("\n Buscando un valor \n");
        Lista.forEach(contenido4 ->{
           if (contenido4.equals("H")){
               System.out.println("El valor fue encontrado");
               
           } 
        });
    }
    
}
