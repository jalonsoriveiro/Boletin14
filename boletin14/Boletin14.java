/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin14;

//import TemperaturaErradaExcepcion;

/**
 *
 * @author jalonsoriveiro
 */
public class Boletin14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws TemperaturaErradaExcepcion {
        // TODO code application logic here
        try{
        ConversorTemperaturas obj1 = new ConversorTemperaturas();
        ConversorTemperaturas obj2 = new ConversorTemperaturas();
        
        
            System.out.println(obj1.centigradosAFharenheit(85));
        obj2.centígradosAReamur(85);
         }catch (TemperaturaErradaExcepcion ej){
           System.out.println("Error" + ej.toString());
       }
        System.out.println("el programa sigue");

        
        
       
        
       
        
        
    }
    
}
